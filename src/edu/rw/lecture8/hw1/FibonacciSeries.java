package edu.rw.lecture8.hw1;

public class FibonacciSeries {
    public static void getFibonacciSeries(int num) {
        int x = 0, y = 1;
        System.out.println("Place 1: "+x);
        System.out.println("Place 2: "+y);
        for (int i = 3; i <= num; i++) {
            int z = x + y;
            System.out.println("Place "+i+": "+z);
            x = y;
            y = z;
        }
    }
    public static void runFibonacciSeries (int placeValue){
        int x = 0, y = 1, i;
        System.out.println("======================");
        System.out.println(":::Fibonacci Series:::");
        System.out.println("======================");
        System.out.print(x+" "+y);
        for (i=3; i<=placeValue; i++){
            int z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }
        System.out.println();
        System.out.print("1 2");
        for (i=3; i<=placeValue; i++){
            System.out.print(" "+i);
        }
    }
    public static void main(String[] args) {
        getFibonacciSeries(10);
        System.out.println();
        runFibonacciSeries(8);
    }

//    0, 1, 1, 2, 3, 5, 8, 13 ...... z
//    1, 2, 3, 4, 5, 6, 7, 8, ....   num
}

