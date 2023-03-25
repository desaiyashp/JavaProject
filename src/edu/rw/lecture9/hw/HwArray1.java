package edu.rw.lecture9.hw;

public class HwArray1 {
    int[] myIntNums;
    String[] myString;
    char[] myNewChar;
    private void runNewCharMethod(){
        HwArray1 hwArray1= new HwArray1();
        hwArray1.myNewChar = new char[] {'B','u','g','a','t','t','i'};
        System.out.println(">>> Result of myNewChar is:");
        System.out.print("The fastest car in the World: ");
        for (char myChar: hwArray1.myNewChar) {
            System.out.print(myChar);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        HwArray1 hwArray1 = new HwArray1();
//        initialising and printing individual "myIntNums" value in console
        hwArray1.myIntNums= new int[]{12, 23, 93, 49, 30, 23};
        System.out.println(">>> Result of \"myIntNums\" is: ");
        for (int num: hwArray1.myIntNums){
            System.out.print(num+", ");
        }
        System.out.println();
        System.out.println();
//        declaring size and initialiing string
        hwArray1.myString = new String[5];
        hwArray1.myString[0] = "Volvo XC90";
        hwArray1.myString[1] = "Mercedes GLE";
        hwArray1.myString[2] = "Mclaren 720s";
        hwArray1.myString[3] = "Aston Martin Vanquish";
        hwArray1.myString[4] = "Rolls-Royce Phantom";
        System.out.println(">>> Result of myString is:");
        for (int i =0; i<hwArray1.myString.length; i++){
            System.out.println(hwArray1.myString[i]);
            System.out.println("Uppercase: "+hwArray1.myString[i].toUpperCase());
            System.out.println("Lowercase: "+hwArray1.myString[i].toLowerCase());
        }
        System.out.println();
        hwArray1.runNewCharMethod();
    }
}
