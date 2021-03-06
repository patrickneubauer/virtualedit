/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simpleaspect.simpleAspect;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.VariableDeclaration#getParameter <em>Parameter</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.VariableDeclaration#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Statement, SimpleVariableDeclaration
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getVariableDeclaration_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.VariableDeclaration#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(GenericExpression)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getVariableDeclaration_Expression()
   * @model containment="true"
   * @generated
   */
  GenericExpression getExpression();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.VariableDeclaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(GenericExpression value);

} // VariableDeclaration
