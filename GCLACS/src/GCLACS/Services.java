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
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCLACS.Services#getName <em>Name</em>}</li>
 *   <li>{@link GCLACS.Services#getKind <em>Kind</em>}</li>
 *   <li>{@link GCLACS.Services#getArg <em>Arg</em>}</li>
 *   <li>{@link GCLACS.Services#getBody <em>Body</em>}</li>
 *   <li>{@link GCLACS.Services#getReturnedType <em>Returned Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCLACS.GCLACSPackage#getServices()
 * @model
 * @generated
 */
public interface Services extends EObject {
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
	 * @see GCLACS.GCLACSPackage#getServices_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GCLACS.Services#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link GCLACS.ServiceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see GCLACS.ServiceKind
	 * @see #setKind(ServiceKind)
	 * @see GCLACS.GCLACSPackage#getServices_Kind()
	 * @model
	 * @generated
	 */
	ServiceKind getKind();

	/**
	 * Sets the value of the '{@link GCLACS.Services#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see GCLACS.ServiceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ServiceKind value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference list.
	 * The list contents are of type {@link GCLACS.Arg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference list.
	 * @see GCLACS.GCLACSPackage#getServices_Arg()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arg> getArg();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyType)
	 * @see GCLACS.GCLACSPackage#getServices_Body()
	 * @model containment="true"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link GCLACS.Services#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Returns the value of the '<em><b>Returned Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returned Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returned Type</em>' attribute.
	 * @see #setReturnedType(String)
	 * @see GCLACS.GCLACSPackage#getServices_ReturnedType()
	 * @model
	 * @generated
	 */
	String getReturnedType();

	/**
	 * Sets the value of the '{@link GCLACS.Services#getReturnedType <em>Returned Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returned Type</em>' attribute.
	 * @see #getReturnedType()
	 * @generated
	 */
	void setReturnedType(String value);

} // Services
