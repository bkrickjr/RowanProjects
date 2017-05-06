
/**
 * SubClass of Shape, allows for additional variables width and height to be input and can give you the area and
 * perimeter  
 * 
 * @author Brian Krick 
 * @version 10/17
 */
public class Rectangle implements Shape
{
    protected double width, length;
    protected String color;
    protected boolean filled;
    /**
     * Default Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        this.width = 1.0;
        this.length = 1.0;
    }
    
    /**
     * Constructor for objects of class Rectangle, only passing width and length
     */
    public Rectangle(double widthIn, double lengthIn)
    {
       setWidth(widthIn);
       setLength(lengthIn);
    }
        
    /**
     * Constructor for objects of class Rectangle, takes the color as string, filled in as boolean, and width
     * and length as doubles
     */
    public Rectangle(String colorIn, boolean filledIn, double widthIn, double lengthIn)
    {
        setColor(colorIn);
        setFilled(filledIn);
        setWidth(widthIn);
        setLength(lengthIn);
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
     * set method for width
     * @param - double widthIn
     * @return - void
     */
    private void setWidth(double widthIn)
    {
        if (Checking.isPositiveD(widthIn))
        {
            this.width = widthIn;
        }
        else
        {
            System.out.println("Cannot have a negative Width!");
        }
    }
    
    /**
     * get method for width
     * @param - none
     * @return - double width 
     */
    public double getWidth()
    {
        return width;
    }
    
    /**
     * set method for length
     * @param - double lengthIn
     * @return - void
     */
    private void setLength(double lengthIn)
    {
        if (Checking.isPositiveD(lengthIn))
        {
            this.length = lengthIn;
        }
        else
        {
            System.out.println("Cannot have a negative Length!");
        }
    }
    
    /**
     * get method for length
     * @param - none
     * @return - double length 
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * get method for area
     * @param - none
     * @return - double
     */
    public double getArea()
    {
        double area = 0.0;
        area = width * length;
        return area;
    }
    
    /**
     * get method for perimeter
     * @param - none
     * @return - double
     */
    public double getPerimeter()
    {
        double perim = 0.0;
        perim = (2 * width) + (2 * length);
        return perim;
    }
    
    /**
     * toString method
     * @param - none
     * @return - string representation of the object
     */
    public String toString()
    {
        return "A Rectangle with width = " + width + " and length = " + length ;
    }
}
