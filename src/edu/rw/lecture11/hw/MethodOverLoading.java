package edu.rw.lecture11.hw;

public class MethodOverLoading {
    void addition (int a, int b){
        System.out.println(a+b);
    }
    void addition (int a, int b, int c){
        System.out.println(a+b+c);
    }
    void addition(String a, String b){
        System.out.println(a + " & "+ b);
    }
    void subtraction (int a, int b){
     System.out.println(a-b);
    }
    void subtraction (int a, int b, double c){
        System.out.println(a-(b-c));
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.addition(7,9);
        methodOverLoading.addition(3,5,8);
        methodOverLoading.addition("S/w Testing", "Java");
        methodOverLoading.subtraction(74,33);
        methodOverLoading.subtraction(978,322,183.43);

    }
}
