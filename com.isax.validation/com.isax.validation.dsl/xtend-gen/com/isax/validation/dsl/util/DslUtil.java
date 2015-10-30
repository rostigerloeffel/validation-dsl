package com.isax.validation.dsl.util;

import com.google.common.base.Objects;
import com.isax.validation.dsl.dsl.Axis;
import com.isax.validation.dsl.dsl.NodeDefinition;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class DslUtil {
  public static int uniqueSuffix(final EObject object) {
    return object.hashCode();
  }
  
  public static boolean collectionAxis(final Axis axis) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _equals = Objects.equal(axis, Axis.ANCESTORS);
    if (_equals) {
      _or_2 = true;
    } else {
      boolean _equals_1 = Objects.equal(axis, Axis.DESCENDANTS);
      _or_2 = _equals_1;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _equals_2 = Objects.equal(axis, Axis.CHILDREN);
      _or_1 = _equals_2;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _equals_3 = Objects.equal(axis, Axis.PARENTS);
      _or = _equals_3;
    }
    return _or;
  }
  
  public static String uniqueName(final NodeDefinition node) {
    String _name = node.getName();
    String _plus = (_name + "$");
    int _uniqueSuffix = DslUtil.uniqueSuffix(node);
    return (_plus + Integer.valueOf(_uniqueSuffix));
  }
}
