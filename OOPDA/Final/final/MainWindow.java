import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class MainWindow here.
 * 
 * @author Brian Krick 
 * @version (a version number or a date)
 */
public class MainWindow extends JPanel
{
    private static JButton btnHelp = new JButton("Help");
    private JTextField tfLabel = new JTextField("RESULTS HERE!");

    /**
     * Constructor for objects of class MainWindow
     */
    public MainWindow()
    {       
        setLayout(new BorderLayout());
        
        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        
        centerPanel.add(btnHelp);
        btnHelp.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {
                changeLabel(); } });
        btnHelp.setVisible(false);
        
        JPanel southPanel = new JPanel();
        add(southPanel, BorderLayout.SOUTH);
        southPanel.add(tfLabel);
        tfLabel.setVisible(false);
        
    }
    
    
    public static void showHelpButton()
    {
        btnHelp.setVisible(true);
    }
    
    /**
     * The label doesn't appear at first, need to resize
     */
    public void changeLabel()
    {
        tfLabel.setText("Brian Krick");
        tfLabel.setVisible(true);
    }

}
