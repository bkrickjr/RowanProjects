import java.util.*;

/**
 * Write a description of class Employee here.
 * 
 * @author Brian Krick 
 * @version 
 */
public class Employee
{    
    private int ID, AdminB, TechB ;
    private String LName, FName, Title, Department;
    
    private static HashSet<Employee> Used = new HashSet<Employee>();
    
    
    /**
     * Constructor for objects of class Employee with all fields
     */
    public Employee(int IDIn, String LNameIn, String FNameIn, int AdminBIn, int TechBIn, 
                    String TitleIn, String DepartmentIn)
    throws NullStringException, EmptyStringException, InvalidBossException
                    
    {                   
            setLName(LNameIn);
            setFName(FNameIn);
            setID(IDIn);
            setAB(AdminBIn);
            setTB(TechBIn);
            setTitle(TitleIn);
            setDepartment(DepartmentIn);               
    }
    
    /**
     * Constructor for objects of class Employee with missing Department
     */
    public Employee(int IDIn, String LNameIn, String FNameIn, int AdminBIn, int TechBIn, String TitleIn)
    throws NullStringException, EmptyStringException, InvalidBossException
    {        
            setLName(LNameIn);
            setFName(FNameIn);
            setID(IDIn);
            setAB(AdminBIn);
            setTB(TechBIn);
            setTitle(TitleIn);            
            //setDepartment();   //need to know company to searchByID()       
    }
    
    private void setID(int IDIn)
    {  
       
    }
    
    public int getID()
    {
        return ID;
    }
    
    private void setLName(String LNameIn)
    throws NullStringException, EmptyStringException
    {
        if (LNameIn == null)
        {
            throw new NullStringException("Null Last Name invalid");
        }
        if (LNameIn == "")
        {
            throw new EmptyStringException("Last Name cannot be empty!");
        } 
        
        LName = LNameIn;        
    }
    
    public String getLName()
    {
        return LName;
    }
    
    private void setFName(String FNameIn)
    throws NullStringException, EmptyStringException
    {        
        if (FNameIn == null)
        {
            throw new NullStringException("Null First Name invalid");
        }
        if (FNameIn == "")
        {
            throw new EmptyStringException("First Name cannot be empty!");
        }
        FName = FNameIn;    
    }
    
    public String getFName()
    {
        return FName;
    }
    
    private void setAB(int AdminBIn)
    throws InvalidBossException
    {
        if(AdminB == -1)
        {
            AdminB = AdminBIn;
        }
        else
        {
            throw new InvalidBossException("");
        }
    }
    
    public int getABID()
    {
        return AdminB;
    }
    
    private void setTB(int TechBIn)
    throws InvalidBossException
    {        
        if(Used.contains(new Integer("TechBIn")) || TechB == -1)
        {
            TechB = TechBIn;
        }
        else
        {            
            throw new InvalidBossException("");
        }
    }
    
    public int getTBID()
    {
        return TechB;
    }
    
    private void setTitle(String TitleIn)
    {
        Title = TitleIn;
    }
    
    public String getTitle()
    {
        return Title;
    }
    
    private void setDepartment(String DepartmentIn)
    {
        Department = DepartmentIn;
    }
    
    public String getDepartment()
    {
        return Department;
    }    
    
    
    public String toString()
    {        
        return "Employee ID: " + ID + "\nEmployee Name: " + FName + " " + LName + "\n~Boss info~" ;
    }
}
