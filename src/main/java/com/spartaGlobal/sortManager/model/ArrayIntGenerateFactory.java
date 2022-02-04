package com.spartaGlobal.sortManager.model;

public class ArrayIntGenerateFactory extends ArrayGeneratorFactory{
    @Override
    public ArrayGenerator getInstance() {
        return new ArrayIntGenerate();
    }
}
