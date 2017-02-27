/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simplejava;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simplejava.IntegerExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getIntegerExpression()
 * @model
 * @generated
 */
public interface IntegerExpression extends ConstantExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getIntegerExpression_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simplejava.IntegerExpression#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntegerExpression
