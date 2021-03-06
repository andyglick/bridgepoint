/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unconstrained Array Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.UnconstrainedArrayDefinition#getIndexType <em>Index Type</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.UnconstrainedArrayDefinition#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getUnconstrainedArrayDefinition()
 * @model
 * @generated
 */
public interface UnconstrainedArrayDefinition extends AbstractTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Index Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Type</em>' containment reference.
	 * @see #setIndexType(NamedTypeReference)
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getUnconstrainedArrayDefinition_IndexType()
	 * @model containment="true"
	 * @generated
	 */
	NamedTypeReference getIndexType();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.types.UnconstrainedArrayDefinition#getIndexType <em>Index Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Type</em>' containment reference.
	 * @see #getIndexType()
	 * @generated
	 */
	void setIndexType(NamedTypeReference value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(AbstractTypeReference)
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getUnconstrainedArrayDefinition_ElementType()
	 * @model containment="true"
	 * @generated
	 */
	AbstractTypeReference getElementType();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.types.UnconstrainedArrayDefinition#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(AbstractTypeReference value);

} // UnconstrainedArrayDefinition
