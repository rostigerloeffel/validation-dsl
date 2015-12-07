package com.isax.validation.dsl.api;

public class NodePredicates {
	public boolean hasType(ResolvingNode node, String... types) {
		return true;
	}
	
	public boolean equals(String lhs, String rhs) {
		return true;
	}
	
	public boolean notEquals(String lhs, String rhs) {
		return true;
	}
	
	public boolean greaterThan(String lhs, String rhs) {
		return true;
	}
	
	public boolean lesserThan(String lhs, String rhs) {
		return true;
	}
	
	public boolean greaterOrEqualsThan(String lhs, String rhs) {
		return true;
	}
	
	public boolean lesserOrEqualsThan(String lhs, String rhs) {
		return true;
	}
}
