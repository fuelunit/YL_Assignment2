/*
    Author  : Yipeng Liu
    Project : Assignment 2
    Class   : MyFile
    Date    : 06/24/2021
 */
package edu.sjsu.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFile {
    public static final int[] PRIME_ARRAY = {2, 3, 5, 7, 11, 13, 17,
            19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
            79, 83, 89, 97};

    /**
     * A public static method that takes two Strings for two filenames
     * as parameters. The first file contains lines of words or integers,
     * each word/integer is separated by a comma (except for the last one
     * of a line). Read the first file, and write any prime numbers to the
     * second file, separate by a line.
     *
     * @param inputFileName A {@code String} for the full path to the input file
     *
     * @param outputFileName A name {@code String} for the output file to be
     *                       created
     */
    public static void writePrimes(String inputFileName, String outputFileName) {
        File inputFile = new File(inputFileName);
        try (Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFileName)) {
            // Reads the input file
            // For each line, use another scanner to scan each line
            // Scanner line = scanner.useDelimiter("[\n\r\s\t]");
            // For each word, use a scanner to scan each word
            Scanner word = scanner.useDelimiter("[,\n\r\s\t]");
            while (word.hasNext()) {
                String currentWord = word.next();
                if (isPrime(currentWord)) {
                    writer.println(currentWord);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    /**
     * A helper method that takes a {@code String} and
     * check if it is a prime number.
     *
     * @param text An input {@code String}
     *
     * @return A boolean value
     *
     */
    private static boolean isPrime(String text) {
        int testNum;
        // parseInt exception handling
        try {
            testNum = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return false;
        }
        // Loop through the PRIME_ARRAY to check for primes
//        for (int num : PRIME_ARRAY) {
//            if (testNum == num) {
//                return true;
//            } else if (testNum % num == 0) {
//                return false;
//            }
//        }
        // Deprecated:
        // After looping through the array, if we still have not
        // found any match, we consider it a prime number for
        // this method as we are not dealing with large numbers.

        // new algorithm
        for (int i = 2; i <= Math.sqrt(testNum); i++) {
            if (testNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
