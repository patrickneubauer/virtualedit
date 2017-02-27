/**
 */
package simplejava.tests;

import junit.textui.TestRunner;

import simplejava.BooleanExpression;
import simplejava.SimplejavaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanExpressionTest extends ConstantExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanExpressionTest.class);
	}

	/**
	 * Constructs a new Boolean Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanExpression getFixture() {
		return (BooleanExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplejavaFactory.eINSTANCE.createBooleanExpression());
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

} //BooleanExpressionTest
