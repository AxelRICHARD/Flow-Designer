/**
 * generated by Xtext 2.12.0
 */
package fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RoutingRule#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getRoutingRule()
 * @model
 * @generated
 */
public interface RoutingRule extends RoutingRules
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.CaseRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see fr.obeo.dsl.designer.sample.flow.routerdsl.routerDsl.RouterDslPackage#getRoutingRule_Rules()
   * @model containment="true"
   * @generated
   */
  EList<CaseRule> getRules();

} // RoutingRule