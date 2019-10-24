import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FuncMathTest extends Assert {
    private FuncMath math;

    @Before
    public void init() {
        math = new FuncMath();
    }

    @After
    public void tearDown() {
        math = null;
    }

    @Test
    public void testCalls() {
        assertEquals("math.getCalls() != 0", 0, math.getCalls());

        math.factorial(1);
        assertEquals(1, math.getCalls());

        math.factorial(1);
        assertEquals(2, math.getCalls());
    }

    @Test
    public void testFactorial() {
        assertTrue(math.factorial(0) == 1);
        assertTrue(math.factorial(1) == 1);
        assertTrue(math.factorial(5) == 120);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        math.factorial(-1);
    }

    @Test
    public void todo() {
        assertTrue(math.plus(1,2) == 3);
    }
}
