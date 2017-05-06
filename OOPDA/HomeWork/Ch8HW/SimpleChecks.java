import java.util.Arrays;
public class SimpleChecks
{
    public SimpleChecks()
    {
    }
    
    //check that returns true if the string is null
    public static boolean CheckIsNull(String s)
    {
        if (s == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //check returns a more logical way of telling the user availability
    public static String CheckIsIn(boolean b)
    {
        String temp;
        if (b == true)
        {
            temp = "is available ";
        }
        else
        {
            temp = "is not available ";
        }
        return temp;
    }
    
    //check that returns true if the number is above or equal to 0
    public static boolean CheckNotNegative(int i)
    {
        if (i >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //check that returns true if the input string is in the input array
    public static boolean CheckValidRating(String s, String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            if ( s.toUpperCase() == a[i])
            {
                return true;
            }
        }
        return false;
    }
    
    //check that returns the total number of minutes (tempM) when passed hours (H)
    public static int CheckHtM(int H)
    {
        int tempM = 0;
        do {                      //while there are positive hours
            H--;                 //subtract 1 hour
            tempM = tempM + 60;   //add 60 minutes
        } while (H > 0);
        return tempM;
    }
    
    //check that returns the total number of hours (tempH) when passed minutes (M)
    public static int CheckMtH(int M)
    {
        int tempH = 0;
        do {                      //while there are minutes over 60
            tempH++;              //add 1 hour
            M = M - 60;   //subtract 60 minutes
        } while (M > 59);
        
        return tempH; //remember to multiply H by 60 and subtract that from minutes after calling
    }
    
    
}
