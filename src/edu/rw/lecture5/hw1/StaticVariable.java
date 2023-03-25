package edu.rw.lecture5.hw1;
public class StaticVariable {
    static byte age, numberOfExp, yearInUk;
    static float height, weight;
    static String nameOfPerson;
    public static void running(){
        System.out.println("I run 2 miles everyday.");    }
    public static void watching(){
        System.out.println("I watch movie once a week");    }

    public static void main(String[] args) {
        nameOfPerson="Narendra";     age=45;     numberOfExp=20;
        height=5.6f;          weight=78.4f;

        System.out.println("Name: "+nameOfPerson);
        System.out.println("Age: "+age+" years\nHeight: "+height+" feet");
        System.out.println("Weight: "+weight+" Kg");
        watching();
        running();

    }
}
