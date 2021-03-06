import java.io.FileReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
/**
 * This class is where all the actual file reading and counting happens
 * 
 * @author Brian Krick 
 * @version 
 */
public class FileWork
{
    private static String input, output, currentState;
    static String[] currentRegion;
    static String[] NewEngland =          {"ME", "NH", "VT", "MA", "CT", "RI"};
    static String[] NorthEast =                 {"NY", "PA", "NJ", "DE", "MD"};
    static String[] SouthEast =      {"VA", "NC", "SC", "GA", "FL", "AL", "MS",
                                                 "TN", "KY", "WV", "AR", "LA"};
    static String[] Lakes =               {"OH", "MI", "IN", "IL", "WI", "MN"};
    static String[] Central = {"IA", "MO", "ND", "SD", "NE", "KS", "OK", "TX"};
    static String[] West =    {"MT", "WY", "CO", "NM", "AZ", "UT", "ID", "NV"};
    static String[] Pacific =                   {"WA", "OR", "CA", "AK", "HI"};
    
    /**
     * Constructor for objects of class FileWork
     */
    public FileWork()
    {
        
    } 
    
    /**
     * 
     * @param - String FileName
     * @return - String answer
     */
    public static void FindState(File file)
    {
        try
        {
          Scanner reader = new Scanner(new FileReader(file));
          currentState = reader.next();
          currentRegion = checkAllRegions(currentState);
          while (reader.hasNextLine())
          {
              output = reader.next() + " ";
              output += computeScore(reader.next(), reader.next(), reader.next(), reader.next());
              System.out.println(output);
           }
          reader.close();
        }
        catch (Exception ex)
        {
            
        }        
    } 
    
    /**
     * Simple Checking to determine the region of the file
     */
    public static String[] checkAllRegions(String state)
    {
        if (checkRegion(state, NewEngland))
        {
            return NewEngland;
        }
        else if (checkRegion(state, NorthEast))
        {
            return NorthEast;
        }
        else if (checkRegion(state, SouthEast))
        {
            return SouthEast;
        }
        else if (checkRegion(state, Lakes))
        {
            return Lakes;
        }
        else if (checkRegion(state, Central))
        {
            return Central;
        }
        else if (checkRegion(state, West))
        {
            return West;
        }
        else if (checkRegion(state, Pacific))
        {
            return Pacific;
        }
        return currentRegion;
    }
    
    /**
     * Simple function to loop through any region given to it and check if the State entered is part of that
     * region
     * @param - String state is the state you wish to check
     * @param - String[] region is the region you wish to check
     * @return - boolean, true if the state is in that region, false if not
     */
    public static boolean checkRegion(String state, String[] region)
    {
        boolean found = false;
        for (int i = 0; i < region.length; i++)
        {
            if (state.equals(region[i]))
            {
                found = true;
            }
        }
        return found;
    }
    
    /**
     * Function to compute candidates Score. HomeState, Commercials, Days Running, Caucas Wins passed in as
     * strings, converts and computes the score, returns a string form of the score to be printed
     */
    public static String computeScore(String HomeState, String CommercialsIn, String DaysIn, String WinsIn)
    {
        int Commercials = Integer.parseInt(CommercialsIn), Days = Integer.parseInt(DaysIn), 
            Wins = Integer.parseInt(WinsIn), Score = 0;
        
        if(HomeState.equals(currentState))
        {
            Score += 50;
        }
        if(!(HomeState.equals(currentState)) && checkRegion(HomeState, currentRegion))
        {
            Score += 20;
        } 
        Score += ( Commercials - (Commercials%10) ) / 10;
        Score += Days;
        Score += (Wins * 5);
        return new Integer(Score).toString();
    }
    
    
    /**
     * This Function uses the file chooser to select the file you wish to read
     */
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
