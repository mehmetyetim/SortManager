package com.spartaGlobal.sortManager.controller;

import com.spartaGlobal.sortManager.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.spartaGlobal.sortManager.controller.ArrayGenerateManager.*;

public class SortManager {

    private static Logger logger = LogManager.getLogger(SortManager.class.getName());

    public int[] initiateSorting(String desiredSorterType, int desiredArrayLength){
        Sorter s = getSorter(desiredSorterType);
        logger.info("User initiated sorting");
        return s.sort(getInstance().getArray(desiredArrayLength));
    }

    public String initiateRunning(String desiredSorterType, int desiredArrayLength){
        Sorter s = getSorter(desiredSorterType);
        logger.info("User initiates timing");
        return "Running time for " + desiredSorterType + " is " + s.runningTime(getInstance().getArray(desiredArrayLength));
    }

    public static Sorter getSorter(String sorterType){
        SorterFactory sf = null;
        switch (sorterType.toLowerCase()){
            case "bubble" -> {
                sf = new BubbleSortFactory();
                logger.info("User chose bubble sort");
            }
            case "merge" -> {
                sf = new MergeSortFactory();
                logger.info("User chose merge sort");
            }
            case "binary" -> {
                sf = new BinarySearchTreeFactory();
                logger.info("User chose binary sort");
            }
            default -> {
                logger.warn("User entered invalid sort");
            }
        }
        return sf.getInstance();
    }
}
