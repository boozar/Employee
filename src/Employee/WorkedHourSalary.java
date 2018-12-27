package Employee;


public class WorkedHourSalary extends Employee{

    public WorkedHourSalary() {
    }

    public WorkedHourSalary(String name, long ID, double hourSalary, double dayHours, double workedDays) {
        super(name, ID, hourSalary, dayHours, workedDays);
    }

@Override
    public double CalculationSalary() {
        return hourSalary*dayHours*workedDays;

    }
}
