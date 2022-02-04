package com.spartaGlobal.sortManager.controller;

import com.spartaGlobal.sortManager.model.BubbleSortFactory;
import com.spartaGlobal.sortManager.model.MergeSortFactory;
import com.spartaGlobal.sortManager.model.Sorter;
import com.spartaGlobal.sortManager.model.SorterFactory;
import static com.spartaGlobal.sortManager.controller.ArrayGenerateManager.*;

public class SortManager {

    public int[] initiateSorting(String desiredSorterType, int desiredArrayLength){
        Sorter s = getSorter(desiredSorterType);
        int[] sortedArray = s.sort(getInstance().getArray(desiredArrayLength));
        return sortedArray;
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
