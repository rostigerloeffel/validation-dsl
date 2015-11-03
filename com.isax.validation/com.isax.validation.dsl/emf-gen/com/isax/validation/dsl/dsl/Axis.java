/**
 */
package com.isax.validation.dsl.dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Axis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.isax.validation.dsl.dsl.DslPackage#getAxis()
 * @model
 * @generated
 */
public enum Axis implements Enumerator
{
	/**
	 * The '<em><b>Parent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENT_VALUE
	 * @generated
	 * @ordered
	 */
	PARENT(0, "Parent", "parent"),

	/**
	 * The '<em><b>Child</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(1, "Child", "child"),

	/**
	 * The '<em><b>Ancestor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ANCESTOR(2, "Ancestor", "ancestor"),

	/**
	 * The '<em><b>Descendant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDANT(3, "Descendant", "descendant"),

	/**
	 * The '<em><b>Parents</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARENTS_VALUE
	 * @generated
	 * @ordered
	 */
	PARENTS(4, "Parents", "multiple parents"),

	/**
	 * The '<em><b>Children</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILDREN_VALUE
	 * @generated
	 * @ordered
	 */
	CHILDREN(5, "Children", "multiple children"),

	/**
	 * The '<em><b>Ancestors</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCESTORS_VALUE
	 * @generated
	 * @ordered
	 */
	ANCESTORS(6, "Ancestors", "multiple ancestors"),

	/**
	 * The '<em><b>Descendants</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENDANTS_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENDANTS(7, "Descendants", "multiple descendants");

	/**
	 * The '<em><b>Parent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARENT
	 * @model name="Parent" literal="parent"
	 * @generated
	 * @ordered
	 */
	public static final int PARENT_VALUE = 0;

	/**
	 * The '<em><b>Child</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Child</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHILD
	 * @model name="Child" literal="child"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 1;

	/**
	 * The '<em><b>Ancestor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ancestor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANCESTOR
	 * @model name="Ancestor" literal="ancestor"
	 * @generated
	 * @ordered
	 */
	public static final int ANCESTOR_VALUE = 2;

	/**
	 * The '<em><b>Descendant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Descendant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCENDANT
	 * @model name="Descendant" literal="descendant"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDANT_VALUE = 3;

	/**
	 * The '<em><b>Parents</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parents</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARENTS
	 * @model name="Parents" literal="multiple parents"
	 * @generated
	 * @ordered
	 */
	public static final int PARENTS_VALUE = 4;

	/**
	 * The '<em><b>Children</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Children</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHILDREN
	 * @model name="Children" literal="multiple children"
	 * @generated
	 * @ordered
	 */
	public static final int CHILDREN_VALUE = 5;

	/**
	 * The '<em><b>Ancestors</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ancestors</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANCESTORS
	 * @model name="Ancestors" literal="multiple ancestors"
	 * @generated
	 * @ordered
	 */
	public static final int ANCESTORS_VALUE = 6;

	/**
	 * The '<em><b>Descendants</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Descendants</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCENDANTS
	 * @model name="Descendants" literal="multiple descendants"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENDANTS_VALUE = 7;

	/**
	 * An array of all the '<em><b>Axis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Axis[] VALUES_ARRAY =
		new Axis[]
		{
			PARENT,
			CHILD,
			ANCESTOR,
			DESCENDANT,
			PARENTS,
			CHILDREN,
			ANCESTORS,
			DESCENDANTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Axis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Axis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Axis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Axis get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Axis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Axis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Axis getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			Axis result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Axis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Axis get(int value)
	{
		switch (value)
		{
			case PARENT_VALUE: return PARENT;
			case CHILD_VALUE: return CHILD;
			case ANCESTOR_VALUE: return ANCESTOR;
			case DESCENDANT_VALUE: return DESCENDANT;
			case PARENTS_VALUE: return PARENTS;
			case CHILDREN_VALUE: return CHILDREN;
			case ANCESTORS_VALUE: return ANCESTORS;
			case DESCENDANTS_VALUE: return DESCENDANTS;
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
	private Axis(int value, String name, String literal)
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
	
} //Axis
