package edu.rw.lecture13;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        //        List<String> fruits = new ArrayList<String>();
        studentName.add("Falguni");
        studentName.add("Yash");
        studentName.add("Amisha");

        System.out.println(studentName); //this is printing the whole ArrayList
        Collections.sort(studentName); //Collections interface this method


        for (String name:studentName){
            System.out.println(name);  //This will print individual members
        }
        studentName.remove("Yash"); //you can remove some member of Arraylist once some code has been executed
        System.out.println("Yash stopped coming to class " +studentName);

        ArrayList valueOfBucket = new ArrayList();
        valueOfBucket.add("Rishi");
        valueOfBucket.add(23);
        valueOfBucket.add("purchase value");
        valueOfBucket.add(99.32);
        System.out.println(valueOfBucket);
        System.out.println(valueOfBucket.size());
    }
}
