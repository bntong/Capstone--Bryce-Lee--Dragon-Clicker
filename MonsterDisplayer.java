import javax.swing.*; // JFrame, JButton, JPanel, JLabel, ImageIcon.
import java.awt.event.*;//ActionListener, ActionEvent, KeyListener
import java.awt.BorderLayout;
import java.awt.*; //Color, Image
import java.io.*;
/**
 * Write a description of class Monsters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonsterDisplayer extends JLabel
{
    //List<ImageIcon> monsterList = new ArrayList<ImageIcon>();
    ImageIcon[] monsterList = new ImageIcon[10];
    JFrame frame= new JFrame();
    JLabel monster= new JLabel();
    ImageIcon currentImage;

    /**
     * Constructor for objects of class Monsters
     */
    public MonsterDisplayer() 
    {     
        frame = new JFrame();
        ImageIcon[] monsterList = new ImageIcon[10];
        JLabel sprite= new JLabel();
        ImageIcon image = new ImageIcon("Background.jpg");
        monster.setIcon(image);
        frame.add(monster);
        KeyboardListener key= new KeyboardListener();
        
        this.monsterList[0]=image;
        
        this.frame.addKeyListener(key);
        this.frame.setSize(500, 500);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    public ImageIcon getImage()
    {
        return this.monsterList[0]; 
        //currentImage;
    }

    public void changeSprite()
    {
    }

    public static void main (String[] args)
    {
        MonsterDisplayer mon= new MonsterDisplayer();
    }
    public class KeyboardListener implements KeyListener
    {

        public void keyPressed(KeyEvent e)
        {
         //System.out.print(e.getKeyChar());
         System.out.println(getImage());
         getImage();
        }
        public void keyReleased(KeyEvent e)
        {
        }
        public void keyTyped(KeyEvent e)
        {
        }
    }
        
}
