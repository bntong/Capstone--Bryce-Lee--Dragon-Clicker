import javax.swing.*; // JFrame, JButton, JPanel, JLabel, ImageIcon.
import java.awt.event.*;//ActionListener, ActionEvent, KeyListener
import java.awt.BorderLayout;
import java.awt.*; //Color, Image
import java.io.*;
/**
 * MonsterDisplayer is a class that is used to chagne the monster sprites that appear in ButtonClicker.
 * 
 * @author Bryce Lee 
 * @version 5/3/2016
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
        //JLabel sprite= new JLabel();
        ImageIcon image = new ImageIcon("Background.jpg");
        monster.setIcon(image);// Label
        //frame.add(monster);
        KeyboardListener key= new KeyboardListener();
        
        this.monsterList[0]=image;
        this.monsterList[1]=image;
        this.monsterList[2]=image;
        this.monsterList[3]=image;
        this.monsterList[4]=image;
        this.monsterList[5]=image;
        this.monsterList[6]=image;
        this.monsterList[7]=image;
        this.monsterList[8]=image;
        this.monsterList[9]=image;
        
        
        this.frame.addKeyListener(key);
        this.frame.setSize(500, 500);
        //this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        //this.frame.setVisible(true);
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
