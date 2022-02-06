package com.spartaGlobal.sortManager.test;

import com.spartaGlobal.sortManager.controller.ArrayGenerateManager;
import com.spartaGlobal.sortManager.controller.SortManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BubbleSortTest {

    SortManager sortManager = new SortManager();

    @ParameterizedTest
    @ValueSource(ints = {2,5,6,99,120,67,21,0,1,4})
    @DisplayName("Given list of integer values to length of Array Then Sorting")
    public void givenListOfIntegerToLengthOfArrayThenSorting(int length){
        int[] actual = ArrayGenerateManager.getInstance().getArray(length);
        sortManager.initiateSorting("bubble",length);
        for (int i = 1; i < actual.length; i++) {
            if (actual[i-1] > actual[i]) {
                Assertions.fail();
            }
        }
    }

    @Test
    @DisplayName("Given negative number to initiate array")
    public void givenNegativeNumberToInitiateArray(){
        NegativeArraySizeException thrown = Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            int[] actual = ArrayGenerateManager.getInstance().getArray(-1);
            sortManager.initiateSorting("bubble", -1);
        });
    }
}
