package com.isax.validation.dsl.api;

import java.util.function.Predicate;
import java.util.function.Consumer;

public interface Traverser {
	public abstract ResolvingNode ancestor(ResolvingNode node, Predicate<ResolvingNode> where, Consumer<ResolvingNode> then);
	public abstract ResolvingNodeSet ancestors(ResolvingNode node, Predicate<ResolvingNode> where, Consumer<ResolvingNode> then);
	public abstract ResolvingNode descendant(ResolvingNode node, Predicate<ResolvingNode> where, Consumer<ResolvingNode> then);
	public abstract ResolvingNodeSet descendants(ResolvingNode node, Predicate<ResolvingNode> where, Consumer<ResolvingNode> then);
	public abstract ResolvingNode parent(ResolvingNode node, Predicate<ResolvingNode> where, Consumer<ResolvingNode> then);
	public abstract ResolvingNodeSet parents(ResolvingNode node, Predicate<ResolvingNode> where, Consumer<ResolvingNode> then);
	public abstract ResolvingNode child(ResolvingNode node, Predicate<ResolvingNode> where, Consumer<ResolvingNode> then);
	public abstract ResolvingNodeSet children(ResolvingNode node, Predicate<ResolvingNode> where, Consumer<ResolvingNode> then);
}
