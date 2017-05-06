

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EarthTest tests rge methods in Earth.
 *
 * @author  Brian Krick
 * @version 10/15
 */
public class EarthTest
{
    /**
     * Default constructor for test class EarthTest
     */
    public EarthTest()
    {
    }
    
    /**
     * Test addMammal adds a null Negative test
     */
    @Test
    public void ETestAddMammalNull()
    {
        Earth e = new Earth();
        e.addMammal(null);
        assertEquals(0, e.getMammals().size());
    }

    /**
     * Test addMammal adds human positive
     */
    @Test
    public void ETestAddMammalHPositive()
    {
        Earth e = new Earth();
        Human A = new Human(".", 2);
        e.addMammal(A);
        assertEquals(1, e.getMammals().size());
    }
    
    /**
     * Test addMammal adds pet positive
     */
    @Test
    public void ETestAddMammalPPositive()
    {
        Earth e = new Earth();
        Pet A = new Pet("Red", 1);
        e.addMammal(A);
        assertEquals(1, e.getMammals().size());
    }
    
    /**
     * Test addMammal multiple
     */
    @Test
    public void ETestAddMammalMultiple()
    {
        Earth e = new Earth();
        Pet A = new Pet("Red", 1);
        Human B = new Human(".", 2);
        Pet C = new Pet("Black", 3);
        e.addMammal(A);
        e.addMammal(B);
        e.addMammal(C);
        assertEquals(3, e.getMammals().size());
    }
    
    /**
     * Test getHumans
     */
    @Test
    public void ETestGetHumans()
    {
        Earth e = new Earth();
        Human A = new Human(".", 1);
        Human B = new Human(".", 2);
        Pet C = new Pet ("BLACK", 3);
        e.addMammal(A);
        e.addMammal(B);
        e.addMammal(C);
        assertEquals(2, e.getHumans().size());
    }
    
    /**
     * Test getHumans multiple times
     */
    @Test
    public void ETestGetHumansMultiple()
    {
        Earth e = new Earth();
        Human A = new Human(".", 1);
        Human B = new Human(".", 2);
        Pet C = new Pet ("BLACK", 3);
        e.addMammal(A);
        e.addMammal(B);
        e.addMammal(C);
        e.getHumans();
        assertEquals(2, e.getHumans().size());
    }
    
    /**
     * Test getHumanNames, nothing added to earth
     */
    @Test
    public void ETestGetHumanNamesNothingAdded()
    {
        Earth e = new Earth();
        Human A = new Human(".", 1);
        assertEquals(0, e.getHumanNames().size());
    }
    
    /**
     * Test getHumanNames, only pets added to earth
     */
    @Test
    public void ETestGetHumanNamesPetOnly()
    {
        Earth e = new Earth();
        Pet A = new Pet("RED", 1);
        Pet B = new Pet("BLUE", 1);
        e.addMammal(A);
        e.addMammal(B);
        assertEquals(0, e.getHumanNames().size());
    }
    
    /**
     * Test getHumanNames, people added
     */
    @Test
    public void ETestGetHumanNames()
    {
        Earth e = new Earth();
        Human A = new Human("RED", 1);
        Human B = new Human("BLUE", 1);
        e.addMammal(A);
        e.addMammal(B);
        assertEquals(2, e.getHumanNames().size());
    }
    
    /**
     * Test getHumanNames, both pets and humans added to earth
     */
    @Test
    public void ETestGetHumanNamesAddedBoth()
    {
        Earth e = new Earth();
        Pet A = new Pet("RED", 1);
        Pet B = new Pet("BLUE", 1);
        Human C = new Human(".", 2);
        Human D = new Human(".", 3);
        e.addMammal(A);
        e.addMammal(B);
        e.addMammal(C);
        e.addMammal(D);
        assertEquals(2, e.getHumanNames().size());
    }
    
    /**
     * Test getOwnedPets for one owner and one pet
     */
    @Test
    public void ETestGetOwnedPets()
    {
        Earth e = new Earth();
        Human A = new Human(".", 1);
        Pet C = new Pet ("BLACK", 3);
        e.addMammal(A);
        A.addPet(C);
        assertEquals(1, e.getOwnedPets().size());
    }
    
    /**
     * Test getOwnedPets for multiple owners and one pet
     */
    @Test
    public void ETestGetOwnedPetsMultiOwner()
    {
        Earth e = new Earth();
        Human A = new Human(".", 1);
        Human B = new Human(".", 2);
        Pet C = new Pet ("BLACK", 3);
        e.addMammal(A);
        e.addMammal(B);
        A.addPet(C);
        B.addPet(C);
        assertEquals(1, e.getOwnedPets().size());
    }
    
    /**
     * Test getOwnedPets for multiple owners and one pet and pets not owned
     */
    @Test
    public void ETestGetOwnedPetsMultiOwnerAndNotOwned()
    {
        Earth e = new Earth();
        Human A = new Human(".", 1);
        Human B = new Human(".", 2);
        Pet C = new Pet ("BLACK", 3);
        Pet D = new Pet ("RED", 2);
        e.addMammal(A);
        e.addMammal(B);
        A.addPet(C);
        B.addPet(C);
        assertEquals(1, e.getOwnedPets().size());
    }
    
}
