

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class clocktimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class clocktimeTest
{
    /**
     * Default constructor for test class clocktimeTest
     */
    public clocktimeTest()
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
    public void equalsTest()
    {
        ClockTime clockTim1 = new ClockTime(11, 01, 01);
        ClockTime clockTim2 = new ClockTime(11, 01, 01);
        assertEquals(true, clockTim2.equals(clockTim1));
    }

    @Test
    public void minuteTest()
    {
        ClockTime clockTim1 = new ClockTime();
        clockTim1.setMinute(11);
        assertEquals(11, clockTim1.getMinute());
    }

    @Test
    public void hourtest()
    {
        ClockTime clockTim1 = new ClockTime();
        clockTim1.setHour(10);
        assertEquals(10, clockTim1.getHour());
    }

    @Test
    public void secondsTest()
    {
        ClockTime clockTim2 = new ClockTime();
        clockTim2.setSecond(12);
        assertEquals(12, clockTim2.getSecond());
    }
}




