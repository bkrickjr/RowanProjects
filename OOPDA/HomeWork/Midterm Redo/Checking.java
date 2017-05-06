
/**
 * Write a description of class Checking here.
 * 
 * @author Brian Krick
 * @version 10/15
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
     * check method that returns true if the int is greater than 0
     * @param - int i
     * @return - boolean
     */
    public static boolean isAboveZero(int i)
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
    
    /**
     * check method that returns true if the pet is not null
     * @param - Pet p
     * @return - boolean
     */
    public static boolean mammalIsNotNull(Mammal m)
    {
        if (m != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    /**
     * check method that returns true if the String is not null
     * @param - String s
     * @return - boolean
     */
    public static boolean isNotNull(String s)
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
     * check method that returns true if the String is not empty
     * @param - String s
     * @return - boolean
     */
    public static boolean isNotEmpty(String s)
    {
        if (!s.equals(" ") && !s.equals("")) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
