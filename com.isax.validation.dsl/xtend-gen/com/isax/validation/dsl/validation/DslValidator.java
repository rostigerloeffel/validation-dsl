/**
 * generated by Xtext
 */
package com.isax.validation.dsl.validation;

import com.isax.validation.dsl.dsl.Sentence;
import com.isax.validation.dsl.dsl.StartOnSentence;
import com.isax.validation.dsl.dsl.Validator;
import com.isax.validation.dsl.validation.AbstractDslValidator;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  @Check
  public void checkHasOnlyOneStartOnSentence(final Validator validator) {
    final ArrayList<StartOnSentence> sentences = new ArrayList<StartOnSentence>();
    EList<Sentence> _sentences = validator.getSentences();
    for (final Sentence sentence : _sentences) {
      if ((sentence instanceof StartOnSentence)) {
        sentences.add(((StartOnSentence)sentence));
      }
    }
    int _size = sentences.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      for (final StartOnSentence sentence_1 : sentences) {
        this.error("Validator may have only one \'start on\' sentence!", sentence_1, null);
      }
    }
  }
}
