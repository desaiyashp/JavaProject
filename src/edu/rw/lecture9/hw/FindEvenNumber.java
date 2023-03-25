package edu.rw.lecture9.hw;

public class FindEvenNumber {

    int[] poolOfValue;
    int[] arrOfValueSeries;
    void getEvenNum (int[] nums){
        for ( int num : nums) {
            if (num != 0 && num % 2 == 0) {
                System.out.println(num + " is an even number.");
            }        }     }
    void findOddNum(int[] oddNums){
        for (int oddNum:oddNums){
            if (oddNum % 2 != 0){
                System.out.println(oddNum+" is an odd number.");
            }         }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        for (int evenNum:oddNums){
            if (evenNum!=0 && evenNum%2==0) {
                System.out.println(evenNum + " is an EVEN number.");
            }         }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        for (int i=0; i<oddNums.length; i++) {
            if (oddNums[i] == 0) {
                System.out.println("Index: " + i + " value is 0. It is not an odd or even number");
            }         }     }
    public static void main(String[] args) {
        FindEvenNumber findEvenNumber = new FindEvenNumber();
        findEvenNumber.poolOfValue = new int[10];
        findEvenNumber.poolOfValue[0]=(20);
        findEvenNumber.poolOfValue[1]=(21);
        findEvenNumber.poolOfValue[2]=(22);
        findEvenNumber.poolOfValue[3]=(23);
        findEvenNumber.poolOfValue[4]=(24);
        findEvenNumber.poolOfValue[5]=(25);
        findEvenNumber.poolOfValue[6]=(26);
        findEvenNumber.poolOfValue[7]=(27);
        findEvenNumber.poolOfValue[8]=(28);
        findEvenNumber.poolOfValue[9]=(29);
        findEvenNumber.getEvenNum(findEvenNumber.poolOfValue);
        System.out.println();
        findEvenNumber.arrOfValueSeries = new int[]{2321, 2322, 2342, 2375,435, 342,0,323,234,0, 2323, 2342, 320, 0, 2342, 3423};
        findEvenNumber.findOddNum(findEvenNumber.arrOfValueSeries);
    }
}
