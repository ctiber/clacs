/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCLACS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCLACS.Binding#getKind <em>Kind</em>}</li>
 *   <li>{@link GCLACS.Binding#isGlue <em>Glue</em>}</li>
 *   <li>{@link GCLACS.Binding#getSource <em>Source</em>}</li>
 *   <li>{@link GCLACS.Binding#getTarget <em>Target</em>}</li>
 *   <li>{@link GCLACS.Binding#getName <em>Name</em>}</li>
 *   <li>{@link GCLACS.Binding#getUsedServiceName <em>Used Service Name</em>}</li>
 *   <li>{@link GCLACS.Binding#getUsedServiceArgs <em>Used Service Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCLACS.GCLACSPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link GCLACS.BindingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see GCLACS.BindingKind
	 * @see #setKind(BindingKind)
	 * @see GCLACS.GCLACSPackage#getBinding_Kind()
	 * @model
	 * @generated
	 */
	BindingKind getKind();

	/**
	 * Sets the value of the '{@link GCLACS.Binding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see GCLACS.BindingKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BindingKind value);

	/**
	 * Returns the value of the '<em><b>Glue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' attribute.
	 * @see #setGlue(boolean)
	 * @see GCLACS.GCLACSPackage#getBinding_Glue()
	 * @model
	 * @generated
	 */
	boolean isGlue();

	/**
	 * Sets the value of the '{@link GCLACS.Binding#isGlue <em>Glue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' attribute.
	 * @see #isGlue()
	 * @generated
	 */
	void setGlue(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Port)
	 * @see GCLACS.GCLACSPackage#getBinding_Source()
	 * @model required="true"
	 * @generated
	 */
	Port getSource();

	/**
	 * Sets the value of the '{@link GCLACS.Binding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Port value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Port)
	 * @see GCLACS.GCLACSPackage#getBinding_Target()
	 * @model required="true"
	 * @generated
	 */
	Port getTarget();

	/**
	 * Sets the value of the '{@link GCLACS.Binding#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Port value);

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
	 * @see GCLACS.GCLACSPackage#getBinding_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GCLACS.Binding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Used Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Service Name</em>' attribute.
	 * @see #setUsedServiceName(String)
	 * @see GCLACS.GCLACSPackage#getBinding_UsedServiceName()
	 * @model
	 * @generated
	 */
	String getUsedServiceName();

	/**
	 * Sets the value of the '{@link GCLACS.Binding#getUsedServiceName <em>Used Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Service Name</em>' attribute.
	 * @see #getUsedServiceName()
	 * @generated
	 */
	void setUsedServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Used Service Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Service Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Service Args</em>' attribute.
	 * @see #setUsedServiceArgs(String)
	 * @see GCLACS.GCLACSPackage#getBinding_UsedServiceArgs()
	 * @model
	 * @generated
	 */
	String getUsedServiceArgs();

	/**
	 * Sets the value of the '{@link GCLACS.Binding#getUsedServiceArgs <em>Used Service Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Service Args</em>' attribute.
	 * @see #getUsedServiceArgs()
	 * @generated
	 */
	void setUsedServiceArgs(String value);

} // Binding
