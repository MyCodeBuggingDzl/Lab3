package college.management;

import college.hr.Employee;



public class Manager extends college.hr.Employee {

    private double managementAllowance;

    public Manager(double salary, String name) {
        super(salary, name);
    }


    public double getManagementAllowance() {
        return managementAllowance;
    }

    @Override
    protected double calculateBonus() {
        return salary * 1.1 + managementAllowance;
    }
}
