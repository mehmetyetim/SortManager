package com.spartaGlobal.sortManager.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort implements Sorter, Timer{
    private static Logger logger = LogManager.getLogger(BubbleSort.class.getName());
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

    @Override
    public long runningTime(int[] array) {
        long startTime = System.nanoTime();
        sort(array);
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
        logger.info("Running time for " + BubbleSort.class.getName() + " is " + duration);
        return endTime - startTime;
    }
}
