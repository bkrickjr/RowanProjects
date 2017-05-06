/**
 * Write a description of class NullCarException here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class NullCarException extends Exception
{
    private String key;
    public NullCarException(String key)
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
