package edu.rw.lecture8.hw1;

public class PowerWithWhileLoop {
    public static void powerMethod (int base, int power){
        int result = 1;
        while(power!=0) {
            result *= base;
            power--;
        }
        System.out.println(result);
    }
    private static void getNewMethod (){
        int x = 100;
        while (x>=90){
            System.out.println(x);
            x-=2;
        }
    }
    public static void main(String[] args) {
        powerMethod(9, 2);
        powerMethod(8,3);
        System.out.println();
        getNewMethod();
        System.out.println();
        OddNumberWithWhileLoop.getOddNumbers(-270, -280);
    }
}
