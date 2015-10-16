package com.isax.validation.dsl;

public class Main {

	@FunctionalInterface
	public interface BooleanBlock {
		public boolean run();
	}
	
	public static void main(String args[]) {
		boolean b = where(() -> { return true; });
	}	
	
	public static boolean where(BooleanBlock b) {
		return b.run();
	}
	
}
