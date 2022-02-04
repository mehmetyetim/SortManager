package com.spartaGlobal.sortManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,7,10,19,2,4,7,34,20,3,89};
        int[] array2 = array.clone();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(new BubbleSort().sort(array)));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(new MergeSort().sort(array2)));
    }
}
