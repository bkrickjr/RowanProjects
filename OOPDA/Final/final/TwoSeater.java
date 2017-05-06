/**  ******************************
 * Write a description of class PlugIn here.
 * 
concrete subclass TwoSeater of Economy has

–   implements the Sporty interface with a method sportiness that returns ten (10.0)
–   a method toString that returns the state of the object as a String
–   other methods and fields as needed

 * @author Brian Krick 
 * @version 
 */
public class TwoSeater extends Economy implements Sporty
{

    /**  ******************************
     * Constructor for objects of class PlugIn
     */
    public TwoSeater(String serialnoIn, int mpgIn)
    throws NullStringException, EmptyStringException, BelowZeroException
    {
        super(serialnoIn, mpgIn);
    }

    /** ******************************
     * sportiness - 
     * @return 
     */
    public double sportiness()
    {
        return 10.0;
    }

    /** toString - returns a string representation of this instance
     * 
     * @return string - description of instance
     */
    public String toString()
    {
        return "Two-seater: SN: " + getSerialNumber() + " MPG: " + getMilesPerGallon() + 
                " Sportiness: " + sportiness();
    }

}
