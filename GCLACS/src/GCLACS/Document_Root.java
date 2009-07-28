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
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCLACS.Document_Root#getComponentInstance <em>Component Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCLACS.GCLACSPackage#getDocument_Root()
 * @model
 * @generated
 */
public interface Document_Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' containment reference.
	 * @see #setComponentInstance(ComponentInstance)
	 * @see GCLACS.GCLACSPackage#getDocument_Root_ComponentInstance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInstance getComponentInstance();

	/**
	 * Sets the value of the '{@link GCLACS.Document_Root#getComponentInstance <em>Component Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance</em>' containment reference.
	 * @see #getComponentInstance()
	 * @generated
	 */
	void setComponentInstance(ComponentInstance value);

} // Document_Root
