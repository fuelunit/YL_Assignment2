/*
    Author  : Yipeng Liu
    Project : Assignment 2
    Class   : MyTime
    Date    : 06/24/2021
 */
package edu.sjsu.assignment2;

import java.util.Scanner;

public class MyTime {
    /**
     * Gets the user input once
     * @return A {@code String}
     */
    private static String getUserInput() {
        // Scans user input
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    /**
     * printTimeDifference method
     * This method is a public static function that takes two integers as two
     * timestamps in military format (hhmm) and prints the number of hours and
     * minutes between the two times. If the first time is later than the second
     * time, assume the second time is the next day.
     *
     * @param firstTime
     *        Earlier time
     *
     * @param secondTime
     *        Later time
     */
    public static void printTimeDifference(int firstTime, int secondTime) {
        int firstHours = firstTime / 100;
        int firstMinutes = firstTime % 100;
        int secondHours = secondTime / 100;
        int secondMinutes = secondTime % 100;
        // Making the secondMinutes always bigger than firstMinutes
        if (firstMinutes > secondMinutes) {
            secondHours -= 1;
            secondMinutes += 60;
        }
        // Making the secondHours always bigger than firstHours
        if (firstHours > secondHours) {
            secondHours += 24;
        }
        // Differences in the hours part
        int totalHours = secondHours - firstHours;
        // Differences in the minutes part
        int totalMinutes = secondMinutes - firstMinutes;
        System.out.println(totalHours + " hour(s) " + totalMinutes + " minute(s)");
    }

    /**
     * Runs the program that takes user input
     * and calculates the time difference.
     */
    public static void runMyTime() {
        // Prompt
        System.out.print("Please enter the first time: ");
        // Validation
        int firstTime = validateTime(getUserInput());
        // Prompt
        System.out.print("Please enter the second time: ");
        // Validation
        int secondTime = validateTime(getUserInput());
        // Print time difference
        printTimeDifference(firstTime, secondTime);
    }

    /**
     * Validates a time format String
     * @param timeStr A String
     * @return
     */
    private static int validateTime(String timeStr) {
        try {
            // Check the length
            if (timeStr.length() != 4) {
                throw new NumberFormatException();
            }
            // Check the numbers
            int result = Integer.parseInt(timeStr);
            int hours = result / 100;
            int minutes = result % 100;
            if (hours >= 24 || minutes >= 60) {
                throw new NumberFormatException();
            }
            return result;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Program terminated!");
            System.exit(-3);
        }
        return -2;
    }
}
