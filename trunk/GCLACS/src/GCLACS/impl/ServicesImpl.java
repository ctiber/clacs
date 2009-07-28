/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCLACS.impl;

import GCLACS.Arg;
import GCLACS.BodyType;
import GCLACS.GCLACSPackage;
import GCLACS.ServiceKind;
import GCLACS.Services;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCLACS.impl.ServicesImpl#getName <em>Name</em>}</li>
 *   <li>{@link GCLACS.impl.ServicesImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link GCLACS.impl.ServicesImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link GCLACS.impl.ServicesImpl#getBody <em>Body</em>}</li>
 *   <li>{@link GCLACS.impl.ServicesImpl#getReturnedType <em>Returned Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServicesImpl extends EObjectImpl implements Services {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceKind KIND_EDEFAULT = ServiceKind.BUSINESS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ServiceKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArg()
	 * @generated
	 * @ordered
	 */
	protected EList<Arg> arg;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected BodyType body;

	/**
	 * The default value of the '{@link #getReturnedType() <em>Returned Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnedType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURNED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnedType() <em>Returned Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnedType()
	 * @generated
	 * @ordered
	 */
	protected String returnedType = RETURNED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCLACSPackage.Literals.SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.SERVICES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ServiceKind newKind) {
		ServiceKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.SERVICES__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arg> getArg() {
		if (arg == null) {
			arg = new EObjectContainmentEList<Arg>(Arg.class, this, GCLACSPackage.SERVICES__ARG);
		}
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyType getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(BodyType newBody, NotificationChain msgs) {
		BodyType oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GCLACSPackage.SERVICES__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(BodyType newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GCLACSPackage.SERVICES__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GCLACSPackage.SERVICES__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.SERVICES__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnedType() {
		return returnedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnedType(String newReturnedType) {
		String oldReturnedType = returnedType;
		returnedType = newReturnedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.SERVICES__RETURNED_TYPE, oldReturnedType, returnedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCLACSPackage.SERVICES__ARG:
				return ((InternalEList<?>)getArg()).basicRemove(otherEnd, msgs);
			case GCLACSPackage.SERVICES__BODY:
				return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCLACSPackage.SERVICES__NAME:
				return getName();
			case GCLACSPackage.SERVICES__KIND:
				return getKind();
			case GCLACSPackage.SERVICES__ARG:
				return getArg();
			case GCLACSPackage.SERVICES__BODY:
				return getBody();
			case GCLACSPackage.SERVICES__RETURNED_TYPE:
				return getReturnedType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GCLACSPackage.SERVICES__NAME:
				setName((String)newValue);
				return;
			case GCLACSPackage.SERVICES__KIND:
				setKind((ServiceKind)newValue);
				return;
			case GCLACSPackage.SERVICES__ARG:
				getArg().clear();
				getArg().addAll((Collection<? extends Arg>)newValue);
				return;
			case GCLACSPackage.SERVICES__BODY:
				setBody((BodyType)newValue);
				return;
			case GCLACSPackage.SERVICES__RETURNED_TYPE:
				setReturnedType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GCLACSPackage.SERVICES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GCLACSPackage.SERVICES__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case GCLACSPackage.SERVICES__ARG:
				getArg().clear();
				return;
			case GCLACSPackage.SERVICES__BODY:
				setBody((BodyType)null);
				return;
			case GCLACSPackage.SERVICES__RETURNED_TYPE:
				setReturnedType(RETURNED_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GCLACSPackage.SERVICES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GCLACSPackage.SERVICES__KIND:
				return kind != KIND_EDEFAULT;
			case GCLACSPackage.SERVICES__ARG:
				return arg != null && !arg.isEmpty();
			case GCLACSPackage.SERVICES__BODY:
				return body != null;
			case GCLACSPackage.SERVICES__RETURNED_TYPE:
				return RETURNED_TYPE_EDEFAULT == null ? returnedType != null : !RETURNED_TYPE_EDEFAULT.equals(returnedType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", kind: ");
		result.append(kind);
		result.append(", returnedType: ");
		result.append(returnedType);
		result.append(')');
		return result.toString();
	}

} //ServicesImpl
