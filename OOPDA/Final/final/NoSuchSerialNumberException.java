/**
 * Write a description of class NoSuchSerialNumberException here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class NoSuchSerialNumberException extends Exception
{
    private String key;
    public NoSuchSerialNumberException(String key)
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
