
/**
 * Write a description of class Vehicle here.
 * 
 * @author Brian Krick
 * @version 10/5
 */
abstract public class Vehicle
{
    protected String Name;
    protected int NumberOfTires;
    
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(String NameIn, int NOTIn)
    {
        setName(NameIn);
        setNOT(NOTIn);
    }
    
    /**
     * set name method
     * @param - String NameIn
     * @return - void
     */
    public void setName(String NameIn)
    {
        if (NameIn == null)
        {
            System.out.println("cannot have a null name, please reset it!");
        }
        else
        {
            Name = NameIn;
        }
    }

    /**
     * abstract get method for the name
     * @param - none
     * @return - String Name of vehicle
     */
    abstract public String getName();
    
    /**
     * set method for NumberOfTires
     * @param - int NOTIn
     * @return - void
     */
    public void setNOT(int NOTIn)
    {
        if(NOTIn >= 0)
        {
            NumberOfTires = NOTIn;
        }
        else
        {
            System.out.println("cannot have negative number of tires, please reset it!");
        }
    }
    
    /**
     * abstract get method for the number of tires on the vehicle
     * @param - none
     * @return - int number of tires
     */
    abstract public int getNumberOfTires();
    
    /**
     * toString 
     * @param - none
     * @return - string representation of this object
     */
    public String toString()
    {
        return "Vehicle Named: " + Name + " has " + NumberOfTires + " tires.";
    }
}
