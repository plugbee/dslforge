/**
 */
package org.eclipse.xtext.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.Operation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.Operation#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Feature
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.xtext.example.domainmodel.domainmodel.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.Visibility
   * @see #setVisibility(Visibility)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getOperation_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.Operation#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.example.domainmodel.domainmodel.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getOperation_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

} // Operation
