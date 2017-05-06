/**
 * Write a description of class NoSuchCarTypeException here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class NoSuchCarTypeException extends Exception
{
    private String key;
    public NoSuchCarTypeException(String key)
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
