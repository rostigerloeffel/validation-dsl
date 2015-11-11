package com.isax.validation.dsl.jvmmodel;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Objects;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.util.DslUtil;

@SuppressWarnings("all")
public class NameProvider {
  private int index = 0;
  
  private HashMap<EObject, Integer> suffixes = new HashMap<EObject, Integer>();
  
  private HashMap<String, String> mappings = new HashMap<String, String>();
  
  public String map(final NodeDefinition node, final String newName) {
    String _computeUniqueName = this.computeUniqueName(node);
    return this.mappings.put(_computeUniqueName, newName);
  }
  
  public Object unmap(final NodeDefinition node) {
    Object _xblockexpression = null;
    {
      String _computeUniqueName = this.computeUniqueName(node);
      this.mappings.remove(_computeUniqueName);
      _xblockexpression = null;
    }
    return _xblockexpression;
  }
  
  public Integer uniqueSuffix(final EObject object) {
    Integer _xblockexpression = null;
    {
      Integer suffix = this.suffixes.get(object);
      boolean _equals = Objects.equal(suffix, null);
      if (_equals) {
        int _plusPlus = this.index++;
        suffix = Integer.valueOf(_plusPlus);
        this.suffixes.put(object, suffix);
      }
      _xblockexpression = suffix;
    }
    return _xblockexpression;
  }
  
  private String computeUniqueName(final NodeDefinition node) {
    String _name = node.getName();
    String _plus = (_name + "$");
    String _path = DslUtil.path(node);
    return (_plus + _path);
  }
  
  public String uniqueName(final NodeDefinition node) {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(node, null);
      if (_equals) {
        return "";
      }
      final String uniqueName = this.computeUniqueName(node);
      _xblockexpression = this.mappings.getOrDefault(uniqueName, uniqueName);
    }
    return _xblockexpression;
  }
}
