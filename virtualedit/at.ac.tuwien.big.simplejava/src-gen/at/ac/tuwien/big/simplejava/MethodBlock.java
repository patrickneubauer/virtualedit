/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simplejava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simplejava.MethodBlock#isGenerated <em>Generated</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.MethodBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethodBlock()
 * @model
 * @generated
 */
public interface MethodBlock extends Statement
{
  /**
   * Returns the value of the '<em><b>Generated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generated</em>' attribute.
   * @see #setGenerated(boolean)
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethodBlock_Generated()
   * @model
   * @generated
   */
  boolean isGenerated();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.simplejava.MethodBlock#isGenerated <em>Generated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generated</em>' attribute.
   * @see #isGenerated()
   * @generated
   */
  void setGenerated(boolean value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.tuwien.big.simplejava.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see at.ac.tuwien.big.simplejava.SimplejavaPackage#getMethodBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // MethodBlock
