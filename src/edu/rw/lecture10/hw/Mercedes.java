package edu.rw.lecture10.hw;

public class Mercedes extends Automobile {

    String customerBase ="You are a Premium Customer" ;   // Premium customer base, HNI, low middle income
    String safetyStd;      // High Safety features (5-star rated)
    Mercedes(char customerType){
        System.out.println();
        System.out.println("==========================");
        System.out.println(customerBase);
        System.out.println("==========================");
    }
    Mercedes(String model){
        safetyStd = model;
        System.out.println("Safety Standard: "+safetyStd);
    }

    public Mercedes() {
    }

    public static void main(String[] args) {
 //       Mercedes mercedes = new Mercedes();
        Mercedes mercedes2= new Mercedes('1');
        Mercedes mercedes1 = new Mercedes("5-Star rated");


    }


}
