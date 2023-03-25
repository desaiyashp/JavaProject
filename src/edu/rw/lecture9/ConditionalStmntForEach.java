package edu.rw.lecture9;

import javax.sound.midi.Soundbank;

public class ConditionalStmntForEach {
    public static void main(String[] args) {
        int[] myNumber = {23, 124, 382, 2918, 282, 8283};
        int myNumberLength = myNumber.length;

        System.out.println("Printing result--");
        for ( int number : myNumber) {             // for each loop
            System.out.println(number);
        }
        System.out.println();
        System.out.println("Printing result in reverse order--");
        for ( int i=myNumberLength-1; i>=0; i--){             // for loop
            System.out.println(myNumber[i]);

        }
    }
}
