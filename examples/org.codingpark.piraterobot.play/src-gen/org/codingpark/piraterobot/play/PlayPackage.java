/**
 */
package org.codingpark.piraterobot.play;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.codingpark.piraterobot.play.PlayFactory
 * @model kind="package"
 * @generated
 */
public interface PlayPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "play";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.codingpark.org/piraterobot/Play";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "play";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PlayPackage eINSTANCE = org.codingpark.piraterobot.play.impl.PlayPackageImpl.init();

  /**
   * The meta object id for the '{@link org.codingpark.piraterobot.play.impl.PlayModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingpark.piraterobot.play.impl.PlayModelImpl
   * @see org.codingpark.piraterobot.play.impl.PlayPackageImpl#getPlayModel()
   * @generated
   */
  int PLAY_MODEL = 0;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAY_MODEL__PROCEDURES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAY_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.codingpark.piraterobot.play.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingpark.piraterobot.play.impl.ProcedureImpl
   * @see org.codingpark.piraterobot.play.impl.PlayPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.codingpark.piraterobot.play.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingpark.piraterobot.play.impl.ActionImpl
   * @see org.codingpark.piraterobot.play.impl.PlayPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The feature id for the '<em><b>Is Up</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_UP = 0;

  /**
   * The feature id for the '<em><b>Parameter Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PARAMETER_VALUE = 1;

  /**
   * The feature id for the '<em><b>Is Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_RIGHT = 2;

  /**
   * The feature id for the '<em><b>Is Down</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_DOWN = 3;

  /**
   * The feature id for the '<em><b>Is Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_LEFT = 4;

  /**
   * The feature id for the '<em><b>Is Dig</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_DIG = 5;

  /**
   * The feature id for the '<em><b>Is Jump</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_JUMP = 6;

  /**
   * The feature id for the '<em><b>Is Fight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_FIGHT = 7;

  /**
   * The feature id for the '<em><b>Is Repeat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__IS_REPEAT = 8;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTIONS = 9;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.codingpark.piraterobot.play.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.codingpark.piraterobot.play.impl.ParameterValueImpl
   * @see org.codingpark.piraterobot.play.impl.PlayPackageImpl#getParameterValue()
   * @generated
   */
  int PARAMETER_VALUE = 3;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE__NUM = 0;

  /**
   * The number of structural features of the '<em>Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.codingpark.piraterobot.play.PlayModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.codingpark.piraterobot.play.PlayModel
   * @generated
   */
  EClass getPlayModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.codingpark.piraterobot.play.PlayModel#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see org.codingpark.piraterobot.play.PlayModel#getProcedures()
   * @see #getPlayModel()
   * @generated
   */
  EReference getPlayModel_Procedures();

  /**
   * Returns the meta object for class '{@link org.codingpark.piraterobot.play.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see org.codingpark.piraterobot.play.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.codingpark.piraterobot.play.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.codingpark.piraterobot.play.Procedure#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.codingpark.piraterobot.play.Procedure#getActions()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Actions();

  /**
   * Returns the meta object for class '{@link org.codingpark.piraterobot.play.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.codingpark.piraterobot.play.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Action#isIsUp <em>Is Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Up</em>'.
   * @see org.codingpark.piraterobot.play.Action#isIsUp()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsUp();

  /**
   * Returns the meta object for the containment reference '{@link org.codingpark.piraterobot.play.Action#getParameterValue <em>Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter Value</em>'.
   * @see org.codingpark.piraterobot.play.Action#getParameterValue()
   * @see #getAction()
   * @generated
   */
  EReference getAction_ParameterValue();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Action#isIsRight <em>Is Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Right</em>'.
   * @see org.codingpark.piraterobot.play.Action#isIsRight()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsRight();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Action#isIsDown <em>Is Down</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Down</em>'.
   * @see org.codingpark.piraterobot.play.Action#isIsDown()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsDown();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Action#isIsLeft <em>Is Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Left</em>'.
   * @see org.codingpark.piraterobot.play.Action#isIsLeft()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsLeft();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Action#isIsDig <em>Is Dig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Dig</em>'.
   * @see org.codingpark.piraterobot.play.Action#isIsDig()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsDig();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Action#isIsJump <em>Is Jump</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Jump</em>'.
   * @see org.codingpark.piraterobot.play.Action#isIsJump()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsJump();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Action#isIsFight <em>Is Fight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Fight</em>'.
   * @see org.codingpark.piraterobot.play.Action#isIsFight()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsFight();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.Action#isIsRepeat <em>Is Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Repeat</em>'.
   * @see org.codingpark.piraterobot.play.Action#isIsRepeat()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_IsRepeat();

  /**
   * Returns the meta object for the containment reference list '{@link org.codingpark.piraterobot.play.Action#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.codingpark.piraterobot.play.Action#getActions()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Actions();

  /**
   * Returns the meta object for class '{@link org.codingpark.piraterobot.play.ParameterValue <em>Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Value</em>'.
   * @see org.codingpark.piraterobot.play.ParameterValue
   * @generated
   */
  EClass getParameterValue();

  /**
   * Returns the meta object for the attribute '{@link org.codingpark.piraterobot.play.ParameterValue#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.codingpark.piraterobot.play.ParameterValue#getNum()
   * @see #getParameterValue()
   * @generated
   */
  EAttribute getParameterValue_Num();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PlayFactory getPlayFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.codingpark.piraterobot.play.impl.PlayModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingpark.piraterobot.play.impl.PlayModelImpl
     * @see org.codingpark.piraterobot.play.impl.PlayPackageImpl#getPlayModel()
     * @generated
     */
    EClass PLAY_MODEL = eINSTANCE.getPlayModel();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAY_MODEL__PROCEDURES = eINSTANCE.getPlayModel_Procedures();

    /**
     * The meta object literal for the '{@link org.codingpark.piraterobot.play.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingpark.piraterobot.play.impl.ProcedureImpl
     * @see org.codingpark.piraterobot.play.impl.PlayPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__ACTIONS = eINSTANCE.getProcedure_Actions();

    /**
     * The meta object literal for the '{@link org.codingpark.piraterobot.play.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingpark.piraterobot.play.impl.ActionImpl
     * @see org.codingpark.piraterobot.play.impl.PlayPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Is Up</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_UP = eINSTANCE.getAction_IsUp();

    /**
     * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__PARAMETER_VALUE = eINSTANCE.getAction_ParameterValue();

    /**
     * The meta object literal for the '<em><b>Is Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_RIGHT = eINSTANCE.getAction_IsRight();

    /**
     * The meta object literal for the '<em><b>Is Down</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_DOWN = eINSTANCE.getAction_IsDown();

    /**
     * The meta object literal for the '<em><b>Is Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_LEFT = eINSTANCE.getAction_IsLeft();

    /**
     * The meta object literal for the '<em><b>Is Dig</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_DIG = eINSTANCE.getAction_IsDig();

    /**
     * The meta object literal for the '<em><b>Is Jump</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_JUMP = eINSTANCE.getAction_IsJump();

    /**
     * The meta object literal for the '<em><b>Is Fight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_FIGHT = eINSTANCE.getAction_IsFight();

    /**
     * The meta object literal for the '<em><b>Is Repeat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__IS_REPEAT = eINSTANCE.getAction_IsRepeat();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ACTIONS = eINSTANCE.getAction_Actions();

    /**
     * The meta object literal for the '{@link org.codingpark.piraterobot.play.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.codingpark.piraterobot.play.impl.ParameterValueImpl
     * @see org.codingpark.piraterobot.play.impl.PlayPackageImpl#getParameterValue()
     * @generated
     */
    EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_VALUE__NUM = eINSTANCE.getParameterValue_Num();

  }

} //PlayPackage
