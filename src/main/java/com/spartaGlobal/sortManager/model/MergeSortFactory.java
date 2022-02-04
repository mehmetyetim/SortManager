package com.spartaGlobal.sortManager.model;

public class MergeSortFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        return new MergeSort();
    }
}
