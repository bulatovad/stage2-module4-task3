package com.mjc.stage2.entity;

public class WordLeaf extends AbstractTextComponent{
    private String word;

    public WordLeaf(TextComponentType componentType) {
        super(componentType);
        word = "";
    }
    @Override
    public String operation() {
        return word+this.componentType.getDelimiter();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        if(textComponent.getComponentType()==TextComponentType.SYMBOL || textComponent.getComponentType() == TextComponentType.WORD)
            word+=textComponent.operation();
        else throw new UnsupportedOperationException();

    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        if(textComponent.getComponentType() == TextComponentType.SYMBOL || textComponent.getComponentType() == TextComponentType.WORD) {
            int lastIndex = word.lastIndexOf(textComponent.operation());
            word = word.substring(0, lastIndex);
        }
        else throw new UnsupportedOperationException();
    }

    @Override
    public int getSize() {
        return word.length();
    }
}
