/**
 */
package org.eclipse.xtext.example.domainmodel.domainmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.TypeRef#getReferenced <em>Referenced</em>}</li>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.TypeRef#isMulti <em>Multi</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getTypeRef()
 * @model
 * @generated
 */
public interface TypeRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Referenced</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced</em>' reference.
   * @see #setReferenced(Type)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getTypeRef_Referenced()
   * @model
   * @generated
   */
  Type getReferenced();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.TypeRef#getReferenced <em>Referenced</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced</em>' reference.
   * @see #getReferenced()
   * @generated
   */
  void setReferenced(Type value);

  /**
   * Returns the value of the '<em><b>Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi</em>' attribute.
   * @see #setMulti(boolean)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getTypeRef_Multi()
   * @model
   * @generated
   */
  boolean isMulti();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.TypeRef#isMulti <em>Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi</em>' attribute.
   * @see #isMulti()
   * @generated
   */
  void setMulti(boolean value);

} // TypeRef
