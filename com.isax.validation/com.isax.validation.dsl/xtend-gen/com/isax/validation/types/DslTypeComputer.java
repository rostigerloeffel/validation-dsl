package com.isax.validation.types;

import com.isax.validation.dsl.dsl.XXAssignment;
import com.isax.validation.dsl.dsl.XXPropertyExpression;
import java.util.Arrays;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationResult;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;

@SuppressWarnings("all")
public class DslTypeComputer extends XbaseWithAnnotationsTypeComputer {
  protected void _computeTypes(final XXPropertyExpression expression, final ITypeComputationState state) {
    LightweightTypeReference _typeForName = this.getTypeForName(String.class, state);
    state.acceptActualType(_typeForName);
  }
  
  protected void _computeTypes(final XXAssignment assignment, final ITypeComputationState state) {
    XExpression _expression = assignment.getExpression();
    final ITypeComputationResult inner = state.computeTypes(_expression);
    LightweightTypeReference _actualExpressionType = inner.getActualExpressionType();
    state.acceptActualType(_actualExpressionType);
  }
  
  public void computeTypes(final XExpression assignment, final ITypeComputationState state) {
    if (assignment instanceof XAssignment) {
      _computeTypes((XAssignment)assignment, state);
      return;
    } else if (assignment instanceof XDoWhileExpression) {
      _computeTypes((XDoWhileExpression)assignment, state);
      return;
    } else if (assignment instanceof XListLiteral) {
      _computeTypes((XListLiteral)assignment, state);
      return;
    } else if (assignment instanceof XSetLiteral) {
      _computeTypes((XSetLiteral)assignment, state);
      return;
    } else if (assignment instanceof XWhileExpression) {
      _computeTypes((XWhileExpression)assignment, state);
      return;
    } else if (assignment instanceof XXAssignment) {
      _computeTypes((XXAssignment)assignment, state);
      return;
    } else if (assignment instanceof XXPropertyExpression) {
      _computeTypes((XXPropertyExpression)assignment, state);
      return;
    } else if (assignment instanceof XAbstractFeatureCall) {
      _computeTypes((XAbstractFeatureCall)assignment, state);
      return;
    } else if (assignment instanceof XBasicForLoopExpression) {
      _computeTypes((XBasicForLoopExpression)assignment, state);
      return;
    } else if (assignment instanceof XBlockExpression) {
      _computeTypes((XBlockExpression)assignment, state);
      return;
    } else if (assignment instanceof XBooleanLiteral) {
      _computeTypes((XBooleanLiteral)assignment, state);
      return;
    } else if (assignment instanceof XCastedExpression) {
      _computeTypes((XCastedExpression)assignment, state);
      return;
    } else if (assignment instanceof XClosure) {
      _computeTypes((XClosure)assignment, state);
      return;
    } else if (assignment instanceof XConstructorCall) {
      _computeTypes((XConstructorCall)assignment, state);
      return;
    } else if (assignment instanceof XForLoopExpression) {
      _computeTypes((XForLoopExpression)assignment, state);
      return;
    } else if (assignment instanceof XIfExpression) {
      _computeTypes((XIfExpression)assignment, state);
      return;
    } else if (assignment instanceof XInstanceOfExpression) {
      _computeTypes((XInstanceOfExpression)assignment, state);
      return;
    } else if (assignment instanceof XNullLiteral) {
      _computeTypes((XNullLiteral)assignment, state);
      return;
    } else if (assignment instanceof XNumberLiteral) {
      _computeTypes((XNumberLiteral)assignment, state);
      return;
    } else if (assignment instanceof XReturnExpression) {
      _computeTypes((XReturnExpression)assignment, state);
      return;
    } else if (assignment instanceof XStringLiteral) {
      _computeTypes((XStringLiteral)assignment, state);
      return;
    } else if (assignment instanceof XSwitchExpression) {
      _computeTypes((XSwitchExpression)assignment, state);
      return;
    } else if (assignment instanceof XSynchronizedExpression) {
      _computeTypes((XSynchronizedExpression)assignment, state);
      return;
    } else if (assignment instanceof XThrowExpression) {
      _computeTypes((XThrowExpression)assignment, state);
      return;
    } else if (assignment instanceof XTryCatchFinallyExpression) {
      _computeTypes((XTryCatchFinallyExpression)assignment, state);
      return;
    } else if (assignment instanceof XTypeLiteral) {
      _computeTypes((XTypeLiteral)assignment, state);
      return;
    } else if (assignment instanceof XVariableDeclaration) {
      _computeTypes((XVariableDeclaration)assignment, state);
      return;
    } else if (assignment instanceof XAnnotation) {
      _computeTypes((XAnnotation)assignment, state);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assignment, state).toString());
    }
  }
}
