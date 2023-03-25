package edu.rw.lecture9.hw;

public class HwArrayLogicalInitialise {
    public static void main(String[] args) {
        int[] myNewNums = new int[7];   // Array ini
        int i, x;
        x = 1;
        for (i=myNewNums.length-1; i>=0; i--){
            myNewNums[i]=x;
            System.out.print(myNewNums[i]+", ");
            x=x*i;
        }
        System.out.println();
        for (i=1; i<myNewNums.length; i++){
            myNewNums[i]=x;
            System.out.print(myNewNums[i]+", ");
            x=x*i;
        }
        System.out.println();
    }
}
