package edu.rw.lecture8.hw1;

public class TimeTableDoWhile {
    public static void getTimeTable (int x){
        int y =1;
        do {
            int z = x*y;
            System.out.println(z);
            y++;
        } while (y <=10);
    }
    private static void sumOfNum (){
        int y = 1;
        int x = 0;
        do {
            x = x + y;
            y++;
            System.out.println(x);
        } while (y<=50);
        System.out.println(x);
    }

    public static void main(String[] args) {
        getTimeTable(10);
        System.out.println();
        getTimeTable(16);
        System.out.println();
        sumOfNum();
    }
}
