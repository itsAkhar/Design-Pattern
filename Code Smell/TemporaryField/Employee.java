package TemporaryField;

public class Employee {
    private String name;
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
class SalaryAdjustment{
    private int tempSalary;

    public void giveRaise(int raiseAmount,Employee employee) {
        tempSalary = employee.getSalary() + raiseAmount;
    }

    public void applyRaise(Employee employee) {
        employee.setSalary(tempSalary);
        tempSalary = 0;
    }
}