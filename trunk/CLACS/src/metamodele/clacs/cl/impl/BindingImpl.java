/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodele.clacs.cl.impl;

import metamodele.clacs.cl.Binding;
import metamodele.clacs.cl.BindingKind;
import metamodele.clacs.cl.ClPackage;
import metamodele.clacs.cl.UsedService;

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
 *   <li>{@link metamodele.clacs.cl.impl.BindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.BindingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.BindingImpl#getUsedService <em>Used Service</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.BindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.BindingImpl#isGlue <em>Glue</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.BindingImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.BindingImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends EObjectImpl implements Binding {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedService() <em>Used Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedService()
	 * @generated
	 * @ordered
	 */
	protected UsedService usedService;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * This is true if the Glue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean glueESet;

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
		return ClPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.BINDING__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.BINDING__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedService getUsedService() {
		return usedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedService(UsedService newUsedService, NotificationChain msgs) {
		UsedService oldUsedService = usedService;
		usedService = newUsedService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClPackage.BINDING__USED_SERVICE, oldUsedService, newUsedService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedService(UsedService newUsedService) {
		if (newUsedService != usedService) {
			NotificationChain msgs = null;
			if (usedService != null)
				msgs = ((InternalEObject)usedService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClPackage.BINDING__USED_SERVICE, null, msgs);
			if (newUsedService != null)
				msgs = ((InternalEObject)newUsedService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClPackage.BINDING__USED_SERVICE, null, msgs);
			msgs = basicSetUsedService(newUsedService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.BINDING__USED_SERVICE, newUsedService, newUsedService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.BINDING__DESCRIPTION, oldDescription, description));
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
		boolean oldGlueESet = glueESet;
		glueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.BINDING__GLUE, oldGlue, glue, !oldGlueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlue() {
		boolean oldGlue = glue;
		boolean oldGlueESet = glueESet;
		glue = GLUE_EDEFAULT;
		glueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ClPackage.BINDING__GLUE, oldGlue, GLUE_EDEFAULT, oldGlueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlue() {
		return glueESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.BINDING__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.BINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClPackage.BINDING__USED_SERVICE:
				return basicSetUsedService(null, msgs);
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
			case ClPackage.BINDING__SOURCE:
				return getSource();
			case ClPackage.BINDING__TARGET:
				return getTarget();
			case ClPackage.BINDING__USED_SERVICE:
				return getUsedService();
			case ClPackage.BINDING__DESCRIPTION:
				return getDescription();
			case ClPackage.BINDING__GLUE:
				return isGlue() ? Boolean.TRUE : Boolean.FALSE;
			case ClPackage.BINDING__KIND:
				return getKind();
			case ClPackage.BINDING__NAME:
				return getName();
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
			case ClPackage.BINDING__SOURCE:
				setSource((String)newValue);
				return;
			case ClPackage.BINDING__TARGET:
				setTarget((String)newValue);
				return;
			case ClPackage.BINDING__USED_SERVICE:
				setUsedService((UsedService)newValue);
				return;
			case ClPackage.BINDING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ClPackage.BINDING__GLUE:
				setGlue(((Boolean)newValue).booleanValue());
				return;
			case ClPackage.BINDING__KIND:
				setKind((BindingKind)newValue);
				return;
			case ClPackage.BINDING__NAME:
				setName((String)newValue);
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
			case ClPackage.BINDING__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case ClPackage.BINDING__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case ClPackage.BINDING__USED_SERVICE:
				setUsedService((UsedService)null);
				return;
			case ClPackage.BINDING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ClPackage.BINDING__GLUE:
				unsetGlue();
				return;
			case ClPackage.BINDING__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ClPackage.BINDING__NAME:
				setName(NAME_EDEFAULT);
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
			case ClPackage.BINDING__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case ClPackage.BINDING__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case ClPackage.BINDING__USED_SERVICE:
				return usedService != null;
			case ClPackage.BINDING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ClPackage.BINDING__GLUE:
				return isSetGlue();
			case ClPackage.BINDING__KIND:
				return kind != KIND_EDEFAULT;
			case ClPackage.BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(", description: ");
		result.append(description);
		result.append(", glue: ");
		if (glueESet) result.append(glue); else result.append("<unset>");
		result.append(", kind: ");
		result.append(kind);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
