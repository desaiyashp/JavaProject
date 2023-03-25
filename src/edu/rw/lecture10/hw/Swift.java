package edu.rw.lecture10.hw;

public class Swift {
    String modelName;    // SUV, Hatchback, Sadan, Van, MPV
    int numOfPassengers = 4;   // 2, 5, 7,...
    String fuelType = "Petrol";
    float engineCapacityInLitre = 1.2f;
    Swift(String model){
        System.out.println();
        modelName = model;
        System.out.println("(/o\\__"+modelName+"_/o\\)");
        Suzuki suzuki = new Suzuki('1');
        Automobile automobile = new Automobile("Car");
        Suzuki suzuki1 = new Suzuki("No Safety Feature");
        System.out.println("Passenger Capacity: "+numOfPassengers);
        System.out.println("Fuel: "+fuelType);
        System.out.println("Capacity in litre: "+engineCapacityInLitre);
    }

    public static void main(String[] args) {
        Swift swift = new Swift("Suzuki Swift");
    }

}
