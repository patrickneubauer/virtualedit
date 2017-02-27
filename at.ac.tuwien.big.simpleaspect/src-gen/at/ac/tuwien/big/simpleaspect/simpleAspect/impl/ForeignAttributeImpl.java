/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simpleaspect.simpleAspect.impl;

import at.ac.tuwien.big.simpleaspect.simpleAspect.ForeignAttribute;
import at.ac.tuwien.big.simpleaspect.simpleAspect.SimpleAspectPackage;
import at.ac.tuwien.big.simpleaspect.simpleAspect.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.ForeignAttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.ForeignAttributeImpl#getInType <em>In Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simpleaspect.simpleAspect.impl.ForeignAttributeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignAttributeImpl extends MinimalEObjectImpl.Container implements ForeignAttribute
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #getInType() <em>In Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInType()
   * @generated
   * @ordered
   */
  protected static final String IN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInType() <em>In Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInType()
   * @generated
   * @ordered
   */
  protected String inType = IN_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeignAttributeImpl()
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
    return SimpleAspectPackage.Literals.FOREIGN_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInType()
  {
    return inType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInType(String newInType)
  {
    String oldInType = inType;
    inType = newInType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOREIGN_ATTRIBUTE__IN_TYPE, oldInType, inType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleAspectPackage.FOREIGN_ATTRIBUTE__NAME, oldName, name));
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
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE:
        return basicSetType(null, msgs);
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
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE:
        return getType();
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__IN_TYPE:
        return getInType();
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__NAME:
        return getName();
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
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE:
        setType((Type)newValue);
        return;
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__IN_TYPE:
        setInType((String)newValue);
        return;
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__NAME:
        setName((String)newValue);
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
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE:
        setType((Type)null);
        return;
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__IN_TYPE:
        setInType(IN_TYPE_EDEFAULT);
        return;
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
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
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__TYPE:
        return type != null;
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__IN_TYPE:
        return IN_TYPE_EDEFAULT == null ? inType != null : !IN_TYPE_EDEFAULT.equals(inType);
      case SimpleAspectPackage.FOREIGN_ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (inType: ");
    result.append(inType);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ForeignAttributeImpl