
/**
 * Quick driver program for testing Shape
 * 
 * @author Brian Krick 
 * @version 10/17
 */
public class QuickTestShape
{
    

    /**
     * Constructor for objects of class QuickTestShape
     */
    public QuickTestShape()
    {
        Shape a = new Shape();
        Shape b = new Shape("black", true);
        Shape c = new Shape("orange", false);
        
        System.out.println("QuickTestShape:");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
    }

    
}
