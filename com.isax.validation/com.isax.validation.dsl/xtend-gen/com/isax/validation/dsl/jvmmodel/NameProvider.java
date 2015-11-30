package com.isax.validation.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.isax.validation.dsl.dsl.NodeDefinition;
import com.isax.validation.dsl.util.DslUtil;
import java.util.HashMap;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class NameProvider {
  private int index = 0;
  
  private HashMap<EObject, Integer> suffixes = new HashMap<EObject, Integer>();
  
  private HashMap<String, Stack<String>> mappings = new HashMap<String, Stack<String>>();
  
  public Object map(final NodeDefinition node, final String newName) {
    Object _xblockexpression = null;
    {
      String _computeUniqueName = this.computeUniqueName(node);
      Stack<String> _stack = new Stack<String>();
      this.mappings.putIfAbsent(_computeUniqueName, _stack);
      String _computeUniqueName_1 = this.computeUniqueName(node);
      Stack<String> _get = this.mappings.get(_computeUniqueName_1);
      _get.push(newName);
      _xblockexpression = null;
    }
    return _xblockexpression;
  }
  
  public Object unmap(final NodeDefinition node) {
    Object _xblockexpression = null;
    {
      String _computeUniqueName = this.computeUniqueName(node);
      Stack<String> _get = this.mappings.get(_computeUniqueName);
      if (_get!=null) {
        _get.pop();
      }
      _xblockexpression = null;
    }
    return _xblockexpression;
  }
  
  public String uniqueSuffix(final EObject object) {
    String _xblockexpression = null;
    {
      Integer suffix = this.suffixes.get(object);
      boolean _equals = Objects.equal(suffix, null);
      if (_equals) {
        int _plusPlus = this.index++;
        suffix = Integer.valueOf(_plusPlus);
        this.suffixes.put(object, suffix);
      }
      _xblockexpression = suffix.toString();
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
      final Stack<String> mappings = this.mappings.get(uniqueName);
      String _xifexpression = null;
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(mappings);
      if (_isNullOrEmpty) {
        _xifexpression = uniqueName;
      } else {
        _xifexpression = mappings.peek();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
