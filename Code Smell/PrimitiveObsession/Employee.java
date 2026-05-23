package PrimitiveObsession;

import java.security.InvalidParameterException;

public class Employee {
    private String name;
    private Money salary;
    private Date hireDate;
    
    public Money getSalary() {
        return salary;
    }

    public void setSalary(Money salary) {
        this.salary = salary;
    }
}
class Money{
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money>0)this.money = money;
        else throw new InvalidParameterException("Invalid Parameter");
    }
}
class Date{
    private int hireYear;
    private int hireMonth;
    private int hireDay;

    public Date(int hireYear, int hireMonth, int hireDay) {
        this.hireYear = hireYear;
        this.hireMonth = hireMonth;
        this.hireDay = hireDay;
    }

    public int getHireYear() {
        return hireYear;
    }

    public int getHireMonth() {
        return hireMonth;
    }

    public int getHireDay() {
        return hireDay;
    }
}