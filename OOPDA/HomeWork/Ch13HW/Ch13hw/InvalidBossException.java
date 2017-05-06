
/**
 * Write a description of class InvalidBossException here.
 * 
 * @author Brian Krick
 * @version 
 */
public class InvalidBossException extends Exception
{
    private String key;
    public InvalidBossException(String key)
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
