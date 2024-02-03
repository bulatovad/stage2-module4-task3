package com.mjc.stage2.entity;

public class SentenceLeaf extends AbstractTextComponent {
    private String sentence;

    public SentenceLeaf(TextComponentType componentType) {
        super(componentType);
        sentence = "";
    }

    @Override
    public String operation() {
        return  sentence+this.componentType.getDelimiter();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        if(textComponent.getComponentType()==TextComponentType.SYMBOL || textComponent.getComponentType() == TextComponentType.WORD)
            sentence+=textComponent.operation();
        else throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        if(textComponent.getComponentType() == TextComponentType.SYMBOL || textComponent.getComponentType() == TextComponentType.WORD) {
            int lastIndex = sentence.lastIndexOf(textComponent.operation());
            sentence = sentence.substring(0, lastIndex);
        }
        else throw new UnsupportedOperationException();
    }

    @Override
    public int getSize() {
        return sentence.length();
    }
}
