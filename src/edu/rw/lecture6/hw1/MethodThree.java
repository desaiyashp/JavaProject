package edu.rw.lecture6.hw1;

public class MethodThree {
    private boolean chkCardNum (int a, int b){
        boolean c = a>b;
        return c;
    }
    private void chkCardNum2 (int a, int b){
        boolean c = a>b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        MethodThree myObj = new MethodThree();
        System.out.println(myObj.chkCardNum(4,2));
        myObj.chkCardNum2(4, 2);
    }
}
