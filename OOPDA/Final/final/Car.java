
/** ******************************
 * Abstract class Car - write a description of the class here
 * <p>
 * abstract Car class has:<br />
<br />
–	an immutable (final) serialno field of type String (must not be null or empty)<br />
–	an accessor method getSerialNumber<br />
–	a method toString that returns the state of the object as a String<br />
–	other methods and fields as needed<br />

 * @author Brian Krick
 * @version 12/15/10
 */
abstract public class Car
{
    final protected String serialno;
    protected boolean rented;

    /**  ******************************
     * Car Constructor
	 
	 * @param String serialnoIn
     */
    public Car(String serialnoIn)
    throws NullStringException, EmptyStringException
    {
        if (serialnoIn == null)
        {
            throw new NullStringException("Serial Number Cannot Be Null");
        }
        else if (serialnoIn == "")
        {
            throw new EmptyStringException("Serial Number Cannot Be Empty");
        }
        else
        {
            serialno = serialnoIn;
        }
    }

    /** getSerialNumber - returns serial number as a string
     * 
     * @return string serial number
     */
    public String getSerialNumber()
    {
        return serialno;
    }
    
    public void setRented(boolean R)
    {
        rented = R;
    }
    
    public boolean getRented()
    {
        return rented;
    }
    
    /** toString - returns a string representation of this instance
     * 
     * @return string - description of instance
     */
    public String toString()
    {
        return "Serial Number: " + serialno + ". ";
    }    
}
