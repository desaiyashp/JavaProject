package edu.rw.lecture8.hw1;

public class OddNumberWithWhileLoop {
    public static void getOddNumbers (int fstNum, int lstNum){
        if (fstNum<lstNum) {
            if(fstNum%2!=0) {
                while (fstNum <= lstNum) {
                    System.out.println(fstNum);;
                    fstNum += 2;
                }
            }else{
                fstNum = fstNum+1;
                while (fstNum <= lstNum) {
                    System.out.println(fstNum);;
                    fstNum += 2;
                }
            }
        } else {
            if(fstNum%2!=0) {
                while (fstNum >= lstNum) {
                    System.out.println(fstNum);;
                    fstNum -= 2;
                }
            }else{
                fstNum = fstNum-1;
                while (fstNum >= lstNum) {
                    System.out.println(fstNum);;
                    fstNum -= 2;
                }
            }
        }
    }

    public static void main(String[] args) {
       getOddNumbers(-20, 20);
//        getOddNumbers(2, 12);
//        getOddNumbers(12, 2);

    }

}
