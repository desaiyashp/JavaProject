package edu.rw.lecture13.hw2;

import java.util.ArrayList;

public class OutOfBoundExceptionHandling {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(46);
        numbersList.add(92);
        numbersList.add(32);
        numbersList.add(84);
        numbersList.add(3, 30);         // fixing index has to be in ascending order only
        try {
            numbersList.add(6, 100);
        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            numbersList.add(1, 94);
        }
        numbersList.add(1, 94);
        System.out.println(numbersList);
        System.out.println(numbersList.get(0));
    }
}
