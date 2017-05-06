import java.util.*;
/**
 * The Human class, which is a subclass of Mammal, and has an age, a name, and can have pets.
 * 
 * @author Brian Krick 
 * @version 10/15
 */
public class Human extends Mammal
{
    String Name;
    int PetCount;
    ArrayList <Pet> PetList = new ArrayList<Pet>();
    
    /**
     * Constructor for objects of class Human, takes int age(must be positive), and a string name(cant be empty)
     */
    public Human(String NameIn, int ageIn)
    {
        super(ageIn);
        setName(NameIn);
    }

 
   /**
     * getName - returns the name of the Human
     * @param - none
     * @return - the name of the Human
     */
    public String getName()
    {
        return Name;
    }
    
   /**
     * setName - used to set the name of the Human
     *           (must not be null or empty)
     * @param   
     */
    public void setName(String NameIn)
    {
        if (Checking.isNotNull(NameIn) && Checking.isNotEmpty(NameIn))
        {
            Name = NameIn;
        }
        else
        {
            System.out.println("Cannot be a null or empty name!");
        }
    }
    
   /**
     * addPet - This method will add a Pet object to the list of Pets
     *       (the pet added must not be null)
     * @param - Pet p
     * @return - void
     */
    public void addPet(Pet p)
    {
        if (Checking.mammalIsNotNull(p))
        {
            PetList.add(p);
            PetCount++;
        }
        else
        {
            System.out.println("Cannot add a null pet!");
        }
    }
    
   /**
     * getPets - This method will return a list of pets "owned" by the Human
     * 
     * @return a list of pets "owned" by the Human
     */
    public ArrayList getPets()
    {
        return PetList;
    }
    
   /**
     * toString - Returns the state of the object as a String.
     * 
     * @return - String representation of this object
     */
    public String toString()
    {
        return "Human - Name: " + Name + " Age: " + this.getAge() + " owns " + PetCount + " pets";
    }
}
