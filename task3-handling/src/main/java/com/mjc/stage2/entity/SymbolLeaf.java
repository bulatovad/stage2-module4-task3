package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent{

    private char value;

    public SymbolLeaf(TextComponentType componentType) {
        super(componentType);
    }

    // Write your code here!
    @Override
    public String operation() {
        return value+this.componentType.getDelimiter();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        value = 0;
    }

    @Override
    public int getSize() {
        return 1;
    }

    public void setValue(char c) {
        value = c;
    }


}
