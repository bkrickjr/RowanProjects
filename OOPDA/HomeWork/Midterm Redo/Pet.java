
/**
 * The Pet class is a subclass of Mammal in addition to Mammal's age, it has a color.
 * 
 * @author Brian Krick 
 * @version 10/15
 */
public class Pet extends Mammal
{
    private String Color;
    
    /**
     * Constructor for objects of class Pet, takes an int age(must be positive) it sends to the super
     * and a string color(cant be empty)
     */
    public Pet(String ColorIn, int ageIn)
    {
        super(ageIn);
        setColor(ColorIn);
    }

   /**
     * getColor - returns the Pet's color
     * 
     * @return the Pet's color    
     */
    public String getColor()
    {
        return Color;
    }
    
   /**
     * setColor - sets the Pet's color
     * 
     * @param - ColorIn from constructor 
     */
    public void setColor(String ColorIn)
    {
        if (Checking.isNotNull(ColorIn) && Checking.isNotEmpty(ColorIn))
        {
            Color = ColorIn;
        }
        else
        {
            System.out.println("Cannot be a null or empty color!");
        }
    }
    
   /**
     * toString - returns the state of the Pet as a String 
     * 
     * @return - String representation of this object  
     */
    public String toString()
    {
        return "Pet - Age: " + this.getAge() + " Color: " + Color ;
    }
    
   /**
    * equals method to check if two pets are the same by checking age and color
    * @param - Object obj
    * @return - boolean
    */
   public boolean equals(Object obj)
   {
       if (this == obj)
       {
           return true;
       }
       if (! (obj instanceof Pet))
       {
           return false;
       }
       Pet other = (Pet) obj;
       return (this.getAge() == other.getAge()) && this.Color.equals(other.getColor());
   }
}
