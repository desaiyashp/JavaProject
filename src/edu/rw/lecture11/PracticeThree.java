package edu.rw.lecture11;

public class PracticeThree extends Practise {
     static void add(int a, int b){
        System.out.println(a-b);
    }
    void calculate(){
        int a = 10;
        int b = 30;
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        PracticeThree practiceThree = new PracticeThree();
        add(53,23);
        practiceThree.calculate();
    }
}
