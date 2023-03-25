package edu.rw.lecture9.hw;

public class NarrowCasting {
    public static void main(String[] args) {
        byte a = 2;
        int b = 9;
        float c = a*b;
        double d = (double) b/a  ;
        System.out.println("c = "+c);
        System.out.println("d = "+d);

        long mobNum = 37;
        byte myMobNum = (byte) mobNum;
        System.out.println(myMobNum);
        char myMobNum1 = (char) mobNum;
        System.out.println(myMobNum1);

        double w = 20;
        double x = 6;
        int y = (int) (w/x);
        System.out.println(y);
    }
}
