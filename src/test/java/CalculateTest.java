import junit.framework.TestCase;

/**
 * Created by dima on 25.07.2017.
 */
public class CalculateTest extends TestCase {

    public void testCalc() throws Exception {
        Calculate calculate=new Calculate();
        assertEquals(4,calculate.calc(3,1));
        assertEquals(44,calculate.calc(22,22));
        assertEquals(0,calculate.calc(-3,3));
        assertEquals(1000,calculate.calc(500,500));
        assertEquals(-1,calculate.calc(0,-1));
        assertEquals(0,calculate.calc(0,0));

    }
}