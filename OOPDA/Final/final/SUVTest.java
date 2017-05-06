

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SUVTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SUVTest
{
    /**
     * Default constructor for test class SUVTest
     */
    public SUVTest()
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
    public void SUV_Constructor_SerialNumber()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            SUV suv = new SUV(serialNumber2); 
            assertEquals(serialNumber2, suv.getSerialNumber());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void SUV_Constructor_SerialNumber_Null()
    {
        try {
            String serialNumber2 = null;
            int mpg = 123;
            SUV suv = new SUV(serialNumber2); 
            fail("Should not allow a null serial number");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void SUV_Constructor_SerialNumber_Empty()
    {
        try {
            String serialNumber2 = "";
            int mpg = 123;
            SUV suv = new SUV(serialNumber2); 
            fail("Should not allow a empty serial number");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void SUV_toString()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            SUV suv = new SUV(serialNumber2); 
            String s = suv.toString();
            assertEquals("SUV: SN: a2 Sportiness: 5.0", suv.toString());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }

    @Test
    public void SUV_getsetRented()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            SUV suv = new SUV(serialNumber2); 
            suv.setRented(true);
            assertEquals(true, suv.getRented());
            suv.setRented(false);
            assertEquals(false, suv.getRented());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }

    @Test
    public void SUV_sportiness()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            SUV suv = new SUV(serialNumber2); 
            assertEquals(true, 5.0 == suv.sportiness());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }

   
    }
