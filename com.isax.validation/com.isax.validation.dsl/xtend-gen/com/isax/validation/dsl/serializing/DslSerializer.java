package com.isax.validation.dsl.serializing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.serializer.impl.Serializer;

@SuppressWarnings("all")
public class DslSerializer extends Serializer {
  @Override
  public String serialize(final EObject obj) {
    String _xifexpression = null;
    if ((obj instanceof EPackage)) {
      _xifexpression = ((EPackage)obj).getName();
    } else {
      _xifexpression = super.serialize(obj);
    }
    return _xifexpression;
  }
}
