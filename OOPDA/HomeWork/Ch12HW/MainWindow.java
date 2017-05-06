import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import java.util.EventObject;
import javax.swing.*;
/**
 * This is the Main Window of the program
 * 
 * @author Brian Krick
 * @version 
 */
public class MainWindow extends JPanel
{
    private JButton btnCountA = new JButton("Count A's");
    private JButton btnSearch = new JButton("Search");
    private JButton btnFindL = new JButton("Find Line");
    private JTextField tfSearchString = new JTextField("Search String");
    private JTextField tfStatus = new JTextField("The Results Are Displayed Here!");
    private String strSearchString;
    private String strFileName;
    
    
    /**
     * Constructor for objects of class MainWindow, this sets the GUI up to look how it should look
     */
    public MainWindow()
    {
        setLayout(new BorderLayout());
        
        //North Panel
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        add(northPanel, BorderLayout.NORTH);
        northPanel.add(btnCountA);
        
        //West Panel
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(2, 1));
        add(westPanel, BorderLayout.WEST);
        westPanel.add(tfSearchString);
        westPanel.add(btnFindL);
        
        //East Panel
        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BorderLayout());
        add(eastPanel, BorderLayout.EAST);
        eastPanel.add(btnSearch);
        
        //South Panel
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        add(southPanel, BorderLayout.SOUTH);
        southPanel.add(tfStatus);
        tfStatus.setEditable(false);
        
        
        addListeners();
    }

    /**
     * This method adds the listeners to the buttons used in the GUI
     * @param - none
     * @return - void
     */
    private void addListeners()
    {
        Actions act = new Actions();
        btnCountA.addActionListener(act);
        btnSearch.addActionListener(act);
        btnFindL.addActionListener(act);
    }
    
    /**
     * This is the listener class for the 3 buttons used in this GUI
     */
    private class Actions implements ActionListener
    {
        /**
         * The default method for a listener class, this reacts to specific button actions
         * @param - ActionEvent e
         * @return - void
         */
        public void actionPerformed(ActionEvent e)
        {
                String fileName;
                if(e.getSource() == btnCountA)
                {
                    //fileName = JOptionPane.showInputDialog( "Please select the file name:" );
                    int temp = FileWork.FindA(FileWork.getFile());
                    tfStatus.setText(temp + " A's");
                }
                else if (e.getSource() == btnSearch)
                {
                    //fileName = JOptionPane.showInputDialog( "Please select the file name:" );
                    String word = tfSearchString.getText();
                    int temp = FileWork.Search(FileWork.getFile(), word);
                    tfStatus.setText(word + " comes up " + temp + " times");
                    tfSearchString.setText("Search String");
                }
                else if (e.getSource() == btnFindL)
                {
                    //fileName = JOptionPane.showInputDialog( "Please select the file name:" );
                    String temp = FileWork.FindL(FileWork.getFile());
                    tfStatus.setText(temp);
                }
        }
    }

}
