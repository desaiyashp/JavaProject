package edu.rw.lecture5.hw1;

public class InstanceVariable {                  // Instance Variable = Global Variable
    String personName;                           // Declaring Variable
    byte age, yearsOfExp;
    float height, weight;
    public void playing(){                       // Instance Method
        System.out.println("I like to play cricket");    }
    public void cooking(){
        System.out.println("I cook meal for my family");    }

    public static void main(String[] args) {
        InstanceVariable myInstanceVariable = new InstanceVariable();
/*                    ClassName objectName = new ClassName();
                      Object has to be created within main method only.               */
        myInstanceVariable.personName="Kapil Dev";
        myInstanceVariable.height=5.9f;    myInstanceVariable.weight=79.2f;
        myInstanceVariable.age=53;    myInstanceVariable.yearsOfExp=13;
//                    Assignment of Variable

        System.out.println("Introduction");
        System.out.println("Name: "+myInstanceVariable.personName);
        System.out.println("Age: "+myInstanceVariable.age+" years\nHeight: "+myInstanceVariable.height+" feet");
        System.out.println("Weight: "+myInstanceVariable.weight+" Kilograms");
        System.out.println("I have played cricket for "+myInstanceVariable.yearsOfExp+" years for India.");
        System.out.println("Hobbies:");
        myInstanceVariable.playing();
        myInstanceVariable.cooking();

    }

}
