import javax.swing.*; // JFrame, JButton, JPanel, JLabel, ImageIcon.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
    Image[] monsterList = new Image[10];	
    JFrame frame= new JFrame();
	JLabel monster= new JLabel();
    ImageIcon currentImage;

    /**
     * Constructor for objects of class Monsters
     */
    public MonsterDisplayer() 
    {     
		frame = new JFrame();
        Image[] monsterList = new Image[10];
        JLabel sprite= new JLabel();
        ImageIcon image = new ImageIcon("Background.jpg");
		monster.setIcon(image);
    	frame.add(monster);
	
	    this.frame.setSize(500, 500);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    public ImageIcon getImage()
    {
        return currentImage;
    }

    public void changeSprite()
    {

    }

    public static void main (String[] args)
    {
        MonsterDisplayer mon= new MonsterDisplayer();
    }
}
