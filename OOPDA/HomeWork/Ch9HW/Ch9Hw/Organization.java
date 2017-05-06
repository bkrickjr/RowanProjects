import java.util.*;
/**
 * Holds Organization Name and number of Employees
 * 
 * @author Brian Krick 
 * @version (9/26
 */
public class Organization
{
    private String Name;
    private static int NumberOfEmployees;
    ArrayList <Employee> MyList = new ArrayList <Employee>();
    
    /**
     * Constructor for objects of class Orginization
     */
    public Organization(String NameIn)
    {
        setOrgName(NameIn);
    }

    /**
     * set method for the Organization name 
     * @param - String NameIn
     * @return - void
     */
    public void setOrgName(String NameIn)
    {
        if (Checking.isNull(NameIn))
        {
            System.out.println("Cannot accept Null input!");
        }
        else
        {
            Name = NameIn;
        }
    }
    
    /**
     * get method for the Organization name
     * @param - none
     * @return - String Name
     */
    public String getOrgName()
    {
        return Name;
    }
    
    /**
     * method to add an employee to the MyList of the Organization
     * @param - Employee
     * @return - none
     */
    public void addEmployee(Employee e)
    {
        MyList.add(e);
        NumberOfEmployees++;
    }
    
    /**
     * method to get a list of all the employees working for this organization
     * @param - none
     * @return - array list
     */
    public ArrayList getMember()
    {
        return MyList;
    }
    
    /**
     * method to show all the employees of the organization in the terminal
     * @param - none
     * @return - void
     */
    public void showEmployees()
    {
        for (Employee currentEmployee : MyList)
        {
            System.out.println(currentEmployee.toString());
        }
    }
    
    /**
     * method to show only the programmers in the organization in the terminal
     * @param - none
     * @return - void
     */
    public void showProgrammers()
    {
        for (Employee currentEmployee : MyList)
        {
            if (currentEmployee instanceof Programmer)
            {
                System.out.println(currentEmployee.toString());
            }            
        }
    }
    
    /**
     * method to show only the testers in the organization in the terminal
     * @param - none
     * @return - void
     */
    public void showTesters()
    {
        for (Employee currentEmployee : MyList)
        {
            if (currentEmployee instanceof Tester)
            {
                System.out.println(currentEmployee.toString());
            }            
        }
    }
    
    /**
     * toString method for organization
     * @param - none
     * @return - string representation of this object
     */
    public String toString()
    {
        return "Organization:: Name : " + Name + ". Number of Employees: " + NumberOfEmployees + 
        ". ";
    }
    
    /**
     * equals method for comparing organizations
     * @param - Object Organization
     * @return boolean
     */
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if ( ! (obj instanceof Organization) )
        {
            return false;
        }
        Organization other = (Organization) obj;
        return Name.equals(other.Name);
    }
}
