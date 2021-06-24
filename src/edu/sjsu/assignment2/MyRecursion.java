/*
    Author  : Yipeng Liu
    Project : Assignment 2--MyRecursion
    Date    : 06/22/2021
 */
package edu.sjsu.assignment2;

public class MyRecursion {
    /**
     * A public static function that takes two Strings as parameters
     * and returns an int for the starting position of the first String
     * that matches the second String. Return -1 if the second String
     * is not a substring of the first String.
     *
     * @param firstStr
     *        The first String
     *
     * @param secondStr
     *        The second String
     */
    public static int indexOf(String firstStr, String secondStr) {
        return indexOf(firstStr, secondStr, 0);
    }

    /**
     * A helper recursive method
     * @param firstStr The first {@code String}
     * @param secondStr The second {@code String}
     * @param index The index of the character in firstStr
     * @return An integer index for the starting position of the first String
     *         that matches the second String. Return -1 if the second String
     *         is not a substring of the first String.
     */
    private static int indexOf(String firstStr, String secondStr, int index) {
        if (firstStr.length() < secondStr.length()) {
            // Not found
            return -1;
        } else if (firstStr.substring(0,secondStr.length()).equals(secondStr)) {
            // Base case
            return index;
        } else {
            // Recursion
            return indexOf(firstStr.substring(1), secondStr, index + 1);
        }
    }
}
