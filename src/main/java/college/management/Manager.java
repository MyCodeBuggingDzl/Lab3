package college.management;

import college.hr.Employee;



public class Manager extends college.hr.Employee {

    public Manager(double salary) {
        super(salary);
    }

    public void changeMySalary() {
        salary = 100000;
    }
}
