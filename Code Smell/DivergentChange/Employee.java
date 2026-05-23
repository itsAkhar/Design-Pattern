package DivergentChange;

public class Employee {
    private String name;
    private int salary;
    private double taxRate;

    public Employee(String name, int salary, double taxRate) {
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public double getTaxRate() {
        return taxRate;
    }
}
class SalaryManager{
    public void applyRaise(int raiseAmount,Employee employee) {
        employee.setSalary(employee.getSalary()+raiseAmount);
    }
}
class TaxCalculator{
    public double calculateTax(Employee employee) {
        return  employee.getSalary() * employee.getTaxRate();
    }
}