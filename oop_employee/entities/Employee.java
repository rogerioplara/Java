package oop_employee.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double increase) {
        grossSalary += (increase / 100) * grossSalary;
    }

    public String toString() {
        return String.format("%s, $ %.2f%n",
                name,
                netSalary());
    }

}
