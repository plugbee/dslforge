/**
 */
package org.codingpark.piraterobot.play;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.codingpark.piraterobot.play.ParameterValue#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see org.codingpark.piraterobot.play.PlayPackage#getParameterValue()
 * @model
 * @generated
 */
public interface ParameterValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(int)
   * @see org.codingpark.piraterobot.play.PlayPackage#getParameterValue_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.ParameterValue#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

} // ParameterValue
