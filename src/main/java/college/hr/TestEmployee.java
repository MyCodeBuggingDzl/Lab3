package college.hr;

import college.management.Manager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestEmployee {

    @Test
    public void testNameAndSalary() {
        Employee e = new Employee(40000, "Name1");

        assertEquals("Name1", e.getName());
        assertEquals(40000, e.getSalary(), 0.001);
    }

    @Test
    public void testBonus() {
        Employee e = new Employee (20000, "Name2");

        double bonus = 20000 * 1.05;

        assertEquals(bonus, e.calculateBonus(), 0.001);
    }
}
