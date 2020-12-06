package simplejavacalculator;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;
import static simplejavacalculator.Calculator.BiOperatorModes.*;
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
    public void testTan(){
        // squareRoot test
        Calculator tester = new Calculator();
        Double val = Math.round( tester.calculateMono(tan, Math.toRadians(45)) * 100.0) / 100.0;
        assertEquals((Double) 1.0, val);
        assertEquals((Double) 0.0, tester.calculateMono(tan, 0.0));
        assertEquals((Double) NaN, tester.calculateMono(tan, 90.0));
    }
    @Test
    public void testAbs(){
        // squareRoot test
        Calculator tester = new Calculator();
        assertEquals((Double) 5.0, tester.calculateMono(abs, -5.0));
    }

    @Test
    public void testRate(){
        // squareRoot test
        Calculator tester = new Calculator();
        assertEquals((Double) 0.16, tester.calculateMono(rate, 16.0));
        assertEquals((Double) (-0.02), tester.calculateMono(rate, -2.0));
        assertEquals((Double) 0.0, tester.calculateMono(rate, 0.0));
    }

    // normal, add, minus, multiply, divide , xpowerofy
    @Test
    public void testNorm(){
        // squareRoot test
        Calculator tester = new Calculator();
        tester.reset();
        Double temp = tester.calculateBi(normal, 1.0);
        assertEquals((Double) NaN, tester.calculateBi(normal, 2.0));
    }
    @Test
    public void testReset(){
        // squareRoot test
        Calculator tester = new Calculator();
        assertEquals((Double) NaN, tester.reset());
    }
    @Test
    public void testAdd(){
        // squareRoot test
        Calculator tester = new Calculator();
        tester.reset();
        Double temp = tester.calculateBi(add, 1.0);
        assertEquals((Double) 3.0, tester.calculateBi(add, 2.0));
    }
    @Test
    public void testMinus(){
        // squareRoot test
        Calculator tester = new Calculator();
        tester.reset();
        Double temp = tester.calculateBi(minus, 10.0);
        assertEquals((Double) 8.0, tester.calculateBi(minus, 2.0));
        assertEquals((Double) 10.0, tester.calculateBi(minus, -2.0));
    }
    @Test
    public void testMultiply(){
        // squareRoot test
        Calculator tester = new Calculator();
        tester.reset();
        Double temp = tester.calculateBi(multiply, 5.0);
        assertEquals((Double) 10.0, tester.calculateBi(multiply, 2.0));
        assertEquals((Double) (-20.0), tester.calculateBi(multiply, -2.0));
    }
    @Test
    public void testDivide(){
        // squareRoot test
        Calculator tester = new Calculator();
        tester.reset();
        Double temp = tester.calculateBi(divide, 10.0);
        assertEquals((Double) 5.0, tester.calculateBi(divide, 2.0));
        assertEquals((Double) Double.POSITIVE_INFINITY, tester.calculateBi(divide, 0.0));
    }
    @Test
    public void testXPowerOfY(){
        // squareRoot test
        Calculator tester = new Calculator();
        tester.reset();
        tester.calculateBi(xpowerofy, 2.0);
        assertEquals((Double) 4.0, tester.calculateBi(xpowerofy, 2.0));
        assertEquals((Double) 1.0, tester.calculateBi(xpowerofy, 0.0));
    }
    @Test
    public void testEqual(){
        // squareRoot test
        Calculator tester = new Calculator();
        tester.reset();
        assertEquals((Double) NaN, tester.calculateEqual(2.0));
    }



}
