package com.spartaGlobal.sortManager.controller;

import com.spartaGlobal.sortManager.model.ArrayGenerator;
import com.spartaGlobal.sortManager.model.ArrayGeneratorFactory;
import com.spartaGlobal.sortManager.model.ArrayIntGenerateFactory;

public class ArrayGenerateManager {

    int[] array;
    int[] copyOfArray;

    private static ArrayGenerateManager arrayGenerateManager = null;

    private ArrayGenerateManager(){

    }

    public ArrayGenerator getArrayGenerator(){
        ArrayGeneratorFactory agf = new ArrayIntGenerateFactory();
        return agf.getInstance();
    }

    public int[] getUnsortedArray(){return copyOfArray;}

    public int[] getArray(int desiredArrayLength){
        if(array == null) {
            this.array = getArrayGenerator().generate(desiredArrayLength);
            copyOfArray = this.array.clone();
        }
        return array;
    }

    public static ArrayGenerateManager getInstance(){
        if(arrayGenerateManager == null)
            arrayGenerateManager = new ArrayGenerateManager();
        return arrayGenerateManager;
    }

    public void close(){
        arrayGenerateManager = null;
    }
}
