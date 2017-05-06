
/**
 * SubClass of Employee, with the addition of JobTitle and PrimaryLanguage variables
 * 
 * @author Brian Krick 
 * @version 9/26
 */
public class Programmer extends Employee
{
    private String JobTitle = "Programmer";
    private String PrimaryLanguage;

    /**
     * Constructor for objects of class Programmer, all inputs are strings, Sex should be
     * just "M" "F" or "T", Birthday in the form of "XX/XX/XX",
     * @param - String NameIn, Sting SexIn, Organization OrgIn, String BDayIn, String PLIn
     */
    public Programmer(String NameIn,String SexIn,Organization OrgIn,String BDayIn, String PLIn)
    {
        super(NameIn, SexIn, OrgIn, BDayIn);
        setPL(PLIn);
    }

    /**
     * set method for the primary language of the programmer
     * @param - String PLIn
     * @return - void
     */
    public void setPL(String PLIn)
    {
        if (Checking.isNull(PLIn))
        {
            System.out.println("Cannot accept Null input!");
        }
        else
        {
            PrimaryLanguage = PLIn;
        }
    }
    
    /**
     * get method for the primary language
     * @param - none
     * @return - PrimaryLanguage 
     */
    public String getPrimLang()
    {
        return PrimaryLanguage;
    }
    
    /**
     * toString method for programmer
     * @param - none
     * @return - string representation of this object
     */
    public String toString()
    {
        return super.toString() + "Job Title: " + JobTitle + ". Primary Language: " + 
        PrimaryLanguage + ". ";
    }
    
    /**
     * equals method for comparing employees, only needed in the super class because
     * it only compares Name, Sex, Birthay, and Organization
     * @param - Object Employee
     * @return boolean
     */
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
