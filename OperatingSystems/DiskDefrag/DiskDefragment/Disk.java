import java.util.Arrays;

/**
 * Representation of the Hard Disk as an object. The disk holds an array of easily changable size (size hard disks
 * are finite in size). Constructors have been created for your time's sake and will populate the array with file
 * parts in mixed up order and position. There is a default constructor that simply creates the array for you to
 * populate with FileParts as you please as well. Once the Disk is good and fragmented, you can call the 
 * Defragment method and it will sort out your mess for you, putting the FileParts in alphebetical order by name,
 * ascending numeric order, and nulls at the end of the array.
 * 
 * @author Brian Krick
 * @version 
 */
public class Disk
{
    private int size = 16;
    private FilePart[] FPArray = new FilePart[size];

    /**
     * Constructor for objects of class Disk
     */
    public Disk()
    {
        
    }
    
    /**
     * Test Constructor populates the array at different places from string constructor
     * input does not matter!!
     */
    public Disk(int test)
    {
        FilePart a = new FilePart("A.txt", 1);
        FilePart aa = new FilePart("A.txt", 2);
        FilePart aaa = new FilePart("A.txt", 3);
        FilePart b = new FilePart("B.txt", 1);
        FilePart bb = new FilePart("B.txt", 2);
        FilePart bbb = new FilePart("B.txt", 3);
        this.addFilePart(a, 4);
        this.addFilePart(aa, 1);
        this.addFilePart(aaa, 3);        
        this.addFilePart(b, 5);
        this.addFilePart(bb, 9);
        this.addFilePart(bbb, 7);
    }
    
    /**
     * Test Constructor populates the array at different places from int constructor
     * input does not matter!!
     */
    public Disk(String test)
    {
        FilePart a = new FilePart("A.txt", 1);
        FilePart aa = new FilePart("A.txt", 2);
        FilePart aaa = new FilePart("A.txt", 3);
        FilePart b = new FilePart("B.txt", 1);
        FilePart bb = new FilePart("B.txt", 2);
        FilePart bbb = new FilePart("B.txt", 3);
        FilePart c = new FilePart("C.txt", 1);
        FilePart cc = new FilePart("C.txt", 2);
        FilePart ccc = new FilePart("C.txt", 3);
        FilePart cccc = new FilePart("C.txt", 4);
        this.addFilePart(a, 6);
        this.addFilePart(aa, 12);
        this.addFilePart(aaa, 0);
        this.addFilePart(b, 15);
        this.addFilePart(bb, 8);
        this.addFilePart(bbb, 5);
        this.addFilePart(c, 3);
        this.addFilePart(cc, 4);
        this.addFilePart(ccc, 7);
        this.addFilePart(cccc, 1);
    }

    /**
     * adds a file part to the array at the selected slot
     * @param - FilePart
     * @param - int i where i is location in the array
     */
    public void addFilePart(FilePart fp, int i)
    {
        FPArray[i] = fp;
    } 
    
    /**
     * defragment method should put all the file parts in order and at the front of the array
     * @param - none
     * @return - none
     */    
    public void Defragment()
    {
        int i = 0, j = 0;
        boolean flag = true;
        FilePart temp = new FilePart(" ", 0);
        
        sortNulls(i, j, temp);
        sortFilePartsName(i, j, temp);
        sortFilePartsNumber(i, j, temp);
    }
    
    /**
     * sort method for the names, organizes all the file parts by name
     * @param - int i: counter variable
     * @param - int j: counter variable
     * @param - FilePart temp: temporary place holder to help with swapping
     * @return - void
     */ 
    private void sortFilePartsName(int i, int j, FilePart temp)
    {
       for (i = 0; i < FPArray.length - 1; i++)
        {
            for (j = i + 1; j < FPArray.length - 1; j++)
            {
                if (FPArray[i] != null && FPArray[j] != null &&
                    FPArray[i].getName().compareTo(FPArray[j].getName()) > 0)
                {
                        temp = FPArray[i];
                        FPArray[i] = FPArray[j];
                        FPArray[j] = temp;
                }
            }
        } 
    }
    
    /**
     * sort method for the number, organizes all the file parts by number
     * @param - int i: counter variable
     * @param - int j: counter variable
     * @param - FilePart temp: temporary place holder to help with swapping
     * @return - void
     */
    private void sortFilePartsNumber(int i, int j, FilePart temp)
    {
        for (i = 0; i < FPArray.length - 1; i++)
        {
            for (j = i + 1; j < FPArray.length - 1; j++)
            {
                if (FPArray[i] != null && FPArray[j] != null &&
                    FPArray[i].getName().compareTo(FPArray[j].getName()) == 0 &&
                    FPArray[i].getNumber() > FPArray[j].getNumber())
                {
                        temp = FPArray[i];
                        FPArray[i] = FPArray[j];
                        FPArray[j] = temp;
                }
            }
        } 
    }
    
    /**
     * sort method for the nulls, puts all the nulls at the end of the array
     * @param - int i: counter variable
     * @param - int j: counter variable
     * @param - FilePart temp: temporary place holder to help with swapping
     * @return - void
     */
    private void sortNulls(int i, int j, FilePart temp)
    {        
        for (i = 0; i < FPArray.length - 1; i++)
            {
                for (j = i; j < FPArray.length - 1; j++)
                {
                    if (FPArray[j] == null)
                    {
                        temp = FPArray[j+1];
                        FPArray[j+1] = null;
                        FPArray[j] = temp;                    
                    }
                }
            }
    }
}
