/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simpleaspect.simpleAspect.impl;

import at.ac.tuwien.big.simpleaspect.simpleAspect.BinaryPointcutCondition;
import at.ac.tuwien.big.simpleaspect.simpleAspect.PointcutCondition;
import at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Pointcut Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.BinaryPointcutConditionImpl#getFirst <em>First</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.BinaryPointcutConditionImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.BinaryPointcutConditionImpl#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryPointcutConditionImpl extends PointcutConditionImpl implements BinaryPointcutCondition
{
  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected PointcutCondition first;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected PointcutCondition second;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryPointcutConditionImpl()
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
    return SimpleAspectPackage.Literals.BINARY_POINTCUT_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointcutCondition getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirst(PointcutCondition newFirst, NotificationChain msgs)
  {
    PointcutCondition oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST, oldFirst, newFirst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(PointcutCondition newFirst)
  {
    if (newFirst != first)
    {
      NotificationChain msgs = null;
      if (first != null)
        msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST, null, msgs);
      if (newFirst != null)
        msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST, null, msgs);
      msgs = basicSetFirst(newFirst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST, newFirst, newFirst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.BINARY_POINTCUT_CONDITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointcutCondition getSecond()
  {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecond(PointcutCondition newSecond, NotificationChain msgs)
  {
    PointcutCondition oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND, oldSecond, newSecond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(PointcutCondition newSecond)
  {
    if (newSecond != second)
    {
      NotificationChain msgs = null;
      if (second != null)
        msgs = ((InternalEObject)second).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND, null, msgs);
      if (newSecond != null)
        msgs = ((InternalEObject)newSecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND, null, msgs);
      msgs = basicSetSecond(newSecond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND, newSecond, newSecond));
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
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST:
        return basicSetFirst(null, msgs);
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND:
        return basicSetSecond(null, msgs);
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
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST:
        return getFirst();
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__TYPE:
        return getType();
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND:
        return getSecond();
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
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST:
        setFirst((PointcutCondition)newValue);
        return;
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__TYPE:
        setType((String)newValue);
        return;
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND:
        setSecond((PointcutCondition)newValue);
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
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST:
        setFirst((PointcutCondition)null);
        return;
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND:
        setSecond((PointcutCondition)null);
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
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__FIRST:
        return first != null;
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case SimpleAspectPackage.BINARY_POINTCUT_CONDITION__SECOND:
        return second != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //BinaryPointcutConditionImpl