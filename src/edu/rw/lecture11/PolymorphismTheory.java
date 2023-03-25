package edu.rw.lecture11;

public class PolymorphismTheory {
    /*  many forms =
    * */

    void addition(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    void addition(short a, short b){
        short c = (short) (a + b);
        System.out.println( c);
    }
    void addition(long a, long b){
        long c = a + b;
        System.out.println(c);
    }
    void addition(float a, float b){
        float c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        PolymorphismTheory polymorphismTheory = new PolymorphismTheory();
        polymorphismTheory.addition(38474, 2273733);
        polymorphismTheory.addition(883782947,847393729);
        polymorphismTheory.addition(8339.393f,3938.32f);
        polymorphismTheory.addition(3382.23f,2828.33f);
    }
}
