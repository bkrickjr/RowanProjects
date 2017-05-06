import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * This class is where all the actual file reading and counting happens
 * 
 * @author Brian Krick 
 * @version 
 */
public class FileWork
{
    private static String input;
    /**
     * Constructor for objects of class FileWork
     */
    public FileWork()
    {
        
    }
    
    /**
     * This method is used to search through a file for a designated line and return the contents of the line
     * @param - String FileName
     * @return - String answer
     */
    public static String FindL(File file)
    {
        String answer = "";
        try
        {
          BufferedReader reader = new BufferedReader(new FileReader(file));
          String numberRead = reader.readLine();
          while (reader.readLine() != null)
          {
              answer += reader.readLine();  
          }
        }
        catch (Exception ex)
        {
            
        }
        
        return answer;
    }
    
    public static File getFile()
    {
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);  //REQUIRES COMPONENT
        
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = chooser.getSelectedFile();
            
            System.out.println("Opening: "+ chooser.getSelectedFile().getAbsolutePath() + ".");
            return file;
        }
        else
        {
            System.out.println("Open Command Cancled by User.");
            return null;
        }
    }
}
