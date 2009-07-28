/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodele.clacs.cl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binding Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see metamodele.clacs.cl.ClPackage#getBindingKind()
 * @model extendedMetaData="name='binding_Kind'"
 * @generated
 */
public enum BindingKind implements Enumerator {
	/**
	 * The '<em><b>Simple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(0, "simple", "simple"),

	/**
	 * The '<em><b>Delegation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGATION_VALUE
	 * @generated
	 * @ordered
	 */
	DELEGATION(1, "delegation", "delegation"),

	/**
	 * The '<em><b>BSI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BSI_VALUE
	 * @generated
	 * @ordered
	 */
	BSI(2, "bSI", "bSI"),

	/**
	 * The '<em><b>ASI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASI_VALUE
	 * @generated
	 * @ordered
	 */
	ASI(3, "aSI", "aSI"),

	/**
	 * The '<em><b>BCon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCON_VALUE
	 * @generated
	 * @ordered
	 */
	BCON(4, "bCon", "bCon"),

	/**
	 * The '<em><b>ACon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACON_VALUE
	 * @generated
	 * @ordered
	 */
	ACON(5, "aCon", "aCon"),

	/**
	 * The '<em><b>BDiscon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BDISCON_VALUE
	 * @generated
	 * @ordered
	 */
	BDISCON(6, "bDiscon", "bDiscon"),

	/**
	 * The '<em><b>ADiscon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADISCON_VALUE
	 * @generated
	 * @ordered
	 */
	ADISCON(7, "aDiscon", "aDiscon"),

	/**
	 * The '<em><b>Constraint Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRAINT_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRAINT_CONNECTION(8, "constraintConnection", "constraintConnection"),

	/**
	 * The '<em><b>Contract Connection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT_CONNECTION(9, "contractConnection", "contractConnection");

	/**
	 * The '<em><b>Simple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model name="simple"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 0;

	/**
	 * The '<em><b>Delegation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delegation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELEGATION
	 * @model name="delegation"
	 * @generated
	 * @ordered
	 */
	public static final int DELEGATION_VALUE = 1;

	/**
	 * The '<em><b>BSI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BSI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BSI
	 * @model name="bSI"
	 * @generated
	 * @ordered
	 */
	public static final int BSI_VALUE = 2;

	/**
	 * The '<em><b>ASI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASI
	 * @model name="aSI"
	 * @generated
	 * @ordered
	 */
	public static final int ASI_VALUE = 3;

	/**
	 * The '<em><b>BCon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BCon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BCON
	 * @model name="bCon"
	 * @generated
	 * @ordered
	 */
	public static final int BCON_VALUE = 4;

	/**
	 * The '<em><b>ACon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACON
	 * @model name="aCon"
	 * @generated
	 * @ordered
	 */
	public static final int ACON_VALUE = 5;

	/**
	 * The '<em><b>BDiscon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BDiscon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BDISCON
	 * @model name="bDiscon"
	 * @generated
	 * @ordered
	 */
	public static final int BDISCON_VALUE = 6;

	/**
	 * The '<em><b>ADiscon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADiscon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADISCON
	 * @model name="aDiscon"
	 * @generated
	 * @ordered
	 */
	public static final int ADISCON_VALUE = 7;

	/**
	 * The '<em><b>Constraint Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constraint Connection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRAINT_CONNECTION
	 * @model name="constraintConnection"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINT_CONNECTION_VALUE = 8;

	/**
	 * The '<em><b>Contract Connection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contract Connection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_CONNECTION
	 * @model name="contractConnection"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_CONNECTION_VALUE = 9;

	/**
	 * An array of all the '<em><b>Binding Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BindingKind[] VALUES_ARRAY =
		new BindingKind[] {
			SIMPLE,
			DELEGATION,
			BSI,
			ASI,
			BCON,
			ACON,
			BDISCON,
			ADISCON,
			CONSTRAINT_CONNECTION,
			CONTRACT_CONNECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Binding Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BindingKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingKind get(int value) {
		switch (value) {
			case SIMPLE_VALUE: return SIMPLE;
			case DELEGATION_VALUE: return DELEGATION;
			case BSI_VALUE: return BSI;
			case ASI_VALUE: return ASI;
			case BCON_VALUE: return BCON;
			case ACON_VALUE: return ACON;
			case BDISCON_VALUE: return BDISCON;
			case ADISCON_VALUE: return ADISCON;
			case CONSTRAINT_CONNECTION_VALUE: return CONSTRAINT_CONNECTION;
			case CONTRACT_CONNECTION_VALUE: return CONTRACT_CONNECTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BindingKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BindingKind
