/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.FaultCond#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.agen.FaultCond#getWhere <em>Where</em>}</li>
 *   <li>{@link org.xtext.agen.FaultCond#getWhen <em>When</em>}</li>
 *   <li>{@link org.xtext.agen.FaultCond#getExtraData <em>Extra Data</em>}</li>
 * </ul>
 *
 * @see org.xtext.agen.AgenPackage#getFaultCond()
 * @model
 * @generated
 */
public interface FaultCond extends Types
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.agen.AgenPackage#getFaultCond_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.agen.FaultCond#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(Where)
   * @see org.xtext.agen.AgenPackage#getFaultCond_Where()
   * @model containment="true"
   * @generated
   */
  Where getWhere();

  /**
   * Sets the value of the '{@link org.xtext.agen.FaultCond#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(Where value);

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(When)
   * @see org.xtext.agen.AgenPackage#getFaultCond_When()
   * @model containment="true"
   * @generated
   */
  When getWhen();

  /**
   * Sets the value of the '{@link org.xtext.agen.FaultCond#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(When value);

  /**
   * Returns the value of the '<em><b>Extra Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra Data</em>' containment reference.
   * @see #setExtraData(CodeBlock)
   * @see org.xtext.agen.AgenPackage#getFaultCond_ExtraData()
   * @model containment="true"
   * @generated
   */
  CodeBlock getExtraData();

  /**
   * Sets the value of the '{@link org.xtext.agen.FaultCond#getExtraData <em>Extra Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extra Data</em>' containment reference.
   * @see #getExtraData()
   * @generated
   */
  void setExtraData(CodeBlock value);

} // FaultCond
