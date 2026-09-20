package college.hr;

public class Employee {

    protected double salary;
    private String name;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    protected double calculateBonus() {
        return salary * 1.05; //imagine the bonus is 5% for all;
    }
}
