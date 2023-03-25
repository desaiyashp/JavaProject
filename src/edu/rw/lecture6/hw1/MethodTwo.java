package edu.rw.lecture6.hw1;

public class MethodTwo {

    protected String findEmpData(String empfName, String emplName){
        String empFullName = empfName.concat(" ").concat(emplName);
        System.out.println(empFullName);
        return empFullName;
    }
    private int totalSalary (int basicSal, int hra, int dAllow){
        int salary = basicSal+hra+dAllow;
        System.out.println(salary);
        return salary;
    }

    private static int calculateNewInterest(int salary){
        salary = salary * 2;
        return salary;
    }

    public static void main(String[] args) {
        MethodTwo myObj = new MethodTwo();
        myObj.findEmpData("Farhan", "Qureshi");
        System.out.print("Total Salary: ");
        int returnSalary = myObj.totalSalary(2000, 500, 250);
        System.out.println(returnSalary);//2750
        //2%
        System.out.println(calculateNewInterest(returnSalary));
        myObj.findEmpData("Chatur", "Ramalingam");
        System.out.print("Total Salary: ");
        myObj.totalSalary(3600,1800,900);

    }
}
