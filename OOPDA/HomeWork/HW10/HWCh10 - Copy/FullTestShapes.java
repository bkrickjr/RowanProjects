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
        Shape j = new Shape();
        Collection.add(j);
        
        showArea(Collection);
        
    }

    /**
     * show area method, loops a collection of Shapes and prints their areas
     * @param - ArrayList L
     * @return - void
     */
    public void showArea(ArrayList<Shape> L)
    {
        for (Shape currentS : L)
        {
            System.out.println(currentS.getArea());
        }
    }
    
}
