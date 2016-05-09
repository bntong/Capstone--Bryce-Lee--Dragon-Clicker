import javax.swing.*; // JFrame, JButton, JPanel, JLabel, ImageIcon.
import java.awt.event.*;//ActionListener, ActionEvent, KeyListener
import java.awt.BorderLayout;
import java.awt.*; //Color, Image
import java.io.*;
import java.util.*;
/**
 * MonsterDisplayer is a class that is used to chagne the monster sprites that appear in ButtonClicker.
 * 
 * @author Bryce Lee 
 * @version 5/3/2016
 */
public class MonsterDisplayer extends JLabel
{
    //List<ImageIcon> monsterList = new ArrayList<ImageIcon>();
    ImageIcon[] monsterList = new ImageIcon[7];
    JFrame frame= new JFrame();
    JPanel panel= new JPanel();
    JLabel monster= new JLabel();
    ImageIcon currentImage;
    double num;
    /**
     * Constructor for objects of class Monsters
     */
    public MonsterDisplayer() 
    {     
        //frame = new JFrame();
        //panel = new JPanel();
        this.num =0;
        ImageIcon[] monsterList = new ImageIcon[7];
        JLabel sprite= new JLabel();
        //ImageIcon image = new ImageIcon("Background.jpg");
        
        this.monsterList[0]=new ImageIcon("Background.jpg");
        this.monsterList[1]=new ImageIcon("BlackDragon.png");
        this.monsterList[2]=new ImageIcon("Dragon1.png");
        this.monsterList[3]=new ImageIcon("Dragon2.png");
        this.monsterList[4]=new ImageIcon("LicheDragon.png");
        this.monsterList[5]=new ImageIcon("Metallic_Dragon.png");
        this.monsterList[6]=new ImageIcon("Muspelheim.png");
        //monster.setIcon(image);// Label
        monster.setIcon((ImageIcon)this.monsterList[(int)num]);
        //panel.add(monster);
        //frame.add(panel);
        KeyboardListener key= new KeyboardListener();
        Random gen= new Random();
        
        
        //this.frame.addKeyListener(key);
        //this.frame.setSize(500, 500);
        //this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        //this.frame.setVisible(true);
    }
    public ImageIcon getImage()
    {
        this.num= Math.random()*7.0;
        return this.monsterList[(int)this.num]; 
        //currentImage;
    }

    public void changeSprite()
    {
        monster.setIcon((ImageIcon)this.monsterList[(int)this.num]);
        revalidate();
        repaint();
        //panel.add(monster);
        
    }

    public static void main (String[] args)
    {
        MonsterDisplayer mon= new MonsterDisplayer();
    }
    public class KeyboardListener implements KeyListener
    {

        public void keyPressed(KeyEvent e)
        {
            
         //System.out.println(getImage());
         getImage();
         changeSprite();
        }
        public void keyReleased(KeyEvent e)
        {
        }
        public void keyTyped(KeyEvent e)
        {
        }
    }
        
}
