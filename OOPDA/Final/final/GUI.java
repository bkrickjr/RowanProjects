import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**   ******************************
 * Write a description of class GUI here.
 * 
 *  GUI class has<br />
–   Menu: File  Help<br />
        Print <br />
        Read File <br />
        Exit <br />
–   Print Menu Item under File – this calls printAll after loading data (note print will be to the console, not the frame)<br />
–   Exit Menu Item exits program<br />
–   Help Menu loads a button onto the center of the frame.<br />
–   Clicking the button displays the author centered below the button. <br />
–   Read File – read a text file selected from a file chooser, writing the contents of the file to the console.<br />

 * @author Brian Krick 
 * @version 
 */
public class GUI extends JFrame
{
    

     /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        super("Final");
        makeMenu();
        setContents(new MainWindow());
        setSize(400, 400);
    }    

    /**
     * sets the contents of The JPanel you pass it
     */
    public void setContents(JPanel jp)
    {
        Container ContentPane = getContentPane();
        this.setVisible(false);
        ContentPane.removeAll();
        ContentPane.add(jp);
        this.pack();
        this.setVisible(true);
    }
    
    public void quitProgram()
    {
        System.exit(0);
    }
    
    /**
     * creates a menu with File, leads to Exit, and Help
     */
    public void makeMenu()
    {
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        
        JMenuItem exitItem = new JMenuItem("Exit");        
        exitItem.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e) 
            {
                quitProgram(); } });
        
        JMenuItem helpItem = new JMenuItem("Help");
        menubar.add(helpItem);
        helpItem.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {                
            MainWindow.showHelpButton();} } );
                        
        JMenuItem printItem = new JMenuItem("Print");        
        printItem.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) 
            {
                try{
                    CompileCarRentalAgency.testMethods(); 
                }
                catch (Exception ex)
                {
                    ex.toString();
                } } });
        
        JMenuItem ReadItem = new JMenuItem("Read File");
        ReadItem.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {                
            String temp = FileWork.FindL(FileWork.getFile());
            System.out.println(temp);} } );
        
        
        fileMenu.add(printItem);
        fileMenu.add(ReadItem);
        fileMenu.add(exitItem);
        
      
    }    
        
}
