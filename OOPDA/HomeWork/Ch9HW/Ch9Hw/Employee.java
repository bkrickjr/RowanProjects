
/**
 * Holds name, sex, what organization they work for and their birthday
 * 
 * @author Brian Krick 
 * @version 9/26
 */
public class Employee
{
    private String Name, Sex, BirthDay;
    private Organization Org;

    /**
     * Constructor for objects of class Employee, all inputs are strings, Sex should be
     * just "M" "F" or "T", Birthday in the form of "XX/XX/XX"
     * @param - String NameIn, Sting SexIn, Organization OrgIn, String BDayIn
     */
    public Employee(String NameIn,String SexIn,Organization OrgIn,String BDayIn)
    {
        setName(NameIn);
        setSex(SexIn);
        setOrg(OrgIn);
        setBDay(BDayIn);
    }

    /**
     * set method for the name of the employee
     * @param - String NameIn
     * @return - void
     */
    public void setName(String NameIn)
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
     * get method for the name of the employee
     * @param - none
     * @return - String Name
     */
    public String getName()
    {
        return Name;
    }
    
    /**
     * set method for the sex of the employee
     * @param - String SexIn
     * @return - void
     */
    public void setSex(String SexIn)
    {
       if (Checking.isValidSex(SexIn))
       {
           Sex = SexIn;
       }
       else
       {
           System.out.println("Sex " + SexIn + " is invalid, please enter M F or T");
       }
    }
    
    /**
     * get method for the Sex of the employee
     * @param - none
     * @return - String Sex
     */
    public String getSex()
    {
        return Sex;
    }
    
    /**
     * set method for the Organization of the employee
     * @param - Organization OrgIn
     * @return - void
     */
    public void setOrg(Organization OrgIn)
    {
       Org = OrgIn;       
    }
    
    /**
     * get method for the Organization of the employee
     * @param - none
     * @return - Organization Org
     */
    public Organization getOrg()
    {
        return Org;
    }
    
    /**
     * set method for the BirthDay of the employee
     * @param - String BDayIn
     * @return - void
     */
    public void setBDay(String BDayIn)
    {
       if (Checking.isNull(BDayIn))
       {
           System.out.println("Cannot accept Null input!");
           return;
       }
        else if (Checking.isValidBDay(BDayIn) == false)
       {
           System.out.println("Input was invalid, please use XX/XX/XX format");
           return;
       }
       else
       {
           BirthDay = BDayIn;
       }
    }
    
    /**
     * get method for the BirthDay of the employee
     * @param - none
     * @return - BirthDay
     */
    public String getBDay()
    {
        return BirthDay;
    }
    
    /**
     * toString method for employee
     * @param - none
     * @return - string representation of this object
     */
    public String toString()
    {
        return "Employee:: Name : " + Name + ". Gender: " + Sex + ". Currently Working for " +
        this.Org.getOrgName() + ". Date of Birth: " + BirthDay + ". ";
    }
    
    /**
     * equals method for comparing employees, only needed in this class because
     * it only compares Name, Sex, Birthay, and Organization
     * @param - Object Employee
     * @return boolean
     */
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if ( ! (obj instanceof Employee) )
        {
            return false;
        }
        Employee other = (Employee) obj;
        return Name.equals(other.Name) && Sex.equals(other.Sex) && 
               Org.equals(other.Org) && BirthDay.equals(other.BirthDay) ;
    }
    
}
