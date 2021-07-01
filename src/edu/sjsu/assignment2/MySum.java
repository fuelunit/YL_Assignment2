/*
    Author: Yipeng Liu
    Project: Assignment 2
    Class: MySum
    Date: 07/01/2021
 */
package edu.sjsu.assignment2;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class MySum {

    /**
     * A public static function that takes an integer array and returns
     * the alternating sum (an integer) of all elements in the array.
     *
     * @param array an array of integers
     */
    public static int getAlternatingSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                // if i is even: 0, 2, 4, etc., add the number
                // at index i to sum
                sum += array[i];
            } else {
                // if i is odd, subtract the number
                // from the sum
                sum -= array[i];
            }
        }
        return sum;
    }

    public static void userInputVersion() {
        // Prompt
        System.out.print("Please enter an integer array " +
                "(separate each integer by a comma): ");
        // Taking user input and scanning it
        Scanner scan = new Scanner(System.in);
        // Validation
        String[] scannedStrArr = scan.nextLine().split(",");
        int[] userIntArr = new int[scannedStrArr.length];
        try {
            for (int i = 0; i < userIntArr.length; i++) {
                userIntArr[i] = Integer.parseInt(scannedStrArr[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Program terminated!");
            System.exit(4);
        }
        // Get the alternating sum
        System.out.println("The alternating sum is "
                + getAlternatingSum(userIntArr));
    }
}
