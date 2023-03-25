package edu.rw.lecture5.hw2;

public class ArithmeticOperator {
//            +, -, *, /, %(Modulus, remainder), ++(increment), --(decrement)
    int a, b, c, d, e, f, g;
    float v, w, x, y, z;

    public static void main(String[] args) {
        ArithmeticOperator myObj = new ArithmeticOperator();
        myObj.a=5;  myObj.b=6;  myObj.c=2;  myObj.d=3;
        myObj.e=4;  myObj.f=7;  myObj.g=8;

        myObj.w=(myObj.c* myObj.f);                // 14
        myObj.x=(myObj.b/ myObj.c)+ myObj.a;       // 8
        myObj.y=(myObj.w / myObj.b);               // 2.33
        myObj.z=((myObj.x * myObj.c) + myObj.d) / myObj.e ;     //4.75
        myObj.v=((myObj.g * myObj.c) + myObj.d) / myObj.e ;     //4.75
/*           The result value depends on its feed.
             Though myObj.v is float, its result is in int as
                    all its variables used are in int unlike myObj.z
             The decimal values are not printed in console in this case.
*/
        System.out.println(myObj.w);
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        System.out.println(myObj.z);
        System.out.println(myObj.v);


    }

}
