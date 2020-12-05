package simplejavacalculator;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;
import static simplejavacalculator.Calculator.MonoOperatorModes.*;

import org.junit.Test;

/**
 * Trivial test class. Demonstrates the syntax of JUnit4.
 * Important: Do NOT inherit this class from TestCase() or JUnit3.x is enforced
 *
 * @author Sascha Tayefeh
 */
public class DoSomeActionTest {
    @Test
    public void testSquare() {
        Calculator tester = new Calculator();
        //squareRoot, oneDevidedBy, cos, sin, tan, log, rate
        // square test
        assertEquals((Double) 16.0, tester.calculateMono(square, 4.0));
        assertEquals((Double) 4.0, tester.calculateMono(square, -2.0));
        assertEquals((Double) 0.0, tester.calculateMono(square, 0.0));
    }
    @Test
    public void testSquareRoot(){
        // squareRoot test
        Calculator tester = new Calculator();
        assertEquals((Double) 4.0, tester.calculateMono(squareRoot, 16.0));
        assertEquals((Double) NaN, tester.calculateMono(squareRoot, -2.0));
        assertEquals((Double) 0.0, tester.calculateMono(squareRoot, 0.0));
    }
    @Test
    public void testOneDevidedBy(){
        // oneDevidedBy test
        Calculator tester = new Calculator();
        assertEquals((Double) 0.2, tester.calculateMono(oneDevidedBy, 5.0));
        assertEquals((Double) Double.POSITIVE_INFINITY, tester.calculateMono(oneDevidedBy, 0.0));
        assertEquals((Double) (-5.0), tester.calculateMono(oneDevidedBy, -0.2));
    }
    @Test
    public void testCos(){
        // squareRoot test
        Calculator tester = new Calculator();
        assertEquals((Double) 1.0, tester.calculateMono(cos, 0.0));
        assertEquals((Double) (-1.0), tester.calculateMono(cos, Math.toRadians(180)));
    }
    @Test
    public void testSin(){
        // squareRoot test
        Calculator tester = new Calculator();
        assertEquals((Double) 1.0, tester.calculateMono(sin, Math.toRadians(90)));
        assertEquals((Double) 0.0, tester.calculateMono(sin, 0.0));
    }
    @Test
    public void testLog(){
        // squareRoot test
        Calculator tester = new Calculator();
        assertEquals((Double) Double.NEGATIVE_INFINITY, tester.calculateMono(log, 0.0));
        assertEquals((Double) NaN, tester.calculateMono(log, -2.0));
        assertEquals((Double) 3.0, tester.calculateMono(log, 1000.0));
    }
    @Test
    public void testRate(){
        // squareRoot test
        Calculator tester = new Calculator();
        assertEquals((Double) 0.16, tester.calculateMono(rate, 16.0));
        assertEquals((Double) (-0.02), tester.calculateMono(rate, -2.0));
        assertEquals((Double) 0.0, tester.calculateMono(rate, 0.0));
    }
}
