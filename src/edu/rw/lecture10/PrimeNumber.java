package edu.rw.lecture10;

public class PrimeNumber {
    public static void findPrimeMember(int n) {
        int divisor;
        int divider;
        if (n>1) {
            for (divisor = 2; divisor <= n; divisor++) {
                for ( divider = 2; divider <=n; divider++){
                    if (divisor%divider==0){
                        if(divisor==divider){
                            System.out.println(divisor+" ");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        findPrimeMember(10);

    }
}
// 2, 3, 5, 7, 11, 13, 17