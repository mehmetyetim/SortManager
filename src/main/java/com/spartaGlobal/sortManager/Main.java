package com.spartaGlobal.sortManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new ArrayIntGenerate().generate(12);
        int[] array2 = new ArrayIntGenerate().generate(8);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(new BubbleSort().sort(array)));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(new MergeSort().sort(array2)));
    }
}
