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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodele.clacs.cl.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Port#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Port#getDefinedByInterface <em>Defined By Interface</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Port#getDescription <em>Description</em>}</li>
 *   <li>{@link metamodele.clacs.cl.Port#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodele.clacs.cl.ClPackage#getPort()
 * @model extendedMetaData="name='port' kind='elementOnly'"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"required"</code>.
	 * The literals are from the enumeration {@link metamodele.clacs.cl.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see metamodele.clacs.cl.Direction
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(Direction)
	 * @see metamodele.clacs.cl.ClPackage#getPort_Direction()
	 * @model default="required" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Direction' namespace='##targetNamespace'"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see metamodele.clacs.cl.Direction
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Unsets the value of the '{@link metamodele.clacs.cl.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(Direction)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link metamodele.clacs.cl.Port#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(Direction)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"external"</code>.
	 * The literals are from the enumeration {@link metamodele.clacs.cl.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see metamodele.clacs.cl.Visibility
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(Visibility)
	 * @see metamodele.clacs.cl.ClPackage#getPort_Visibility()
	 * @model default="external" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Visibility' namespace='##targetNamespace'"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Port#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see metamodele.clacs.cl.Visibility
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Unsets the value of the '{@link metamodele.clacs.cl.Port#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Visibility)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link metamodele.clacs.cl.Port#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(Visibility)
	 * @generated
	 */
	boolean isSetVisibility();

	/**
	 * Returns the value of the '<em><b>Defined By Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined By Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By Interface</em>' attribute.
	 * @see #setDefinedByInterface(String)
	 * @see metamodele.clacs.cl.ClPackage#getPort_DefinedByInterface()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='element' name='DefinedByInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefinedByInterface();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Port#getDefinedByInterface <em>Defined By Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By Interface</em>' attribute.
	 * @see #getDefinedByInterface()
	 * @generated
	 */
	void setDefinedByInterface(String value);

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
	 * @see metamodele.clacs.cl.ClPackage#getPort_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Port#getDescription <em>Description</em>}' attribute.
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
	 * @see metamodele.clacs.cl.ClPackage#getPort_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodele.clacs.cl.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Port
