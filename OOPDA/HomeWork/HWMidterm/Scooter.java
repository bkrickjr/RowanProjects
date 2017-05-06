
/**
 * A subclass of vehicle, accepts a name and a number of wheels as an integer
 * 
 * @author Brian Krick 
 * @version 10/5
 */
public class Scooter extends Vehicle
{
    /**
     * Constructor for objects of class Scooter
     */
    public Scooter(String NameIn, int NOTIn)
    {
        super(NameIn, NOTIn);
    }

    /**
     * get method for the name of the Scooter
     * @param - none
     * @return - String Name
     */
    public String getName()
    {
        return Name;
    }
    
    /**
     * get method for the Number of Tires of the Scooter
     * @param - none
     * @return - int NumberOfTires 
     */
    public int getNumberOfTires()
    {
        return NumberOfTires;
    }
    
    
    
    /**
     * toString 
     * @param - none
     * @return - string representation of this object
     */
    public String toString()
    {
        return "Scooter Named " + Name + " has " + NumberOfTires + " tires.";
    }
}
