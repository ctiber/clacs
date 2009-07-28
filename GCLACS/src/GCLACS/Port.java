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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCLACS.Port#getName <em>Name</em>}</li>
 *   <li>{@link GCLACS.Port#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link GCLACS.Port#getXp <em>Xp</em>}</li>
 *   <li>{@link GCLACS.Port#getYp <em>Yp</em>}</li>
 *   <li>{@link GCLACS.Port#getDefineByInterface <em>Define By Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCLACS.GCLACSPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
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
	 * @see GCLACS.GCLACSPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GCLACS.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link GCLACS.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see GCLACS.Visibility
	 * @see #setVisibility(Visibility)
	 * @see GCLACS.GCLACSPackage#getPort_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link GCLACS.Port#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see GCLACS.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xp</em>' attribute.
	 * @see #setXp(int)
	 * @see GCLACS.GCLACSPackage#getPort_Xp()
	 * @model
	 * @generated
	 */
	int getXp();

	/**
	 * Sets the value of the '{@link GCLACS.Port#getXp <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xp</em>' attribute.
	 * @see #getXp()
	 * @generated
	 */
	void setXp(int value);

	/**
	 * Returns the value of the '<em><b>Yp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yp</em>' attribute.
	 * @see #setYp(int)
	 * @see GCLACS.GCLACSPackage#getPort_Yp()
	 * @model
	 * @generated
	 */
	int getYp();

	/**
	 * Sets the value of the '{@link GCLACS.Port#getYp <em>Yp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yp</em>' attribute.
	 * @see #getYp()
	 * @generated
	 */
	void setYp(int value);

	/**
	 * Returns the value of the '<em><b>Define By Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Define By Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define By Interface</em>' containment reference.
	 * @see #setDefineByInterface(DefineByInterface)
	 * @see GCLACS.GCLACSPackage#getPort_DefineByInterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DefineByInterface getDefineByInterface();

	/**
	 * Sets the value of the '{@link GCLACS.Port#getDefineByInterface <em>Define By Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Define By Interface</em>' containment reference.
	 * @see #getDefineByInterface()
	 * @generated
	 */
	void setDefineByInterface(DefineByInterface value);

} // Port
