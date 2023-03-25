package edu.rw.lecture11;

public interface MyThirdInterface extends MyFirstInterface, MySecondInterface {
    int sum(int a, int b);

    long multiply(long a, long b);
    double divide(double a, double b);
    void calculate(double x, double y, String z);
}
