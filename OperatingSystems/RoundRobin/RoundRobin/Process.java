import java.util.Random;

/**
 * This object represents a process that will hold onto the CPU for a set amount of time while timeToFinish > 0
 * 
 * @author Brian Krick 
 * @version 
 */
public class Process
{
    private int timeToFinish, Name;
    /**
     * Constructor for objects of class Process
     */
    public Process(int NameIn)
    {
        setName(NameIn);
        Random r = new Random();
        timeToFinish = r.nextInt(11) + 1;
    }
    
    public void setName(int NameIn)
    {
        Name = NameIn;
    }
    
    public int getTTF()
    {
        return timeToFinish;
    }

    public void Decrement(int quantom)
    {
        timeToFinish -= quantom;
    }
    
    public String toString()
    {
        return "Process " + Name + " has " + timeToFinish + " quantoms left.";
    }
}
