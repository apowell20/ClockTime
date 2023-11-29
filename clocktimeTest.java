

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
    private ClockTime clockTim1;
    private ClockTime clockTim2;

    
    

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
        clockTim1 = new ClockTime(11, 00, 00);
        clockTim2 = new ClockTime(11, 00, 00);
        clockTim1.setHour(11);
        clockTim1.setMinute(00);
        clockTim1.setSecond(00);
        clockTim2.setHour(11);
        clockTim2.setMinute(00);
        clockTim2.getSecond();
        clockTim2.setSecond(00);
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

    @Test
    public void timeEqualTest()
    {
        assertEquals(11, clockTim1.getHour());
        assertEquals(00, clockTim1.getMinute());
        assertEquals(00, clockTim1.getSecond());
        assertEquals(11, clockTim2.getHour());
        assertEquals(00, clockTim2.getMinute());
        assertEquals(00, clockTim2.getSecond());
        assertEquals(true, clockTim2.equals(clockTim1));
    }
}





