package edu.rw.lecture6.hw1;

import org.jetbrains.annotations.NotNull;

public class Method {
    static int a = 100;
    static int b = 6;
    private static int calculate(){
        int c = a/b;
        System.out.println(c);
        return c;
    }
    public static String emp1Name (){
        String fName = "Raju";
        String lName = "Rastogi";
        String addSpace = " ";
        String fullName = fName.concat(addSpace).concat(lName);
        System.out.println(fullName);
        return fullName;
    }
    public static int lengthFullName (){
        int length = emp1Name().length();
        System.out.println(length);
        return length;
    }
    //Type casting
    //int -- byte,short
    public static byte divideNum (byte a, byte b){   // byte and short variables are not allowed?
        byte c = (byte) (a+b);
        System.out.println(c);
        return c;
    }


    public static void main(String[] args) {
        calculate();
        emp1Name();
        lengthFullName();
//        divideNum(8, 4);
//        divideNum(120.31f, 23.31f);



    }

}
