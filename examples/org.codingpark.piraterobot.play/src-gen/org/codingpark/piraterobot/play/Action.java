/**
 */
package org.codingpark.piraterobot.play;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.codingpark.piraterobot.play.Action#isIsUp <em>Is Up</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#isIsRight <em>Is Right</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#isIsDown <em>Is Down</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#isIsLeft <em>Is Left</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#isIsDig <em>Is Dig</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#isIsJump <em>Is Jump</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#isIsFight <em>Is Fight</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#isIsRepeat <em>Is Repeat</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.Action#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.codingpark.piraterobot.play.PlayPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Up</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Up</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Up</em>' attribute.
   * @see #setIsUp(boolean)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_IsUp()
   * @model
   * @generated
   */
  boolean isIsUp();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#isIsUp <em>Is Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Up</em>' attribute.
   * @see #isIsUp()
   * @generated
   */
  void setIsUp(boolean value);

  /**
   * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Value</em>' containment reference.
   * @see #setParameterValue(ParameterValue)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_ParameterValue()
   * @model containment="true"
   * @generated
   */
  ParameterValue getParameterValue();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#getParameterValue <em>Parameter Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Value</em>' containment reference.
   * @see #getParameterValue()
   * @generated
   */
  void setParameterValue(ParameterValue value);

  /**
   * Returns the value of the '<em><b>Is Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Right</em>' attribute.
   * @see #setIsRight(boolean)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_IsRight()
   * @model
   * @generated
   */
  boolean isIsRight();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#isIsRight <em>Is Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Right</em>' attribute.
   * @see #isIsRight()
   * @generated
   */
  void setIsRight(boolean value);

  /**
   * Returns the value of the '<em><b>Is Down</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Down</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Down</em>' attribute.
   * @see #setIsDown(boolean)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_IsDown()
   * @model
   * @generated
   */
  boolean isIsDown();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#isIsDown <em>Is Down</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Down</em>' attribute.
   * @see #isIsDown()
   * @generated
   */
  void setIsDown(boolean value);

  /**
   * Returns the value of the '<em><b>Is Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Left</em>' attribute.
   * @see #setIsLeft(boolean)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_IsLeft()
   * @model
   * @generated
   */
  boolean isIsLeft();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#isIsLeft <em>Is Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Left</em>' attribute.
   * @see #isIsLeft()
   * @generated
   */
  void setIsLeft(boolean value);

  /**
   * Returns the value of the '<em><b>Is Dig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Dig</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Dig</em>' attribute.
   * @see #setIsDig(boolean)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_IsDig()
   * @model
   * @generated
   */
  boolean isIsDig();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#isIsDig <em>Is Dig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Dig</em>' attribute.
   * @see #isIsDig()
   * @generated
   */
  void setIsDig(boolean value);

  /**
   * Returns the value of the '<em><b>Is Jump</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Jump</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Jump</em>' attribute.
   * @see #setIsJump(boolean)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_IsJump()
   * @model
   * @generated
   */
  boolean isIsJump();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#isIsJump <em>Is Jump</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Jump</em>' attribute.
   * @see #isIsJump()
   * @generated
   */
  void setIsJump(boolean value);

  /**
   * Returns the value of the '<em><b>Is Fight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Fight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Fight</em>' attribute.
   * @see #setIsFight(boolean)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_IsFight()
   * @model
   * @generated
   */
  boolean isIsFight();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#isIsFight <em>Is Fight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Fight</em>' attribute.
   * @see #isIsFight()
   * @generated
   */
  void setIsFight(boolean value);

  /**
   * Returns the value of the '<em><b>Is Repeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Repeat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Repeat</em>' attribute.
   * @see #setIsRepeat(boolean)
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_IsRepeat()
   * @model
   * @generated
   */
  boolean isIsRepeat();

  /**
   * Sets the value of the '{@link org.codingpark.piraterobot.play.Action#isIsRepeat <em>Is Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Repeat</em>' attribute.
   * @see #isIsRepeat()
   * @generated
   */
  void setIsRepeat(boolean value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.codingpark.piraterobot.play.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see org.codingpark.piraterobot.play.PlayPackage#getAction_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Action
