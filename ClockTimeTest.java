

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClockTimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClockTimeTest
{
    private ClockTime clockTim1;
    private ClockTime clockTim2;

    /**
     * Default constructor for test class ClockTimeTest
     */
    public ClockTimeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clockTim1 = new ClockTime();
        clockTim2 = new ClockTime();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void allMethods()
    {
        ClockTime clockTim2 = new ClockTime();
        ClockTime clockTim3 = new ClockTime(1, 2, 3);
        assertEquals(1, clockTim3.getHour());
        assertEquals(2, clockTim3.getMinute());
        assertEquals(3, clockTim3.getSecond());
        assertEquals("01:02:03", clockTim3.toString());
        assertEquals("01:02:03 A.M.", clockTim3.toString12());
        assertEquals(false, clockTim3.equals(clockTim2));
        clockTim2.setHour(1);
        clockTim2.setMinute(2);
        clockTim2.setSecond(3);
        assertEquals(true, clockTim3.equals(clockTim2));
    }

    @Test
    public void fixture()
    {
        assertEquals(true, clockTim1.equals(clockTim2));
    }

    @Test
    public void elevenAM()
    {
        clockTim1.setHour(11);
        assertEquals("11:00:00", clockTim1.toString());
    }
}



