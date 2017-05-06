package midtermP_Starter;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * HumanTest - unit test class to test Human
 *
 * @author  Saad Sohail
 * @version 10/16/2014
 */
public class HumanTest
{
    /**
     * Default constructor for test class TestChild
     */
    public HumanTest()
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
        Human human1 = new Human(".",1 );
        assertEquals(".", human1.getName());
        assertEquals(1, human1.getAge());
       
    }

    @Test
    public void getsetName()
    {
        Human human1 = new Human(".",1 );
        human1.setName("test");
        assertEquals("test", human1.getName());
    }
    
     @Test
    public void setNameNull()
    {
        Human human1 = new Human(".",1 );
        human1.setName(null);
        assertEquals(".", human1.getName());
    }
    
    @Test
    public void setNameEmpty()
    {
        Human human1 = new Human(".",1 );
        human1.setName("");
        assertEquals(".", human1.getName());
    }
    
    @Test
    public void addgetPets()
    {
        Human human1 = new Human(".",1 );
        Pet p1 = new Pet("h",2);
        human1.addPet(p1);
        assertEquals(1, human1.getPets().size());
        assertEquals(p1, human1.getPets().get(0));
    }
    
    @Test
    public void TesttoString()
    {
        Human human1 = new Human(".",1);
        assertEquals("Human - Name: . Age: 1 owns 0 pets", human1.toString());
    }

    

    @Test
    public void ConstructorEmptyName()
    {
        Human human1 = new Human("", 1);
        assertEquals(null, human1.getName());
    }

  @Test
    public void ConstructorBadAge()
    {
        Human human1 = new Human(".", -1);
        assertEquals(0, human1.getAge());
    }

 
}


