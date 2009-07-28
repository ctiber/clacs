/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodele.clacs.cl.impl;

import java.util.Collection;
import metamodele.clacs.cl.Binding;
import metamodele.clacs.cl.ClPackage;
import metamodele.clacs.cl.ComponentInstance;

import metamodele.clacs.cl.ComponentKind;
import metamodele.clacs.cl.Interface;
import metamodele.clacs.cl.Port;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodele.clacs.cl.impl.ComponentInstanceImpl#getDefinedByDescriptor <em>Defined By Descriptor</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.ComponentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.ComponentInstanceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.ComponentInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.ComponentInstanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.ComponentInstanceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.ComponentInstanceImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link metamodele.clacs.cl.impl.ComponentInstanceImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends EObjectImpl implements ComponentInstance {
	/**
	 * The default value of the '{@link #getDefinedByDescriptor() <em>Defined By Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedByDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINED_BY_DESCRIPTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinedByDescriptor() <em>Defined By Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedByDescriptor()
	 * @generated
	 * @ordered
	 */
	protected String definedByDescriptor = DEFINED_BY_DESCRIPTOR_EDEFAULT;

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
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstance;

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
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentKind KIND_EDEFAULT = ComponentKind.BUSINESS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ComponentKind kind = KIND_EDEFAULT;

	/**
	 * This is true if the Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClPackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinedByDescriptor() {
		return definedByDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedByDescriptor(String newDefinedByDescriptor) {
		String oldDefinedByDescriptor = definedByDescriptor;
		definedByDescriptor = newDefinedByDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.COMPONENT_INSTANCE__DEFINED_BY_DESCRIPTOR, oldDefinedByDescriptor, definedByDescriptor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.COMPONENT_INSTANCE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.COMPONENT_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, ClPackage.COMPONENT_INSTANCE__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, ClPackage.COMPONENT_INSTANCE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstance() {
		if (componentInstance == null) {
			componentInstance = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, ClPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE);
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<Interface>(Interface.class, this, ClPackage.COMPONENT_INSTANCE__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ComponentKind newKind) {
		ComponentKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		boolean oldKindESet = kindESet;
		kindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClPackage.COMPONENT_INSTANCE__KIND, oldKind, kind, !oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKind() {
		ComponentKind oldKind = kind;
		boolean oldKindESet = kindESet;
		kind = KIND_EDEFAULT;
		kindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ClPackage.COMPONENT_INSTANCE__KIND, oldKind, KIND_EDEFAULT, oldKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKind() {
		return kindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClPackage.COMPONENT_INSTANCE__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case ClPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return ((InternalEList<?>)getComponentInstance()).basicRemove(otherEnd, msgs);
			case ClPackage.COMPONENT_INSTANCE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case ClPackage.COMPONENT_INSTANCE__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
			case ClPackage.COMPONENT_INSTANCE__DEFINED_BY_DESCRIPTOR:
				return getDefinedByDescriptor();
			case ClPackage.COMPONENT_INSTANCE__NAME:
				return getName();
			case ClPackage.COMPONENT_INSTANCE__INTERFACE:
				return getInterface();
			case ClPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance();
			case ClPackage.COMPONENT_INSTANCE__DESCRIPTION:
				return getDescription();
			case ClPackage.COMPONENT_INSTANCE__PORT:
				return getPort();
			case ClPackage.COMPONENT_INSTANCE__BINDING:
				return getBinding();
			case ClPackage.COMPONENT_INSTANCE__KIND:
				return getKind();
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
			case ClPackage.COMPONENT_INSTANCE__DEFINED_BY_DESCRIPTOR:
				setDefinedByDescriptor((String)newValue);
				return;
			case ClPackage.COMPONENT_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case ClPackage.COMPONENT_INSTANCE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case ClPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				getComponentInstance().clear();
				getComponentInstance().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case ClPackage.COMPONENT_INSTANCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ClPackage.COMPONENT_INSTANCE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case ClPackage.COMPONENT_INSTANCE__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
				return;
			case ClPackage.COMPONENT_INSTANCE__KIND:
				setKind((ComponentKind)newValue);
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
			case ClPackage.COMPONENT_INSTANCE__DEFINED_BY_DESCRIPTOR:
				setDefinedByDescriptor(DEFINED_BY_DESCRIPTOR_EDEFAULT);
				return;
			case ClPackage.COMPONENT_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClPackage.COMPONENT_INSTANCE__INTERFACE:
				getInterface().clear();
				return;
			case ClPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				getComponentInstance().clear();
				return;
			case ClPackage.COMPONENT_INSTANCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ClPackage.COMPONENT_INSTANCE__PORT:
				getPort().clear();
				return;
			case ClPackage.COMPONENT_INSTANCE__BINDING:
				getBinding().clear();
				return;
			case ClPackage.COMPONENT_INSTANCE__KIND:
				unsetKind();
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
			case ClPackage.COMPONENT_INSTANCE__DEFINED_BY_DESCRIPTOR:
				return DEFINED_BY_DESCRIPTOR_EDEFAULT == null ? definedByDescriptor != null : !DEFINED_BY_DESCRIPTOR_EDEFAULT.equals(definedByDescriptor);
			case ClPackage.COMPONENT_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClPackage.COMPONENT_INSTANCE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case ClPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return componentInstance != null && !componentInstance.isEmpty();
			case ClPackage.COMPONENT_INSTANCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ClPackage.COMPONENT_INSTANCE__PORT:
				return port != null && !port.isEmpty();
			case ClPackage.COMPONENT_INSTANCE__BINDING:
				return binding != null && !binding.isEmpty();
			case ClPackage.COMPONENT_INSTANCE__KIND:
				return isSetKind();
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
		result.append(" (definedByDescriptor: ");
		result.append(definedByDescriptor);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", kind: ");
		if (kindESet) result.append(kind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
