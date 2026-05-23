package RefusedBequest;

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

class Manager extends Employee {
    private int bonus;

}

class Developer extends Employee {
    private String programmingLanguage;

}
class SalaryAdjustment{
    public void giveRaise(int raiseAmount,Employee employee) {
        employee.setSalary(employee.getSalary()+raiseAmount);
    }
}