
/**
 * Class to check inputs
 * 
 * @author Brian Krick 
 * @version 10/17
 */
public class Checking
{
    

    /**
     * Constructor for objects of class Checking
     */
    public Checking()
    {
        
    }

    /** 
     * check method returns true if String is not null
     * @param - String s
     * @return - boolean
     */
    public static boolean stringNotNull(String s)
    {
        if (s != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /** 
     * check method returns true if String is not empty
     * @param - String s
     * @return - boolean
     */
    public static boolean stringNotEmpty(String s)
    {
        if (s != "")
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * check method returns true if double is positive
     * @param - double d
     * @return - boolean
     */
    public static boolean isPositiveD(double d)
    {
        if (d > 0.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * check method returns true if integer is positive
     * @param - int i
     * @return - boolean
     */
    public static boolean isPositiveI(int i)
    {
        if (i > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
