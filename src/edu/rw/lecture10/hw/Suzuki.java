package edu.rw.lecture10.hw;

public class Suzuki {
    String customerBase ="You are a Rising Star Customer" ;
    String safetyStd;
    Suzuki(char customerType){
        System.out.println();
        System.out.println("==============================");
        System.out.println(customerBase);
        System.out.println("==============================");
    }
    Suzuki(String model){
        safetyStd = model;
        System.out.println("Safety Standard: "+safetyStd);
    }
    public static void main(String[] args) {
        Suzuki suzuki = new Suzuki('1');
        Suzuki suzuki1 = new Suzuki("No Safety Feature");
    }
}

