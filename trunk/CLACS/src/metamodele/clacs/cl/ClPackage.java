/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodele.clacs.cl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metamodele.clacs.cl.ClFactory
 * @model kind="package"
 * @generated
 */
public interface ClPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Metamodele/clacsCL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClPackage eINSTANCE = metamodele.clacs.cl.impl.ClPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.ArgImpl <em>Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.ArgImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getArg()
	 * @generated
	 */
	int ARG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.BindingImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Used Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__USED_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__GLUE = 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__KIND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = 6;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.BodyTypeImpl <em>Body Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.BodyTypeImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getBodyType()
	 * @generated
	 */
	int BODY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.ComponentInstanceImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Defined By Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__DEFINED_BY_DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PORT = 5;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BINDING = 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__KIND = 7;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.DocumentRootImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_INSTANCE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.InterfaceImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Descrition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.PortImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Defined By Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEFINED_BY_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 4;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.ServiceImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ARG = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BODY = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__KIND = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Returned Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RETURNED_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.UsedServiceImpl <em>Used Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.UsedServiceImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getUsedService()
	 * @generated
	 */
	int USED_SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_SERVICE__ARG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_SERVICE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Used Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.AssemblyBindingImpl <em>Assembly Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.AssemblyBindingImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getAssemblyBinding()
	 * @generated
	 */
	int ASSEMBLY_BINDING = 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_BINDING__KIND = 0;

	/**
	 * The number of structural features of the '<em>Assembly Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLY_BINDING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.impl.DelegationBindingImpl <em>Delegation Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.impl.DelegationBindingImpl
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getDelegationBinding()
	 * @generated
	 */
	int DELEGATION_BINDING = 10;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_BINDING__KIND = 0;

	/**
	 * The number of structural features of the '<em>Delegation Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_BINDING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.BindingKind <em>Binding Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.BindingKind
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getBindingKind()
	 * @generated
	 */
	int BINDING_KIND = 11;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.ComponentKind <em>Component Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.ComponentKind
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getComponentKind()
	 * @generated
	 */
	int COMPONENT_KIND = 12;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.Direction
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 13;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.ServiceKind <em>Service Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.ServiceKind
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getServiceKind()
	 * @generated
	 */
	int SERVICE_KIND = 14;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.Visibility
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 15;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.A_BindingKind <em>ABinding Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.A_BindingKind
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getA_BindingKind()
	 * @generated
	 */
	int ABINDING_KIND = 16;

	/**
	 * The meta object id for the '{@link metamodele.clacs.cl.D_BindingKind <em>DBinding Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.D_BindingKind
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getD_BindingKind()
	 * @generated
	 */
	int DBINDING_KIND = 17;

	/**
	 * The meta object id for the '<em>Binding Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.BindingKind
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getBindingKindObject()
	 * @generated
	 */
	int BINDING_KIND_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Component Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.ComponentKind
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getComponentKindObject()
	 * @generated
	 */
	int COMPONENT_KIND_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.Direction
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getDirectionObject()
	 * @generated
	 */
	int DIRECTION_OBJECT = 20;

	/**
	 * The meta object id for the '<em>Service Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.ServiceKind
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getServiceKindObject()
	 * @generated
	 */
	int SERVICE_KIND_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Visibility Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodele.clacs.cl.Visibility
	 * @see metamodele.clacs.cl.impl.ClPackageImpl#getVisibilityObject()
	 * @generated
	 */
	int VISIBILITY_OBJECT = 22;


	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.Arg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arg</em>'.
	 * @see metamodele.clacs.cl.Arg
	 * @generated
	 */
	EClass getArg();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Arg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodele.clacs.cl.Arg#getName()
	 * @see #getArg()
	 * @generated
	 */
	EAttribute getArg_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Arg#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metamodele.clacs.cl.Arg#getType()
	 * @see #getArg()
	 * @generated
	 */
	EAttribute getArg_Type();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see metamodele.clacs.cl.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Binding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see metamodele.clacs.cl.Binding#getSource()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Source();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Binding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see metamodele.clacs.cl.Binding#getTarget()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Target();

	/**
	 * Returns the meta object for the containment reference '{@link metamodele.clacs.cl.Binding#getUsedService <em>Used Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Used Service</em>'.
	 * @see metamodele.clacs.cl.Binding#getUsedService()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_UsedService();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Binding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see metamodele.clacs.cl.Binding#getDescription()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Description();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Binding#isGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue</em>'.
	 * @see metamodele.clacs.cl.Binding#isGlue()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Glue();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Binding#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see metamodele.clacs.cl.Binding#getKind()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Kind();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodele.clacs.cl.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Name();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Type</em>'.
	 * @see metamodele.clacs.cl.BodyType
	 * @generated
	 */
	EClass getBodyType();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.BodyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodele.clacs.cl.BodyType#getValue()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.BodyType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see metamodele.clacs.cl.BodyType#getLanguage()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_Language();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.ComponentInstance#getDefinedByDescriptor <em>Defined By Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined By Descriptor</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance#getDefinedByDescriptor()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_DefinedByDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.ComponentInstance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance#getDescription()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Description();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.ComponentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance#getName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodele.clacs.cl.ComponentInstance#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance#getBinding()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Binding();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodele.clacs.cl.ComponentInstance#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance#getPort()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodele.clacs.cl.ComponentInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instance</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance#getComponentInstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodele.clacs.cl.ComponentInstance#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance#getInterface()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Interface();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.ComponentInstance#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see metamodele.clacs.cl.ComponentInstance#getKind()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Kind();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see metamodele.clacs.cl.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link metamodele.clacs.cl.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see metamodele.clacs.cl.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link metamodele.clacs.cl.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see metamodele.clacs.cl.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link metamodele.clacs.cl.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see metamodele.clacs.cl.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link metamodele.clacs.cl.DocumentRoot#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instance</em>'.
	 * @see metamodele.clacs.cl.DocumentRoot#getComponentInstance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentInstance();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see metamodele.clacs.cl.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodele.clacs.cl.Interface#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see metamodele.clacs.cl.Interface#getService()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Service();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Interface#getDescrition <em>Descrition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descrition</em>'.
	 * @see metamodele.clacs.cl.Interface#getDescrition()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Descrition();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodele.clacs.cl.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see metamodele.clacs.cl.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Port#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see metamodele.clacs.cl.Port#getDirection()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Direction();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Port#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see metamodele.clacs.cl.Port#getVisibility()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Port#getDefinedByInterface <em>Defined By Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined By Interface</em>'.
	 * @see metamodele.clacs.cl.Port#getDefinedByInterface()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_DefinedByInterface();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Port#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see metamodele.clacs.cl.Port#getDescription()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Description();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodele.clacs.cl.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see metamodele.clacs.cl.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodele.clacs.cl.Service#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg</em>'.
	 * @see metamodele.clacs.cl.Service#getArg()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Arg();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see metamodele.clacs.cl.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the containment reference '{@link metamodele.clacs.cl.Service#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see metamodele.clacs.cl.Service#getBody()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Body();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Service#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see metamodele.clacs.cl.Service#getKind()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Kind();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodele.clacs.cl.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.Service#getReturnedType <em>Returned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returned Type</em>'.
	 * @see metamodele.clacs.cl.Service#getReturnedType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ReturnedType();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.UsedService <em>Used Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Service</em>'.
	 * @see metamodele.clacs.cl.UsedService
	 * @generated
	 */
	EClass getUsedService();

	/**
	 * Returns the meta object for the attribute list '{@link metamodele.clacs.cl.UsedService#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arg</em>'.
	 * @see metamodele.clacs.cl.UsedService#getArg()
	 * @see #getUsedService()
	 * @generated
	 */
	EAttribute getUsedService_Arg();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.UsedService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodele.clacs.cl.UsedService#getName()
	 * @see #getUsedService()
	 * @generated
	 */
	EAttribute getUsedService_Name();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.AssemblyBinding <em>Assembly Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembly Binding</em>'.
	 * @see metamodele.clacs.cl.AssemblyBinding
	 * @generated
	 */
	EClass getAssemblyBinding();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.AssemblyBinding#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see metamodele.clacs.cl.AssemblyBinding#getKind()
	 * @see #getAssemblyBinding()
	 * @generated
	 */
	EAttribute getAssemblyBinding_Kind();

	/**
	 * Returns the meta object for class '{@link metamodele.clacs.cl.DelegationBinding <em>Delegation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Binding</em>'.
	 * @see metamodele.clacs.cl.DelegationBinding
	 * @generated
	 */
	EClass getDelegationBinding();

	/**
	 * Returns the meta object for the attribute '{@link metamodele.clacs.cl.DelegationBinding#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see metamodele.clacs.cl.DelegationBinding#getKind()
	 * @see #getDelegationBinding()
	 * @generated
	 */
	EAttribute getDelegationBinding_Kind();

	/**
	 * Returns the meta object for enum '{@link metamodele.clacs.cl.BindingKind <em>Binding Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Kind</em>'.
	 * @see metamodele.clacs.cl.BindingKind
	 * @generated
	 */
	EEnum getBindingKind();

	/**
	 * Returns the meta object for enum '{@link metamodele.clacs.cl.ComponentKind <em>Component Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Kind</em>'.
	 * @see metamodele.clacs.cl.ComponentKind
	 * @generated
	 */
	EEnum getComponentKind();

	/**
	 * Returns the meta object for enum '{@link metamodele.clacs.cl.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see metamodele.clacs.cl.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link metamodele.clacs.cl.ServiceKind <em>Service Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Kind</em>'.
	 * @see metamodele.clacs.cl.ServiceKind
	 * @generated
	 */
	EEnum getServiceKind();

	/**
	 * Returns the meta object for enum '{@link metamodele.clacs.cl.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see metamodele.clacs.cl.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link metamodele.clacs.cl.A_BindingKind <em>ABinding Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ABinding Kind</em>'.
	 * @see metamodele.clacs.cl.A_BindingKind
	 * @generated
	 */
	EEnum getA_BindingKind();

	/**
	 * Returns the meta object for enum '{@link metamodele.clacs.cl.D_BindingKind <em>DBinding Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DBinding Kind</em>'.
	 * @see metamodele.clacs.cl.D_BindingKind
	 * @generated
	 */
	EEnum getD_BindingKind();

	/**
	 * Returns the meta object for data type '{@link metamodele.clacs.cl.BindingKind <em>Binding Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binding Kind Object</em>'.
	 * @see metamodele.clacs.cl.BindingKind
	 * @model instanceClass="metamodele.clacs.cl.BindingKind"
	 *        extendedMetaData="name='binding_Kind:Object' baseType='binding_Kind'"
	 * @generated
	 */
	EDataType getBindingKindObject();

	/**
	 * Returns the meta object for data type '{@link metamodele.clacs.cl.ComponentKind <em>Component Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component Kind Object</em>'.
	 * @see metamodele.clacs.cl.ComponentKind
	 * @model instanceClass="metamodele.clacs.cl.ComponentKind"
	 *        extendedMetaData="name='componentKind:Object' baseType='componentKind'"
	 * @generated
	 */
	EDataType getComponentKindObject();

	/**
	 * Returns the meta object for data type '{@link metamodele.clacs.cl.Direction <em>Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direction Object</em>'.
	 * @see metamodele.clacs.cl.Direction
	 * @model instanceClass="metamodele.clacs.cl.Direction"
	 *        extendedMetaData="name='direction:Object' baseType='direction'"
	 * @generated
	 */
	EDataType getDirectionObject();

	/**
	 * Returns the meta object for data type '{@link metamodele.clacs.cl.ServiceKind <em>Service Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Kind Object</em>'.
	 * @see metamodele.clacs.cl.ServiceKind
	 * @model instanceClass="metamodele.clacs.cl.ServiceKind"
	 *        extendedMetaData="name='serviceKind:Object' baseType='serviceKind'"
	 * @generated
	 */
	EDataType getServiceKindObject();

	/**
	 * Returns the meta object for data type '{@link metamodele.clacs.cl.Visibility <em>Visibility Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Visibility Object</em>'.
	 * @see metamodele.clacs.cl.Visibility
	 * @model instanceClass="metamodele.clacs.cl.Visibility"
	 *        extendedMetaData="name='visibility:Object' baseType='visibility'"
	 * @generated
	 */
	EDataType getVisibilityObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClFactory getClFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.ArgImpl <em>Arg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.ArgImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getArg()
		 * @generated
		 */
		EClass ARG = eINSTANCE.getArg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARG__NAME = eINSTANCE.getArg_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARG__TYPE = eINSTANCE.getArg_Type();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.BindingImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__SOURCE = eINSTANCE.getBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__TARGET = eINSTANCE.getBinding_Target();

		/**
		 * The meta object literal for the '<em><b>Used Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__USED_SERVICE = eINSTANCE.getBinding_UsedService();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__DESCRIPTION = eINSTANCE.getBinding_Description();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__GLUE = eINSTANCE.getBinding_Glue();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__KIND = eINSTANCE.getBinding_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.BodyTypeImpl <em>Body Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.BodyTypeImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getBodyType()
		 * @generated
		 */
		EClass BODY_TYPE = eINSTANCE.getBodyType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_TYPE__VALUE = eINSTANCE.getBodyType_Value();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_TYPE__LANGUAGE = eINSTANCE.getBodyType_Language();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.ComponentInstanceImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Defined By Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__DEFINED_BY_DESCRIPTOR = eINSTANCE.getComponentInstance_DefinedByDescriptor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__DESCRIPTION = eINSTANCE.getComponentInstance_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__NAME = eINSTANCE.getComponentInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__BINDING = eINSTANCE.getComponentInstance_Binding();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PORT = eINSTANCE.getComponentInstance_Port();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_INSTANCE = eINSTANCE.getComponentInstance_ComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__INTERFACE = eINSTANCE.getComponentInstance_Interface();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__KIND = eINSTANCE.getComponentInstance_Kind();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.DocumentRootImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPONENT_INSTANCE = eINSTANCE.getDocumentRoot_ComponentInstance();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.InterfaceImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SERVICE = eINSTANCE.getInterface_Service();

		/**
		 * The meta object literal for the '<em><b>Descrition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__DESCRITION = eINSTANCE.getInterface_Descrition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.PortImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DIRECTION = eINSTANCE.getPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__VISIBILITY = eINSTANCE.getPort_Visibility();

		/**
		 * The meta object literal for the '<em><b>Defined By Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DEFINED_BY_INTERFACE = eINSTANCE.getPort_DefinedByInterface();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DESCRIPTION = eINSTANCE.getPort_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.ServiceImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ARG = eINSTANCE.getService_Arg();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BODY = eINSTANCE.getService_Body();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__KIND = eINSTANCE.getService_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Returned Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__RETURNED_TYPE = eINSTANCE.getService_ReturnedType();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.UsedServiceImpl <em>Used Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.UsedServiceImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getUsedService()
		 * @generated
		 */
		EClass USED_SERVICE = eINSTANCE.getUsedService();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USED_SERVICE__ARG = eINSTANCE.getUsedService_Arg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USED_SERVICE__NAME = eINSTANCE.getUsedService_Name();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.AssemblyBindingImpl <em>Assembly Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.AssemblyBindingImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getAssemblyBinding()
		 * @generated
		 */
		EClass ASSEMBLY_BINDING = eINSTANCE.getAssemblyBinding();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSEMBLY_BINDING__KIND = eINSTANCE.getAssemblyBinding_Kind();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.impl.DelegationBindingImpl <em>Delegation Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.impl.DelegationBindingImpl
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getDelegationBinding()
		 * @generated
		 */
		EClass DELEGATION_BINDING = eINSTANCE.getDelegationBinding();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION_BINDING__KIND = eINSTANCE.getDelegationBinding_Kind();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.BindingKind <em>Binding Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.BindingKind
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getBindingKind()
		 * @generated
		 */
		EEnum BINDING_KIND = eINSTANCE.getBindingKind();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.ComponentKind <em>Component Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.ComponentKind
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getComponentKind()
		 * @generated
		 */
		EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.Direction
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.ServiceKind <em>Service Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.ServiceKind
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getServiceKind()
		 * @generated
		 */
		EEnum SERVICE_KIND = eINSTANCE.getServiceKind();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.Visibility
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.A_BindingKind <em>ABinding Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.A_BindingKind
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getA_BindingKind()
		 * @generated
		 */
		EEnum ABINDING_KIND = eINSTANCE.getA_BindingKind();

		/**
		 * The meta object literal for the '{@link metamodele.clacs.cl.D_BindingKind <em>DBinding Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.D_BindingKind
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getD_BindingKind()
		 * @generated
		 */
		EEnum DBINDING_KIND = eINSTANCE.getD_BindingKind();

		/**
		 * The meta object literal for the '<em>Binding Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.BindingKind
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getBindingKindObject()
		 * @generated
		 */
		EDataType BINDING_KIND_OBJECT = eINSTANCE.getBindingKindObject();

		/**
		 * The meta object literal for the '<em>Component Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.ComponentKind
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getComponentKindObject()
		 * @generated
		 */
		EDataType COMPONENT_KIND_OBJECT = eINSTANCE.getComponentKindObject();

		/**
		 * The meta object literal for the '<em>Direction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.Direction
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getDirectionObject()
		 * @generated
		 */
		EDataType DIRECTION_OBJECT = eINSTANCE.getDirectionObject();

		/**
		 * The meta object literal for the '<em>Service Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.ServiceKind
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getServiceKindObject()
		 * @generated
		 */
		EDataType SERVICE_KIND_OBJECT = eINSTANCE.getServiceKindObject();

		/**
		 * The meta object literal for the '<em>Visibility Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodele.clacs.cl.Visibility
		 * @see metamodele.clacs.cl.impl.ClPackageImpl#getVisibilityObject()
		 * @generated
		 */
		EDataType VISIBILITY_OBJECT = eINSTANCE.getVisibilityObject();

	}

} //ClPackage
