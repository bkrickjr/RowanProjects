import java.util.*;
public class Member
{
    //Variables used in the following code
    private int MemberID;
    private String MemberName;
    private String Sex;
    private boolean isFamily = false;
    //constructor takes ID first name and gender
    public Member(int MemberIdentification, String FirstName, String Gender)
    {
        setID(MemberIdentification);
        setMemberName(FirstName);
        setMemberSex(Gender);
    }
    //method that sets the ID
     public void setID(int newID)
    {
        if(Checking.addedToHS(newID, isFamily))
        {
            this.MemberID = newID;
        }
        else
        {
            System.out.println("The MemberID " + newID + " was already used!");
        }
    }
   //simple get method for the member ID
   public int getMemberID()
   {
       return this.MemberID;
   }
   //sets the members name
   public void setMemberName(String newMemberName)
    {
        if(newMemberName == null)  //spec said cannot be a null name
        {
            System.out.println("Cannot accept nothing as a Member Name!");
        }
        else
        {
            MemberName = newMemberName;
        }
    } 
   //simple get method for the member name 
   public String getMemberName()
   {
      return this.MemberName; 
   }
   //checks the sex entered
   public void setMemberSex(String newMemberSex)
   {
       if(Checking.sexIsValid(newMemberSex.toUpperCase()) == true)
       {
           Sex = newMemberSex;
        }
        else
        {
           System.out.println("Cannot accept user input as a Member's Sex! Defaulted to M");
           Sex = "M"; //if it was anything else defaults to male
        }
    }
    //simple method for the member sex   
    public String getMemberSex()
    {
        return this.Sex;
    }
    //toString method prints member info
    public String toString()
    {
        return
            "\t" + this.getMemberID() + " " 
            + this.getMemberName() + " " 
            + this.getMemberSex();
    }
}
