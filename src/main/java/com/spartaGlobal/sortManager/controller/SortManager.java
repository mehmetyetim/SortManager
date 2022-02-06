package com.spartaGlobal.sortManager.controller;

import com.spartaGlobal.sortManager.model.BubbleSortFactory;
import com.spartaGlobal.sortManager.model.MergeSortFactory;
import com.spartaGlobal.sortManager.model.Sorter;
import com.spartaGlobal.sortManager.model.SorterFactory;
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
            default -> null;
        };
        return sf.getInstance();
    }
}
