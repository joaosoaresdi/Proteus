/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.agen.AgenPackage;
import org.xtext.agen.AlterPacketFault;
import org.xtext.agen.BigPacketFault;
import org.xtext.agen.CPULoader;
import org.xtext.agen.CodeBlock;
import org.xtext.agen.Exit;
import org.xtext.agen.LeakFault;
import org.xtext.agen.RepeatExecution;
import org.xtext.agen.Sleep;
import org.xtext.agen.What;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>What</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getCodeBlock <em>Code Block</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getSleep <em>Sleep</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getBigPacketFault <em>Big Packet Fault</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getLeakFault <em>Leak Fault</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getAlterPacketFault <em>Alter Packet Fault</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getCpuLoader <em>Cpu Loader</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getSkipExecution <em>Skip Execution</em>}</li>
 *   <li>{@link org.xtext.agen.impl.WhatImpl#getRepeatExecution <em>Repeat Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhatImpl extends MinimalEObjectImpl.Container implements What
{
  /**
   * The cached value of the '{@link #getCodeBlock() <em>Code Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeBlock()
   * @generated
   * @ordered
   */
  protected CodeBlock codeBlock;

  /**
   * The cached value of the '{@link #getSleep() <em>Sleep</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSleep()
   * @generated
   * @ordered
   */
  protected Sleep sleep;

  /**
   * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected Exit exit;

  /**
   * The cached value of the '{@link #getBigPacketFault() <em>Big Packet Fault</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBigPacketFault()
   * @generated
   * @ordered
   */
  protected BigPacketFault bigPacketFault;

  /**
   * The cached value of the '{@link #getLeakFault() <em>Leak Fault</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeakFault()
   * @generated
   * @ordered
   */
  protected LeakFault leakFault;

  /**
   * The cached value of the '{@link #getAlterPacketFault() <em>Alter Packet Fault</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterPacketFault()
   * @generated
   * @ordered
   */
  protected AlterPacketFault alterPacketFault;

  /**
   * The cached value of the '{@link #getCpuLoader() <em>Cpu Loader</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpuLoader()
   * @generated
   * @ordered
   */
  protected CPULoader cpuLoader;

  /**
   * The default value of the '{@link #getSkipExecution() <em>Skip Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkipExecution()
   * @generated
   * @ordered
   */
  protected static final String SKIP_EXECUTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSkipExecution() <em>Skip Execution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkipExecution()
   * @generated
   * @ordered
   */
  protected String skipExecution = SKIP_EXECUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRepeatExecution() <em>Repeat Execution</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatExecution()
   * @generated
   * @ordered
   */
  protected RepeatExecution repeatExecution;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhatImpl()
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
    return AgenPackage.Literals.WHAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CodeBlock getCodeBlock()
  {
    return codeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCodeBlock(CodeBlock newCodeBlock, NotificationChain msgs)
  {
    CodeBlock oldCodeBlock = codeBlock;
    codeBlock = newCodeBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__CODE_BLOCK, oldCodeBlock, newCodeBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCodeBlock(CodeBlock newCodeBlock)
  {
    if (newCodeBlock != codeBlock)
    {
      NotificationChain msgs = null;
      if (codeBlock != null)
        msgs = ((InternalEObject)codeBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__CODE_BLOCK, null, msgs);
      if (newCodeBlock != null)
        msgs = ((InternalEObject)newCodeBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__CODE_BLOCK, null, msgs);
      msgs = basicSetCodeBlock(newCodeBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__CODE_BLOCK, newCodeBlock, newCodeBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sleep getSleep()
  {
    return sleep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSleep(Sleep newSleep, NotificationChain msgs)
  {
    Sleep oldSleep = sleep;
    sleep = newSleep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__SLEEP, oldSleep, newSleep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSleep(Sleep newSleep)
  {
    if (newSleep != sleep)
    {
      NotificationChain msgs = null;
      if (sleep != null)
        msgs = ((InternalEObject)sleep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__SLEEP, null, msgs);
      if (newSleep != null)
        msgs = ((InternalEObject)newSleep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__SLEEP, null, msgs);
      msgs = basicSetSleep(newSleep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__SLEEP, newSleep, newSleep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exit getExit()
  {
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExit(Exit newExit, NotificationChain msgs)
  {
    Exit oldExit = exit;
    exit = newExit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__EXIT, oldExit, newExit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExit(Exit newExit)
  {
    if (newExit != exit)
    {
      NotificationChain msgs = null;
      if (exit != null)
        msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__EXIT, null, msgs);
      if (newExit != null)
        msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__EXIT, null, msgs);
      msgs = basicSetExit(newExit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__EXIT, newExit, newExit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BigPacketFault getBigPacketFault()
  {
    return bigPacketFault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBigPacketFault(BigPacketFault newBigPacketFault, NotificationChain msgs)
  {
    BigPacketFault oldBigPacketFault = bigPacketFault;
    bigPacketFault = newBigPacketFault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__BIG_PACKET_FAULT, oldBigPacketFault, newBigPacketFault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBigPacketFault(BigPacketFault newBigPacketFault)
  {
    if (newBigPacketFault != bigPacketFault)
    {
      NotificationChain msgs = null;
      if (bigPacketFault != null)
        msgs = ((InternalEObject)bigPacketFault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__BIG_PACKET_FAULT, null, msgs);
      if (newBigPacketFault != null)
        msgs = ((InternalEObject)newBigPacketFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__BIG_PACKET_FAULT, null, msgs);
      msgs = basicSetBigPacketFault(newBigPacketFault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__BIG_PACKET_FAULT, newBigPacketFault, newBigPacketFault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LeakFault getLeakFault()
  {
    return leakFault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeakFault(LeakFault newLeakFault, NotificationChain msgs)
  {
    LeakFault oldLeakFault = leakFault;
    leakFault = newLeakFault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__LEAK_FAULT, oldLeakFault, newLeakFault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeakFault(LeakFault newLeakFault)
  {
    if (newLeakFault != leakFault)
    {
      NotificationChain msgs = null;
      if (leakFault != null)
        msgs = ((InternalEObject)leakFault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__LEAK_FAULT, null, msgs);
      if (newLeakFault != null)
        msgs = ((InternalEObject)newLeakFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__LEAK_FAULT, null, msgs);
      msgs = basicSetLeakFault(newLeakFault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__LEAK_FAULT, newLeakFault, newLeakFault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlterPacketFault getAlterPacketFault()
  {
    return alterPacketFault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlterPacketFault(AlterPacketFault newAlterPacketFault, NotificationChain msgs)
  {
    AlterPacketFault oldAlterPacketFault = alterPacketFault;
    alterPacketFault = newAlterPacketFault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__ALTER_PACKET_FAULT, oldAlterPacketFault, newAlterPacketFault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlterPacketFault(AlterPacketFault newAlterPacketFault)
  {
    if (newAlterPacketFault != alterPacketFault)
    {
      NotificationChain msgs = null;
      if (alterPacketFault != null)
        msgs = ((InternalEObject)alterPacketFault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__ALTER_PACKET_FAULT, null, msgs);
      if (newAlterPacketFault != null)
        msgs = ((InternalEObject)newAlterPacketFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__ALTER_PACKET_FAULT, null, msgs);
      msgs = basicSetAlterPacketFault(newAlterPacketFault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__ALTER_PACKET_FAULT, newAlterPacketFault, newAlterPacketFault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CPULoader getCpuLoader()
  {
    return cpuLoader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCpuLoader(CPULoader newCpuLoader, NotificationChain msgs)
  {
    CPULoader oldCpuLoader = cpuLoader;
    cpuLoader = newCpuLoader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__CPU_LOADER, oldCpuLoader, newCpuLoader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCpuLoader(CPULoader newCpuLoader)
  {
    if (newCpuLoader != cpuLoader)
    {
      NotificationChain msgs = null;
      if (cpuLoader != null)
        msgs = ((InternalEObject)cpuLoader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__CPU_LOADER, null, msgs);
      if (newCpuLoader != null)
        msgs = ((InternalEObject)newCpuLoader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__CPU_LOADER, null, msgs);
      msgs = basicSetCpuLoader(newCpuLoader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__CPU_LOADER, newCpuLoader, newCpuLoader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSkipExecution()
  {
    return skipExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSkipExecution(String newSkipExecution)
  {
    String oldSkipExecution = skipExecution;
    skipExecution = newSkipExecution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__SKIP_EXECUTION, oldSkipExecution, skipExecution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RepeatExecution getRepeatExecution()
  {
    return repeatExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepeatExecution(RepeatExecution newRepeatExecution, NotificationChain msgs)
  {
    RepeatExecution oldRepeatExecution = repeatExecution;
    repeatExecution = newRepeatExecution;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__REPEAT_EXECUTION, oldRepeatExecution, newRepeatExecution);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRepeatExecution(RepeatExecution newRepeatExecution)
  {
    if (newRepeatExecution != repeatExecution)
    {
      NotificationChain msgs = null;
      if (repeatExecution != null)
        msgs = ((InternalEObject)repeatExecution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__REPEAT_EXECUTION, null, msgs);
      if (newRepeatExecution != null)
        msgs = ((InternalEObject)newRepeatExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AgenPackage.WHAT__REPEAT_EXECUTION, null, msgs);
      msgs = basicSetRepeatExecution(newRepeatExecution, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgenPackage.WHAT__REPEAT_EXECUTION, newRepeatExecution, newRepeatExecution));
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
      case AgenPackage.WHAT__CODE_BLOCK:
        return basicSetCodeBlock(null, msgs);
      case AgenPackage.WHAT__SLEEP:
        return basicSetSleep(null, msgs);
      case AgenPackage.WHAT__EXIT:
        return basicSetExit(null, msgs);
      case AgenPackage.WHAT__BIG_PACKET_FAULT:
        return basicSetBigPacketFault(null, msgs);
      case AgenPackage.WHAT__LEAK_FAULT:
        return basicSetLeakFault(null, msgs);
      case AgenPackage.WHAT__ALTER_PACKET_FAULT:
        return basicSetAlterPacketFault(null, msgs);
      case AgenPackage.WHAT__CPU_LOADER:
        return basicSetCpuLoader(null, msgs);
      case AgenPackage.WHAT__REPEAT_EXECUTION:
        return basicSetRepeatExecution(null, msgs);
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
      case AgenPackage.WHAT__CODE_BLOCK:
        return getCodeBlock();
      case AgenPackage.WHAT__SLEEP:
        return getSleep();
      case AgenPackage.WHAT__EXIT:
        return getExit();
      case AgenPackage.WHAT__BIG_PACKET_FAULT:
        return getBigPacketFault();
      case AgenPackage.WHAT__LEAK_FAULT:
        return getLeakFault();
      case AgenPackage.WHAT__ALTER_PACKET_FAULT:
        return getAlterPacketFault();
      case AgenPackage.WHAT__CPU_LOADER:
        return getCpuLoader();
      case AgenPackage.WHAT__SKIP_EXECUTION:
        return getSkipExecution();
      case AgenPackage.WHAT__REPEAT_EXECUTION:
        return getRepeatExecution();
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
      case AgenPackage.WHAT__CODE_BLOCK:
        setCodeBlock((CodeBlock)newValue);
        return;
      case AgenPackage.WHAT__SLEEP:
        setSleep((Sleep)newValue);
        return;
      case AgenPackage.WHAT__EXIT:
        setExit((Exit)newValue);
        return;
      case AgenPackage.WHAT__BIG_PACKET_FAULT:
        setBigPacketFault((BigPacketFault)newValue);
        return;
      case AgenPackage.WHAT__LEAK_FAULT:
        setLeakFault((LeakFault)newValue);
        return;
      case AgenPackage.WHAT__ALTER_PACKET_FAULT:
        setAlterPacketFault((AlterPacketFault)newValue);
        return;
      case AgenPackage.WHAT__CPU_LOADER:
        setCpuLoader((CPULoader)newValue);
        return;
      case AgenPackage.WHAT__SKIP_EXECUTION:
        setSkipExecution((String)newValue);
        return;
      case AgenPackage.WHAT__REPEAT_EXECUTION:
        setRepeatExecution((RepeatExecution)newValue);
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
      case AgenPackage.WHAT__CODE_BLOCK:
        setCodeBlock((CodeBlock)null);
        return;
      case AgenPackage.WHAT__SLEEP:
        setSleep((Sleep)null);
        return;
      case AgenPackage.WHAT__EXIT:
        setExit((Exit)null);
        return;
      case AgenPackage.WHAT__BIG_PACKET_FAULT:
        setBigPacketFault((BigPacketFault)null);
        return;
      case AgenPackage.WHAT__LEAK_FAULT:
        setLeakFault((LeakFault)null);
        return;
      case AgenPackage.WHAT__ALTER_PACKET_FAULT:
        setAlterPacketFault((AlterPacketFault)null);
        return;
      case AgenPackage.WHAT__CPU_LOADER:
        setCpuLoader((CPULoader)null);
        return;
      case AgenPackage.WHAT__SKIP_EXECUTION:
        setSkipExecution(SKIP_EXECUTION_EDEFAULT);
        return;
      case AgenPackage.WHAT__REPEAT_EXECUTION:
        setRepeatExecution((RepeatExecution)null);
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
      case AgenPackage.WHAT__CODE_BLOCK:
        return codeBlock != null;
      case AgenPackage.WHAT__SLEEP:
        return sleep != null;
      case AgenPackage.WHAT__EXIT:
        return exit != null;
      case AgenPackage.WHAT__BIG_PACKET_FAULT:
        return bigPacketFault != null;
      case AgenPackage.WHAT__LEAK_FAULT:
        return leakFault != null;
      case AgenPackage.WHAT__ALTER_PACKET_FAULT:
        return alterPacketFault != null;
      case AgenPackage.WHAT__CPU_LOADER:
        return cpuLoader != null;
      case AgenPackage.WHAT__SKIP_EXECUTION:
        return SKIP_EXECUTION_EDEFAULT == null ? skipExecution != null : !SKIP_EXECUTION_EDEFAULT.equals(skipExecution);
      case AgenPackage.WHAT__REPEAT_EXECUTION:
        return repeatExecution != null;
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
    result.append(" (skipExecution: ");
    result.append(skipExecution);
    result.append(')');
    return result.toString();
  }

} //WhatImpl
