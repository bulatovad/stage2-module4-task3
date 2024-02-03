package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    // Write your code here!
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String delimeter = abstractTextComponent.getComponentType().getDelimiter();

    }


}
