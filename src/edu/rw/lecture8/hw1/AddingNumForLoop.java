package edu.rw.lecture8.hw1;

public class AddingNumForLoop {
    private static void addNum(int num) {
        int x = 0;
        for (int a = 1; a<=num; a++){
            System.out.println(x +" + "+ a+ " = "+(x+a));
            x += a;
        }
    }

    public static void main(String[] args) {
        addNum(50);
    }
}
