/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.agen.AgenPackage;
import org.xtext.agen.JOIN_TYPE;
import org.xtext.agen.Where;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.impl.WhereImpl#getJoinType <em>Join Type</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhereImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereImpl extends TypesImpl implements Where
{
  /**
   * The default value of the '{@link #getJoinType() <em>Join Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinType()
   * @generated
   * @ordered
   */
  protected static final JOIN_TYPE JOIN_TYPE_EDEFAULT = JOIN_TYPE.BEFORE;

  /**
   * The cached value of the '{@link #getJoinType() <em>Join Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinType()
   * @generated
   * @ordered
   */
  protected JOIN_TYPE joinType = JOIN_TYPE_EDEFAULT;

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
  protected WhereImpl()
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
    return AgenPackage.Literals.WHERE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JOIN_TYPE getJoinType()
  {
    return joinType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJoinType(JOIN_TYPE newJoinType)
  {
    JOIN_TYPE oldJoinType = joinType;
    joinType = newJoinType == null ? JOIN_TYPE_EDEFAULT : newJoinType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHERE__JOIN_TYPE, oldJoinType, joinType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHERE__NAME, oldName, name));
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
      case AgenPackage.WHERE__JOIN_TYPE:
        return getJoinType();
      case AgenPackage.WHERE__NAME:
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
      case AgenPackage.WHERE__JOIN_TYPE:
        setJoinType((JOIN_TYPE)newValue);
        return;
      case AgenPackage.WHERE__NAME:
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
      case AgenPackage.WHERE__JOIN_TYPE:
        setJoinType(JOIN_TYPE_EDEFAULT);
        return;
      case AgenPackage.WHERE__NAME:
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
      case AgenPackage.WHERE__JOIN_TYPE:
        return joinType != JOIN_TYPE_EDEFAULT;
      case AgenPackage.WHERE__NAME:
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (joinType: ");
    result.append(joinType);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //WhereImpl
