package com.isax.validation.dsl.api;

public class NodePredicates {
	public boolean hasType(ResolvingNode node, String... types) {
		return true;
	}
	
	public boolean equals(Object lhs, Object rhs) {
		return true;
	}
	
	public boolean notEquals(Object lhs, Object rhs) {
		return true;
	}
	
	public boolean greaterThan(Object lhs, Object rhs) {
		return true;
	}
	
	public boolean lesserThan(Object lhs, Object rhs) {
		return true;
	}
	
	public boolean greaterOrEqualsThan(Object lhs, Object rhs) {
		return true;
	}
	
	public boolean lesserOrEqualsThan(Object lhs, Object rhs) {
		return true;
	}
}
