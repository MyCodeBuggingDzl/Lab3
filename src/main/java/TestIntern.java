import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestIntern {

    @Test
    public void bonus() {
        Intern i = new Intern(50, "I1", "VANIER");

        double bonus = i.getSalary() * 0;

        assertEquals(00.0, i.calculateBonus(),0.001);
    }
}
