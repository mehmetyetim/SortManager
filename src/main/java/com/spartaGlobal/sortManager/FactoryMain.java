package com.spartaGlobal.sortManager;

import com.spartaGlobal.sortManager.controller.ArrayGenerateManager;
import com.spartaGlobal.sortManager.controller.SortManager;
import com.spartaGlobal.sortManager.view.DisplayManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryMain {
    Logger logger = LogManager.getLogger(FactoryMain.class.getName());
    public static void main(String[] args) {
        DisplayManager dm = new DisplayManager();
        SortManager sm = new SortManager();
        dm.applicationTitle();
        while(true){
            int desiredArrayLength = dm.getDesiredArrayLength();
            int[] unsortedArray = ArrayGenerateManager.getInstance().getArray(desiredArrayLength);
            dm.displayUnsortedArray(unsortedArray);
            String desiredSorter = dm.getDesiredSorter();
            int[] sortedArray = sm.initiateSorting(desiredSorter, desiredArrayLength);
            System.out.println(sm.initiateRunning(desiredSorter, desiredArrayLength));
            dm.displaySortedArray(sortedArray);
            dm.askToExit();
        }

    }
}
