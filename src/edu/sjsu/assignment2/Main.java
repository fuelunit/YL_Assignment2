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
        // MyResursion
        int index = MyRecursion.indexOf("Mississippi", "sip");
        System.out.println(index);
        index = MyRecursion.indexOf("panda", "pan");
        System.out.println(index);
        index = MyRecursion.indexOf("Hello world", "wow");
        System.out.println(index);
        // MyFile
        MyFile.writePrimes(INPUT_FILE, OUTPUT_FILE);
        // MyTime
        // ("0120", "1510") => 13 hour(s) 50 minute(s)
        // ("1635", "0250") => 10 hour(s) 15 minute(s)
        // ("1820", "1810") => 23 hour(s) 50 minute(s)
        // ("1810", "1820") =>  0 hour(s) 10 minute(s)
        // ("1810", "1810") =>  0 hour(s)  0 minute(s)
        boolean done = false;
        while (!done) {
            MyTime.runMyTime();
            System.out.print("Run MyTime Again? Enter 0 to continue " +
                    "or anything else to exit: ");
            Scanner scan = new Scanner(System.in);
            if (!scan.nextLine().equals("0")) {
                done = true;
            }
        }
    }
}
