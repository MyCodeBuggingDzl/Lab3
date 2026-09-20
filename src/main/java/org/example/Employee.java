package org.example;


public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    protected void increaseSalary(double amount) {
        // validate the amount
        // modify salary only if valid
        if (amount > 0) {
            salary += amount;
        }
    }
}




class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void giveRaise() {
        increaseSalary(1000);
    }
}
 /*
           Part B
         1. m.getName() will allow us to get the name
         2. m.getSalary will get the salary
         3. m.getManagementAllowance() will get the management allowance
         4. m. calculateBonus will allow us to calc the bonus.
         (All in the Manager class)

           Part C
         1. Employee will print first because without a parent class, child will not exist.

           Part D
         A. Salary should be protected so the child class can have access.
         1. Yes, it can read & write.
         2. Yes, in here breakSalary gives a negative value.
         3. No, it's weaker, the parent class will be dependant to the child class.
         4. Yes,  a private, a protected will risk to have a invalid state.

           Part E
         A. Because the subclass have control over it.
         1. I would use protected to safely modify the data. It's much safer when there's
            a lot of child. It is way better if you want to raise the salary of a single employee.

           Part F
         1. To safely modify a data, design B safely modifies the data with a validation. And Design A can be invalid data.

         */
