import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * GUI of the Calculator
 * 
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
        super("Calculator");
        makeMenu();
        setContents(new MainWindow());
        
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
        fileMenu.add(exitItem);
        exitItem.addActionListener(new ActionListener() 
        {public void actionPerformed(ActionEvent e) 
            {
                quitProgram(); } });
        
        JMenuItem helpItem = new JMenuItem("Help");
        menubar.add(helpItem);
        
                
        
        
    }

    
}
