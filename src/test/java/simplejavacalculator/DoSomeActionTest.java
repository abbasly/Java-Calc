package simplejavacalculator;

import static org.junit.Assert.*;
import static simplejavacalculator.Calculator.MonoOperatorModes.square;

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
        assertEquals((Double) 888.0, tester.calculateMono(square, 4.0));
    }
}
