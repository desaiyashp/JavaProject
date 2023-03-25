package edu.rw.lecture5.hw2;

public class LogicalOperator {
//                              && (And), || (or), ! (reverse)
   int a, b, c, d;
   boolean result1, result2, result3, wrongResult1, wrongResult2;
   public void calculate(){
       System.out.println(result1=a<b && c<d);          // true
       System.out.println(wrongResult1=a<b && c>d);     // false
       System.out.println(result2=a<b || c>d);          // true
       System.out.println(wrongResult2=a>b || c>d);     // false
       System.out.println(result3=!wrongResult2);       // true

   }

    public static void main(String[] args) {
       LogicalOperator myObj = new LogicalOperator();
       myObj.a=10;
       myObj.b=15;
       myObj.c=20;
       myObj.d=25;

       myObj.calculate();
    }
}
