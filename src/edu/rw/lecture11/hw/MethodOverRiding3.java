package edu.rw.lecture11.hw;

public class MethodOverRiding3 extends MethodOverRiding2 {
    void addNums (int a, int b){
        if ((a<0)){
            a=a*-1;
        }
        if (b<0){
            b=b*-1;
        }
        System.out.println(a+b);
    }
    void subtraction (int a,int b){
        if ((a-b)>=0){
            System.out.println(a-b);
        } else {
            System.out.println(b-a);
        }
    }
    public static void main(String[] args) {
        MethodOverRiding3 myObj = new MethodOverRiding3();
        myObj.addNums(-90, -10);
        myObj.addNums(-10, 40);
        myObj.addNums(60, -20);
    }
}
