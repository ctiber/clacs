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
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodele.clacs.cl.ComponentInstance#getDefinedByDescriptor <em>Defined By Descriptor</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentInstance#getName <em>Name</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentInstance#getInterface <em>Interface</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentInstance#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentInstance#getDescription <em>Description</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentInstance#getPort <em>Port</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentInstance#getBinding <em>Binding</em>}</li>
 *   <li>{@link metamodele.clacs.cl.ComponentInstance#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodele.clacs.cl.ClPackage#getComponentInstance()
 * @model extendedMetaData="name='Component_Instance' kind='elementOnly'"
 * @generated
 */
public interface ComponentInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Defined By Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By Descriptor</em>' attribute.
	 * @see #setDefinedByDescriptor(String)
	 * @see metamodele.clacs.cl.ClPackage#getComponentInstance_DefinedByDescriptor()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='DefinedByDescriptor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefinedByDescriptor();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.ComponentInstance#getDefinedByDescriptor <em>Defined By Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By Descriptor</em>' attribute.
	 * @see #getDefinedByDescriptor()
	 * @generated
	 */
	void setDefinedByDescriptor(String value);

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
	 * @see metamodele.clacs.cl.ClPackage#getComponentInstance_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.ComponentInstance#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see metamodele.clacs.cl.ClPackage#getComponentInstance_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.ComponentInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link metamodele.clacs.cl.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see metamodele.clacs.cl.ClPackage#getComponentInstance_Binding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Binding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Binding> getBinding();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link metamodele.clacs.cl.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see metamodele.clacs.cl.ClPackage#getComponentInstance_Port()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Port' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Port> getPort();

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
	 * @see metamodele.clacs.cl.ClPackage#getComponentInstance_ComponentInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Component_Instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstance();

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
	 * @see metamodele.clacs.cl.ClPackage#getComponentInstance_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Interface> getInterface();

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
	 * @see metamodele.clacs.cl.ClPackage#getComponentInstance_Kind()
	 * @model default="business" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	ComponentKind getKind();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.ComponentInstance#getKind <em>Kind</em>}' attribute.
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
	 * Unsets the value of the '{@link metamodele.clacs.cl.ComponentInstance#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(ComponentKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link metamodele.clacs.cl.ComponentInstance#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(ComponentKind)
	 * @generated
	 */
	boolean isSetKind();

} // ComponentInstance
