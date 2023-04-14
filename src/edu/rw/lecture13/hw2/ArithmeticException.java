package edu.rw.lecture13.hw2;

public class ArithmeticException {
    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int k;
        try{
            k = i/j;
            System.out.println(k);

        } catch (Exception e){
            j=j+5;
            System.out.println(e);
            k = i/j;
            System.out.println(k);

        } finally {
            j=2;
            k = i/j;
        }
        System.out.println(k);
    }

}
