package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;

public class WordParser extends AbstractTextParser{
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String delimeter = abstractTextComponent.getComponentType().getDelimiter();
    }

    // Write your code here!

}
