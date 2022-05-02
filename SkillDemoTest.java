import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSubtract() {
        assertEquals(4, SkillDemo.subtract(5, 3));
    }
}