/**
 * Write a description of class DuplicateSerialNumberException here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class DuplicateSerialNumberException extends Exception
{
    private String key;
    public DuplicateSerialNumberException(String key)
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
