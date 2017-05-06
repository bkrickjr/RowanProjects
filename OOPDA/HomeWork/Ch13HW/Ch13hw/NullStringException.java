
/**
 * Write a description of class NullStringException here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class NullStringException extends Exception
{
    private String key;
    public NullStringException(String key)
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
