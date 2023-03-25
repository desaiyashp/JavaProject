package edu.rw.lecture5.hw1;

public class LocalVariable {

    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 5;
        z = (4 * x) + (2 * y);
        System.out.println(z);

        String sentenceOne, sentenceTwo;
        byte yearOfExp;
        float yearInUk;
        sentenceOne = "Good Morning!!";
        sentenceTwo = "Yash Desai";
        yearOfExp = 10;
        yearInUk = 1.5f;

        System.out.println(sentenceOne + "\nI am " + sentenceTwo);
        System.out.println("I have total " + yearOfExp + " years of experience. \n I am in the UK since " + yearInUk + " years.");
    }

}
