package Employee;

public class WorkedMonthSalary extends Employee {
    public WorkedMonthSalary() {
    }

    public WorkedMonthSalary(String name, long ID, double monthDaySalary) {
        super(name, ID, monthDaySalary);
    }

    @Override
    public double CalculationSalary() {

        return  (monthDaySalary<minimalMonthdaySalary ? minimalMonthdaySalary : monthDaySalary);
    }



}
