/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodele.clacs.cl;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodele.clacs.cl.DelegationBinding#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodele.clacs.cl.ClPackage#getDelegationBinding()
 * @model extendedMetaData="name='binding'"
 * @generated
 */
public interface DelegationBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link metamodele.clacs.cl.D_BindingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see metamodele.clacs.cl.D_BindingKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(D_BindingKind)
	 * @see metamodele.clacs.cl.ClPackage#getDelegationBinding_Kind()
	 * @model default="simple" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	D_BindingKind getKind();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.DelegationBinding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see metamodele.clacs.cl.D_BindingKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(D_BindingKind value);

	/**
	 * Unsets the value of the '{@link metamodele.clacs.cl.DelegationBinding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(D_BindingKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link metamodele.clacs.cl.DelegationBinding#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(D_BindingKind)
	 * @generated
	 */
	boolean isSetKind();

} // DelegationBinding
