
/**
 * SubClass of Employee, with the addition of JobTitle and ProgrammerAssignedTo variables
 * 
 * @author Brian Krick 
 * @version 9/26
 */
public class Tester extends Employee
{
    private String JobTitle = "Tester";
    private Programmer ProgrammerAssignedTo;

    /**
     * Constructor for objects of class Tester, all inputs are strings except PAT, Sex should be
     * just "M" "F" or "T", Birthday in the form of "XX/XX/XX", 
     * @param - String NameIn, Sting SexIn, Organization OrgIn, String BDayIn, Programmer PATIn
     */
    public Tester(String NameIn, String SexIn, Organization OrgIn, String BDayIn, Programmer PATIn)
    {
        super(NameIn, SexIn, OrgIn, BDayIn);
        setPAT(PATIn);
    }

    /**
     *set method for the Programmer the Tester is assigned to
     * @param - String PATIn
     * @return - void 
     */
    public void setPAT(Programmer PATIn)
    {
        ProgrammerAssignedTo = PATIn;
    }
    
    /**
     * get method for the Programmer the Tester is assigned to
     * @param - none
     * @return - ProgrammerAssignedTo
     */
    public Programmer getPAT()
    {
        return ProgrammerAssignedTo;
    }
    
    
    /**
     * toString method for tester
     * @param - none
     * @return - string representation of this object
     */
    public String toString()
    {
        return super.toString() + "Job Title: " + JobTitle + ". Currently Assigned to test for: " +
        ProgrammerAssignedTo.getName() + " who writes primarily in "  + 
        ProgrammerAssignedTo.getPrimLang() + ". " ;
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
