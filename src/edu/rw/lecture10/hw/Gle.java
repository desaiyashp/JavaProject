package edu.rw.lecture10.hw;

public class Gle extends Mercedes{
    String modelName;    // SUV, Hatchback, Sadan, Van, MPV
    int numOfPassengers = 7;   // 2, 5, 7,...
    String fuelType = "Diesel";
    float engineCapacityInLitre = 3.0f;
    Gle(String model){
        System.out.println();
        modelName = model;
        System.out.println("**** "+modelName+" ****");
        Mercedes mercedes = new Mercedes('1');
        Automobile automobile = new Automobile("Car");
        Mercedes mercedes1 = new Mercedes("5-Star rated");
        System.out.println("Passenger Capacity: "+numOfPassengers);
        System.out.println("Fuel: "+fuelType);
        System.out.println("Capacity in litre: "+engineCapacityInLitre);
    }

    public static void main(String[] args) {
        Gle gle = new Gle("Mercedes GLE");
    }



}
