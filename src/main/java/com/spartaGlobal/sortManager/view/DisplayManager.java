package com.spartaGlobal.sortManager.view;

import com.spartaGlobal.sortManager.controller.ArrayGenerateManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    private static Logger logger = LogManager.getLogger(DisplayManager.class.getName());

    public String getDesiredSorter(){
        System.out.print("Please enter \"bubble\", \"merge\" or \"binary\" for the sort type you want to order your array in: ");
        Scanner scanner = new Scanner(System.in);
        String desiredSorterType = scanner.next();
        try{
            while(!(desiredSorterType.equals("bubble") || desiredSorterType.equals("merge") || desiredSorterType.equals("binary"))) {
                System.out.print("You entered type which is not available. Please try again: ");
                logger.info("user entered type which is not available");
                desiredSorterType = scanner.next();
            }}
        catch (Exception e){
            e.printStackTrace();
        }
        return desiredSorterType;
    }

    public int getDesiredArrayLength(){
        System.out.print("Please enter number for length of array: ");
        Scanner scanner = new Scanner(System.in);
        int desiredArrayLength;

        while(!scanner.hasNextInt()){
            logger.warn("User entered invalid value to create an array");
            System.out.print("Please enter number for length of array: ");
            scanner.nextLine();
        }

        desiredArrayLength = scanner.nextInt();

        if(desiredArrayLength < 0){ // if user enters negative numbers, it wants them to enter again.
            logger.warn("User entered negative number");
            messageWarningNegativeNumber();
            return getDesiredArrayLength();
        }
        return desiredArrayLength;
    }

    public void messageWarningNegativeNumber(){
        logger.info("User entered negative number");
        System.out.println("You entered negative number for length of array.");
    }

    public void askToExit(){
        String answer;
        do{
            System.out.print("Do you want to exit \"yes\" or \"no\": ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.next();
            if (answer.equalsIgnoreCase("no")) {
                logger.info("User wanted to sort it again");
                ArrayGenerateManager.getInstance().close();
                break;
            } else if (answer.equalsIgnoreCase("yes")) {
                logger.info("User wanted to finish the application");
                System.out.println("Thanks for using.");
                System.exit(0);
            }else{
                logger.warn("User entered invalid response to askSortAgain");
            }
        } while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")));
    }

    public void displaySortedArray(int[] sorted){
        System.out.println("Sorted array is " + Arrays.toString(sorted));
    }

    public void displayUnsortedArray(int[] unsorted){
        System.out.println("Unsorted array is " + Arrays.toString(unsorted));
    }

    public void applicationTitle(){
        System.out.println("SORTING APPLICATION");
    }

}
