import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
/**
 * Write a description of class TheMenuGame here.
 * 
 * @author Bryce Lee
 * @version 1.0
 */
public class TheBoxGame extends JFrame
{
    // instance variables - replace the example below with your own
    private int gold;
    private int health;
    JPanel grid= new JPanel();
    testbutton buttons[]=new testbutton[12];
    
    public static void main (String args[])
    {
        new TheBoxGame();
    }
    
    /**
     * Constructor for objects of class TheMenuGame
     */
    public TheBoxGame()
    {
        super("The Box Game");
        this.gold = 0;
        this.health= 100;
        setSize(400,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        grid.setLayout(new GridLayout(3,5));
        grid.setBackground(Color.WHITE);
        for (int i=0; i<12;i++)
        {
            buttons[i]=new testbutton();
            grid.add(buttons[i]);
        }
        setVisible(true);
        
        GameViewer start= new GameViewer();
    }
    
}
