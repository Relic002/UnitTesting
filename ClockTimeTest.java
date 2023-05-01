
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
    public void checkTimes()
    {
        ClockTime clockTim1 = new ClockTime();
        ClockTime clockTim2 = new ClockTime(11, 11, 11);
        assertEquals(false, clockTim1.equals(clockTim2));
    }

    @Test
    public void getTime()
    {
        ClockTime clockTim1 = new ClockTime(10, 10, 10);
        assertEquals("10:10:10", clockTim1.toString());
        assertEquals("10:10:10 A.M.", clockTim1.toString12());
    }

    @Test
    public void getHourMinuteSecond()
    {
        ClockTime clockTim1 = new ClockTime(7, 8, 9);
        assertEquals(7, clockTim1.getHour());
        assertEquals(8, clockTim1.getMinute());
        assertEquals(9, clockTim1.getSecond());
    }

    @Test
    public void setHourMinuteSecond()
    {
        ClockTime clockTim1 = new ClockTime();
        clockTim1.setHour(1);
        clockTim1.setMinute(2);
        clockTim1.setSecond(3);
        assertEquals("01:02:03", clockTim1.toString());
    }
}



