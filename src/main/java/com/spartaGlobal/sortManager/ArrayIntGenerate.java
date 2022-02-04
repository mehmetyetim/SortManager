package com.spartaGlobal.sortManager;

import java.util.Random;

public class ArrayIntGenerate implements ArrayGenerator {
    public int[] generate(int length){
        int[] array = new int[length];
        Random random = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
