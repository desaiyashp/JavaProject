package edu.rw.lecture7.hw2;

public class SwitchWeekDay {
    public static void chkDay (String dayNumber){
        switch (dayNumber){
            case "One" :     System.out.println("Today is Monday.");
                break;
            case "Two":      System.out.println("Today is Tuesday.");
                break;
            case "Three":    System.out.println("Today is Wednesday.");
                break;
            case "Four":     System.out.println("Today is Thursday.");
                break;
            case "Five":     System.out.println("Today is Friday.");
                break;
            case "Six":      System.out.println("Today is Saturday.");
                break;
            case "Seven":    System.out.println("Today is Sunday.");
                break;
            default:     System.out.println("Please correct the day number.");
        }
    }

    public static void main(String[] args) {
        chkDay("One");
        chkDay("three");               // Case sensitive
        chkDay("Three");
        chkDay("Nine");
    }
}
