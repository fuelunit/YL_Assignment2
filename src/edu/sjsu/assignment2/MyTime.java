/*
    Author  : Yipeng Liu
    Project : Assignment 2
    Class   : MyTime
    Date    : 06/24/2021
 */
package edu.sjsu.assignment2;

public class MyTime {
    /**
     * printTimeDifference method
     * This method is a public static function that takes two Strings as two
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
    public static void printTimeDifference(String firstTime, String secondTime) {
        if (firstTime.length() != 4 || secondTime.length() != 4) {
            System.out.println("Wrong number of digits. Must be 4 digits " +
                    "in HHMM format");
            return;
        }
        int firstHours, firstMinutes, secondHours, secondMinutes;
        try {
            firstHours = Integer.parseInt(firstTime.substring(0,2));
            firstMinutes = Integer.parseInt(firstTime.substring(2));
            secondHours = Integer.parseInt(secondTime.substring(0,2));
            secondMinutes =Integer.parseInt(secondTime.substring(2));
            if (firstHours >= 24 || firstMinutes >= 60 || secondHours >= 24 ||
                    secondMinutes >= 60) {
                throw new NumberFormatException();
            }
            //Integer earlierTime
        } catch (NumberFormatException e) {
            System.out.println("Wrong time format. Hours must be less than 24, " +
                    "minutes must be less than 60");
            return;
        }
        // Making the secondHours always bigger than firstHours
        if (firstHours > secondHours || (firstHours == secondHours
                && firstMinutes > secondMinutes)) {
            secondHours += 24;
        }
        // Making the secondMinutes always bigger than firstMinutes
        if (firstMinutes > secondMinutes) {
            secondHours -= 1;
            secondMinutes += 60;
        }
        // Differences in the hours part
        Integer totalHours = secondHours - firstHours;
        // Differences in the minutes part
        int totalMinutes = secondMinutes - firstMinutes;
        System.out.println(totalHours + " hour(s) " + totalMinutes + " minute(s)");
    }
}
