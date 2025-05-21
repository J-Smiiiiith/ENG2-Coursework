/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.Tags;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tags</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TagsTest extends TestCase {

	/**
	 * The fixture for this Tags test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tags fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TagsTest.class);
	}

	/**
	 * Constructs a new Tags test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tags test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tags fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tags test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tags getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createTags());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TagsTest
