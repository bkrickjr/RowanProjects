
/**
 * SubClass of Rectangle, no variables of its own, all are inherited
 * 
 * @author Brian Krick
 * @version 10/17
 */
public class Square extends Rectangle
{
    

    /**
     * Default Constructor for objects of class Square
     */
    public Square()
    {
       super();
    }
    
    /**
     * Constructor for objects of class Square only passes one side length
     */
    public Square(double sideIn)
    {
       super(sideIn, sideIn);
    }
    
    /** 
     * Constructor for objects of the class Square passing all variables
     */
    public Square(String colorIn, boolean filledIn, double sideIn)
    {
        super(colorIn, filledIn, sideIn, sideIn);
    }

    /**
     * toString method
     * @param - none
     * @return - string representation of the object
     */
    public String toString()
    {
        return "A Square with side = " + this.width + ", which is a subclass of " + super.toString();
    }
    
    private void setLength(double sideIn)
    {
        if (Checking.isPositiveD(sideIn))
        {
            this.length = sideIn;
            this.width = sideIn;
        }
        else
        {
            System.out.println("Cannot have a negative Length!");
        }
    }
    
    private void setWidth(double sideIn)
    {
        if (Checking.isPositiveD(sideIn))
        {
            this.length = sideIn;
            this.width = sideIn;
        }
        else
        {
            System.out.println("Cannot have a negative Width!");
        }
    }
    
    /**
     * No need to override getArea() and getPerimeter() because they still work the same way
     */
}
