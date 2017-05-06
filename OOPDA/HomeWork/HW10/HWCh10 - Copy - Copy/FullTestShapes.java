import java.util.*;
/**
 * Quick driver program for testing all the Shapes
 * 
 * @author Brian Krick 
 * @version 10/17
 */
public class FullTestShapes
{
    

    /**
     * Constructor for objects of class FullTestShapes
     */
    public FullTestShapes()
    {
        ArrayList <Shape> Collection = new ArrayList<Shape>();
        Circle a = new Circle(); 
        Collection.add(a);
        Circle b = new Circle(2.0);
        Collection.add(b);
        Circle c = new Circle("black", false, 3.0);
        Collection.add(c);
        Square d = new Square();
        Collection.add(d);
        Square e = new Square(4.0);
        Collection.add(e);
        Square f = new Square("red", true, 5.0);
        Collection.add(f);
        Rectangle g = new Rectangle();
        Collection.add(g);
        Rectangle h = new Rectangle(2.0, 3.0);
        Collection.add(h);
        Rectangle i = new Rectangle("blue", false, 3.0, 4.0);
        Collection.add(i);
        //Shape j = new Shape();
        //Collection.add(j);
        
        System.out.println("\n\nshowArea:");
        showArea(Collection);
        System.out.println("\n\nprintSquares:");
        printSquares(Collection);
        System.out.println("\n\nprintRectangles:");
        printRectangles(Collection);
        System.out.println("\n\nprintRectanglesExclusive:");
        printRectanglesExclusive(Collection);
    }

    /**
     * show area method, loops a collection of Shapes and prints their areas
     * @param - ArrayList of Shapes L
     * @return - void
     */
    public void showArea(ArrayList<Shape> L)
    {
        for (Shape currentS : L)
        {
            System.out.println(currentS.getArea());
        }
    }
    
    /**
     * print method for Squares and their sides size
     * @param - ArrayList of Shapes L
     * @return - void
     */
    public void printSquares(ArrayList<Shape> L)
    {
        for (Shape currentS : L)
        {
            if (currentS instanceof Square)
            {
                Square other = (Square) currentS;
                System.out.println(other.getColor() + " Square with sides " + other.getWidth() + 
                " long.");
            }
        }
    }
    
    /**
     * print method for All Rectangles and their sides size
     * @param - ArrayList of Shapes L
     * @return - void
     */
    public void printRectangles(ArrayList<Shape> L)
    {
        for (Shape currentS : L)
        {
            if (currentS instanceof Rectangle)
            {
                Rectangle other = (Rectangle) currentS;
                System.out.println(other.getColor() + " Rectangle with width " + other.getWidth() + 
                " and length " + other.getLength());
            }
        }
    }
    
    /**
     * print method for Exclusively Rectangles and their sides size
     * @param - ArrayList of Shapes L
     * @return - void
     */
    public void printRectanglesExclusive(ArrayList<Shape> L)
    {
        for (Shape currentS : L)
        {
            if (currentS instanceof Rectangle && (!(currentS instanceof Square)))
            {
                Rectangle other = (Rectangle) currentS;
                System.out.println(other.getColor() + " Rectangle with width " + other.getWidth() + 
                " and length " + other.getLength());
            }
        }
    }
    
}
