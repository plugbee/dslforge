/**
 */
package org.codingpark.piraterobot.play.impl;

import java.util.Collection;

import org.codingpark.piraterobot.play.Action;
import org.codingpark.piraterobot.play.ParameterValue;
import org.codingpark.piraterobot.play.PlayPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#isIsUp <em>Is Up</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#isIsRight <em>Is Right</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#isIsDown <em>Is Down</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#isIsLeft <em>Is Left</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#isIsDig <em>Is Dig</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#isIsJump <em>Is Jump</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#isIsFight <em>Is Fight</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#isIsRepeat <em>Is Repeat</em>}</li>
 *   <li>{@link org.codingpark.piraterobot.play.impl.ActionImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #isIsUp() <em>Is Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsUp()
   * @generated
   * @ordered
   */
  protected static final boolean IS_UP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsUp() <em>Is Up</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsUp()
   * @generated
   * @ordered
   */
  protected boolean isUp = IS_UP_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterValue() <em>Parameter Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterValue()
   * @generated
   * @ordered
   */
  protected ParameterValue parameterValue;

  /**
   * The default value of the '{@link #isIsRight() <em>Is Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRight()
   * @generated
   * @ordered
   */
  protected static final boolean IS_RIGHT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsRight() <em>Is Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRight()
   * @generated
   * @ordered
   */
  protected boolean isRight = IS_RIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsDown() <em>Is Down</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDown()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DOWN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDown() <em>Is Down</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDown()
   * @generated
   * @ordered
   */
  protected boolean isDown = IS_DOWN_EDEFAULT;

  /**
   * The default value of the '{@link #isIsLeft() <em>Is Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLeft()
   * @generated
   * @ordered
   */
  protected static final boolean IS_LEFT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsLeft() <em>Is Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsLeft()
   * @generated
   * @ordered
   */
  protected boolean isLeft = IS_LEFT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsDig() <em>Is Dig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDig()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DIG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDig() <em>Is Dig</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDig()
   * @generated
   * @ordered
   */
  protected boolean isDig = IS_DIG_EDEFAULT;

  /**
   * The default value of the '{@link #isIsJump() <em>Is Jump</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsJump()
   * @generated
   * @ordered
   */
  protected static final boolean IS_JUMP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsJump() <em>Is Jump</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsJump()
   * @generated
   * @ordered
   */
  protected boolean isJump = IS_JUMP_EDEFAULT;

  /**
   * The default value of the '{@link #isIsFight() <em>Is Fight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFight()
   * @generated
   * @ordered
   */
  protected static final boolean IS_FIGHT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsFight() <em>Is Fight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFight()
   * @generated
   * @ordered
   */
  protected boolean isFight = IS_FIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #isIsRepeat() <em>Is Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRepeat()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REPEAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsRepeat() <em>Is Repeat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRepeat()
   * @generated
   * @ordered
   */
  protected boolean isRepeat = IS_REPEAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Action> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return PlayPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsUp()
  {
    return isUp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsUp(boolean newIsUp)
  {
    boolean oldIsUp = isUp;
    isUp = newIsUp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__IS_UP, oldIsUp, isUp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue getParameterValue()
  {
    return parameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterValue(ParameterValue newParameterValue, NotificationChain msgs)
  {
    ParameterValue oldParameterValue = parameterValue;
    parameterValue = newParameterValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__PARAMETER_VALUE, oldParameterValue, newParameterValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterValue(ParameterValue newParameterValue)
  {
    if (newParameterValue != parameterValue)
    {
      NotificationChain msgs = null;
      if (parameterValue != null)
        msgs = ((InternalEObject)parameterValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlayPackage.ACTION__PARAMETER_VALUE, null, msgs);
      if (newParameterValue != null)
        msgs = ((InternalEObject)newParameterValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlayPackage.ACTION__PARAMETER_VALUE, null, msgs);
      msgs = basicSetParameterValue(newParameterValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__PARAMETER_VALUE, newParameterValue, newParameterValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsRight()
  {
    return isRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRight(boolean newIsRight)
  {
    boolean oldIsRight = isRight;
    isRight = newIsRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__IS_RIGHT, oldIsRight, isRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDown()
  {
    return isDown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDown(boolean newIsDown)
  {
    boolean oldIsDown = isDown;
    isDown = newIsDown;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__IS_DOWN, oldIsDown, isDown));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsLeft()
  {
    return isLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsLeft(boolean newIsLeft)
  {
    boolean oldIsLeft = isLeft;
    isLeft = newIsLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__IS_LEFT, oldIsLeft, isLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDig()
  {
    return isDig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDig(boolean newIsDig)
  {
    boolean oldIsDig = isDig;
    isDig = newIsDig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__IS_DIG, oldIsDig, isDig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsJump()
  {
    return isJump;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsJump(boolean newIsJump)
  {
    boolean oldIsJump = isJump;
    isJump = newIsJump;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__IS_JUMP, oldIsJump, isJump));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsFight()
  {
    return isFight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsFight(boolean newIsFight)
  {
    boolean oldIsFight = isFight;
    isFight = newIsFight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__IS_FIGHT, oldIsFight, isFight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsRepeat()
  {
    return isRepeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRepeat(boolean newIsRepeat)
  {
    boolean oldIsRepeat = isRepeat;
    isRepeat = newIsRepeat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PlayPackage.ACTION__IS_REPEAT, oldIsRepeat, isRepeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Action>(Action.class, this, PlayPackage.ACTION__ACTIONS);
    }
    return actions;
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
      case PlayPackage.ACTION__PARAMETER_VALUE:
        return basicSetParameterValue(null, msgs);
      case PlayPackage.ACTION__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case PlayPackage.ACTION__IS_UP:
        return isIsUp();
      case PlayPackage.ACTION__PARAMETER_VALUE:
        return getParameterValue();
      case PlayPackage.ACTION__IS_RIGHT:
        return isIsRight();
      case PlayPackage.ACTION__IS_DOWN:
        return isIsDown();
      case PlayPackage.ACTION__IS_LEFT:
        return isIsLeft();
      case PlayPackage.ACTION__IS_DIG:
        return isIsDig();
      case PlayPackage.ACTION__IS_JUMP:
        return isIsJump();
      case PlayPackage.ACTION__IS_FIGHT:
        return isIsFight();
      case PlayPackage.ACTION__IS_REPEAT:
        return isIsRepeat();
      case PlayPackage.ACTION__ACTIONS:
        return getActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlayPackage.ACTION__IS_UP:
        setIsUp((Boolean)newValue);
        return;
      case PlayPackage.ACTION__PARAMETER_VALUE:
        setParameterValue((ParameterValue)newValue);
        return;
      case PlayPackage.ACTION__IS_RIGHT:
        setIsRight((Boolean)newValue);
        return;
      case PlayPackage.ACTION__IS_DOWN:
        setIsDown((Boolean)newValue);
        return;
      case PlayPackage.ACTION__IS_LEFT:
        setIsLeft((Boolean)newValue);
        return;
      case PlayPackage.ACTION__IS_DIG:
        setIsDig((Boolean)newValue);
        return;
      case PlayPackage.ACTION__IS_JUMP:
        setIsJump((Boolean)newValue);
        return;
      case PlayPackage.ACTION__IS_FIGHT:
        setIsFight((Boolean)newValue);
        return;
      case PlayPackage.ACTION__IS_REPEAT:
        setIsRepeat((Boolean)newValue);
        return;
      case PlayPackage.ACTION__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Action>)newValue);
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
      case PlayPackage.ACTION__IS_UP:
        setIsUp(IS_UP_EDEFAULT);
        return;
      case PlayPackage.ACTION__PARAMETER_VALUE:
        setParameterValue((ParameterValue)null);
        return;
      case PlayPackage.ACTION__IS_RIGHT:
        setIsRight(IS_RIGHT_EDEFAULT);
        return;
      case PlayPackage.ACTION__IS_DOWN:
        setIsDown(IS_DOWN_EDEFAULT);
        return;
      case PlayPackage.ACTION__IS_LEFT:
        setIsLeft(IS_LEFT_EDEFAULT);
        return;
      case PlayPackage.ACTION__IS_DIG:
        setIsDig(IS_DIG_EDEFAULT);
        return;
      case PlayPackage.ACTION__IS_JUMP:
        setIsJump(IS_JUMP_EDEFAULT);
        return;
      case PlayPackage.ACTION__IS_FIGHT:
        setIsFight(IS_FIGHT_EDEFAULT);
        return;
      case PlayPackage.ACTION__IS_REPEAT:
        setIsRepeat(IS_REPEAT_EDEFAULT);
        return;
      case PlayPackage.ACTION__ACTIONS:
        getActions().clear();
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
      case PlayPackage.ACTION__IS_UP:
        return isUp != IS_UP_EDEFAULT;
      case PlayPackage.ACTION__PARAMETER_VALUE:
        return parameterValue != null;
      case PlayPackage.ACTION__IS_RIGHT:
        return isRight != IS_RIGHT_EDEFAULT;
      case PlayPackage.ACTION__IS_DOWN:
        return isDown != IS_DOWN_EDEFAULT;
      case PlayPackage.ACTION__IS_LEFT:
        return isLeft != IS_LEFT_EDEFAULT;
      case PlayPackage.ACTION__IS_DIG:
        return isDig != IS_DIG_EDEFAULT;
      case PlayPackage.ACTION__IS_JUMP:
        return isJump != IS_JUMP_EDEFAULT;
      case PlayPackage.ACTION__IS_FIGHT:
        return isFight != IS_FIGHT_EDEFAULT;
      case PlayPackage.ACTION__IS_REPEAT:
        return isRepeat != IS_REPEAT_EDEFAULT;
      case PlayPackage.ACTION__ACTIONS:
        return actions != null && !actions.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isUp: ");
    result.append(isUp);
    result.append(", isRight: ");
    result.append(isRight);
    result.append(", isDown: ");
    result.append(isDown);
    result.append(", isLeft: ");
    result.append(isLeft);
    result.append(", isDig: ");
    result.append(isDig);
    result.append(", isJump: ");
    result.append(isJump);
    result.append(", isFight: ");
    result.append(isFight);
    result.append(", isRepeat: ");
    result.append(isRepeat);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
