/**
 * generated by Xtext 2.25.0
 */
package org.xtext.agen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.agen.Model#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.xtext.agen.AgenPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.agen.Types}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.xtext.agen.AgenPackage#getModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<Types> getTypes();

} // Model
