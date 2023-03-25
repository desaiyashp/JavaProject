package edu.rw.lecture7.hw1;

public class IfElseMaxNum2 {
    private static int compareThreeNumbers(int a, int b, int c){
        if ((a >= b) && (a>=c)){
            System.out.println(a + " is the highest number.");
        } else if ((b>=a) && (b>=c)) {
            System.out.println(b + " is the highest number.");
        } else {
            System.out.println(c + " is the highest number.");
        }
        return c;
    }

    public static void main(String[] args) {
        compareThreeNumbers(32, 93, 29);
        compareThreeNumbers(22 ,22, 68);  // Same Two Number
        compareThreeNumbers(23, 84, 84);  // Same Highest Number
    }
}
