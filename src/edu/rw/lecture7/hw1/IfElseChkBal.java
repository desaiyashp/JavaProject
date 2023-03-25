package edu.rw.lecture7.hw1;

public class IfElseChkBal {
    static double mainBal = 5000.30;  //999.40
    static void chkBal (double withdraw){
        if (mainBal>=withdraw){
            System.out.println("Your current balance is " + mainBal);
            System.out.println("Your withdrawal money is: "+ withdraw);
            changeValue(withdraw);
            System.out.println(mainBal);
        } else {
            System.out.println("Your balance is less than withdrawal request.");
        }
    }
    private static void changeValue(double withdraw){
        mainBal = mainBal-withdraw;
    }

    public static void main(String[] args) {
        chkBal(4000.60); // Why result show many decimal places in bal?
        System.out.println();
        chkBal(100.00); // Why result show only single decimal place?
        System.out.println();
        chkBal(900);
    }
}
