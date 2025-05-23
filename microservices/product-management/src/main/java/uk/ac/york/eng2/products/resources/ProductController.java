package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.transaction.annotation.Transactional;
import jakarta.inject.Inject;
import uk.ac.york.eng2.products.domain.Product;
import uk.ac.york.eng2.products.dto.ProductDTO;
import uk.ac.york.eng2.products.repository.OrdersByDayRepository;
import uk.ac.york.eng2.products.repository.ProductRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import uk.ac.york.eng2.products.resources.offers.generated.StartingRule;
import uk.ac.york.eng2.products.resources.offers.src.OfferPricingContext;

import java.net.URI;
import java.util.*;

@Tag(name = "Products")
@Controller(ProductController.PREFIX)
public class ProductController {
    public static final String PREFIX = "/products";

    @Inject
    ProductRepository prodRepo;

    @Inject
    OrdersByDayRepository ordersByDayRepo;

    @Get
    public List<Product> getProducts() {
        return prodRepo.findAll();
    }

    @Get("/{productId}")
    public Product getProduct(@PathVariable long productId) {
        return prodRepo.findById(productId).orElse(null);
    }

    @Get("/{productId}/unit_price")
    public float getProductUnitPrice(@PathVariable long productId) {
        Product product = prodRepo.findById(productId).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        return product.getUnitPrice();
    }

    @Post
    public HttpResponse<Void> createProduct(@Body ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setUnitPrice(dto.getUnitPrice());
        prodRepo.save(product);
        return HttpResponse.created(URI.create(PREFIX + "/" + product.getId()));
    }

    @Post("/validate")
    @Transactional
    public Map<String, Map<Long, Integer>> checkProductsValidity(@Body Map<Long, Integer> products) {
        List<Long> productIds = List.copyOf(products.keySet());
        Map<Long, Integer> validProducts = new HashMap<>();
        Map<Long, Integer> invalidProductIds = new HashMap<>();
        Map<String, Map<Long, Integer>> response = new HashMap<>();

        for (Long productId : productIds) {
            Product product = prodRepo.findById(productId).orElse(null);
            if (product == null) {
                invalidProductIds.put(productId, products.get(productId));
            }
            else {
                validProducts.put(productId, products.get(productId));
            }
        }
        response.put("Valid Products", validProducts);
        response.put("Invalid Products", invalidProductIds);
        return response;
    }

    @Post("/total_price")
    @Transactional
    public float getProductsPrice(@Body Map<Long, Integer> products) {
        OfferPricingContext pricingContext = createPricingContext(products);

        try {
            float totalPriceWithOffer = findTotalOrderPrice(products) - new StartingRule(pricingContext).start();
            if (totalPriceWithOffer < 0) {
                return 0;
            }
            else {
                return totalPriceWithOffer;
            }
        } catch (Exception e) {
            return findTotalOrderPrice(products);
        }
    }

    @Put("/{id}")
    @Transactional
    public void updateProduct(@PathVariable long id, @Body ProductDTO dto) {
        Product product = prodRepo.findById(id).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        }
        else {
            if (dto.getName() != null) {
                product.setName(dto.getName());
            }
            if (dto.getUnitPrice() != null) {
                product.setUnitPrice(dto.getUnitPrice());
            }
            prodRepo.save(product);
        }
    }

    @Delete("/{id}")
    @Transactional
    public void deleteProduct(@PathVariable long id) {
        Product product = prodRepo.findById(id).orElse(null);
        if (product == null) {
            throw new HttpStatusException(HttpStatus.NOT_FOUND, "Product not found");
        } else {
            prodRepo.delete(product);
        }
    }

    public OfferPricingContext createPricingContext(Map<Long, Integer> products) {
        OfferPricingContext pricingContext = new OfferPricingContext();

        pricingContext.setOrder(products);

        Map<String, Integer> orderWithNameAndQuantity = new HashMap<>();
        for (Long productId : products.keySet()) {
            Product product = prodRepo.findById(productId).orElse(null);
            if (product != null) {
                orderWithNameAndQuantity.put(product.getName(), products.get(productId));
            }
        }
        pricingContext.setOrderWithNameAndQuantity(orderWithNameAndQuantity);

        Map<String, Map<Float, Integer>> orderWithNamePriceAndQuantity = new HashMap<>();
        for (Long productId : products.keySet()) {
            Product product = prodRepo.findById(productId).orElse(null);
            if ((product != null)) {
                Map<Float, Integer> priceAndQuantity = new HashMap<>();
                priceAndQuantity.put(product.getUnitPrice(), products.get(productId));
                orderWithNamePriceAndQuantity.put(product.getName(), priceAndQuantity);
            }
        }
        pricingContext.setOrderWithNamePriceAndQuantity(orderWithNamePriceAndQuantity);

        pricingContext.setTotalPrice(findTotalOrderPrice(products));

        List<Integer> allOrdersToday = ordersByDayRepo.getCountByDay(pricingContext.getDateToday());
        int totalOrdersToday = 0;
        for (int orderCount : allOrdersToday) {
            totalOrdersToday += orderCount;
        }
        pricingContext.setNumOrdersToday(totalOrdersToday);

        return pricingContext;
    }

    private float findTotalOrderPrice(Map<Long, Integer> products) {
        float totalPrice = 0;
        List<Long> productIds = List.copyOf(products.keySet());
        for (Long productId : productIds) {
            Product product = prodRepo.findById(productId).orElse(null);
            if (product != null) {
                totalPrice += product.getUnitPrice() * products.get(productId);
            }
        }
        return totalPrice;
    }
}
