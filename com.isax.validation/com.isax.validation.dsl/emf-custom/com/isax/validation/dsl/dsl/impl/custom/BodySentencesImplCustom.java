package com.isax.validation.dsl.dsl.impl.custom;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.isax.validation.dsl.dsl.ConstraintSentence;
import com.isax.validation.dsl.dsl.DefinitionSentence;
import com.isax.validation.dsl.dsl.impl.BodySentencesImpl;

import java.util.stream.Collectors;

public class BodySentencesImplCustom extends BodySentencesImpl {

	@Override
	public EList<DefinitionSentence> getDefinitions() {
		return (getSentences().stream()
					.filter(s -> { return (s instanceof DefinitionSentence); })
					.map(s -> { return (DefinitionSentence) s; })
					.collect(Collectors.toCollection(BasicEList::new)));
	}
	
	@Override
	public EList<ConstraintSentence> getConstraints() {
		return (getSentences().stream()
				.filter(s -> { return (s instanceof ConstraintSentence); })
				.map(s -> { return (ConstraintSentence) s; })
				.collect(Collectors.toCollection(BasicEList::new)));
	}
}
