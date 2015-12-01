package com.isax.validation.dsl.api;

import java.util.Iterator;

public class ResolvingNodeSet implements Iterable<ResolvingNode>, Resolvable {
	@Override
	public boolean hasCandidates() {
		return true;
	}
	
	public Object getProperty(String name) {
		return null;
	}

	public void setProperty(String name, Object value) {
		
	}
	
	@Override
	public Iterator<ResolvingNode> iterator() {
		return null;
	}
}
