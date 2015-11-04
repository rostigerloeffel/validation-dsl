package com.isax.validation.dsl.util;

import com.google.common.base.Objects;
import com.isax.validation.dsl.dsl.Axis;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
  
  public static String path(final EObject object) {
    String _xblockexpression = null;
    {
      ArrayList<Integer> path = new ArrayList<Integer>();
      EObject inner = object;
      EObject parent = object.eContainer();
      while ((!Objects.equal(parent, null))) {
        {
          List<EObject> _eAllContentsAsList = EcoreUtil2.eAllContentsAsList(parent);
          int _indexOf = _eAllContentsAsList.indexOf(inner);
          path.add(Integer.valueOf(_indexOf));
          inner = parent;
          EObject _eContainer = parent.eContainer();
          parent = _eContainer;
        }
      }
      _xblockexpression = IterableExtensions.join(path, "_");
    }
    return _xblockexpression;
  }
}
