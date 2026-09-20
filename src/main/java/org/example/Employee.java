package org.example;


class Employee {

    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {

    public Manager(double salary) {
        super(salary);
    }

    public void giveRaise() {
        salary += 1000;
    }

    public void breakSalary() {
        salary = -500000;
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
          */
