/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCLACS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCLACS.UsedService#getName <em>Name</em>}</li>
 *   <li>{@link GCLACS.UsedService#getListArg <em>List Arg</em>}</li>
 *   <li>{@link GCLACS.UsedService#getSource <em>Source</em>}</li>
 *   <li>{@link GCLACS.UsedService#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCLACS.GCLACSPackage#getUsedService()
 * @model
 * @generated
 */
public interface UsedService extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GCLACS.GCLACSPackage#getUsedService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GCLACS.UsedService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Arg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Arg</em>' attribute.
	 * @see #setListArg(String)
	 * @see GCLACS.GCLACSPackage#getUsedService_ListArg()
	 * @model
	 * @generated
	 */
	String getListArg();

	/**
	 * Sets the value of the '{@link GCLACS.UsedService#getListArg <em>List Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Arg</em>' attribute.
	 * @see #getListArg()
	 * @generated
	 */
	void setListArg(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Services)
	 * @see GCLACS.GCLACSPackage#getUsedService_Source()
	 * @model
	 * @generated
	 */
	Services getSource();

	/**
	 * Sets the value of the '{@link GCLACS.UsedService#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Services value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Binding)
	 * @see GCLACS.GCLACSPackage#getUsedService_Target()
	 * @model
	 * @generated
	 */
	Binding getTarget();

	/**
	 * Sets the value of the '{@link GCLACS.UsedService#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Binding value);

} // UsedService
