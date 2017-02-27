/**
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simplejava.impl;

import at.ac.tuwien.big.simplejava.GenericExpression;
import at.ac.tuwien.big.simplejava.ParanthesisOrBinaryExpression;
import at.ac.tuwien.big.simplejava.SimplejavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paranthesis Or Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.simplejava.impl.ParanthesisOrBinaryExpressionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.impl.ParanthesisOrBinaryExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.simplejava.impl.ParanthesisOrBinaryExpressionImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParanthesisOrBinaryExpressionImpl extends GenericExpressionImpl implements ParanthesisOrBinaryExpression
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected GenericExpression source;

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
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected GenericExpression argument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParanthesisOrBinaryExpressionImpl()
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
    return SimplejavaPackage.Literals.PARANTHESIS_OR_BINARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(GenericExpression newSource, NotificationChain msgs)
  {
    GenericExpression oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(GenericExpression newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE, newSource, newSource));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument(GenericExpression newArgument, NotificationChain msgs)
  {
    GenericExpression oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT, oldArgument, newArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(GenericExpression newArgument)
  {
    if (newArgument != argument)
    {
      NotificationChain msgs = null;
      if (argument != null)
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT, newArgument, newArgument));
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
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE:
        return basicSetSource(null, msgs);
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT:
        return basicSetArgument(null, msgs);
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
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE:
        return getSource();
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__TYPE:
        return getType();
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT:
        return getArgument();
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
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE:
        setSource((GenericExpression)newValue);
        return;
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__TYPE:
        setType((String)newValue);
        return;
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT:
        setArgument((GenericExpression)newValue);
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
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE:
        setSource((GenericExpression)null);
        return;
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT:
        setArgument((GenericExpression)null);
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
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__SOURCE:
        return source != null;
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case SimplejavaPackage.PARANTHESIS_OR_BINARY_EXPRESSION__ARGUMENT:
        return argument != null;
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

} //ParanthesisOrBinaryExpressionImpl