/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodele.clacs.cl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodele.clacs.cl.ComponentDescriptor#getInterface <em>Interface</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentDescriptor#getComponentDescriptor <em>Component Descriptor</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentDescriptor#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentDescriptor#getKind <em>Kind</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentDescriptor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodele.clacs.cl.ClPackage#getComponentDescriptor()
 * @model extendedMetaData="name='component_Descriptor' kind='elementOnly'"
 * @generated
 */
public interface ComponentDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link metamodele.clacs.cl.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see metamodele.clacs.cl.ClPackage#getComponentDescriptor_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Component Descriptor</b></em>' containment reference list.
	 * The list contents are of type {@link metamodele.clacs.cl.ComponentDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Descriptor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Descriptor</em>' containment reference list.
	 * @see metamodele.clacs.cl.ClPackage#getComponentDescriptor_ComponentDescriptor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Component_Descriptor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentDescriptor> getComponentDescriptor();

	/**
	 * Returns the value of the '<em><b>Component Instance</b></em>' containment reference list.
	 * The list contents are of type {@link metamodele.clacs.cl.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance</em>' containment reference list.
	 * @see metamodele.clacs.cl.ClPackage#getComponentDescriptor_ComponentInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Component_Instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstance();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see metamodele.clacs.cl.ClPackage#getComponentDescriptor_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.ComponentDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"business"</code>.
	 * The literals are from the enumeration {@link metamodele.clacs.cl.ComponentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see metamodele.clacs.cl.ComponentKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(ComponentKind)
	 * @see metamodele.clacs.cl.ClPackage#getComponentDescriptor_Kind()
	 * @model default="business" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	ComponentKind getKind();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.ComponentDescriptor#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see metamodele.clacs.cl.ComponentKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ComponentKind value);

	/**
	 * Unsets the value of the '{@link metamodele.clacs.cl.ComponentDescriptor#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ComponentKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link metamodele.clacs.cl.ComponentDescriptor#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ComponentKind)
	 * @generated
	 */
	boolean isSetKind();

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
	 * @see metamodele.clacs.cl.ClPackage#getComponentDescriptor_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.ComponentDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentDescriptor
