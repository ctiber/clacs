/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCLACS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see GCLACS.GCLACSFactory
 * @model kind="package"
 * @generated
 */
public interface GCLACSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GCLACS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "GCLACS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gcl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GCLACSPackage eINSTANCE = GCLACS.impl.GCLACSPackageImpl.init();

	/**
	 * The meta object id for the '{@link GCLACS.impl.Document_RootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.Document_RootImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getDocument_Root()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link GCLACS.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.InterfaceImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link GCLACS.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.ServicesImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 3;

	/**
	 * The meta object id for the '{@link GCLACS.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.PortImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The meta object id for the '{@link GCLACS.impl.RequiredPortImpl <em>Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.RequiredPortImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getRequiredPort()
	 * @generated
	 */
	int REQUIRED_PORT = 5;

	/**
	 * The meta object id for the '{@link GCLACS.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.BindingImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 6;

	/**
	 * The meta object id for the '{@link GCLACS.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.ProvidedPortImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getProvidedPort()
	 * @generated
	 */
	int PROVIDED_PORT = 7;

	/**
	 * The meta object id for the '{@link GCLACS.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.ComponentInstanceImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PORT = 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BINDING = 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__KIND = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__WIDTH = 6;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__HEIGHT = 7;

	/**
	 * The feature id for the '<em><b>Define By Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR = 8;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__KIND = 1;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__ARG = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__BODY = 3;

	/**
	 * The feature id for the '<em><b>Returned Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__RETURNED_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__XP = 2;

	/**
	 * The feature id for the '<em><b>Yp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__YP = 3;

	/**
	 * The feature id for the '<em><b>Define By Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEFINE_BY_INTERFACE = 4;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__VISIBILITY = PORT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__XP = PORT__XP;

	/**
	 * The feature id for the '<em><b>Yp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__YP = PORT__YP;

	/**
	 * The feature id for the '<em><b>Define By Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__DEFINE_BY_INTERFACE = PORT__DEFINE_BY_INTERFACE;

	/**
	 * The number of structural features of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__KIND = 0;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__GLUE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = 4;

	/**
	 * The feature id for the '<em><b>Used Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__USED_SERVICE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Used Service Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__USED_SERVICE_ARGS = 6;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__VISIBILITY = PORT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Xp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__XP = PORT__XP;

	/**
	 * The feature id for the '<em><b>Yp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__YP = PORT__YP;

	/**
	 * The feature id for the '<em><b>Define By Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__DEFINE_BY_INTERFACE = PORT__DEFINE_BY_INTERFACE;

	/**
	 * The number of structural features of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GCLACS.impl.DefineByInterfaceImpl <em>Define By Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.DefineByInterfaceImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getDefineByInterface()
	 * @generated
	 */
	int DEFINE_BY_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_BY_INTERFACE__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_BY_INTERFACE__PORT = 1;

	/**
	 * The number of structural features of the '<em>Define By Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINE_BY_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link GCLACS.impl.ArgImpl <em>Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.ArgImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getArg()
	 * @generated
	 */
	int ARG = 9;

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
	 * The meta object id for the '{@link GCLACS.impl.BodyTypeImpl <em>Body Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.impl.BodyTypeImpl
	 * @see GCLACS.impl.GCLACSPackageImpl#getBodyType()
	 * @generated
	 */
	int BODY_TYPE = 10;

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
	 * The meta object id for the '{@link GCLACS.BindingKind <em>Binding Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.BindingKind
	 * @see GCLACS.impl.GCLACSPackageImpl#getBindingKind()
	 * @generated
	 */
	int BINDING_KIND = 11;

	/**
	 * The meta object id for the '{@link GCLACS.ComponentKind <em>Component Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.ComponentKind
	 * @see GCLACS.impl.GCLACSPackageImpl#getComponentKind()
	 * @generated
	 */
	int COMPONENT_KIND = 12;

	/**
	 * The meta object id for the '{@link GCLACS.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.Visibility
	 * @see GCLACS.impl.GCLACSPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 13;

	/**
	 * The meta object id for the '{@link GCLACS.ServiceKind <em>Service Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCLACS.ServiceKind
	 * @see GCLACS.impl.GCLACSPackageImpl#getServiceKind()
	 * @generated
	 */
	int SERVICE_KIND = 14;


	/**
	 * Returns the meta object for class '{@link GCLACS.Document_Root <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see GCLACS.Document_Root
	 * @generated
	 */
	EClass getDocument_Root();

	/**
	 * Returns the meta object for the containment reference '{@link GCLACS.Document_Root#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instance</em>'.
	 * @see GCLACS.Document_Root#getComponentInstance()
	 * @see #getDocument_Root()
	 * @generated
	 */
	EReference getDocument_Root_ComponentInstance();

	/**
	 * Returns the meta object for class '{@link GCLACS.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see GCLACS.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GCLACS.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link GCLACS.Interface#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see GCLACS.Interface#getService()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Service();

	/**
	 * Returns the meta object for class '{@link GCLACS.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see GCLACS.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Services#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GCLACS.Services#getName()
	 * @see #getServices()
	 * @generated
	 */
	EAttribute getServices_Name();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Services#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see GCLACS.Services#getKind()
	 * @see #getServices()
	 * @generated
	 */
	EAttribute getServices_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link GCLACS.Services#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg</em>'.
	 * @see GCLACS.Services#getArg()
	 * @see #getServices()
	 * @generated
	 */
	EReference getServices_Arg();

	/**
	 * Returns the meta object for the containment reference '{@link GCLACS.Services#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see GCLACS.Services#getBody()
	 * @see #getServices()
	 * @generated
	 */
	EReference getServices_Body();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Services#getReturnedType <em>Returned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returned Type</em>'.
	 * @see GCLACS.Services#getReturnedType()
	 * @see #getServices()
	 * @generated
	 */
	EAttribute getServices_ReturnedType();

	/**
	 * Returns the meta object for class '{@link GCLACS.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see GCLACS.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GCLACS.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Port#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see GCLACS.Port#getVisibility()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Port#getXp <em>Xp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xp</em>'.
	 * @see GCLACS.Port#getXp()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Xp();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Port#getYp <em>Yp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yp</em>'.
	 * @see GCLACS.Port#getYp()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Yp();

	/**
	 * Returns the meta object for the containment reference '{@link GCLACS.Port#getDefineByInterface <em>Define By Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Define By Interface</em>'.
	 * @see GCLACS.Port#getDefineByInterface()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_DefineByInterface();

	/**
	 * Returns the meta object for class '{@link GCLACS.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Port</em>'.
	 * @see GCLACS.RequiredPort
	 * @generated
	 */
	EClass getRequiredPort();

	/**
	 * Returns the meta object for class '{@link GCLACS.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see GCLACS.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Binding#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see GCLACS.Binding#getKind()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Kind();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Binding#isGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Glue</em>'.
	 * @see GCLACS.Binding#isGlue()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Glue();

	/**
	 * Returns the meta object for the reference '{@link GCLACS.Binding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see GCLACS.Binding#getSource()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link GCLACS.Binding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see GCLACS.Binding#getTarget()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Target();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GCLACS.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Name();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Binding#getUsedServiceName <em>Used Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Service Name</em>'.
	 * @see GCLACS.Binding#getUsedServiceName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_UsedServiceName();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Binding#getUsedServiceArgs <em>Used Service Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Service Args</em>'.
	 * @see GCLACS.Binding#getUsedServiceArgs()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_UsedServiceArgs();

	/**
	 * Returns the meta object for class '{@link GCLACS.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Port</em>'.
	 * @see GCLACS.ProvidedPort
	 * @generated
	 */
	EClass getProvidedPort();

	/**
	 * Returns the meta object for class '{@link GCLACS.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see GCLACS.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.ComponentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GCLACS.ComponentInstance#getName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.ComponentInstance#getDefineByDescriptor <em>Define By Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Define By Descriptor</em>'.
	 * @see GCLACS.ComponentInstance#getDefineByDescriptor()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_DefineByDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link GCLACS.ComponentInstance#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see GCLACS.ComponentInstance#getPort()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link GCLACS.ComponentInstance#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see GCLACS.ComponentInstance#getBinding()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Binding();

	/**
	 * Returns the meta object for the containment reference list '{@link GCLACS.ComponentInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instance</em>'.
	 * @see GCLACS.ComponentInstance#getComponentInstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link GCLACS.ComponentInstance#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see GCLACS.ComponentInstance#getInterface()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Interface();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.ComponentInstance#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see GCLACS.ComponentInstance#getKind()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Kind();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.ComponentInstance#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see GCLACS.ComponentInstance#getWidth()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Width();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.ComponentInstance#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see GCLACS.ComponentInstance#getHeight()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Height();

	/**
	 * Returns the meta object for class '{@link GCLACS.DefineByInterface <em>Define By Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Define By Interface</em>'.
	 * @see GCLACS.DefineByInterface
	 * @generated
	 */
	EClass getDefineByInterface();

	/**
	 * Returns the meta object for the reference '{@link GCLACS.DefineByInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see GCLACS.DefineByInterface#getInterface()
	 * @see #getDefineByInterface()
	 * @generated
	 */
	EReference getDefineByInterface_Interface();

	/**
	 * Returns the meta object for the reference '{@link GCLACS.DefineByInterface#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see GCLACS.DefineByInterface#getPort()
	 * @see #getDefineByInterface()
	 * @generated
	 */
	EReference getDefineByInterface_Port();

	/**
	 * Returns the meta object for class '{@link GCLACS.Arg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arg</em>'.
	 * @see GCLACS.Arg
	 * @generated
	 */
	EClass getArg();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Arg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GCLACS.Arg#getName()
	 * @see #getArg()
	 * @generated
	 */
	EAttribute getArg_Name();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.Arg#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see GCLACS.Arg#getType()
	 * @see #getArg()
	 * @generated
	 */
	EAttribute getArg_Type();

	/**
	 * Returns the meta object for class '{@link GCLACS.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Type</em>'.
	 * @see GCLACS.BodyType
	 * @generated
	 */
	EClass getBodyType();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.BodyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GCLACS.BodyType#getValue()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link GCLACS.BodyType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see GCLACS.BodyType#getLanguage()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_Language();

	/**
	 * Returns the meta object for enum '{@link GCLACS.BindingKind <em>Binding Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Kind</em>'.
	 * @see GCLACS.BindingKind
	 * @generated
	 */
	EEnum getBindingKind();

	/**
	 * Returns the meta object for enum '{@link GCLACS.ComponentKind <em>Component Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Kind</em>'.
	 * @see GCLACS.ComponentKind
	 * @generated
	 */
	EEnum getComponentKind();

	/**
	 * Returns the meta object for enum '{@link GCLACS.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see GCLACS.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link GCLACS.ServiceKind <em>Service Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Kind</em>'.
	 * @see GCLACS.ServiceKind
	 * @generated
	 */
	EEnum getServiceKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GCLACSFactory getGCLACSFactory();

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
		 * The meta object literal for the '{@link GCLACS.impl.Document_RootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.Document_RootImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getDocument_Root()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocument_Root();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPONENT_INSTANCE = eINSTANCE.getDocument_Root_ComponentInstance();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.InterfaceImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SERVICE = eINSTANCE.getInterface_Service();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.ServicesImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICES__NAME = eINSTANCE.getServices_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICES__KIND = eINSTANCE.getServices_Kind();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES__ARG = eINSTANCE.getServices_Arg();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES__BODY = eINSTANCE.getServices_Body();

		/**
		 * The meta object literal for the '<em><b>Returned Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICES__RETURNED_TYPE = eINSTANCE.getServices_ReturnedType();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.PortImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__VISIBILITY = eINSTANCE.getPort_Visibility();

		/**
		 * The meta object literal for the '<em><b>Xp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__XP = eINSTANCE.getPort_Xp();

		/**
		 * The meta object literal for the '<em><b>Yp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__YP = eINSTANCE.getPort_Yp();

		/**
		 * The meta object literal for the '<em><b>Define By Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__DEFINE_BY_INTERFACE = eINSTANCE.getPort_DefineByInterface();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.RequiredPortImpl <em>Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.RequiredPortImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getRequiredPort()
		 * @generated
		 */
		EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.BindingImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__KIND = eINSTANCE.getBinding_Kind();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__GLUE = eINSTANCE.getBinding_Glue();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__SOURCE = eINSTANCE.getBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__TARGET = eINSTANCE.getBinding_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__NAME = eINSTANCE.getBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Used Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__USED_SERVICE_NAME = eINSTANCE.getBinding_UsedServiceName();

		/**
		 * The meta object literal for the '<em><b>Used Service Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__USED_SERVICE_ARGS = eINSTANCE.getBinding_UsedServiceArgs();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.ProvidedPortImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getProvidedPort()
		 * @generated
		 */
		EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.ComponentInstanceImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__NAME = eINSTANCE.getComponentInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Define By Descriptor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__DEFINE_BY_DESCRIPTOR = eINSTANCE.getComponentInstance_DefineByDescriptor();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PORT = eINSTANCE.getComponentInstance_Port();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__BINDING = eINSTANCE.getComponentInstance_Binding();

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
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__WIDTH = eINSTANCE.getComponentInstance_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__HEIGHT = eINSTANCE.getComponentInstance_Height();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.DefineByInterfaceImpl <em>Define By Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.DefineByInterfaceImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getDefineByInterface()
		 * @generated
		 */
		EClass DEFINE_BY_INTERFACE = eINSTANCE.getDefineByInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_BY_INTERFACE__INTERFACE = eINSTANCE.getDefineByInterface_Interface();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINE_BY_INTERFACE__PORT = eINSTANCE.getDefineByInterface_Port();

		/**
		 * The meta object literal for the '{@link GCLACS.impl.ArgImpl <em>Arg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.ArgImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getArg()
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
		 * The meta object literal for the '{@link GCLACS.impl.BodyTypeImpl <em>Body Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.impl.BodyTypeImpl
		 * @see GCLACS.impl.GCLACSPackageImpl#getBodyType()
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
		 * The meta object literal for the '{@link GCLACS.BindingKind <em>Binding Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.BindingKind
		 * @see GCLACS.impl.GCLACSPackageImpl#getBindingKind()
		 * @generated
		 */
		EEnum BINDING_KIND = eINSTANCE.getBindingKind();

		/**
		 * The meta object literal for the '{@link GCLACS.ComponentKind <em>Component Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.ComponentKind
		 * @see GCLACS.impl.GCLACSPackageImpl#getComponentKind()
		 * @generated
		 */
		EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

		/**
		 * The meta object literal for the '{@link GCLACS.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.Visibility
		 * @see GCLACS.impl.GCLACSPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link GCLACS.ServiceKind <em>Service Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCLACS.ServiceKind
		 * @see GCLACS.impl.GCLACSPackageImpl#getServiceKind()
		 * @generated
		 */
		EEnum SERVICE_KIND = eINSTANCE.getServiceKind();

	}

} //GCLACSPackage
