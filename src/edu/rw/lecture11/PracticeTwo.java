package edu.rw.lecture11;

public class PracticeTwo{
    int multiply (int a, int b){
       int c = a*b;
       return c;
    }

    public static void main(String[] args) {
        PracticeTwo practiceTwo = new PracticeTwo();
        System.out.println(practiceTwo.multiply(74,9));
    }
}
