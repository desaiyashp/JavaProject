package edu.rw.lecture8.hw1;

public class OddNumPractice {
    public static void getOddNum (int firstNum, int lastNum){
        while (firstNum<=lastNum){
            System.out.print(firstNum + " ");
            firstNum+=2;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        getOddNum(3, 13);   // valid output
        getOddNum(12,2);    // invalid output
        getOddNum(2, 12);   // invalid output
    }
}
//   5, 7, 9, 11, 13