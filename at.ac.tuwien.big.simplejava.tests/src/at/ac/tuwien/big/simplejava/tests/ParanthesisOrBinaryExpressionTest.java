/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simplejava.tests;

import at.ac.tuwien.big.simplejava.ParanthesisOrBinaryExpression;
import at.ac.tuwien.big.simplejava.SimplejavaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paranthesis Or Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParanthesisOrBinaryExpressionTest extends GenericExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParanthesisOrBinaryExpressionTest.class);
	}

	/**
	 * Constructs a new Paranthesis Or Binary Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParanthesisOrBinaryExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Paranthesis Or Binary Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParanthesisOrBinaryExpression getFixture() {
		return (ParanthesisOrBinaryExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplejavaFactory.eINSTANCE.createParanthesisOrBinaryExpression());
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

} //ParanthesisOrBinaryExpressionTest