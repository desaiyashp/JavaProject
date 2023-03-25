package edu.rw.lecture6.hw2;

import edu.rw.lecture6.hw1.ModifierOne;

public class ModifierThree {
//    Only public modifier is accessible from ModifierOne class.
//    outside package data is imported by java.

    public static void main(String[] args) {
        ModifierOne myObj = new ModifierOne();
        myObj.runLogicPublic();
    }
}
