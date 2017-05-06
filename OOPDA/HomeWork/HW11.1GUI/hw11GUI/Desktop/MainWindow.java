import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class MainWindow here.
 * 
 * @author Brian Krick 
 * @version (a version number or a date)
 */
public class MainWindow extends JPanel
{
    private JButton btnMC = new JButton("MC");
    private JButton btnMR = new JButton("MR");
    private JButton btnMW = new JButton("MW");
    private JButton btnMPlus = new JButton("M+");
    private JButton btn0 = new JButton("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");
    private JButton btnPlus = new JButton("+");
    private JButton btnMinus = new JButton("-");
    private JButton btnTimes = new JButton("*");
    private JButton btnDivide = new JButton("/");
    private JButton btnEquals = new JButton("=");
    private JButton btnDecimal = new JButton(".");
    private JButton btnReverse = new JButton("+-");
    private JButton btnBack = new JButton("<-");
    private JButton btnCE = new JButton("CE");
    private JButton btnC = new JButton("C");

    /**
     * Constructor for objects of class MainWindow
     */
    public MainWindow()
    {       
        setLayout(new BorderLayout());
        
        //North Panel
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        JTextField tfEntry = new JTextField("0", 10);
        northPanel.add(tfEntry);
        
        //Center Panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(6, 4));
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(btnMC);
        centerPanel.add(btnMR);
        centerPanel.add(btnMW);
        centerPanel.add(btnMPlus);
        centerPanel.add(btn7);
        centerPanel.add(btn8);
        centerPanel.add(btn9);
        centerPanel.add(btnDivide);
        centerPanel.add(btn4);
        centerPanel.add(btn5);
        centerPanel.add(btn6);
        centerPanel.add(btnTimes);
        centerPanel.add(btn1);
        centerPanel.add(btn2);
        centerPanel.add(btn3);
        centerPanel.add(btnMinus);
        centerPanel.add(btnDecimal);
        centerPanel.add(btn0);
        centerPanel.add(btnReverse);
        centerPanel.add(btnPlus);
        centerPanel.add(btnBack);
        centerPanel.add(btnCE);
        centerPanel.add(btnC);
        centerPanel.add(btnEquals);
        
        
        //South Panel
        JPanel southPanel = new JPanel(); 
        southPanel.setLayout(new BorderLayout());
        add(southPanel, BorderLayout.SOUTH);
        JTextField tfCalc = new JTextField("", 10);
        southPanel.add(tfCalc);
        
    }
    
    

}
