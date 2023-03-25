package edu.rw.lecture7.hw1;

import javax.sound.midi.Soundbank;

public class IfElseLeapYear {
    private static void checkLeapYear (int year){
        if (year>0){
            if ((year%4==0) && ((year%100!=0) || (year%400==0))){
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Invalid Input.");
        }

    }

    public static void main(String[] args) {
        checkLeapYear(2023);
        checkLeapYear(2000);
        checkLeapYear(2100);
        checkLeapYear(2024);
        checkLeapYear(96);
        checkLeapYear(-2023);


    }
}
