package edu.rw.lecture6.hw1;

public class ModifierTwo {
//    private modifier is not accessible from ModifierOne class.

    public static void main(String[] args) {
        ModifierOne myObj = new ModifierOne();
        myObj.runLogicPublic();
        myObj.runLogicProtect();

    }
}
