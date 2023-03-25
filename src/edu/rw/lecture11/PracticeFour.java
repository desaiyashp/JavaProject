package edu.rw.lecture11;

public class PracticeFour implements MyThirdInterface {
    @Override
    public int sum(int a, int b) {
        return (a + b);
    }
    @Override
    public int subtract(int a, int b) {
            return (a - b);
    }
    @Override
    public long multiply(long a, long b) {
        return (a * b);
    }
    @Override
    public double divide(double a, double b) {
        return (a / b);
    }

    @Override
    public void calculate(double x, double y, String z) {
        String zLower = z.toLowerCase();
        String c1 = "sum";
        String c2 = "subtract";
        String c3 = "multiply";
        String c4 = "divide";
        if (zLower.equals(c1)){
            int a = (int) x;
            int b = (int) y;
            PracticeFour practiceFour = new PracticeFour();
            System.out.println(a+" + "+b+" = "+practiceFour.sum(a, b));
        } else if (zLower.equals(c2)) {
            int a = (int) x;
            int b = (int) y;
            PracticeFour practiceFour = new PracticeFour();
            System.out.println(a+" - "+b+" = "+practiceFour.subtract(a, b));
        } else if (zLower.equals(c3)) {
            long a = (long) x;
            long b = (long) y;
            PracticeFour practiceFour = new PracticeFour();
            System.out.println(a+" x "+b+" = "+practiceFour.multiply(a, b));
        } else if (zLower.equals(c4)) {
            PracticeFour practiceFour = new PracticeFour();
            System.out.println(x+" / "+y+" = "+practiceFour.divide(x, y));
        } else {
            System.out.println("Please recheck input");
        }
    }
    public static void main(String[] args) {
        PracticeFour practiceFour = new PracticeFour();
        practiceFour.calculate(70.76, 31.79, "Sum");
        practiceFour.calculate(64,73,"subTract");
        practiceFour.calculate(7.5,4,"MULTiply");
        practiceFour.calculate(843.2,82,"diviDE");
        practiceFour.calculate(923,239,"sumation");
    }
}