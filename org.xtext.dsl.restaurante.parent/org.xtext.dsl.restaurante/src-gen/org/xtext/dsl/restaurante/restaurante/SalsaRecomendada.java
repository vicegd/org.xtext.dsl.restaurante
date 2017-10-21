/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.restaurante;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Salsa Recomendada</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getSalsaRecomendada()
 * @model
 * @generated
 */
public enum SalsaRecomendada implements Enumerator
{
  /**
   * The '<em><b>NINGUNA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NINGUNA_VALUE
   * @generated
   * @ordered
   */
  NINGUNA(0, "NINGUNA", "NINGUNA"),

  /**
   * The '<em><b>ACEITE YVINAGRE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACEITE_YVINAGRE_VALUE
   * @generated
   * @ordered
   */
  ACEITE_YVINAGRE(1, "ACEITE_Y_VINAGRE", "ACEITE_Y_VINAGRE"),

  /**
   * The '<em><b>CESAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CESAR_VALUE
   * @generated
   * @ordered
   */
  CESAR(2, "CESAR", "CESAR"),

  /**
   * The '<em><b>MODENA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MODENA_VALUE
   * @generated
   * @ordered
   */
  MODENA(3, "MODENA", "MODENA"),

  /**
   * The '<em><b>MOSTAZA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOSTAZA_VALUE
   * @generated
   * @ordered
   */
  MOSTAZA(4, "MOSTAZA", "MOSTAZA");

  /**
   * The '<em><b>NINGUNA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NINGUNA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NINGUNA
   * @model
   * @generated
   * @ordered
   */
  public static final int NINGUNA_VALUE = 0;

  /**
   * The '<em><b>ACEITE YVINAGRE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ACEITE YVINAGRE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACEITE_YVINAGRE
   * @model name="ACEITE_Y_VINAGRE"
   * @generated
   * @ordered
   */
  public static final int ACEITE_YVINAGRE_VALUE = 1;

  /**
   * The '<em><b>CESAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CESAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CESAR
   * @model
   * @generated
   * @ordered
   */
  public static final int CESAR_VALUE = 2;

  /**
   * The '<em><b>MODENA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MODENA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MODENA
   * @model
   * @generated
   * @ordered
   */
  public static final int MODENA_VALUE = 3;

  /**
   * The '<em><b>MOSTAZA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MOSTAZA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOSTAZA
   * @model
   * @generated
   * @ordered
   */
  public static final int MOSTAZA_VALUE = 4;

  /**
   * An array of all the '<em><b>Salsa Recomendada</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SalsaRecomendada[] VALUES_ARRAY =
    new SalsaRecomendada[]
    {
      NINGUNA,
      ACEITE_YVINAGRE,
      CESAR,
      MODENA,
      MOSTAZA,
    };

  /**
   * A public read-only list of all the '<em><b>Salsa Recomendada</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SalsaRecomendada> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Salsa Recomendada</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SalsaRecomendada get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SalsaRecomendada result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Salsa Recomendada</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SalsaRecomendada getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SalsaRecomendada result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Salsa Recomendada</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static SalsaRecomendada get(int value)
  {
    switch (value)
    {
      case NINGUNA_VALUE: return NINGUNA;
      case ACEITE_YVINAGRE_VALUE: return ACEITE_YVINAGRE;
      case CESAR_VALUE: return CESAR;
      case MODENA_VALUE: return MODENA;
      case MOSTAZA_VALUE: return MOSTAZA;
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
  private SalsaRecomendada(int value, String name, String literal)
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
  
} //SalsaRecomendada