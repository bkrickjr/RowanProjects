
/**
 * Write a description of class RoundRobin here.
 * 
 * @author Brian Krick
 * @version 
 */
public class RoundRobin
{    
    private int quantom = 1;
    Process Active = null; 
    Queue Q = new Queue();
    
    /**
     * Constructor for objects of class RoundRobin
     */
    public RoundRobin(int NumOfProcesses)
    {
        for (int i = NumOfProcesses; i > 0; i--)
        {
            Process p = new Process(i);
            Q.enqueue(p);
            Active = p;
        }  
        
        while (Q.isEmpty())
        {
            Active.Decrement(quantom);
            System.out.println(Active.toString());
            if (Active.getTTF() != 0)
            {
                Q.enqueue(Active);
                Q.dequeue();
            }
            else
            {
                Q.dequeue();               
            }            
        }        
    }

    
}
