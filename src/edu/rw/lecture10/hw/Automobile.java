package edu.rw.lecture10.hw;

public class Automobile {
    String typeOfVehicle;  // Car, Bike, Truck, Bus
    int numOfWheels;    // 4, 3, 2, 6, 8


    Automobile(String carType){
        typeOfVehicle= "Car";
        System.out.println("Vehicle Type: "+typeOfVehicle);
        numOfWheels= 4;
        System.out.println("No of Wheels: "+numOfWheels);
    }

    public Automobile() {
    }

    public static void main(String[] args) {
        Automobile automobile = new Automobile("Car");
    }
}
