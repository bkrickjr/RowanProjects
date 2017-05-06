import java.util.*;
/**
 * Earth class, which contains a list Mammals, which can include Humans and Pets.
 * 
 * @author Brian Krick
 * @version 10/15
 */
public class Earth
{
    private ArrayList <Mammal> AllMammals = new ArrayList<Mammal>();
    
    /**
     * Constructor for objects of class Earth
     */
    public Earth()
    {
    }

   /**
     * Adds a Mammal to the list of Mammals on the Earth.
     *         (the mammal added must not be null)
     * @param   Mammal 
     */
    public void addMammal(Mammal m)
    {
        if (Checking.mammalIsNotNull(m))
        {
            AllMammals.add(m);
        }
        else
        {
            System.out.println("Cannot add a null Mammal!");
        }
    }
    
   /**
     * Returns a list of all the mammals currently on earth.
     * @param - none
     * @return - List of Mammals 
     */
    public List getMammals()
    {
        return AllMammals;
    }

    /**
     * Returns a list of all humans currently on earth.
     * @return - none
     * @return - List of Humans
     */
    public List getHumans()
    {
        ArrayList <Mammal> AllHumans = new ArrayList<Mammal>();
        for (Mammal currentM : AllMammals)
        {
            if (currentM instanceof Human)
            {
                AllHumans.add( (Human) currentM);
            }
        }
        return AllHumans;
    }
    
   /**
     * getOwnedPets - returning a set of all pets on earth owned 
     * (in the pets list) by at least one human with no dups; 
     * it is acceptable for two different humans to have 
     * the same pet in their pet lists
     * @param - none
     * @return - List of Pets
     */
    public ArrayList getOwnedPets()
    {
        ArrayList <Pet> AllUniquePets = new ArrayList<Pet>();
        
        for (Mammal currentM : AllMammals)
        {
           if (currentM instanceof Human)
           {
               Human other = (Human) currentM;
               for (Pet currentP : other.PetList)
               {
                   if (AllUniquePets.contains(currentP))
                   {
                       
                   }
                   else
                   {                       
                       AllUniquePets.add((Pet) currentP);
                   }
               }
           }
        }
        
        return AllUniquePets;
    }
    
   /**
     * Returns a list of names of all humans currently on earth.
     * @param - none
     * @return - List of names 
     */
    public List getHumanNames()
    {
        ArrayList <String> NameList = new ArrayList<String>();
        for (Mammal currentM : AllMammals)
        {
            if (currentM instanceof Human)
            {
                Human other = (Human) currentM;
                NameList.add(other.getName());
            }
        }
        return NameList;
    }
    
    /** 
     * Prints to the terminal window each pet currently owned on Earth, without dups
     * @param - none
     * @return - void
     */
    public void printOwnedPets()
    {
        ArrayList <Pet> AllUniquePets = new ArrayList<Pet>();
        for (Mammal currentM : AllMammals)
        {
           if (currentM instanceof Human)
           {
               Human other = (Human) currentM;
               for (Pet currentP : other.PetList)
               {
                   if (AllUniquePets.contains(currentP))
                   {
                       
                   }
                   else
                   {                       
                       System.out.println(currentP.toString());
                   }
               }
           }
        }        
    }
    
   /**
     * Prints to the terminal window each mammal currently on earth, under each human,
     * this method prints an indented list of pets currently owned by that human, all nicely formatted.
     * @param - none
     * @return - void
     */
    public void printAll()
    {
        System.out.println("Print All: ");
        for (Mammal currentM : AllMammals)
        {
            if (currentM instanceof Human)
            {
                System.out.println("\n" + currentM.toString());
                Human other = (Human) currentM;
                for (Pet currentP : other.PetList)
                {
                    System.out.println("\t" + currentP.toString());
                }
            }
        }
    }
}
