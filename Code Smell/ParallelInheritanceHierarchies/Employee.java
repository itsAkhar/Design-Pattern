package ParallelInheritanceHierarchies;

public class Employee extends Worker{
    private int salary;

    public void giveRaise(int raiseAmount) {
        salary += raiseAmount;
    }
}

class Manager extends Employee implements BonusAdjustment{
    private int bonus;
    public void assignBonus(int bonusAmount) {
        this.bonus = bonusAmount;
    }
}

class Contractor extends Worker{
    private int hourlyRate;

    public void increaseHourlyRate(int increment) {
        hourlyRate += increment;
    }
}

class ContractorManager extends Contractor implements BonusAdjustment{
    private int bonus;
    public void assignBonus(int bonusAmount) {
        this.bonus = bonusAmount;
    }
}
