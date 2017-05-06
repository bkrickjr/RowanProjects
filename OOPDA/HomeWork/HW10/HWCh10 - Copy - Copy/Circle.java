
/**
 * SubClass of Shape, allows for an additional variable radius to be input and can give you the area and
 * perimeter (circumference)
 * 
 * @author Brian Krick
 * @version 10/17
 */
public class Circle implements Shape
{
    protected String color;
    protected boolean filled;
    private double radius;

    /**
     * Default Constructor for objects of class Circle
     */
    public Circle()
    {
        this.radius = 1.0;
    }
    
    /**
     * Constructor for objects of class Circle only passing radius
     */
    public Circle(double radiusIn)
    {
         setRadius(radiusIn);
    }

    /**
     * Constructor for objects of class Circle, takes the color as string, filled in as boolean, and radius as
     * double
     */
    public Circle(String colorIn, boolean filledIn, double radiusIn)
    {
        setColor(colorIn);
        setFilled(filledIn);
        setRadius(radiusIn);        
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
     * set method for radius
     * @param - double radiusIn
     * @return - void
     */
    private void setRadius(double radiusIn)
    {
        if (Checking.isPositiveD(radiusIn))
        {
            this.radius = radiusIn;
        }
        else
        {
            System.out.println("Cannot have a negative radius!");
            radius = 1;
        }
    }
    
    /**
     * get method for radius variable
     * @param - none
     * @retrun - double radius
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * get method for the area of this circle, uses 3.14 instead of pi
     * @param - none
     * @return - double
     */
    public double getArea()
    {
        double area = 0.0;
        area = 3.14 * (radius * radius);
        return area;
    }
    
    /**
     * get method for the perimeter of this circle (circumference), uses 3.14 instead of pi
     * @param - none
     * @return - double
     */
    public double getPerimeter()
    {
        double perim = 0.0;
        perim = 2 * 3.14 * radius;
        return perim;
    }
    
    /** 
     * toString method
     * @param - none
     * @return - string representation of the object
     */
    public String toString()
    {
        return "A Circle with radius = " + radius ;
    }
}
