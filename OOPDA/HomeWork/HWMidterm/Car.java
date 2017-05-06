
/**
 * A subclass of vehicle, accepts a name and a number of wheels as an integer
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle implements Powered
{
    private int HorsePower = 100;

    /**
     * Constructor for objects of class Car
     */
    public Car(String NameIn, int NOTIn)
    {
        super(NameIn, NOTIn);
    }

    /**
     * get method for the name of the Car
     * @param - none
     * @return - String Name
     */
    public String getName()
    {
        return Name;
    }
    
    /**
     * get method for the Number of Tires of the Car
     * @param - none
     * @return - String NumberOfTires
     */
    public int getNumberOfTires()
    {
        return NumberOfTires;
    }
    
    /**
     * get method for the Horse Power of the Car
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
        return "Car Named " + Name + " has " + NumberOfTires + " tires.";
    }
}
