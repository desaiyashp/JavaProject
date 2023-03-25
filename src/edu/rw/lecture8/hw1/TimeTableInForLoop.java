package edu.rw.lecture8.hw1;

public class TimeTableInForLoop {
    private static void makeTimeTable (int num){
        for (int a = num; a>=1; a--){
            System.out.println("Time Table of "+ a);
            System.out.println("=================");
            for (int b=1; b<=10; b++){
                System.out.println(a+" x "+b+" = "+ a*b);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        makeTimeTable(15);
    }
}
