

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PlugInTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PlugInTest
{
    /**
     * Default constructor for test class PlugInTest
     */
    public PlugInTest()
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
    public void PlugIn_Constructor_SerialNumber()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            PlugIn plugIn = new PlugIn(serialNumber2, mpg); 
            assertEquals(serialNumber2, plugIn.getSerialNumber());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void PlugIn_Constructor_SerialNumber_Null()
    {
        try {
            String serialNumber2 = null;
            int mpg = 123;
            PlugIn plugIn = new PlugIn(serialNumber2, mpg); 
            fail("Should not allow a null serial number");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void PlugIn_Constructor_SerialNumber_Empty()
    {
        try {
            String serialNumber2 = "";
            int mpg = 123;
            PlugIn plugIn = new PlugIn(serialNumber2, mpg); 
            fail("Should not allow a empty serial number");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void PlugIn_Constructor_MPG()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            PlugIn plugIn = new PlugIn(serialNumber2, mpg); 
            assertEquals(mpg, plugIn.getMilesPerGallon());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void PlugIn_Constructor_MPG_Zero()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 0;
            PlugIn plugIn = new PlugIn(serialNumber2, mpg); 
            fail("Should not allow a zero MPG");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void PlugIn_Constructor_MPG_Negative()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = -1;
            PlugIn plugIn = new PlugIn(serialNumber2, mpg); 
            fail("Should not allow a negative MPG");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void PlugIn_toString()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            PlugIn plugIn = new PlugIn(serialNumber2, mpg); 
            assertEquals("Plug-in: SN: a2 MPG: 123", plugIn.toString());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }

    @Test
    public void PlugIn_getsetRented()
    {
        try {
            String serialNumber2 = "a2";
            int mpg = 123;
            PlugIn plugIn = new PlugIn(serialNumber2, mpg); 
            plugIn.setRented(true);
            assertEquals(true, plugIn.getRented());
            plugIn.setRented(false);
            assertEquals(false, plugIn.getRented());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }

   
    }
