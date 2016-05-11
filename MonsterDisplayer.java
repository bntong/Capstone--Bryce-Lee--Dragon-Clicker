import java.awt.event.*;//ActionListener, ActionEvent, KeyListener
import javax.swing.*; // JFrame, JButton, JPanel, JLabel, ImageIcon.
import java.util.*;
import java.awt.*; //Color, Image
import java.io.*;
import java.awt.BorderLayout;
/**
 * MonsterDisplayer is a class that is used to change the monster sprites 
 * that appear in ButtonClicker.
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
        this.num =0;
        ImageIcon[] monsterList = new ImageIcon[7];
        JLabel sprite= new JLabel();

        this.monsterList[0]=new ImageIcon("Background.jpg");
        this.monsterList[1]=new ImageIcon("BlackDragon.png");
        this.monsterList[2]=new ImageIcon("Dragon1.png");
        this.monsterList[3]=new ImageIcon("Dragon2.png");
        this.monsterList[4]=new ImageIcon("LicheDragon.png");
        this.monsterList[5]=new ImageIcon("Metallic_Dragon.png");
        this.monsterList[6]=new ImageIcon("Muspelheim.png");

        monster.setIcon((ImageIcon)this.monsterList[(int)num]);
        KeyboardListener key= new KeyboardListener();
        Random gen= new Random();

    }

    /**
     * This method will choose a random ImageIcon from the list created.
     * @return Returns an ImageIcon object using a specific string
     */
    public ImageIcon getImage()
    {
        this.num= Math.random()*monsterList.length;
        return this.monsterList[(int)this.num]; 
    }

    /**
     *  This will start the MonsterDisplayer when called upon.
     */
    public static void main (String[] args)
    {
        MonsterDisplayer mon= new MonsterDisplayer();
    }
    public class KeyboardListener implements KeyListener
    {

        public void keyPressed(KeyEvent e)
        {
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
