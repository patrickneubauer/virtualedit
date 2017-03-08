/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simplejava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simplejava.VariableExpression#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getVariableExpression()
 * @model
 * @generated
 */
public interface VariableExpression extends GenericExpression
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Parameter)
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getVariableExpression_Variable()
   * @model
   * @generated
   */
  Parameter getVariable();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simplejava.VariableExpression#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Parameter value);

} // VariableExpression