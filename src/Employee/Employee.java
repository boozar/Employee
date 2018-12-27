package Employee;

public class Employee implements IEmployee {
    String name;
    long ID;
    double hourSalary;
    double dayHours;
    double workedDays;
    double monthDaySalary;

    public Employee() {
    }

    public Employee(String name, long ID, double monthDaySalary) {
        this.name = name;
        this.ID = ID;
        this.monthDaySalary = monthDaySalary;

    }


    public Employee(String name, long ID, double hourSalary, double dayHours, double workedDays) {
        this.name = name;
        this.ID = ID;
        this.setHourSalary(hourSalary);
        this.setDayHours(dayHours);
        this.setWorkedDays(workedDays);
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = (hourSalary < minimalHourSalary ? minimalHourSalary : hourSalary );
    }

    public void setDayHours(double dayHours) {
        this.dayHours = (dayHours < minimalDayHours ? minimalDayHours : dayHours);
    }

    public void setWorkedDays(double workedDays) {
        this.workedDays = (workedDays < minimalManthDays ?  minimalManthDays : workedDays);
    }

    public String getName() {
        return name;
    }

    public long getID() {
        return ID;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public double getDayHours() {
        return dayHours;
    }

    public double getWorkedDays() {
        return workedDays;
    }

    @Override
    public double CalculationSalary() {

        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", hourSalary=" + hourSalary +
                ", dayHours=" + dayHours +
                ", workedDays=" + workedDays +
                ", monthDaySalary=" + this.CalculationSalary() +
                '}';
    }
}
