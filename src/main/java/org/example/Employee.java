package org.example;


class Employee {

    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    static void main(String[] args) {
        Manager manager = new Manager(80000);

        manager.giveRaise();

        System.out.println(manager.salary);


        manager.breakSalary();

        System.out.println(manager.salary);
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

           Part D
         A. Salary should be protected so the child class can have access.
         1. Yes, it can read & write.
         2. Yes, in here breakSalary gives a negative value.
         3. No, it's weaker, the parent class will be dependant to the child class.
         4. Yes,  a private, a protected will risk to have a invalid state.
          */
