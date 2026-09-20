import college.hr.Employee;

public class Intern extends Employee {

    private String school;


    public Intern(double salary, String name, String school) {
        super(salary, name);
        this.school = school;
    }

    public void printSchool() {
        System.out.println(school);
    }

    @Override
    protected double calculateBonus() {
        return salary * 0;
    }
}
