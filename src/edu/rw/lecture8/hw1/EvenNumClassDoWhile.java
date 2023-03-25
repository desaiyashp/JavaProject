package edu.rw.lecture8.hw1;

public class EvenNumClassDoWhile {
    private void getEvenNum (int fNum, int lNum){
        System.out.println("Even Numbers between "+fNum +" & "+lNum+ " are");
        if (fNum<lNum){
            if (fNum%2==0){
                do {
                    System.out.print(fNum+"; ");
                    fNum+=2;
                } while (fNum<=lNum);
                System.out.println();
                System.out.println();
            } else {
                fNum=fNum+1;
                do {
                    System.out.print(fNum+"; ");
                    fNum+=2;
                } while (fNum<=lNum);
                System.out.println();
                System.out.println();
            }
        } else {
            if (fNum % 2 == 0) {
                do {
                    System.out.print(fNum + "; ");
                    fNum -= 2;
                } while (fNum >= lNum);
                System.out.println();
                System.out.println();
            } else {
                fNum = fNum - 1;
                do {
                    System.out.print(fNum + "; ");
                    fNum -= 2;
                } while (fNum >= lNum);
                System.out.println();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        EvenNumClassDoWhile evenNumClassDoWhile = new EvenNumClassDoWhile();
        evenNumClassDoWhile.getEvenNum(20, 28);
        evenNumClassDoWhile.getEvenNum(15, 25);
        evenNumClassDoWhile.getEvenNum(73, 64);
        evenNumClassDoWhile.getEvenNum(54,43);
    }
}
