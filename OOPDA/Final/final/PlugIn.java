
/**
 * Write a description of class PlugIn here.
 * 
    concrete subclass PlugIn of Economy has

–	a method toString that returns the state of the object as a String
–	other methods and fields as needed

 * @author Brian Krick
 * @version 
 */
public class PlugIn extends Economy
{    
    /**   ******************************
     * Constructor for objects of class PlugIn
     */
    public PlugIn(String serialnoIn, int mpgIn)
    throws NullStringException, EmptyStringException, BelowZeroException
    {
        super(serialnoIn, mpgIn);
    }

    /** toString - returns a string representation of this instance
     * 
     * @return string - description of instance
     */
    public String toString()
    {
        return "Plug-in: SN: " + getSerialNumber() + " MPG: " + getMilesPerGallon();
    }
    

}
