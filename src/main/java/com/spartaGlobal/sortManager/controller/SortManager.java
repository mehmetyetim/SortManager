package com.spartaGlobal.sortManager.controller;

import com.spartaGlobal.sortManager.model.*;

import static com.spartaGlobal.sortManager.controller.ArrayGenerateManager.*;

public class SortManager {

    public int[] initiateSorting(String desiredSorterType, int desiredArrayLength){
        Sorter s = getSorter(desiredSorterType);
        return s.sort(getInstance().getArray(desiredArrayLength));
    }

    public long initiateRunning(String desiredSorterType, int desiredArrayLength){
        Sorter s = getSorter(desiredSorterType);
        return s.runningTime(getInstance().getArray(desiredArrayLength));
    }

    public static Sorter getSorter(String sorterType){
        SorterFactory sf = switch (sorterType.toLowerCase()){
            case "bubble" -> new BubbleSortFactory();
            case "merge" -> new MergeSortFactory();
            case "binary" -> new BinarySearchTreeFactory();
            default -> null;
        };
        return sf.getInstance();
    }
}
