package edu.rw.lecture7.hw2;

// Why only 3rd month of every quarter printed in console?
public class SwitchMonthName {
    private void getMonthName (String quarterNumber, int monthNumber){

        switch (quarterNumber){
            case "First":
                switch (monthNumber){
                    case 1:
                        System.out.println("It is April");
                    case 2:
                        System.out.println("It is May");
                    case 3:
                        System.out.println("It is June");
                }                                     // Without "break;" Syntax
            case "Second":
                switch (monthNumber){
                    case 1:
                        System.out.println("It is July");
                    case 2:
                        System.out.println("It is August");
                    case 3:
                        System.out.println("It is September");
                }
            case "Third":
                switch (monthNumber){
                    case 1:
                        System.out.println("It is October");
                    case 2:
                        System.out.println("It is November");
                    case 3:
                        System.out.println("It is December");
                }
            case "Four":
                switch (monthNumber){
                    case 1:
                        System.out.println("It is January");
                    case 2:
                        System.out.println("It is February");
                    case 3:
                        System.out.println("It is March");
                }
            default:
                System.out.println("Incorrect entry");
        }
    }

    public static void main(String[] args) {
        SwitchMonthName myObj = new SwitchMonthName();
        myObj.getMonthName("First",3);
        myObj.getMonthName("six",1);
        myObj.getMonthName("",2);
    }

}
