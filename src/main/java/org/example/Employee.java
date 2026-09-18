package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Employee {

    private String name;
    private double salary;


    public static void main(String[] args) {


    }


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateBonus() {
        return salary * 0.05;
    }
}




 class Manager extends Employee {


     private double managementAllowance;



     public static void main(String[] args) {
         Manager m = new Manager("John", 8000, 5000);

         double mAllowance = m.managementAllowance;
         System.out.println(mAllowance);

         double bonus = m.calculateBonus();
         System.out.println(bonus);

         String name = m.getName();
         System.out.println(name);

         double salary = m.getSalary();
         System.out.println(salary);


         /*
         1. m.getName() will allow us to get the name
         2. m.getSalary will get the salary
         3. m.getManagementAllowance() will get the management allowance
         4. m. calculateBonus will allow us to calc the bonus.
         (All in the Manager class)
          */
     }


    public Manager(String name, double salary, double managementAllowance){
        super(name, salary);
        this.managementAllowance = managementAllowance;
    }


    public double getManagementAllowance() {
        return managementAllowance;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.1 + managementAllowance;
    }
}
