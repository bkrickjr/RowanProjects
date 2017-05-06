

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CarRentalAgencyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CarRentalAgencyTest
{
    /**
     * Default constructor for test class CarRentalAgencyTest
     */
    public CarRentalAgencyTest()
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
    public void TestAddCarPos()
    {
        try {
            CarRentalAgency C = new CarRentalAgency();
            PlugIn P = new PlugIn("A2", 15);
            C.addCar(P);
            assertEquals(1, C.getCars().size());
        }
        catch(Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void TestAddCarDupSerial()
    {
        try {
            CarRentalAgency C = new CarRentalAgency();
            PlugIn P = new PlugIn("A2", 15);
            PlugIn P2 = new PlugIn("A2", 20);
            C.addCar(P);
            C.addCar(P2);
            fail("Should not be an exception");
        }
        catch(Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void TestAddNullCar()
    {
        try {
            CarRentalAgency C = new CarRentalAgency();
            C.addCar(null);
            fail("Should not allow null car to add");
        }
        catch (Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void TestGetSportyCars()
    {
        try {
            CarRentalAgency C = new CarRentalAgency();
            PlugIn P = new PlugIn("A2", 15);
            SUV S = new SUV("B1");
            C.addCar(S);
            C.addCar(P);
            assertEquals(1, C.getSportyCars().size());
        }
        catch (Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void TestAvgMPG()
    {
        try {
            CarRentalAgency C = new CarRentalAgency();
            PlugIn P = new PlugIn("A2", 15);
            PlugIn P2 = new PlugIn("B1", 15);
            C.addCar(P2);
            C.addCar(P);
            assertEquals(true, 15.0 == C.getAvgMPG());
        }
        catch (Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void TestGetCars()
    {
        try {
            CarRentalAgency C = new CarRentalAgency();
            PlugIn P = new PlugIn("A2", 15);
            PlugIn P2 = new PlugIn("B1", 15);
            SUV S = new SUV("C3");
            C.addCar(P2);
            C.addCar(P);
            C.addCar(S);
            assertEquals(1, C.getCars("SUV").size());
        }
        catch (Exception ex)
        {
            fail("Should not be an exception");
        }
    }
    
    @Test
    public void TestGetCarsBad()
    {
        try {
            CarRentalAgency C = new CarRentalAgency();
            PlugIn P = new PlugIn("A2", 15);
            PlugIn P2 = new PlugIn("B1", 15);
            SUV S = new SUV("C3");
            C.addCar(P2);
            C.addCar(P);
            C.addCar(S);
            C.getCars("X").size();
        }
        catch (Exception ex)
        {
            assertEquals(true, true);
        }
    }
    
    @Test
    public void TestGetAvailableCars()
    {
        try {
            CarRentalAgency C = new CarRentalAgency();
            PlugIn P = new PlugIn("A2", 15);
            PlugIn P2 = new PlugIn("B1", 15);
            SUV S = new SUV("C3");
            C.addCar(P2);
            C.addCar(P);
            C.addCar(S);
            C.rentCar("SUV");
            assertEquals(0, C.getAvailableCars("SUV").size());
        }
        catch (Exception ex)
        {
            fail("Should not be an exception");
        }
    }
}
