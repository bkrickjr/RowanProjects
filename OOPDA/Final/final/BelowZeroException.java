
/**
 * Write a description of class BelowZeroException here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class BelowZeroException extends Exception
{
    private String key;
    public BelowZeroException(String key)
    {
        this.key = key;
    }
    
    public String getKey()
    {
        return key;
    }

    public String toString()
    {
        return key;
    }
}
