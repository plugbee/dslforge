/**
 */
package org.xtext.example.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.domainmodel.ImportSection#getImportDeclarations <em>Import Declarations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.domainmodel.DomainmodelPackage#getImportSection()
 * @model
 * @generated
 */
public interface ImportSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.domainmodel.ImportDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Declarations</em>' containment reference list.
   * @see org.xtext.example.domainmodel.DomainmodelPackage#getImportSection_ImportDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<ImportDeclaration> getImportDeclarations();

} // ImportSection
