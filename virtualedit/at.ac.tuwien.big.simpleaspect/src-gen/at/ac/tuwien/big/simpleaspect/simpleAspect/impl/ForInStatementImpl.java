/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simpleaspect.simpleAspect.impl;

import at.ac.tuwien.big.simpleaspect.simpleAspect.ForInStatement;
import at.ac.tuwien.big.simpleaspect.simpleAspect.GenericExpression;
import at.ac.tuwien.big.simpleaspect.simpleAspect.Parameter;
import at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage;
import at.ac.tuwien.big.simpleaspect.simpleAspect.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For In Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.ForInStatementImpl#getSubparameter <em>Subparameter</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.ForInStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.ForInStatementImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForInStatementImpl extends StatementImpl implements ForInStatement
{
  /**
   * The cached value of the '{@link #getSubparameter() <em>Subparameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubparameter()
   * @generated
   * @ordered
   */
  protected Parameter subparameter;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected GenericExpression expression;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Statement body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForInStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimpleAspectPackage.Literals.FOR_IN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getSubparameter()
  {
    return subparameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubparameter(Parameter newSubparameter, NotificationChain msgs)
  {
    Parameter oldSubparameter = subparameter;
    subparameter = newSubparameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER, oldSubparameter, newSubparameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubparameter(Parameter newSubparameter)
  {
    if (newSubparameter != subparameter)
    {
      NotificationChain msgs = null;
      if (subparameter != null)
        msgs = ((InternalEObject)subparameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER, null, msgs);
      if (newSubparameter != null)
        msgs = ((InternalEObject)newSubparameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER, null, msgs);
      msgs = basicSetSubparameter(newSubparameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER, newSubparameter, newSubparameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(GenericExpression newExpression, NotificationChain msgs)
  {
    GenericExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(GenericExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Statement newBody, NotificationChain msgs)
  {
    Statement oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOR_IN_STATEMENT__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Statement newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.FOR_IN_STATEMENT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.FOR_IN_STATEMENT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOR_IN_STATEMENT__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER:
        return basicSetSubparameter(null, msgs);
      case SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SimpleAspectPackage.FOR_IN_STATEMENT__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER:
        return getSubparameter();
      case SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION:
        return getExpression();
      case SimpleAspectPackage.FOR_IN_STATEMENT__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER:
        setSubparameter((Parameter)newValue);
        return;
      case SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION:
        setExpression((GenericExpression)newValue);
        return;
      case SimpleAspectPackage.FOR_IN_STATEMENT__BODY:
        setBody((Statement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER:
        setSubparameter((Parameter)null);
        return;
      case SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION:
        setExpression((GenericExpression)null);
        return;
      case SimpleAspectPackage.FOR_IN_STATEMENT__BODY:
        setBody((Statement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimpleAspectPackage.FOR_IN_STATEMENT__SUBPARAMETER:
        return subparameter != null;
      case SimpleAspectPackage.FOR_IN_STATEMENT__EXPRESSION:
        return expression != null;
      case SimpleAspectPackage.FOR_IN_STATEMENT__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //ForInStatementImpl
