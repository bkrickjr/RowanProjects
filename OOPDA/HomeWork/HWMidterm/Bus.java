
/**
 * A subclass of vehicle, accepts a name and a number of wheels as an integer
 * 
 * @author Brian Krick 
 * @version 10/5 
 */
public class Bus extends Vehicle implements Powered
{
    private int HorsePower = 150;

    /**
     * Constructor for objects of class Bus
     */
    public Bus(String NameIn, int NOTIn)
    {
        super(NameIn, NOTIn);
    }

    /**
     * get method for the name of the Bus
     * @param - none
     * @return - String Bus
     */
    public String getName()
    {
        return Name;
    }
    
    /**
     * get method for the Number Of Tires of the Bus
     * @param - none
     * @return - int NumberOfTires
     */
    public int getNumberOfTires()
    {
        return NumberOfTires;
    }
    
    /**
     * get method for the Horse Power of the Bus
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
        return "Bus Named " + Name + " has " + NumberOfTires + " tires.";
    }
}
