package edu.rw.lecture4.hw1;

public class Bodmas {
    public static void main(String[] args) {
        int x, y, z, a, b, c, d;
        float f;
        x = 5; y = 3;
        z = 2*x+4*y;
        System.out.println(z);

        x=30; y=10; z=2; a=20; b=15; c=25; d=5;
        f=(20-15)*5;

        System.out.println(f);

        f=a+(x-d)/c*y-z;
//         20 + (30-5)/25 * 10 - 2
//         20 + (25) / 25 * 10 - 2
//         20 + 1 * 10 - 2
//         20 + 10 - 2
//         28

        System.out.println(f);


    }
}
