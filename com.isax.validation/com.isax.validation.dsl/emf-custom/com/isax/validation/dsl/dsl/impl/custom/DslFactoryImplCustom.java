package com.isax.validation.dsl.dsl.impl.custom;

import com.isax.validation.dsl.dsl.BodySentences;
import com.isax.validation.dsl.dsl.impl.DslFactoryImpl;

public class DslFactoryImplCustom extends DslFactoryImpl {

	@Override
	public BodySentences createBodySentences() {
		return new BodySentencesImplCustom();
	}
}
