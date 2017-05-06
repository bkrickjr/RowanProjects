/**
 * Write a description of class NoSuchRentedCarException here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class NoSuchRentedCarException extends Exception
{
    private String key;
    public NoSuchRentedCarException(String key)
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
