package edu.rw.lecture13.hw1;

import java.util.ArrayList;

public class ArrayListHw {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(46);
        numbersList.add(92);
        numbersList.add(32);
        numbersList.add(84);
        numbersList.add(1,30);         // fixing index has to be in ascending order only
        numbersList.add(3,100);
        numbersList.add(6,94);
        System.out.println(numbersList);
        System.out.println(numbersList.get(0));
        int largestNum = numbersList.get(0);                // for largest number
        for (int num:numbersList) {
            if (num >largestNum){
                largestNum= num;
            }
        }
        System.out.println("The largest number in the list: "+largestNum);
        int smallestNum = numbersList.get(0);             // for smallest number
        for (int num:numbersList) {
            if (num<smallestNum){
                smallestNum = num;
            }
        }
        System.out.println("The smallest number in the list: "+smallestNum);
        System.out.println("Size of numbersList is: "+numbersList.size());
    }
}
