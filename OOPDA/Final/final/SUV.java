
/**  ******************************
 * Write a description of class SUV here.
 * 
concrete subclass SUV of Car has

–	implements the Sporty interface with a method sportiness that returns five (5.0)
–	a method toString that returns the state of the object as a String
–	other methods and fields as needed

 * @author Brian Krick 
 * @version 
 */
public class SUV extends Car implements Sporty
{
    public SUV(String serialnoIn)
    throws NullStringException, EmptyStringException
    {
        super(serialnoIn);
    }

    /** ******************************
     * sportiness - 
     * @return 
     */
    public double sportiness()
    {
        return 5.0;
    }

    /** toString - returns a string representation of this instance
     * 
     * @return string - description of instance
     */
    public String toString()
    {
        return "SUV: SN: " + getSerialNumber() + " Sportiness: " + sportiness();
    }

}
