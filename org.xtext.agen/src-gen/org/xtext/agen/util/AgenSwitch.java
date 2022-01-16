/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.agen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.agen.AgenPackage
 * @generated
 */
public class AgenSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AgenPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgenSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AgenPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AgenPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.TYPES:
      {
        Types types = (Types)theEObject;
        T result = caseTypes(types);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.RUN_CONFIGURATION:
      {
        RunConfiguration runConfiguration = (RunConfiguration)theEObject;
        T result = caseRunConfiguration(runConfiguration);
        if (result == null) result = caseTypes(runConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.LOG:
      {
        Log log = (Log)theEObject;
        T result = caseLog(log);
        if (result == null) result = caseTypes(log);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.SYNCPOINT:
      {
        Syncpoint syncpoint = (Syncpoint)theEObject;
        T result = caseSyncpoint(syncpoint);
        if (result == null) result = caseTypes(syncpoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.FAULT:
      {
        Fault fault = (Fault)theEObject;
        T result = caseFault(fault);
        if (result == null) result = caseTypes(fault);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.EXEC_PARAMS:
      {
        ExecParams execParams = (ExecParams)theEObject;
        T result = caseExecParams(execParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.WHAT:
      {
        What what = (What)theEObject;
        T result = caseWhat(what);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.REPEAT_EXECUTION:
      {
        RepeatExecution repeatExecution = (RepeatExecution)theEObject;
        T result = caseRepeatExecution(repeatExecution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.ALTER_PACKET_FAULT:
      {
        AlterPacketFault alterPacketFault = (AlterPacketFault)theEObject;
        T result = caseAlterPacketFault(alterPacketFault);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.LEAK_FAULT:
      {
        LeakFault leakFault = (LeakFault)theEObject;
        T result = caseLeakFault(leakFault);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.BIG_PACKET_FAULT:
      {
        BigPacketFault bigPacketFault = (BigPacketFault)theEObject;
        T result = caseBigPacketFault(bigPacketFault);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.EXIT:
      {
        Exit exit = (Exit)theEObject;
        T result = caseExit(exit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.SLEEP:
      {
        Sleep sleep = (Sleep)theEObject;
        T result = caseSleep(sleep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.CPU_LOADER:
      {
        CPULoader cpuLoader = (CPULoader)theEObject;
        T result = caseCPULoader(cpuLoader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.CODE_BLOCK:
      {
        CodeBlock codeBlock = (CodeBlock)theEObject;
        T result = caseCodeBlock(codeBlock);
        if (result == null) result = caseTypes(codeBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.FAULT_COND:
      {
        FaultCond faultCond = (FaultCond)theEObject;
        T result = caseFaultCond(faultCond);
        if (result == null) result = caseTypes(faultCond);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.WHEN:
      {
        When when = (When)theEObject;
        T result = caseWhen(when);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.RANDOM:
      {
        Random random = (Random)theEObject;
        T result = caseRandom(random);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.BETWEEN_SECONDS:
      {
        betweenSeconds betweenSeconds = (betweenSeconds)theEObject;
        T result = casebetweenSeconds(betweenSeconds);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.BETWEEN_ROUNDS:
      {
        betweenRounds betweenRounds = (betweenRounds)theEObject;
        T result = casebetweenRounds(betweenRounds);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = caseTypes(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AgenPackage.WHERE:
      {
        Where where = (Where)theEObject;
        T result = caseWhere(where);
        if (result == null) result = caseTypes(where);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypes(Types object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunConfiguration(RunConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Log</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Log</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLog(Log object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Syncpoint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Syncpoint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSyncpoint(Syncpoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fault</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fault</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFault(Fault object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exec Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exec Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecParams(ExecParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>What</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>What</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhat(What object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeat Execution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeat Execution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeatExecution(RepeatExecution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alter Packet Fault</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alter Packet Fault</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlterPacketFault(AlterPacketFault object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leak Fault</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leak Fault</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeakFault(LeakFault object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Big Packet Fault</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Big Packet Fault</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBigPacketFault(BigPacketFault object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExit(Exit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sleep</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sleep</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSleep(Sleep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CPU Loader</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CPU Loader</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCPULoader(CPULoader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeBlock(CodeBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fault Cond</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fault Cond</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFaultCond(FaultCond object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhen(When object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Random</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Random</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRandom(Random object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>between Seconds</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>between Seconds</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebetweenSeconds(betweenSeconds object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>between Rounds</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>between Rounds</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebetweenRounds(betweenRounds object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Where</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Where</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhere(Where object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AgenSwitch
