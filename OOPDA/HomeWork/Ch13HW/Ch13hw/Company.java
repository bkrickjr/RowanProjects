import java.util.*;
/**
 * Write a description of class Company here.
 * 
 * @author Brian Krick
 * @version 
 */
public class Company
{
    private ArrayList<Employee> Workers = new ArrayList<Employee>();

    /**
     * Constructor for objects of class Company
     */
    public Company()
    {
        
    }
    
    public void addEmployee(Employee e)
    {
        Workers.add(e);
    }

    public Employee searchWorkers(int id)
    {        
        return null;
    }
    
    public Employee searchByID(int id)
    {
        for (Employee current : Workers)
        {
            if (id == current.getID())
            {
                return current;
            }
        }
        return null;
    }
    
   
    public void printAllWorkers()
    {
        for (Employee current : Workers)
        {
            System.out.println(current.toString());
        }
    }
    
    
}
