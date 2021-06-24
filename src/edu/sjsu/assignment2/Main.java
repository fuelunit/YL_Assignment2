/*
    Author  : Yipeng Liu
    Project : Assignment 2
    Class   : Main
    Date    : 06/24/2021
 */
package edu.sjsu.assignment2;

public class Main {

    public static void main(String[] args) {
        // MyResursion
        int index = MyRecursion.indexOf("Mississippi", "sip");
        System.out.println(index);
        index = MyRecursion.indexOf("panda", "pan");
        System.out.println(index);
        index = MyRecursion.indexOf("Hello world", "wow");
        System.out.println(index);
        // MyFile
        // MyTime
        MyTime.printTimeDifference("0120", "1510");
        MyTime.printTimeDifference("1635", "0250");
        MyTime.printTimeDifference("1820", "1810");
        MyTime.printTimeDifference("1810", "1820");
        MyTime.printTimeDifference("1810", "1810");
    }
}
