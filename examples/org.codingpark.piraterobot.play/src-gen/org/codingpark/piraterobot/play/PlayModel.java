/**
 */
package org.codingpark.piraterobot.play;

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
 *   <li>{@link org.codingpark.piraterobot.play.PlayModel#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @see org.codingpark.piraterobot.play.PlayPackage#getPlayModel()
 * @model
 * @generated
 */
public interface PlayModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link org.codingpark.piraterobot.play.Procedure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see org.codingpark.piraterobot.play.PlayPackage#getPlayModel_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<Procedure> getProcedures();

} // PlayModel
