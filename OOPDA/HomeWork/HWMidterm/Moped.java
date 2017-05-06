
/**
 * A subclass of vehicle, accepts a name and a number of wheels as an integer
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moped extends Vehicle implements Powered
{
    private int HorsePower = 15;
    
    /**
     * Constructor for objects of class Moped
     */
    public Moped(String NameIn, int NOTIn)
    {
        super(NameIn, NOTIn);
    }

    /**
     * get method for the name of the Moped
     * @param - none
     * @return - String Name
     */
    public String getName()
    {
        return Name;
    }
    
    /**
     * get method for the Number of Tires of the Moped
     * @param - none
     * @return - int NumberOfTires
     */
    public int getNumberOfTires()
    {
        return NumberOfTires;
    }
    
    /**
     * get method for the Horse Power of the Moped
     * @param - none
     * @return - int HorsePower
     */
    public int getHorsePower()
    {
        return HorsePower;
    }
    
        
    /**
     * toString 
     * @param - none
     * @return - string representation of this object
     */
    public String toString()
    {
        return "Moped Named " + Name + " has " + NumberOfTires + " tires.";
    }
}
