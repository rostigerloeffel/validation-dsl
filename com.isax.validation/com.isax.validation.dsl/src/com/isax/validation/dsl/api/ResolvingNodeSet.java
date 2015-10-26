package com.isax.validation.dsl.api;

import java.util.Iterator;

public class ResolvingNodeSet implements Iterable<ResolvingNode> {
	public boolean hasCandidates() {
		return true;
	}

	@Override
	public Iterator<ResolvingNode> iterator() {
		return null;
	}
}
