/**
 */
package com.isax.validation.dsl.dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Relation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.isax.validation.dsl.dsl.DslPackage#getPropertyRelation()
 * @model
 * @generated
 */
public enum PropertyRelation implements Enumerator
{
	/**
	 * The '<em><b>Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(0, "Equals", "equals"),

	/**
	 * The '<em><b>Not Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUALS(1, "NotEquals", "not equals"),

	/**
	 * The '<em><b>Greater</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(2, "Greater", "greater than"),

	/**
	 * The '<em><b>Lesser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSER_VALUE
	 * @generated
	 * @ordered
	 */
	LESSER(3, "Lesser", "lesser than"),

	/**
	 * The '<em><b>Greater Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_EQUALS(4, "GreaterEquals", "greater or equals than"),

	/**
	 * The '<em><b>Lesser Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSER_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	LESSER_EQUALS(5, "LesserEquals", "lesser or equals than"),

	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(6, "Contains", "Contains"),

	/**
	 * The '<em><b>Not Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_CONTAINS(7, "NotContains", "NotContains"),

	/**
	 * The '<em><b>Intersects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERSECTS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERSECTS(8, "Intersects", "Intersects"),

	/**
	 * The '<em><b>Subset Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSET_OF_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSET_OF(9, "SubsetOf", "SubsetOf");

	/**
	 * The '<em><b>Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model name="Equals" literal="equals"
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 0;

	/**
	 * The '<em><b>Not Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUALS
	 * @model name="NotEquals" literal="not equals"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUALS_VALUE = 1;

	/**
	 * The '<em><b>Greater</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model name="Greater" literal="greater than"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 2;

	/**
	 * The '<em><b>Lesser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lesser</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSER
	 * @model name="Lesser" literal="lesser than"
	 * @generated
	 * @ordered
	 */
	public static final int LESSER_VALUE = 3;

	/**
	 * The '<em><b>Greater Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_EQUALS
	 * @model name="GreaterEquals" literal="greater or equals than"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_EQUALS_VALUE = 4;

	/**
	 * The '<em><b>Lesser Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lesser Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSER_EQUALS
	 * @model name="LesserEquals" literal="lesser or equals than"
	 * @generated
	 * @ordered
	 */
	public static final int LESSER_EQUALS_VALUE = 5;

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contains</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model name="Contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 6;

	/**
	 * The '<em><b>Not Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Contains</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_CONTAINS
	 * @model name="NotContains"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_CONTAINS_VALUE = 7;

	/**
	 * The '<em><b>Intersects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intersects</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERSECTS
	 * @model name="Intersects"
	 * @generated
	 * @ordered
	 */
	public static final int INTERSECTS_VALUE = 8;

	/**
	 * The '<em><b>Subset Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subset Of</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSET_OF
	 * @model name="SubsetOf"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSET_OF_VALUE = 9;

	/**
	 * An array of all the '<em><b>Property Relation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyRelation[] VALUES_ARRAY =
		new PropertyRelation[]
		{
			EQUALS,
			NOT_EQUALS,
			GREATER,
			LESSER,
			GREATER_EQUALS,
			LESSER_EQUALS,
			CONTAINS,
			NOT_CONTAINS,
			INTERSECTS,
			SUBSET_OF,
		};

	/**
	 * A public read-only list of all the '<em><b>Property Relation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyRelation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Relation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyRelation get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			PropertyRelation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Relation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyRelation getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			PropertyRelation result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Relation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyRelation get(int value)
	{
		switch (value)
		{
			case EQUALS_VALUE: return EQUALS;
			case NOT_EQUALS_VALUE: return NOT_EQUALS;
			case GREATER_VALUE: return GREATER;
			case LESSER_VALUE: return LESSER;
			case GREATER_EQUALS_VALUE: return GREATER_EQUALS;
			case LESSER_EQUALS_VALUE: return LESSER_EQUALS;
			case CONTAINS_VALUE: return CONTAINS;
			case NOT_CONTAINS_VALUE: return NOT_CONTAINS;
			case INTERSECTS_VALUE: return INTERSECTS;
			case SUBSET_OF_VALUE: return SUBSET_OF;
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
	private PropertyRelation(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //PropertyRelation
