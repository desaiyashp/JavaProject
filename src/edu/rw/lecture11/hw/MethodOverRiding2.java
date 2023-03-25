package edu.rw.lecture11.hw;

public class MethodOverRiding2 extends MethodOverRiding1{
    @Override
    void subtraction(int a, int b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        MethodOverRiding2 myobj = new MethodOverRiding2();
        myobj.subtraction(100, 60);
        myobj.subtraction(30, 100);
        myobj.addNums(10, 90);

    }
}
