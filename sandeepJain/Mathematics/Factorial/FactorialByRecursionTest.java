
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialByRecursionTest {
    @Test
    public void testFactorialValue() {
        assertEquals(120, FactorialByRecursion.factorialValue(5));
        assertEquals(120*6, FactorialByRecursion.factorialValue(6));
        assertEquals(120*6*7, FactorialByRecursion.factorialValue(7));
        assertEquals(120*6*7*8,FactorialByRecursion.factorialValue(8));
    }
}
