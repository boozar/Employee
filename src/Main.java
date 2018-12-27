import Employee.Employee;
import Employee.WorkedHourSalary;
import Employee.WorkedMonthSalary;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

   //     Employee worker = new Employee("Worker 1", 1234567890, 123, 15, 18);
        WorkedHourSalary hourworker = new WorkedHourSalary("Worker 2", 1234567891, 135, 10, 25);

//        System.out.println(worker);
        System.out.println(hourworker);

        WorkedMonthSalary monthWorker = new WorkedMonthSalary("Иван", 4555555, 2000);
        System.out.println(monthWorker);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(hourworker);
        employees.add(monthWorker);
        employees.add(new WorkedHourSalary("Алекс", 55545555, 230, 15, 20));
        employees.add(new WorkedHourSalary("Алекс", 21555222, 330, 20, 30));

        for(Employee employ : employees){

            System.out.println(employ.);
        }

    }
}
