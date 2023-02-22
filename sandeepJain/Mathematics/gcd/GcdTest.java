import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class GcdTest {
    @Test
    void testGetGcdValue() {
        assertEquals(10, Gcd.getGcdValue(10,20));
        assertEquals(2, Gcd.getGcdValue(2,4));
        assertEquals( 1, Gcd.getGcdValue(1,5));
        assertEquals(3, Gcd.getGcdValue(3,6));
        assertEquals(3, Gcd.getGcdValue(3,12));
    }
}
