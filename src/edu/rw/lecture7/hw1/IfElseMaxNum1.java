package edu.rw.lecture7.hw1;

public class IfElseMaxNum1 {
    private int compareValue (int w, int x, int y, int z){
        if ((w > x) && (w > y) && (w>z)){
            System.out.println(w + " is the highest value.");
        } else if ((x>w) && (x>y) && (x>z)) {
            System.out.println(x + " is the highest value.");
        } else if ((y>w) && (y>x) && (y>z)) {
            System.out.println(y + " is the highest value.");
        } else if ((z>w) && (z>x) && (z>y)) {
            System.out.println(z + " is the highest value.");
        } else
            System.out.println("Error : More than one highest number");
        return z;
    }

    public static void main(String[] args) {
        IfElseMaxNum1 newObj = new IfElseMaxNum1();
        newObj.compareValue(39, 38, 20, 30);
        newObj.compareValue(20, 20, 20, 29);  // Same Two Number
        newObj.compareValue(49, 93, 93, 30);  // Same Highet Number
    }
}
