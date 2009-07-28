/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCLACS.impl;

import GCLACS.DefineByInterface;
import GCLACS.GCLACSPackage;
import GCLACS.Port;
import GCLACS.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCLACS.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link GCLACS.impl.PortImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link GCLACS.impl.PortImpl#getXp <em>Xp</em>}</li>
 *   <li>{@link GCLACS.impl.PortImpl#getYp <em>Yp</em>}</li>
 *   <li>{@link GCLACS.impl.PortImpl#getDefineByInterface <em>Define By Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends EObjectImpl implements Port {
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
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.INTERNAL;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected Visibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getXp() <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXp()
	 * @generated
	 * @ordered
	 */
	protected static final int XP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXp() <em>Xp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXp()
	 * @generated
	 * @ordered
	 */
	protected int xp = XP_EDEFAULT;

	/**
	 * The default value of the '{@link #getYp() <em>Yp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYp()
	 * @generated
	 * @ordered
	 */
	protected static final int YP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYp() <em>Yp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYp()
	 * @generated
	 * @ordered
	 */
	protected int yp = YP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefineByInterface() <em>Define By Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineByInterface()
	 * @generated
	 * @ordered
	 */
	protected DefineByInterface defineByInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCLACSPackage.Literals.PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(Visibility newVisibility) {
		Visibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.PORT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXp() {
		return xp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXp(int newXp) {
		int oldXp = xp;
		xp = newXp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.PORT__XP, oldXp, xp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYp() {
		return yp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYp(int newYp) {
		int oldYp = yp;
		yp = newYp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.PORT__YP, oldYp, yp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineByInterface getDefineByInterface() {
		return defineByInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefineByInterface(DefineByInterface newDefineByInterface, NotificationChain msgs) {
		DefineByInterface oldDefineByInterface = defineByInterface;
		defineByInterface = newDefineByInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GCLACSPackage.PORT__DEFINE_BY_INTERFACE, oldDefineByInterface, newDefineByInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefineByInterface(DefineByInterface newDefineByInterface) {
		if (newDefineByInterface != defineByInterface) {
			NotificationChain msgs = null;
			if (defineByInterface != null)
				msgs = ((InternalEObject)defineByInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GCLACSPackage.PORT__DEFINE_BY_INTERFACE, null, msgs);
			if (newDefineByInterface != null)
				msgs = ((InternalEObject)newDefineByInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GCLACSPackage.PORT__DEFINE_BY_INTERFACE, null, msgs);
			msgs = basicSetDefineByInterface(newDefineByInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.PORT__DEFINE_BY_INTERFACE, newDefineByInterface, newDefineByInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCLACSPackage.PORT__DEFINE_BY_INTERFACE:
				return basicSetDefineByInterface(null, msgs);
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
			case GCLACSPackage.PORT__NAME:
				return getName();
			case GCLACSPackage.PORT__VISIBILITY:
				return getVisibility();
			case GCLACSPackage.PORT__XP:
				return new Integer(getXp());
			case GCLACSPackage.PORT__YP:
				return new Integer(getYp());
			case GCLACSPackage.PORT__DEFINE_BY_INTERFACE:
				return getDefineByInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GCLACSPackage.PORT__NAME:
				setName((String)newValue);
				return;
			case GCLACSPackage.PORT__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case GCLACSPackage.PORT__XP:
				setXp(((Integer)newValue).intValue());
				return;
			case GCLACSPackage.PORT__YP:
				setYp(((Integer)newValue).intValue());
				return;
			case GCLACSPackage.PORT__DEFINE_BY_INTERFACE:
				setDefineByInterface((DefineByInterface)newValue);
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
			case GCLACSPackage.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GCLACSPackage.PORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case GCLACSPackage.PORT__XP:
				setXp(XP_EDEFAULT);
				return;
			case GCLACSPackage.PORT__YP:
				setYp(YP_EDEFAULT);
				return;
			case GCLACSPackage.PORT__DEFINE_BY_INTERFACE:
				setDefineByInterface((DefineByInterface)null);
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
			case GCLACSPackage.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GCLACSPackage.PORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case GCLACSPackage.PORT__XP:
				return xp != XP_EDEFAULT;
			case GCLACSPackage.PORT__YP:
				return yp != YP_EDEFAULT;
			case GCLACSPackage.PORT__DEFINE_BY_INTERFACE:
				return defineByInterface != null;
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
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", xp: ");
		result.append(xp);
		result.append(", yp: ");
		result.append(yp);
		result.append(')');
		return result.toString();
	}

} //PortImpl
