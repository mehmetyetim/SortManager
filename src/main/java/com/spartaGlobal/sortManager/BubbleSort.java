package com.spartaGlobal.sortManager;

public class BubbleSort {
    public int[] sort(int[] array){
        if(array.length<2)
            return array;
        for(int i = 0;i<array.length-1;i++){
            for (int j = 0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    array[j] = array[j+1] + array[j];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                }
            }
        }
        return array;
    }
}
