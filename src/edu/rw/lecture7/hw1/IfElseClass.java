package edu.rw.lecture7.hw1;

public class IfElseClass {
/* Syntax=
    if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}

*/

    public static void main(String[] args) {
        byte age = 10;
        if (age>=18){
            System.out.println("Adult");
        } else if ((age>12) && (age<18)) {
            System.out.println("Teens");
        } else {
            System.out.println("Child");
        }
    }
}
