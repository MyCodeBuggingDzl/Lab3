import college.hr.Employee;

public class Developer extends Employee {

    private String progLanguage;

    public Developer(double salary, String name, String progLanguage) {
        super(salary, name);
        this.progLanguage = progLanguage;
    }

    public void printProgLanguage() {
        System.out.println(progLanguage);
    }

    @Override
    protected double calculateBonus() {
        return salary * 1.08;
    }

    public String getProgLanguage() {
        return progLanguage;
    }
}
