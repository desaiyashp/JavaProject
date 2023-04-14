package edu.rw.lecture13.hw1;

import java.util.HashSet;
import java.util.Set;

public class HashSetHw {
    public static void main(String[] args) {
        Set<Double> numList = new HashSet<>();
        numList.add(80.1);
        numList.add(81.2);
        numList.add(82.3);
        numList.add(83.4);
        numList.add(84.5);
        numList.add(85.6);
        numList.add(83.4);
        System.out.println("Size of Hashset is: "+numList.size());    // length of HashSet
        System.out.println(numList+"\n");
        numList.remove(80.1);                                     // removeing value
        System.out.println("Size of Hashset is: "+numList.size());
        System.out.println(numList+"\n");
        for(double x: numList){                            // printing each value using for loop
            System.out.println(x);
        }
    }
}
