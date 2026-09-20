package college.hr;

public class Payroll {

    public void changeSalary(Employee employee) {
        employee.salary = 100000;
    }
}


/*
Part I
Since salary is protected any subclass can access it or any class in the same package.
 */