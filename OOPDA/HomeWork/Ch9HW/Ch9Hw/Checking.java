
/**
 * Checking Method that is used to validate tests
 * 
 * @author Brian Krick 
 * @version 9/26
 */
public class Checking
{
    /**
     * Constructor for objects of class Checking
     */
    public Checking()
    {
    }

    /**
     * Checking method that returns true if a string is null
     * @param - String S
     * @return - boolean
     */
    public static boolean isNull(String S)
    {
       if(S == null)
       {
           return true;
       }
       else
       {
           return false;
       }
    }
    
    /**
     * Checking method that returns true if the sex is valid
     * @param - String X
     * @return - boolean
     */
    public static boolean isValidSex(String X)
    {
        if (X.toUpperCase().equals("M") || X.toUpperCase().equals("F") ||
                 X.toUpperCase().equals("T"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Checking method that returns true if the birthday was entered in the proper
     * XX/XX/XX format
     * @param - String B
     * @return - boolean
     */
    public static boolean isValidBDay(String B)
    {
        if (B.length() != 8)
           {
               System.out.println("Input was invalid");
           }
           else
           {
               for (int i = 0; i < 2; i++)
               {
                   if ( (checkNumberChar(B.charAt(i)) == false) )
                   {
                       return false;
                   }                   
               }
               for (int i = 3; i < 5; i++)
               {
                   if ( (checkNumberChar(B.charAt(i)) == false) )
                   {
                       return false;
                   } 
               }
               for (int i = 6; i < 8; i++)
               {
                   if ( (checkNumberChar(B.charAt(i)) == false) )
                   {
                       return false;
                   } 
               }
               if ( (B.charAt(2) != '/') && (B.charAt(5) != '/') )
               {
                   return false;
               }
           }
        return true;
    }
    
    /**
     * Checking method that returns true if the character is between 0 and 9
     * @param - char c
     * @return - boolean
     */
    public static boolean checkNumberChar(char c)
    {
        if (c >= '0' && c <= '9')
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
}
