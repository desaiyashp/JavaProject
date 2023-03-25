package edu.rw.lecture11;

public class NewClass {
    public static void myMethod (int x){
        int result = 1;
        for (int i=1; i<=x; i++){
            result = result*i;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        myMethod(4);
    }
}
