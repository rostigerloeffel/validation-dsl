package com.isax.validation.dsl.api;

public class ResolvingNode implements Resolvable {
	@Override
	public boolean hasCandidates() {
		return true;
	}
	
	public Object getProperty(String name) {
		return null;
	}
}
