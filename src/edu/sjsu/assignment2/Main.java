/*
    Author  : Yipeng Liu
    Project : Assignment 2
    Class   : Main
    Date    : 06/24/2021
 */
package edu.sjsu.assignment2;

import java.util.Scanner;

public class Main {
    private static final String INPUT_FILE = "C:\\Users\\ethan" +
            "\\Documents\\Education\\SJSU\\Curriculum\\CS-49J" +
            "\\cs_49j_assignments\\YL_Assignment2\\files\\file1.txt";
    private static final String OUTPUT_FILE = "C:\\Users\\ethan" +
            "\\Documents\\Education\\SJSU\\Curriculum\\CS-49J" +
            "\\cs_49j_assignments\\YL_Assignment2\\files\\file2.txt";

    public static void main(String[] args) {
        boolean done = false;
        while (!done) {
            System.out.print("===============================\n"
                    + "Assignment 2\n"
                    + "1. MyRecursion\n"
                    + "2. MyFile\n"
                    + "3. MyTime\n"
                    + "4. MySum\n"
                    + "Please enter the class number respectively "
                    + "(non-integer inputs will exit the program): "
            );
            Scanner numberScan = new Scanner(System.in);
            int classNum = 0;
            try {
                classNum = Integer.parseInt(numberScan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Terminating...");
                done = true;
                break;
            }
            switch (classNum) {
                case 1:
                    // MyRecursion
                    int index = MyRecursion.indexOf("Mississippi", "sip");
                    System.out.println(index);
                    index = MyRecursion.indexOf("panda", "pan");
                    System.out.println(index);
                    index = MyRecursion.indexOf("Hello world", "wow");
                    System.out.println(index);
                    break;
                case 2:
                    // MyFile
                    MyFile.writePrimes(INPUT_FILE, OUTPUT_FILE);
                    break;
                case 3:
                    // MyTime
                    // ("0120", "1510") => 13 hour(s) 50 minute(s)
                    // ("1635", "0250") => 10 hour(s) 15 minute(s)
                    // ("1820", "1810") => 23 hour(s) 50 minute(s)
                    // ("1810", "1820") =>  0 hour(s) 10 minute(s)
                    // ("1810", "1810") =>  0 hour(s)  0 minute(s)
                    MyTime.runMyTime();
                    break;
                case 4:
                    // MySum
                    MySum.userInputVersion();
                    break;
                default:
                    System.out.println("Not implemented yet");
                    break;
            }
            System.out.print("Run testing program Again? " +
                    "Enter 0 to continue or anything else to exit: ");
            Scanner doneScan = new Scanner(System.in);
            if (!doneScan.nextLine().equals("0")) {
                done = true;
            }
        }
    }
}
