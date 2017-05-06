
/**
 * Write a description of class EmptyStringException here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class EmptyStringException extends Exception
{
    private String key;
    public EmptyStringException(String key)
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
