package com.spartaGlobal.sortManager.model;

public class BinarySearchTreeFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        return new BinarySearchTreeSort();
    }
}
