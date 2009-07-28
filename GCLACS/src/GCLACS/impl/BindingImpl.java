/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCLACS.impl;

import GCLACS.Binding;
import GCLACS.BindingKind;
import GCLACS.GCLACSPackage;
import GCLACS.Port;

import GCLACS.UsedService;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCLACS.impl.BindingImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link GCLACS.impl.BindingImpl#isGlue <em>Glue</em>}</li>
 *   <li>{@link GCLACS.impl.BindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link GCLACS.impl.BindingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link GCLACS.impl.BindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link GCLACS.impl.BindingImpl#getUsedServiceName <em>Used Service Name</em>}</li>
 *   <li>{@link GCLACS.impl.BindingImpl#getUsedServiceArgs <em>Used Service Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends EObjectImpl implements Binding {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final BindingKind KIND_EDEFAULT = BindingKind.SIMPLE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected BindingKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isGlue() <em>Glue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGlue() <em>Glue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGlue()
	 * @generated
	 * @ordered
	 */
	protected boolean glue = GLUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Port source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Port target;

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
	 * The default value of the '{@link #getUsedServiceName() <em>Used Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String USED_SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedServiceName() <em>Used Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedServiceName()
	 * @generated
	 * @ordered
	 */
	protected String usedServiceName = USED_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedServiceArgs() <em>Used Service Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedServiceArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String USED_SERVICE_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedServiceArgs() <em>Used Service Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedServiceArgs()
	 * @generated
	 * @ordered
	 */
	protected String usedServiceArgs = USED_SERVICE_ARGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCLACSPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(BindingKind newKind) {
		BindingKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.BINDING__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(boolean newGlue) {
		boolean oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.BINDING__GLUE, oldGlue, glue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Port)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCLACSPackage.BINDING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Port newSource) {
		Port oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.BINDING__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Port)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCLACSPackage.BINDING__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Port newTarget) {
		Port oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.BINDING__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.BINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsedServiceName() {
		return usedServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedServiceName(String newUsedServiceName) {
		String oldUsedServiceName = usedServiceName;
		usedServiceName = newUsedServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.BINDING__USED_SERVICE_NAME, oldUsedServiceName, usedServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsedServiceArgs() {
		return usedServiceArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedServiceArgs(String newUsedServiceArgs) {
		String oldUsedServiceArgs = usedServiceArgs;
		usedServiceArgs = newUsedServiceArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.BINDING__USED_SERVICE_ARGS, oldUsedServiceArgs, usedServiceArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCLACSPackage.BINDING__KIND:
				return getKind();
			case GCLACSPackage.BINDING__GLUE:
				return isGlue() ? Boolean.TRUE : Boolean.FALSE;
			case GCLACSPackage.BINDING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case GCLACSPackage.BINDING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case GCLACSPackage.BINDING__NAME:
				return getName();
			case GCLACSPackage.BINDING__USED_SERVICE_NAME:
				return getUsedServiceName();
			case GCLACSPackage.BINDING__USED_SERVICE_ARGS:
				return getUsedServiceArgs();
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
			case GCLACSPackage.BINDING__KIND:
				setKind((BindingKind)newValue);
				return;
			case GCLACSPackage.BINDING__GLUE:
				setGlue(((Boolean)newValue).booleanValue());
				return;
			case GCLACSPackage.BINDING__SOURCE:
				setSource((Port)newValue);
				return;
			case GCLACSPackage.BINDING__TARGET:
				setTarget((Port)newValue);
				return;
			case GCLACSPackage.BINDING__NAME:
				setName((String)newValue);
				return;
			case GCLACSPackage.BINDING__USED_SERVICE_NAME:
				setUsedServiceName((String)newValue);
				return;
			case GCLACSPackage.BINDING__USED_SERVICE_ARGS:
				setUsedServiceArgs((String)newValue);
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
			case GCLACSPackage.BINDING__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case GCLACSPackage.BINDING__GLUE:
				setGlue(GLUE_EDEFAULT);
				return;
			case GCLACSPackage.BINDING__SOURCE:
				setSource((Port)null);
				return;
			case GCLACSPackage.BINDING__TARGET:
				setTarget((Port)null);
				return;
			case GCLACSPackage.BINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GCLACSPackage.BINDING__USED_SERVICE_NAME:
				setUsedServiceName(USED_SERVICE_NAME_EDEFAULT);
				return;
			case GCLACSPackage.BINDING__USED_SERVICE_ARGS:
				setUsedServiceArgs(USED_SERVICE_ARGS_EDEFAULT);
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
			case GCLACSPackage.BINDING__KIND:
				return kind != KIND_EDEFAULT;
			case GCLACSPackage.BINDING__GLUE:
				return glue != GLUE_EDEFAULT;
			case GCLACSPackage.BINDING__SOURCE:
				return source != null;
			case GCLACSPackage.BINDING__TARGET:
				return target != null;
			case GCLACSPackage.BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GCLACSPackage.BINDING__USED_SERVICE_NAME:
				return USED_SERVICE_NAME_EDEFAULT == null ? usedServiceName != null : !USED_SERVICE_NAME_EDEFAULT.equals(usedServiceName);
			case GCLACSPackage.BINDING__USED_SERVICE_ARGS:
				return USED_SERVICE_ARGS_EDEFAULT == null ? usedServiceArgs != null : !USED_SERVICE_ARGS_EDEFAULT.equals(usedServiceArgs);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", glue: ");
		result.append(glue);
		result.append(", name: ");
		result.append(name);
		result.append(", usedServiceName: ");
		result.append(usedServiceName);
		result.append(", usedServiceArgs: ");
		result.append(usedServiceArgs);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
