package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Employee {

    private String name;
    private double salary;


    public static void main(String[] args) {


    }


    public Employee(String name, double salary) {
        System.out.println("Employee Constructor");
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
         Manager m1 = new Manager("Amanda", 80000, 5000);


         double mAllowance = m.managementAllowance;
         System.out.println(mAllowance);

         double bonus = m.calculateBonus();
         System.out.println(bonus);

         String name = m.getName();
         System.out.println(name);

         double salary = m.getSalary();
         System.out.println(salary);


     }


    public Manager(String name, double salary, double managementAllowance){
         super(name, salary);
         System.out.println("Manager Constructor");
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
