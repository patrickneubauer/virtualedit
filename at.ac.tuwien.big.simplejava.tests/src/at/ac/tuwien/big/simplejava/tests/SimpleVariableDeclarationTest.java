/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simplejava.tests;

import at.ac.tuwien.big.simplejava.SimpleVariableDeclaration;
import at.ac.tuwien.big.simplejava.SimplejavaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleVariableDeclarationTest extends SimpleStatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleVariableDeclarationTest.class);
	}

	/**
	 * Constructs a new Simple Variable Declaration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleVariableDeclarationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Variable Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleVariableDeclaration getFixture() {
		return (SimpleVariableDeclaration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplejavaFactory.eINSTANCE.createSimpleVariableDeclaration());
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

} //SimpleVariableDeclarationTest
