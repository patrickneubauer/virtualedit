/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simpleaspect.simpleAspect;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForStatement#getInit <em>Init</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForStatement#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(SimpleStatement)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForStatement_Init()
   * @model containment="true"
   * @generated
   */
  SimpleStatement getInit();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForStatement#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(SimpleStatement value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(GenericExpression)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForStatement_Condition()
   * @model containment="true"
   * @generated
   */
  GenericExpression getCondition();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(GenericExpression value);

  /**
   * Returns the value of the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continuation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continuation</em>' containment reference.
   * @see #setContinuation(SimpleStatement)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForStatement_Continuation()
   * @model containment="true"
   * @generated
   */
  SimpleStatement getContinuation();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForStatement#getContinuation <em>Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' containment reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(SimpleStatement value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Statement)
   * @see at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage#getForStatement_Body()
   * @model containment="true"
   * @generated
   */
  Statement getBody();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simpleaspect.simpleAspect.ForStatement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Statement value);

} // ForStatement
