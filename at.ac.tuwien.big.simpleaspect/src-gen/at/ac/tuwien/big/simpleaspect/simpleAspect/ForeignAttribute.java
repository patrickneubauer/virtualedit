/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simpleaspect.simpleAspect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForeignAttribute#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForeignAttribute#getInType <em>In Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForeignAttribute#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForeignAttribute()
 * @model
 * @generated
 */
public interface ForeignAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForeignAttribute_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForeignAttribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>In Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Type</em>' attribute.
   * @see #setInType(String)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForeignAttribute_InType()
   * @model
   * @generated
   */
  String getInType();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForeignAttribute#getInType <em>In Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Type</em>' attribute.
   * @see #getInType()
   * @generated
   */
  void setInType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForeignAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForeignAttribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ForeignAttribute