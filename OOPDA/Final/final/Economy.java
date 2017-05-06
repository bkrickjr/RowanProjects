
/**
 * Write a description of class Economy here.
 * 
 *  abstract subclass Economy of Car has<br/>

–	an immutable mpg field of type int (must be positive)<br/>
–	an accessor method getMilesPerGallon<br/>
–	a method toString that returns the state of the object as a String<br/>
–	other methods and fields as needed<br/>

 * @author Brian Krick
 * @version (a version number or a date)
 */
abstract public class Economy extends Car 
{
    // instance variables - replace the example below with your own
    final private int mpg;

    /**
     * Constructor for objects of class Economy
     */
    public Economy(String serialnoIn, int mpgIn)
    throws NullStringException, EmptyStringException, BelowZeroException
    {
        super(serialnoIn);
        if (mpgIn > 0)
        {
            mpg = mpgIn;
        }
        else
        {
            throw new BelowZeroException("MPG cannot be 0 or lower!");
        }        
    }

    /** getMilesPerGallon - returns an int of miles per gallon
     * @return int - miles per gallon
     */
    public int getMilesPerGallon()
    {
        return mpg;
    }

    /** toString - returns a string representation of this instance
     * 
     * @return string - description of instance
     */
    public String toString()
    {
        return super.toString() + "MPG: " + mpg + ". ";
    }
}
