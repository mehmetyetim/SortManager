package com.spartaGlobal.sortManager;

public class MergeSort implements Sorter{
    public int[] sort (int[] array){
        if(array.length<2)
            return array;
        int[] subArray1 = new int[array.length/2];
        int[] subArray2 = new int[array.length - array.length/2];

        for (int i = 0;i<subArray1.length;i++){
            subArray1[i] = array[i];
        }

        for (int i = 0;i< subArray2.length;i++){
            subArray2[i] = array[(array.length/2)+i];
        }

        sort(subArray1);
        sort(subArray2);

        merge(array,subArray1,subArray2);

        return array;
    }

    public void merge(int[] array, int[] subArray1, int[] subArray2){
        int i = 0, j= 0, k = 0;
        while(j< subArray1.length && k< subArray2.length){
            if(subArray1[j] > subArray2[k]){
                array[i] = subArray2[k];
                k++;
            }else{
                array[i] = subArray1[j];
                j++;
            }
            i++;
        }

        while(j< subArray1.length){
            array[i] = subArray1[j];
            i++;
            j++;
        }

        while(k< subArray2.length){
            array[i] = subArray2[k];
            i++;
            k++;
        }
    }
}
