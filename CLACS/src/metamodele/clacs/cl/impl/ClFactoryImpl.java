/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodele.clacs.cl.impl;

import metamodele.clacs.cl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClFactoryImpl extends EFactoryImpl implements ClFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClFactory init() {
		try {
			ClFactory theClFactory = (ClFactory)EPackage.Registry.INSTANCE.getEFactory("Metamodele/clacsCL"); 
			if (theClFactory != null) {
				return theClFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClPackage.ARG: return createArg();
			case ClPackage.BINDING: return createBinding();
			case ClPackage.BODY_TYPE: return createBodyType();
			case ClPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case ClPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ClPackage.INTERFACE: return createInterface();
			case ClPackage.PORT: return createPort();
			case ClPackage.SERVICE: return createService();
			case ClPackage.USED_SERVICE: return createUsedService();
			case ClPackage.ASSEMBLY_BINDING: return createAssemblyBinding();
			case ClPackage.DELEGATION_BINDING: return createDelegationBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ClPackage.BINDING_KIND:
				return createBindingKindFromString(eDataType, initialValue);
			case ClPackage.COMPONENT_KIND:
				return createComponentKindFromString(eDataType, initialValue);
			case ClPackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case ClPackage.SERVICE_KIND:
				return createServiceKindFromString(eDataType, initialValue);
			case ClPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case ClPackage.ABINDING_KIND:
				return createA_BindingKindFromString(eDataType, initialValue);
			case ClPackage.DBINDING_KIND:
				return createD_BindingKindFromString(eDataType, initialValue);
			case ClPackage.BINDING_KIND_OBJECT:
				return createBindingKindObjectFromString(eDataType, initialValue);
			case ClPackage.COMPONENT_KIND_OBJECT:
				return createComponentKindObjectFromString(eDataType, initialValue);
			case ClPackage.DIRECTION_OBJECT:
				return createDirectionObjectFromString(eDataType, initialValue);
			case ClPackage.SERVICE_KIND_OBJECT:
				return createServiceKindObjectFromString(eDataType, initialValue);
			case ClPackage.VISIBILITY_OBJECT:
				return createVisibilityObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ClPackage.BINDING_KIND:
				return convertBindingKindToString(eDataType, instanceValue);
			case ClPackage.COMPONENT_KIND:
				return convertComponentKindToString(eDataType, instanceValue);
			case ClPackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case ClPackage.SERVICE_KIND:
				return convertServiceKindToString(eDataType, instanceValue);
			case ClPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case ClPackage.ABINDING_KIND:
				return convertA_BindingKindToString(eDataType, instanceValue);
			case ClPackage.DBINDING_KIND:
				return convertD_BindingKindToString(eDataType, instanceValue);
			case ClPackage.BINDING_KIND_OBJECT:
				return convertBindingKindObjectToString(eDataType, instanceValue);
			case ClPackage.COMPONENT_KIND_OBJECT:
				return convertComponentKindObjectToString(eDataType, instanceValue);
			case ClPackage.DIRECTION_OBJECT:
				return convertDirectionObjectToString(eDataType, instanceValue);
			case ClPackage.SERVICE_KIND_OBJECT:
				return convertServiceKindObjectToString(eDataType, instanceValue);
			case ClPackage.VISIBILITY_OBJECT:
				return convertVisibilityObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arg createArg() {
		ArgImpl arg = new ArgImpl();
		return arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyType createBodyType() {
		BodyTypeImpl bodyType = new BodyTypeImpl();
		return bodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedService createUsedService() {
		UsedServiceImpl usedService = new UsedServiceImpl();
		return usedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyBinding createAssemblyBinding() {
		AssemblyBindingImpl assemblyBinding = new AssemblyBindingImpl();
		return assemblyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationBinding createDelegationBinding() {
		DelegationBindingImpl delegationBinding = new DelegationBindingImpl();
		return delegationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingKind createBindingKindFromString(EDataType eDataType, String initialValue) {
		BindingKind result = BindingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKind createComponentKindFromString(EDataType eDataType, String initialValue) {
		ComponentKind result = ComponentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceKind createServiceKindFromString(EDataType eDataType, String initialValue) {
		ServiceKind result = ServiceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A_BindingKind createA_BindingKindFromString(EDataType eDataType, String initialValue) {
		A_BindingKind result = A_BindingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertA_BindingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public D_BindingKind createD_BindingKindFromString(EDataType eDataType, String initialValue) {
		D_BindingKind result = D_BindingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertD_BindingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingKind createBindingKindObjectFromString(EDataType eDataType, String initialValue) {
		return createBindingKindFromString(ClPackage.Literals.BINDING_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBindingKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBindingKindToString(ClPackage.Literals.BINDING_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKind createComponentKindObjectFromString(EDataType eDataType, String initialValue) {
		return createComponentKindFromString(ClPackage.Literals.COMPONENT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComponentKindToString(ClPackage.Literals.COMPONENT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionFromString(ClPackage.Literals.DIRECTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionToString(ClPackage.Literals.DIRECTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceKind createServiceKindObjectFromString(EDataType eDataType, String initialValue) {
		return createServiceKindFromString(ClPackage.Literals.SERVICE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertServiceKindToString(ClPackage.Literals.SERVICE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityObjectFromString(EDataType eDataType, String initialValue) {
		return createVisibilityFromString(ClPackage.Literals.VISIBILITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisibilityToString(ClPackage.Literals.VISIBILITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClPackage getClPackage() {
		return (ClPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClPackage getPackage() {
		return ClPackage.eINSTANCE;
	}

} //ClFactoryImpl
