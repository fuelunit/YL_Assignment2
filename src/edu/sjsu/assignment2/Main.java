/*
    Author  : Yipeng Liu
    Project : Assignment 2
    Class   : Main
    Date    : 06/24/2021
 */
package edu.sjsu.assignment2;

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
        MyTime.printTimeDifference("0120", "1510");
        MyTime.printTimeDifference("1635", "0250");
        MyTime.printTimeDifference("1820", "1810");
        MyTime.printTimeDifference("1810", "1820");
        MyTime.printTimeDifference("1810", "1810");
    }
}
