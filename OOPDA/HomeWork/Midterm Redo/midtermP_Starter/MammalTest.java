

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MammalTest since Mamal is abstract, use MammalShell to test Mammal
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MammalTest
{
    public class MammalShell extends Mammal
    {
        MammalShell(int ageIn)
        {
            super(ageIn);
        }
    }
    /**
     * Default constructor for test class MammalTest
     */
    public MammalTest()
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
       MammalShell ms = new MammalShell(1 );
       assertEquals(1, ms.getAge());
       
    }

    @Test
    public void getsetAge()
    {
        MammalShell ms = new MammalShell(1 );
       ms.setAge(22);
        assertEquals(22, ms.getAge());
    }
    
       
     @Test
    public void setAgeNegative()
    {
        MammalShell ms = new MammalShell(1 );
       ms.setAge(-22);
        assertEquals(1, ms.getAge());
    }
    
       
     @Test
    public void setAgeZero()
    {
        MammalShell ms = new MammalShell(1 );
       ms.setAge(0);
        assertEquals(1, ms.getAge());
    }
    
       
    @Test
    public void TesttoString()
    {
        MammalShell ms = new MammalShell(1 );
       assertEquals("Mammal - Age: 1", ms.toString());
    }

   @Test
    public void ConstructorBadAge()
    {
        Human human1 = new Human(".", -1);
        assertEquals(0, human1.getAge());
    }

}
