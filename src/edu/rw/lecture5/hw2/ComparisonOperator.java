package edu.rw.lecture5.hw2;

public class ComparisonOperator {
//                             ==, !=, >, <, >=, <=
    short a, b, c, d, e, f;
    boolean result1, result2, wrongResult1, wrongResult2;

    public void calculate(){
        System.out.println(a*b);                          // 28
        System.out.println(c/d);                          // 10
        System.out.println(result1=((a*b)>(c/d)));        // true
        System.out.println(wrongResult1=e<f);             // false
        System.out.println(result2=c==e);                 // true
        System.out.println(wrongResult2=(a*b)<=f);        // false
    }

    public static void main(String[] args) {
        ComparisonOperator myObjTwo = new ComparisonOperator();
        myObjTwo.a=4;
        myObjTwo.b=7;
        myObjTwo.c=90;
        myObjTwo.d=9;
        myObjTwo.e=90;
        myObjTwo.f=20;
        myObjTwo.calculate();
    }

}
