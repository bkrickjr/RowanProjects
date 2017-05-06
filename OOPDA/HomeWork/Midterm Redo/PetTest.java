

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * PetTest - unit test class to test Pet
 *
 * @author  Brian Krick
 * @version 10/15
 */
public class PetTest
{
    /**
     * Default constructor for test class PetTest
     */
    public PetTest()
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
    public void constructor()
    {
        Pet pet1 = new Pet(".",1 );
        assertEquals(".", pet1.getColor());
        assertEquals(1, pet1.getAge());
       
    }

    @Test
    public void getsetColor()
    {
        Pet pet1 = new Pet(".",1 );
        pet1.setColor("test");
        assertEquals("test", pet1.getColor());
    }
    
     @Test
    public void setColorNull()
    {
        Pet pet1 = new Pet(".",1 );
        pet1.setColor(null);
        assertEquals(".", pet1.getColor());
    }
    
    @Test
    public void setColorEmpty()
    {
        Pet human1 = new Pet(".",1 );
        human1.setColor("");
        assertEquals(".", human1.getColor());
    }
    
       
    @Test
    public void TesttoString()
    {
        Pet pet1 = new Pet("blue",1);
        assertEquals("Pet - Age: 1 Color: blue", pet1.toString());
    }

    

    @Test
    public void ConstructorEmptyColor()
    {
        Pet pet1 = new Pet("", 1);
        assertEquals(null, pet1.getColor());
    }

  @Test
    public void ConstructorBadAge()
    {
        Pet human1 = new Pet(".", -1);
        assertEquals(0, human1.getAge());
    }

 
}
