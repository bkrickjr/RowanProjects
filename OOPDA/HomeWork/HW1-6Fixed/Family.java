import java.util.*;
public class Family
{
    //Variables used in the following code
    private int ID;   //keeps the ID number of the family
    private String FamilyName;   //keeps the name of the family
    private String Address;      // keeps the family's street address
    private String City;        //keeps the city the family lives in
    private String State;       //keeps the state the family lives in
    private String Zip;         //keeps the zip code the family lives in
    private boolean isFamily = true;
    ArrayList <Member> FamilyMembers = new ArrayList<Member>();  //FamilyMembers ArrayList for this family
    
    
   //Constructor for objects of class Family
    public Family(int Identification, String LastName, String StreetAddress, String CITY,
                    String STATE, String ZIPCODE)
    {
        hsSetID(Identification);
        setFamilyName(LastName);
        setAddress(StreetAddress);
        setCity(CITY);
        setState(STATE);
        setZip(ZIPCODE);        
    }
    
    
    
    //setID using hashset
    public void hsSetID(int IDIn)
    {
        if(Checking.addedToHS(IDIn, isFamily))
        {
            this.ID = IDIn;
        }
        else
        {
            System.out.println("The FamilyID " + IDIn + " was already used!");
        }
    }
    //simple get method to return ID
    public int getFamilyID()
    {
        return this.ID;
    }
   
    
    //setFamilyName method used by the family constructor to input the last name of the family
    public void setFamilyName(String newFamilyName)
    {
        if(newFamilyName == null)
        {
            System.out.println("Cannot accept nothing as a Family Name!");
        }
        else
        {
            FamilyName = newFamilyName;
        }
    } 
    //simple get method to return FamilyName
    public String getFamilyName()
    {
        return this.FamilyName;
    }
    
    
    //setAddress method used by family constructor to input family's street address
    public void setAddress(String newAddress)
    {
        Address = newAddress;
    }
    //simple get method to return Address
    public String getAddress()
    {
        return this.Address;
    }
    
    
    //setCity method used by family constructor to input family's city
    public void setCity(String newCity)
    {
        City = newCity;
    }
    //simple get method to return City
    public String getCity()
    {
        return this.City;
    }
    
    
    //setState method used by family constructor to input family's state
    public void setState(String newState)
    {
        State = newState;
    }
    //simple get method to return State
    public String getState()
    {
        return this.State;
    }
    
    
    //setZip method used by family constructor to input family's zip
    public void setZip(String newZip)
    {
        Zip = newZip;
    }
    //simple get method to return Zip
    public String getZip()
    {
        return this.Zip;
    }
    
    
    //addMember method that adds a member object that already exists to the family
    public void addMember(Member m)
    {
        FamilyMembers.add(m);
    }
    
    //returns a list of members that have been added to the family
    public ArrayList getMembers()
    { 
      return FamilyMembers;
    }
    
    //returns a list of members that have been added to the family by sex
    public ArrayList getMembers(String s)
    {
        //creates a new arraylist of these members being pulled out by sex
          ArrayList <Member> FamilyMembersBySex = new ArrayList<Member>(); 
        if (Checking.sexIsValid(s) == true) //checks to see if the input is a valid gender
            {
            for (Member currentMember : FamilyMembers)   //loop through FamilyMembers
                    {
                        if (s == currentMember.getMemberSex())   //if the member's sex is the same
                        {
                            FamilyMembersBySex.add(currentMember);  //add them to the arraylist
                        }
                    }
            }
        return FamilyMembersBySex;
    }
    
    //showMembers prints out a list of all members that have been added to the family
    public void showMembers()
    {
        
        for(Member currentMember : FamilyMembers)  //loop through FamilyMembers
        {
            System.out.println(currentMember.toString());   
        }                                                        
        
    }
    
    //this version of showMembers prints the list of all members based on the desired sex entered
    public void showMembers(String s)
    {
       if (Checking.sexIsValid(s) == true)
       {
           for(Member currentMember : FamilyMembers)
           {      
               if (s == currentMember.getMemberSex())  //if the member's sex is the same as input
                 {
                    System.out.println(currentMember.toString());
                }
            }
        }
    }
    
    //prints the info about the family followed by the info of each of its members
    public void showAll() 
    {
       System.out.println(this.toString());
       this.showMembers();
    }
   
    public String toString()
    {
        return FamilyName + ID + "\n" +
        Address + "\n" + City + ", " + State + " " + Zip + "\n";
    }
    
}
