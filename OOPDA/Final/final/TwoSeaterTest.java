

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TwoSeaterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TwoSeaterTest
{
    /**
     * Default constructor for test class TwoSeaterTest
     */
    public TwoSeaterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void TwoSeater_Constructor_SerialNumber()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            assertEquals(serialNumber2, twoSeater.getSerialNumber());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void TwoSeater_Constructor_SerialNumber_Null()
    {
        try {
            String serialNumber2 = null;
            int mpg = 123;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            fail("Should not allow a null serial number");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void TwoSeater_Constructor_SerialNumber_Empty()
    {
        try {
            String serialNumber2 = "";
            int mpg = 123;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            fail("Should not allow a empty serial number");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void TwoSeater_Constructor_MPG()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            assertEquals(mpg, twoSeater.getMilesPerGallon());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void TwoSeater_Constructor_MPG_Zero()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 0;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            fail("Should not allow a zero MPG");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void TwoSeater_Constructor_MPG_Negative()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = -1;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            fail("Should not allow a negative MPG");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void TwoSeater_toString()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            String s = twoSeater.toString();
            assertEquals("Two-seater: SN: a2 MPG: 123 Sportiness: 10.0", twoSeater.toString());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }

    @Test
    public void TwoSeater_getsetRented()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            twoSeater.setRented(true);
            assertEquals(true, twoSeater.getRented());
            twoSeater.setRented(false);
            assertEquals(false, twoSeater.getRented());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }

    @Test
    public void TwoSeater_sportiness()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            TwoSeater twoSeater = new TwoSeater(serialNumber2, mpg); 
            assertEquals(true, 10.0 == twoSeater.sportiness());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }

   
    }
