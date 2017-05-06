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
    private static int LastID = 0; //used to keep the last ID entered so that incorrect ID entries 
                                 // can still be given an ID
    static ArrayList <Integer> IDs = new ArrayList<Integer>();
    ArrayList <Member> FamilyMembers = new ArrayList<Member>();
    
    
   //Constructor for objects of class Family
    public Family(int Identification, String LastName, String StreetAddress, String CITY,
                    String STATE, String ZIPCODE)
    {
        setID(Identification);
        setFamilyName(LastName);
        setAddress(StreetAddress);
        setCity(CITY);
        setState(STATE);
        setZip(ZIPCODE);        
    }
    
    //getID method used by the family constructor to test if the ID entered is valid and not 
    //a duplicate
    public void setID(int newID)
    {
        if(newID == 0) //makes sure the FamilyID cannot be set to Zero
        {
            System.out.println("Cannot accept 0 as an ID number! ID will be set to " + 
            (LastID + 1) + ".");
            ID = LastID + 1;  
        }
        else  
        {
            ID = newID; //sets the ID variable
            LastID = newID;  //readies the LastID variable in case it has been used
            //this loop checks through the ID arraylist to see if the desired ID was used already
            for(int i = 0; i < IDs.size(); i++)
            {
                if(newID == (IDs.get(i)))  //if the newID is a match to an existing ID
                {                          //let user know their ID will be bumped up one number
                    
                    System.out.println("This Family ID number has already been used! ID will" +
                    " be set to " + (LastID + 1) + ".");
                    ID = LastID + 1;
                    newID = ID;
                    LastID = newID;
                }
            }  
            IDs.add(newID);           //adds this new ID to the list for future searches
    }
   }
    
    //getFamilyName method used by the family constructor to input the last name of the family
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
    
    //getAddress method used by family constructor to input family's street address
    public void setAddress(String newAddress)
    {
        Address = newAddress;
    }
    
    //getCity method used by family constructor to input family's city
    public void setCity(String newCity)
    {
        City = newCity;
    }
    
    //getState method used by family constructor to input family's state
    public void setState(String newState)
    {
        State = newState;
    }
    
    //getZip method used by family constructor to input family's zip
    public void setZip(String newZip)
    {
        Zip = newZip;
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
        if (s != "M" && s != "F" && s != "T") //checks to see if the input is a valid gender
            {
               System.out.println("The sex " + s + " is not a valid sex");  //tells them theyre wrong
            }
        else   //if the input sex works
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
        String listString = "";  //variable created to hold the list of names
        for(Member currentMember : FamilyMembers)  //loop through FamilyMembers
        {
            listString += currentMember.getMemberName() + "\t";   //add each name plus 6 spaces to
        }                                                        //seperate them
        System.out.println(listString);     //prints the string
    }
    
    //this version of showMembers prints the list of all members based on the desired sex entered
    public void showMembers(String s)
    {
       if (s != "M" && s != "F" && s != "T")  //checks user input
            {
               System.out.println("The sex " + s + " is not a valid sex");  //error message if wrong
            }
        else  //if the input works
        {
            String listString = ""; //variable created to hold the list of names 
            for(Member currentMember : FamilyMembers)  //loop through FamilyMembers
            {
                if (s == currentMember.getMemberSex())  //if the member's sex is the same as input
                {
                    listString += currentMember.getMemberName() + "\t";    //add name to the string
                }
            }
            System.out.println(listString);  //print the string
        }
    }
    
    //prints the info about the family followed by the info of each of its members
    public void showAll() 
    {
        // Print family info like a mailing address
        System.out.println(FamilyName + ID + "\n" +
        Address + "\n" + City + ", " + State + Zip + "\n");
        for(Member currentMember : FamilyMembers) 
        {
            System.out.println("\t" + currentMember.getMemberID() + " " 
            + currentMember.getMemberName() + " " 
            + currentMember.getMemberSex());
        }
    }
   
}
