package com.isax.validation.dsl.api;

public abstract class AbstractValidator {

	public abstract boolean isActive(ResolvingNode node);
	
	public abstract boolean validate(ResolvingNode node);
	
	protected boolean eval(final Predicate predicate) {
		return predicate.test();
	}
}
