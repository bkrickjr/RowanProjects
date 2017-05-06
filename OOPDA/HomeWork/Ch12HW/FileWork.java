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
     * This method is used to find and count the letter A no matter the case of the letter and returns the counter
     * @param - String FileName
     * @return - int counter
     */
    public static int FindA(File file)
    {
        int ACounter = 0, c;
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            while ((c = reader.read()) != -1)
            {
                if( 'a' == (char)c || 'A' == (char)c)
                {
                    ACounter++;
                }
            }
            reader.close();
        }
        catch (Exception ex)
        {
            
        }
        return ACounter;
    }
    
    /**
     * This method is used to search for a specific word in a file and returns how many times that word was used
     * @param - String FileName
     * @param - String searchedWord
     * @return - int WordCounter
     */
    public static int Search(File file, String searchedWord)
    {
        int WordCounter = 0, c;
        
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            while ((reader.readLine()) != null)
            {
                String[] words = reader.readLine().split(" ");
                for (int i = 0; i < words.length; i++)
                {
                    if(words[i].equalsIgnoreCase(searchedWord))
                    {
                        WordCounter++;
                    }
                }
            }
            reader.close();
        }
        catch (Exception ex)
        {
            
        }
        
        return WordCounter;
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
          int number = Integer.parseInt(numberRead);
          
          for (int i = 0; i < number-2; i++)
          {
              reader.readLine();
          }
          answer = reader.readLine();          
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
