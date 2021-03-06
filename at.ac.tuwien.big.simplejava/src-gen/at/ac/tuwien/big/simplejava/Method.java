/**
 * generated by Xtext 2.11.0
 */
package at.ac.tuwien.big.simplejava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simplejava.Method#isStatic <em>Static</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.Method#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.Method#getParameter <em>Parameter</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.Method#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject
{
  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethod_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simplejava.Method#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(Type)
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethod_ReturnType()
   * @model containment="true"
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simplejava.Method#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

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
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simplejava.Method#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.tuwien.big.simplejava.SimpleParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethod_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<SimpleParameter> getParameter();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(MethodBlock)
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethod_Content()
   * @model containment="true"
   * @generated
   */
  MethodBlock getContent();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simplejava.Method#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(MethodBlock value);

} // Method
