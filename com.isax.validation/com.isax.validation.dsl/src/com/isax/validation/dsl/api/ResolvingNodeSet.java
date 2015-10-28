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

	@Override
	public Iterator<ResolvingNode> iterator() {
		return null;
	}
}
