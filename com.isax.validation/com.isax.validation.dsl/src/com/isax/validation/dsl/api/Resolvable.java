package com.isax.validation.dsl.api;

public interface Resolvable {
	public abstract boolean hasCandidates();
		
	public class Null implements Resolvable {
		@Override
		public boolean hasCandidates() {
			return false;
		}		
	}
}
