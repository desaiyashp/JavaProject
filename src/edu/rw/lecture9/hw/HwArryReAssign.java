package edu.rw.lecture9.hw;

public class HwArryReAssign {
    public static void main(String[] args) {
        String[] myStringArr = {"I", "am", "a", "Good", "boy"};

        for (String myNewString:myStringArr) {
            System.out.print( myNewString+" ");
        }
        System.out.println();
        myStringArr[3] = "bad";
        for (String myNewString:myStringArr) {
            System.out.print( myNewString+" ");
        }
        System.out.println();
    }
}
