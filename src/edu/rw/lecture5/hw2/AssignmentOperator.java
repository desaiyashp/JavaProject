package edu.rw.lecture5.hw2;

public class AssignmentOperator {
//                                   =, +=, -=, *=, /=, %=
    int p, q, r, s, t;
    float x, y, z;
    public void runCalculation(){

        System.out.println("The calculation is correct.");
    }

    public static void main(String[] args) {
        AssignmentOperator myObj1 = new AssignmentOperator();
//        myObjOne.p + myObjOne.q = myObjOne.r;
        myObj1.p=20;
        myObj1.q=10;

        myObj1.r=myObj1.p+ myObj1.q;    //30
        System.out.println(myObj1.r);

        myObj1.s=myObj1.r+=10;     // 40
        myObj1.t=myObj1.s*2;       // 80
        myObj1.t%=15;              // 5

        System.out.println(myObj1.r);
        System.out.println(myObj1.s);
        System.out.println(myObj1.t);    // 5
        myObj1.runCalculation();

    }

}
