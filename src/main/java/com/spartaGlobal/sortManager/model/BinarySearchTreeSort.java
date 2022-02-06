package com.spartaGlobal.sortManager.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTreeSort implements Sorter, Timer{

    @Override
    public long runningTime(int[] array) {
        long startTime = System.nanoTime();
        sort(array);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    class Node{
        int value;
        Node left, right;

        public Node(int item){
            value = item;
            left = null;
            right = null;
        }

    }

    public Node root;

    public BinarySearchTreeSort(){
        root = null;
    }

    void insert(int root){
        this.root = insertRec(this.root,root);
    }

    Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key<root.value)
            root.left = insertRec(root.left, key);
        else if(key> root.value)
            root.right = insertRec(root.right, key);

        return root;
    }

    public int[] inorderSort(int[] unsorted){
        for(int u: unsorted) this.insert(u);

        Node root = this.root;

        List<Integer> list = new ArrayList<>();
        sortRecursively(root, list);
        int[] sorted = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            sorted[i] = list.get(i);
        }
        return sorted;
    }

    //this is the helper method
    public void sortRecursively(Node node, List<Integer> list){
        if (node != null){
            sortRecursively(node.left, list);
            list.add(node.value);
            sortRecursively(node.right, list);
        }
    }

    @Override
    public int[] sort(int[] array) {

        return this.inorderSort(array);

    }
}
