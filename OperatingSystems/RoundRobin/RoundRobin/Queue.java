
/**
 * Write a description of class Queue here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class Queue
{
    
    class QueueNode
    {
        Process key;
        QueueNode next = null;
        
        public QueueNode(Process p, QueueNode n)
        {
            key = p;
            next = n;
        }
        
        public QueueNode(Process p)
        {
            key = p;
        }
        
        public Process getP()
        {
            return key;
        }
    }
    
    public QueueNode tail = null, head = null;

    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {
        
    }
    
    public boolean isEmpty()
    {
        return tail == null && head == null;
    }
    
    public void enqueue(Process p)
    {
            if (head == null)
            {
                head = new QueueNode(p);
                head.next = tail;
            }
            else
            {
                tail.next = (new QueueNode(p, tail.next));
                tail = tail.next;
                tail.next = null;
            }
    }
        
    public void dequeue()
    {
        if (isEmpty())
        {
        }
        else
        {
            head = head.next;
        }
    }
}
