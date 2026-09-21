import college.hr.Employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDeveloper {

    @Test
    public void progLanguage() {
        Developer d = new Developer(100, "D1", "Java");

        assertEquals("Java", d.getProgLanguage());
    }

    @Test
    public void bonus() {
        Developer d = new Developer( 10, "D2", "Java");

        double bonus = d.getSalary() * 1.08;

        assertEquals(bonus, d.calculateBonus(), 0.001);
    }
}
