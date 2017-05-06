
import java.util.*;
public class Member
{
    //Variables used in the following code
    private int MemberID;
    private String MemberName;
    private String Sex;
    private static int LastID;
    static ArrayList <Integer> MemberIDs = new ArrayList<Integer>();
    
    public Member(int MemberIdentification, String FirstName, String Gender)
    {
        setID(MemberIdentification);
        setMemberName(FirstName);
        setMemberSex(Gender);
    }
    
     public void setID(int newID)
    {
        if(newID == 0)
        {
            System.out.println("Cannot accept 0 as a Member ID number! Member ID will be set to " + 
            (LastID + 1) + ".");
            MemberID = LastID + 1;    //add check to see if that ID has already been taken
        }
        else
        {
            MemberID = newID; 
            LastID = newID;
            for(int i = 0; i < MemberIDs.size(); i++)
            {
                
                if(newID == (MemberIDs.get(i)))
                {
                    System.out.println("This Member ID number has already been used! Member ID will" +
                    " be set to " + (LastID + 1) + ".");
                    MemberID = LastID + 1;
                    newID = MemberID;
                    LastID = newID;
                }
            }  
        MemberIDs.add(newID);
    }
   }
   
   public int getMemberID()
   {
       return this.MemberID;
   }

   public void setMemberName(String newMemberName)
    {
        if(newMemberName == null)
        {
            System.out.println("Cannot accept nothing as a Member Name!");
        }
        else
        {
            MemberName = newMemberName;
        }
    } 
    
   public String getMemberName()
   {
      return this.MemberName; 
   }
    
   public void setMemberSex(String newMemberSex)
   {
      switch (newMemberSex)
    {
        case "M" : Sex = "M";
        break;
        case "m" : Sex = "M";
        break;
        case "F" : Sex = "F";
        break;
        case "f" : Sex = "F";
        break;
        case "T" : Sex = "T";
        break;
        case "t" : Sex = "T";
        break;
        default : System.out.println("Cannot accept user input as a Member's Sex! Defaulted to M");
        Sex = "M";
        break;
    } 
    }
       
    public String getMemberSex()
    {
        return this.Sex;
    }
}
