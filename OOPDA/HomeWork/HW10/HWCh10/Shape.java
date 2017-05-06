
/**
 * Super Class for the project
 * 
 * @author Brian Krick
 * @version 10/17
 */
public class Shape
{
    protected String color;
    protected boolean filled;
    /**
     * Default Constructor for objects of class Shape, sets color to "green" and filled to true
     */
    public Shape()
    {
        this.color = "green";
        this.filled = true;
    }
    
    /**
     * Constructor for objects of class Shape, sets color to colorIn input and filled to filledIn
     */
    public Shape(String colorIn, boolean filledIn)
    {
        setColor(colorIn);
        setFilled(filledIn);
    }
    
    /**
     * set method for the color variable
     * @param - String ColorIn
     * @return - void
     */
    private void setColor(String colorIn)
    {
        if (Checking.stringNotNull(colorIn) && Checking.stringNotEmpty(colorIn))
        {
            this.color = colorIn; 
        }
        else
        {
            System.out.println("The input was either null or empty!");
        }
    }
    
    /**
     * get method for the Color variable
     * @param - none
     * @return - String color
     */
    public String getColor()
    {
        return color;
    }
    
    /**
     * set method for the filled variable
     * @param - filledIn
     * @return - void
     */
    private void setFilled(boolean filledIn)
    {
        filled = filledIn;
    }
    
    /**
     * get method for the filled variable
     * @param - none
     * @return boolean filled
     */
    public boolean getFilled()
    {
        return filled;
    }
    
    /**
     * toString method
     * @param - none
     * @return - string representation of the object
     */
    public String toString()
    {
        if (filled == true)
        {
            return "A Shape with color of " + color + " and filled";
        }
        else
        {
            return "A Shape with color of " + color + " and Not filled";
        }
    }
    
    /**
     * dummy getArea
     * @param - none
     * @return - double
     */
    public double getArea()
    {
        return 0.0;
    }
}
