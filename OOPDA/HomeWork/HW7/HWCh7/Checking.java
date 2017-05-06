import java.util.*;
public class Checking
{
    private static HashSet <Integer> FamilyIDList = new HashSet <Integer>(); //Hashset for FamilyID
    private static HashSet <Integer> MemberIDList = new HashSet <Integer>(); //Hashset for MemberID
    /**
     * Constructor for objects of class Checking
     */
    public Checking()
    {
    }

    public static boolean addedToHS(int newID, boolean isFamily)
    {
        if (newID == 0)
        {
            System.out.println("Cannot accept 0 as an ID number!");
            return false;
        }
        else
        {
            if(isFamily == true)
            {
                return FamilyIDList.add(newID);
            }
            else
            {
                return MemberIDList.add(newID);
            }
        }
    }
    
    public static boolean sexIsValid(String sexIn)
    {
        if (sexIn.equals("M") || sexIn.equals("F") || sexIn.equals("T"))
        {
            return true;
        }
        else
        {
            System.out.println("The input " + sexIn + "is not a valid sex!");
            return false;
        }
    }
    
    public static boolean isInFamilyHS(int IDIn)
    {
        if(FamilyIDList.contains(IDIn))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean isInMemberHS(int IDIn)
    {
        if(MemberIDList.contains(IDIn))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void addToFamilyID(int newID)
    {
        FamilyIDList.add(newID);
    }
    
    public static void addToMemberID(int newID)
    {
        MemberIDList.add(newID);
    }
}
