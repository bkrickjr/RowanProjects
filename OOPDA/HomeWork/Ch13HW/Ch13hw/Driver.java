
/**
 * Write a description of class Driver here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class Driver
{
    

    /**
     * Constructor for objects of class Driver
     */
    public Driver()
    {
        try
        {
            Company Co = new Company();
            Employee a = new Employee(1, null, "F", 6, 6, "T", "D");
            Employee b = new Employee(2, "B", "B", -1, -1, "Title", "Dep");
            Employee c = new Employee(3, "C", "C", 2, -1, "Title", "Dep");
            Co.addEmployee(b);
            Co.addEmployee(c);
            a.toString();
            b.toString();
            c.toString();
        }
        catch (NullStringException | EmptyStringException | InvalidBossException e)
        {
            System.out.println(e.toString());
        }
        
            
        
    }

    
}
