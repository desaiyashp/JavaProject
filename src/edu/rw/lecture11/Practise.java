package edu.rw.lecture11;

public abstract class Practise {
    static void add (int a, int b){
        System.out.println(a+b);
    }
    static int add (int a, int b, int c){
        int d = a+b+c;
        return d;
    }
    abstract void calculate ();

    public static void main(String[] args) {
        add(67,23);
        System.out.println(add(67,23,12));
    }

}
