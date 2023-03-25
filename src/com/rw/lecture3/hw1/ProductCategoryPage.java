package com.rw.lecture3.hw1;

public class ProductCategoryPage {
    public static void main(String[] args) {
        byte totalHomeAndFurniture = 29;
        String firstCategory = "Home & Furniture";
        short totalTechnology = 384;
        String secondCategory = "Technology";
        int totalToys = 32523;
        String thirdCategory = "Toys";

        System.out.println("Total number of items");
        System.out.print(firstCategory+" "+totalHomeAndFurniture+", ");
        System.out.print(secondCategory+" "+totalTechnology+", ");
        System.out.print(thirdCategory+" "+totalToys);

    }
}
