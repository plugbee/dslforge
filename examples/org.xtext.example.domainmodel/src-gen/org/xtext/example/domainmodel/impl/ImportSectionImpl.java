/**
 */
package org.xtext.example.domainmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.domainmodel.DomainmodelPackage;
import org.xtext.example.domainmodel.ImportDeclaration;
import org.xtext.example.domainmodel.ImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.domainmodel.impl.ImportSectionImpl#getImportDeclarations <em>Import Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportSectionImpl extends MinimalEObjectImpl.Container implements ImportSection
{
  /**
   * The cached value of the '{@link #getImportDeclarations() <em>Import Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportDeclarations()
   * @generated
   * @ordered
   */
  protected EList<ImportDeclaration> importDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportSectionImpl()
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
    return DomainmodelPackage.Literals.IMPORT_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportDeclaration> getImportDeclarations()
  {
    if (importDeclarations == null)
    {
      importDeclarations = new EObjectContainmentEList<ImportDeclaration>(ImportDeclaration.class, this, DomainmodelPackage.IMPORT_SECTION__IMPORT_DECLARATIONS);
    }
    return importDeclarations;
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
      case DomainmodelPackage.IMPORT_SECTION__IMPORT_DECLARATIONS:
        return ((InternalEList<?>)getImportDeclarations()).basicRemove(otherEnd, msgs);
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
      case DomainmodelPackage.IMPORT_SECTION__IMPORT_DECLARATIONS:
        return getImportDeclarations();
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
      case DomainmodelPackage.IMPORT_SECTION__IMPORT_DECLARATIONS:
        getImportDeclarations().clear();
        getImportDeclarations().addAll((Collection<? extends ImportDeclaration>)newValue);
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
      case DomainmodelPackage.IMPORT_SECTION__IMPORT_DECLARATIONS:
        getImportDeclarations().clear();
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
      case DomainmodelPackage.IMPORT_SECTION__IMPORT_DECLARATIONS:
        return importDeclarations != null && !importDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImportSectionImpl
