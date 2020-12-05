package simplejavacalculator;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Trivial test class. Demonstrates the syntax of JUnit4.
 * Important: Do NOT inherit this class from TestCase() or JUnit3.x is enforced
 *
 * @author Sascha Tayefeh
 */
public class DoSomeActionTest {
    @Test
    public void testIsThisReallyTrue() {
        Calculator tester = new Calculator();
        assertEquals(16.0, tester.calculateMono(square, 4.0));
    }
}
