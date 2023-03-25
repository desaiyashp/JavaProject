package edu.rw.lecture7.hw1;

public class IfElseGrades {
   private static void checkGrade (int marks){
        if ((marks>=0) && (marks<=100)){
            if ((marks>=75) && (marks<=100)){
                System.out.println("First Class with Distinction");
            } else if ((marks>=60) && (marks<75)) {
                System.out.println("First Class");
            } else if ((marks>=50) && (marks<60)) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Incorrect marks entered. Please recheck.");
        }
   }

    public static void main(String[] args) {
        checkGrade(93);
        checkGrade(74);
        checkGrade(55);
        checkGrade(23);
        checkGrade(201);
    }
}
