import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * This is the GUI of the program
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
        super("File Handling");
        setContents(new MainWindow());
        setSize(250,250);
    }

    /**
     * sets the contents of The JPanel you pass it
     * @param - JPanel
     * @return - void
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
}
