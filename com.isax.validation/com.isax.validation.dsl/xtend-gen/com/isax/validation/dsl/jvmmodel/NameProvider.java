package com.isax.validation.dsl.jvmmodel;

import com.isax.validation.dsl.dsl.NodeDefinition;
import java.util.HashMap;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class NameProvider {
  private HashMap<String, String> mappings = new HashMap<String, String>();
  
  public String map(final NodeDefinition node, final String newName) {
    String __uniqueName = this._uniqueName(node);
    return this.mappings.put(__uniqueName, newName);
  }
  
  public Object unmap(final NodeDefinition node) {
    Object _xblockexpression = null;
    {
      String __uniqueName = this._uniqueName(node);
      this.mappings.remove(__uniqueName);
      _xblockexpression = null;
    }
    return _xblockexpression;
  }
  
  public int uniqueSuffix(final EObject object) {
    return object.hashCode();
  }
  
  private String _uniqueName(final NodeDefinition node) {
    String _name = node.getName();
    String _plus = (_name + "$");
    int _uniqueSuffix = this.uniqueSuffix(node);
    return (_plus + Integer.valueOf(_uniqueSuffix));
  }
  
  public String uniqueName(final NodeDefinition node) {
    String __uniqueName = this._uniqueName(node);
    String __uniqueName_1 = this._uniqueName(node);
    return this.mappings.getOrDefault(__uniqueName, __uniqueName_1);
  }
}
