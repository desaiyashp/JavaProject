package edu.rw.lecture9.hw;

public class MaxMinValue {
    public static void main(String[] args) {

        int[] myArrNumbers = {23,-224, 3, 434, 234, 2, -232, 23,42, 34, 35, 34, -236, 443, 234,74,-43,-393,474,48,48};
        int smallestValue = myArrNumbers[0];
        int highestValue = myArrNumbers[0];
        System.out.println("Size of the Array is " +myArrNumbers.length);
        for (int x : myArrNumbers){
            if (smallestValue>x){
                smallestValue=x;
            }
        }
        System.out.println("The smallest value in the Array is "+smallestValue);
        for (int y : myArrNumbers){
            if (highestValue<y){
                highestValue=y;
            }
        }
        System.out.println("The highest value in the Array is "+highestValue);


        int x=0;
        for (int i = 1; i<=10; i++){
            System.out.print(x +" ");
            x=i;
        }
    }
}
