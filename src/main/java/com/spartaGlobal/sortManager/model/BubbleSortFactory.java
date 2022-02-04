package com.spartaGlobal.sortManager.model;

public class BubbleSortFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        return new BubbleSort();
    }
}
