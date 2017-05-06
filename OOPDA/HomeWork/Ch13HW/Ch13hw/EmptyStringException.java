
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
        super(key);
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
    
    public EmptyStringException(Throwable cause)
    {
        super(cause);
    }
}
