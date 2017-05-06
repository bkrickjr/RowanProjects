
/**
 * Abstract class Mammal - A mammal that has an age. Used as a super class for human and pet
 * 
 * @author Brian Krick 
 * @version 10/15
 */
abstract public class Mammal
{
    private int age;
    
    /**
     * Constructor for objects of class Mammal, takes an int age
     */
    public Mammal(int ageIn)
    {
        setAge(ageIn);
    }

    /**
     * getAge - returns the age of the Mammal
     * 
     * @param - none
     * @return - the age of the Mammal
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * setAge - allows the age of the Mammal to be set
     *          (must be positive)
     * @param - ageIn from constructor
     * @return - void
     */
    public void setAge(int ageIn)
    {
        if (Checking.isAboveZero(ageIn))
        {
            age = ageIn;
        }
        else
        {
            System.out.println("Age cannot be 0 or below");
            
        }
    }
    
    /**
     * Returns the state of the object as a String
     * 
     * @return - String representation of this object 
     */
    public String toString()
    {
        return "Mammal - Age: " + age;
    }
}
