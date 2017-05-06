
/**
 * The FilePart objects represent each section of memory a file would take up.
 * The FilePart fields include: Name & Number. The Name variable represents the name of the file.
 * The Number variable represents which section of the file that part is.
 * 
 * @author Brian Krick
 * @version 
 */
public class FilePart
{ 
    private int Number;
    private String Name;
    
    /**
     * Constructor for objects of class FilePart
     */
    public FilePart(String NameIn, int NumberIn)
    {
        setName(NameIn);
        setNumber(NumberIn);
    }

    /**
     * simple setter for Number
     * @param - int to set to the Number
     * @return - void
     */
    private void setNumber(int NumberIn)
    {
        Number = NumberIn;
    }
    
    /**
     * simple getter for Number
     * @param - none
     * @return - int Number
     */    
    public int getNumber()
    {
        return Number;
    }
    
    /**
     * simple setter for Name
     * @param - String to set the Name
     * @return - void
     */ 
    private void setName(String NameIn)
    {
        Name = NameIn;
    }
    
    /**
     * simple getter for the Name
     * @param - none
     * @return - String Name
     */ 
    public String getName()
    {
        return Name;
    }  
    
    /**
     * String representation of the object
     * @param - none
     * @return - String representation of the object
     */ 
    public String toString()
    {
        return "File Name: " + Name + ". Part: " + Number + ". ";
    }
}
