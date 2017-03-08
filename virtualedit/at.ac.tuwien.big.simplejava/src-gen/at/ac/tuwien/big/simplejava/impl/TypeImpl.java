/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simplejava.impl;

import at.ac.tuwien.big.simplejava.ClassDeclaration;
import at.ac.tuwien.big.simplejava.SimplejavaPackage;
import at.ac.tuwien.big.simplejava.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simplejava.impl.TypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.impl.TypeImpl#isIsVoid <em>Is Void</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.impl.TypeImpl#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected static final String TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected String typeName = TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isIsVoid() <em>Is Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsVoid()
   * @generated
   * @ordered
   */
  protected static final boolean IS_VOID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsVoid() <em>Is Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsVoid()
   * @generated
   * @ordered
   */
  protected boolean isVoid = IS_VOID_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeRef()
   * @generated
   * @ordered
   */
  protected ClassDeclaration typeRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return SimplejavaPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(String newTypeName)
  {
    String oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.TYPE__TYPE_NAME, oldTypeName, typeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsVoid()
  {
    return isVoid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsVoid(boolean newIsVoid)
  {
    boolean oldIsVoid = isVoid;
    isVoid = newIsVoid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.TYPE__IS_VOID, oldIsVoid, isVoid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration getTypeRef()
  {
    if (typeRef != null && typeRef.eIsProxy())
    {
      InternalEObject oldTypeRef = (InternalEObject)typeRef;
      typeRef = (ClassDeclaration)eResolveProxy(oldTypeRef);
      if (typeRef != oldTypeRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplejavaPackage.TYPE__TYPE_REF, oldTypeRef, typeRef));
      }
    }
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration basicGetTypeRef()
  {
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeRef(ClassDeclaration newTypeRef)
  {
    ClassDeclaration oldTypeRef = typeRef;
    typeRef = newTypeRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.TYPE__TYPE_REF, oldTypeRef, typeRef));
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
      case SimplejavaPackage.TYPE__TYPE_NAME:
        return getTypeName();
      case SimplejavaPackage.TYPE__IS_VOID:
        return isIsVoid();
      case SimplejavaPackage.TYPE__TYPE_REF:
        if (resolve) return getTypeRef();
        return basicGetTypeRef();
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
      case SimplejavaPackage.TYPE__TYPE_NAME:
        setTypeName((String)newValue);
        return;
      case SimplejavaPackage.TYPE__IS_VOID:
        setIsVoid((Boolean)newValue);
        return;
      case SimplejavaPackage.TYPE__TYPE_REF:
        setTypeRef((ClassDeclaration)newValue);
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
      case SimplejavaPackage.TYPE__TYPE_NAME:
        setTypeName(TYPE_NAME_EDEFAULT);
        return;
      case SimplejavaPackage.TYPE__IS_VOID:
        setIsVoid(IS_VOID_EDEFAULT);
        return;
      case SimplejavaPackage.TYPE__TYPE_REF:
        setTypeRef((ClassDeclaration)null);
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
      case SimplejavaPackage.TYPE__TYPE_NAME:
        return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
      case SimplejavaPackage.TYPE__IS_VOID:
        return isVoid != IS_VOID_EDEFAULT;
      case SimplejavaPackage.TYPE__TYPE_REF:
        return typeRef != null;
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
    result.append(" (typeName: ");
    result.append(typeName);
    result.append(", isVoid: ");
    result.append(isVoid);
    result.append(')');
    return result.toString();
  }

} //TypeImpl