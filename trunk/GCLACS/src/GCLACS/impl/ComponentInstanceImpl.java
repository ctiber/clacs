/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCLACS.impl;

import GCLACS.Binding;
import GCLACS.ComponentDescriptor;
import GCLACS.ComponentInstance;
import GCLACS.ComponentKind;
import GCLACS.GCLACSPackage;

import GCLACS.Interface;
import GCLACS.Port;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link GCLACS.impl.ComponentInstanceImpl#getDefineByDescriptor <em>Define By Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends EObjectImpl implements ComponentInstance {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefineByDescriptor() <em>Define By Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineByDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINE_BY_DESCRIPTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefineByDescriptor() <em>Define By Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefineByDescriptor()
	 * @generated
	 * @ordered
	 */
	protected String defineByDescriptor = DEFINE_BY_DESCRIPTOR_EDEFAULT;

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
		return GCLACSPackage.Literals.COMPONENT_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.COMPONENT_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefineByDescriptor() {
		return defineByDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefineByDescriptor(String newDefineByDescriptor) {
		String oldDefineByDescriptor = defineByDescriptor;
		defineByDescriptor = newDefineByDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR, oldDefineByDescriptor, defineByDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, GCLACSPackage.COMPONENT_INSTANCE__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, GCLACSPackage.COMPONENT_INSTANCE__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstance() {
		if (componentInstance == null) {
			componentInstance = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, GCLACSPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE);
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
			interface_ = new EObjectContainmentEList<Interface>(Interface.class, this, GCLACSPackage.COMPONENT_INSTANCE__INTERFACE);
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.COMPONENT_INSTANCE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.COMPONENT_INSTANCE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCLACSPackage.COMPONENT_INSTANCE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCLACSPackage.COMPONENT_INSTANCE__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case GCLACSPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return ((InternalEList<?>)getComponentInstance()).basicRemove(otherEnd, msgs);
			case GCLACSPackage.COMPONENT_INSTANCE__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case GCLACSPackage.COMPONENT_INSTANCE__BINDING:
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
			case GCLACSPackage.COMPONENT_INSTANCE__NAME:
				return getName();
			case GCLACSPackage.COMPONENT_INSTANCE__INTERFACE:
				return getInterface();
			case GCLACSPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return getComponentInstance();
			case GCLACSPackage.COMPONENT_INSTANCE__PORT:
				return getPort();
			case GCLACSPackage.COMPONENT_INSTANCE__BINDING:
				return getBinding();
			case GCLACSPackage.COMPONENT_INSTANCE__KIND:
				return getKind();
			case GCLACSPackage.COMPONENT_INSTANCE__WIDTH:
				return new Integer(getWidth());
			case GCLACSPackage.COMPONENT_INSTANCE__HEIGHT:
				return new Integer(getHeight());
			case GCLACSPackage.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR:
				return getDefineByDescriptor();
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
			case GCLACSPackage.COMPONENT_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				getComponentInstance().clear();
				getComponentInstance().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__KIND:
				setKind((ComponentKind)newValue);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR:
				setDefineByDescriptor((String)newValue);
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
			case GCLACSPackage.COMPONENT_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__INTERFACE:
				getInterface().clear();
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				getComponentInstance().clear();
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__PORT:
				getPort().clear();
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__BINDING:
				getBinding().clear();
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GCLACSPackage.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR:
				setDefineByDescriptor(DEFINE_BY_DESCRIPTOR_EDEFAULT);
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
			case GCLACSPackage.COMPONENT_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GCLACSPackage.COMPONENT_INSTANCE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case GCLACSPackage.COMPONENT_INSTANCE__COMPONENT_INSTANCE:
				return componentInstance != null && !componentInstance.isEmpty();
			case GCLACSPackage.COMPONENT_INSTANCE__PORT:
				return port != null && !port.isEmpty();
			case GCLACSPackage.COMPONENT_INSTANCE__BINDING:
				return binding != null && !binding.isEmpty();
			case GCLACSPackage.COMPONENT_INSTANCE__KIND:
				return kind != KIND_EDEFAULT;
			case GCLACSPackage.COMPONENT_INSTANCE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case GCLACSPackage.COMPONENT_INSTANCE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case GCLACSPackage.COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR:
				return DEFINE_BY_DESCRIPTOR_EDEFAULT == null ? defineByDescriptor != null : !DEFINE_BY_DESCRIPTOR_EDEFAULT.equals(defineByDescriptor);
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
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", defineByDescriptor: ");
		result.append(defineByDescriptor);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
