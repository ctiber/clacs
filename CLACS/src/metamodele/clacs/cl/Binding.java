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
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodele.clacs.cl.Binding#getSource <em>Source</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Binding#getTarget <em>Target</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Binding#getUsedService <em>Used Service</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Binding#getDescription <em>Description</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Binding#isGlue <em>Glue</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Binding#getKind <em>Kind</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Binding#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodele.clacs.cl.ClPackage#getBinding()
 * @model extendedMetaData="name='binding' kind='elementOnly'"
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see metamodele.clacs.cl.ClPackage#getBinding_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Binding#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see metamodele.clacs.cl.ClPackage#getBinding_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Binding#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Used Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Service</em>' containment reference.
	 * @see #setUsedService(UsedService)
	 * @see metamodele.clacs.cl.ClPackage#getBinding_UsedService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UsedService' namespace='##targetNamespace'"
	 * @generated
	 */
	UsedService getUsedService();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Binding#getUsedService <em>Used Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Service</em>' containment reference.
	 * @see #getUsedService()
	 * @generated
	 */
	void setUsedService(UsedService value);

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
	 * @see metamodele.clacs.cl.ClPackage#getBinding_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Binding#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Glue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' attribute.
	 * @see #isSetGlue()
	 * @see #unsetGlue()
	 * @see #setGlue(boolean)
	 * @see metamodele.clacs.cl.ClPackage#getBinding_Glue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='glue'"
	 * @generated
	 */
	boolean isGlue();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Binding#isGlue <em>Glue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' attribute.
	 * @see #isSetGlue()
	 * @see #unsetGlue()
	 * @see #isGlue()
	 * @generated
	 */
	void setGlue(boolean value);

	/**
	 * Unsets the value of the '{@link metamodele.clacs.cl.Binding#isGlue <em>Glue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlue()
	 * @see #isGlue()
	 * @see #setGlue(boolean)
	 * @generated
	 */
	void unsetGlue();

	/**
	 * Returns whether the value of the '{@link metamodele.clacs.cl.Binding#isGlue <em>Glue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Glue</em>' attribute is set.
	 * @see #unsetGlue()
	 * @see #isGlue()
	 * @see #setGlue(boolean)
	 * @generated
	 */
	boolean isSetGlue();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodele.clacs.cl.BindingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see metamodele.clacs.cl.BindingKind
	 * @see #setKind(BindingKind)
	 * @see metamodele.clacs.cl.ClPackage#getBinding_Kind()
	 * @model
	 * @generated
	 */
	BindingKind getKind();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Binding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see metamodele.clacs.cl.BindingKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BindingKind value);

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
	 * @see metamodele.clacs.cl.ClPackage#getBinding_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Binding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Binding
