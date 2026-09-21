package college.management;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestManager {


    @Test
    public void testInitializer() {
        Manager m = new Manager(40000, "Name1");

        assertEquals("Name1", m.getName());
        assertEquals(40000, m.getSalary(), 0.001);
    }

    @Test
    public void testAllowance() {
        Manager m = new Manager(80000, "Name3");
        assertEquals(0.0, m.getManagementAllowance(), 0.001);
    }

    @Test
    public void testBonus() {
        Manager m = new Manager (20000, "Name2");

        double bonus = 20000 * 1.1 + m.getManagementAllowance();

        assertEquals(bonus, m.calculateBonus(), 0.001);
    }

    @Test
    public void testValidChanges() {
        double initialSalary = 50000;
        Manager m = new Manager(initialSalary, "m1");

        m.giveRaise(50000);

        double newSalary = initialSalary + 50000;
        assertEquals(newSalary, m.getSalary(), 0.001);
    }

    @Test
    public void testInvalidChanges() {
        double initialSalary = 200;
        Manager m = new Manager(initialSalary, "m2");

        m.giveRaise(-500);
        double newSalary = initialSalary + -500;
        assertEquals(initialSalary, m.getSalary(), 0.001);
    }
}