import javax.swing.*; // JFrame, JButton, JPanel, JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.BorderLayout;
public class ButtonClicker
{
    private static final int FRAME_WIDTH= 450;// in pixels
    private static final int FRAME_HEIGHT= 600;
    private String action;
    // 
    private int bossHealth; // health on boss.
    private int coins; // Keeps track of how many coins.
    private int kills; // Keep track of how many kills.
    private int tempkills; //needed when collecting
    private int multiplier; // multiples the coins when collect
    private int damage; // amount of damage done by you
    private int needed; //coins for levelup
    // Variables 
    private JFrame frame;// Frames can only have one component
    // Frame^^^^^
    private JButton buttonAttack;
    private JButton buttonCollect;
    private JButton buttonLevelUp;
    // Buttons^^^^
    private JPanel panel;
    private JPanel panelTop;
    private JPanel monsterPanel;
    // Panels^^^^^
    private JLabel label;
    private JLabel label2;
    private JLabel monsterLabel;
    // Labels^^^^^
    MonsterDisplayer monster;
    ImageIcon currentImage;

    /**
     * Constructor of ButtonClicker. 
     */
    public ButtonClicker() throws Exception
    {
        this.bossHealth= 100;
        this.coins= 0;
        this.kills=0;
        this.tempkills=0;
        this.multiplier=1;
        this.damage= 5;
        this.needed= 5;
        this.monster= new MonsterDisplayer();
        BackgroundMusic music= new BackgroundMusic();
        this.currentImage= monster.getImage();
        // variables
        this.frame= new JFrame();
        ///
        this.panel= new JPanel();
        this.panelTop= new JPanel();
        this.monsterPanel= new JPanel(); //
        ////
        this.label= new JLabel();
        this.label2= new JLabel();
        this.monsterLabel = new JLabel();
        ///
        BorderLayout layout= new BorderLayout();
        // 
        this.buttonAttack= new JButton("Attack");
        this.buttonCollect= new JButton("Collect");
        this.buttonLevelUp= new JButton("Level Up");
        // Making the buttons

        this.panelTop.add(this.label,layout.NORTH);
        this.panelTop.add(this.label2,layout.SOUTH);

        // Area for the monsterLabel/////////////
        ImageIcon image= new ImageIcon("Background.jpg");
        this.monsterLabel.setIcon(currentImage);
        //////////////////////////////

        // We put the buttons in the panel, then we add it to frame
        this.panel.add(this.buttonAttack);
        this.panel.add(this.buttonCollect);
        this.panel.add(this.buttonLevelUp);
        // Adding Buttons to panels
        this.panel.setBackground(Color.BLACK);
        this.panelTop.setBackground(Color.RED);
        //this.monsterPanel.add(this.monsterLabel);
        //this.monsterPanel.setBackground(image); // want to add a image    
        // Setting Colors and background

        this.frame.add(panelTop,layout.NORTH);
        this.frame.add(monsterLabel,layout.CENTER);
         
        this.frame.add(panel,layout.SOUTH);

        ClickListener listener= new ClickListener();
        buttonAttack.addActionListener(listener);
        buttonCollect.addActionListener(listener);
        buttonLevelUp.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.frame.setResizable(false);
    }

    /**
     *  Starts the game when called upon.
     */
    public static void main (String[] args) throws Exception
    {
        ButtonClicker view= new ButtonClicker();
    }

    /**
     * Update the text for all labels.
     */
    public void labelDisplay()
    {
        label.setText("Boss HP: " + bossHealth+"\t"+" Coins: " +coins+" Kills: "+kills);
        label2.setText("You need: "+ needed+" coin to level");
    }

    /**
     * This class is the ClickListener which implements ActionListener. 
     * Will be updating all variables and text within the program.
     */
    
    public class ClickListener implements ActionListener
    {

        /**
         * Updating all variables, so the player can see the 
         */
        public void actionPerformed(ActionEvent event)
        {
            action=event.getActionCommand();
            if(action.equals("Attack"))
            {
                bossHealth-= damage;
                if (bossHealth<=0)
                {
                    bossHealth=100;
                    kills++; 
                    //monster.changeSprite();
                    currentImage= monster.getImage();
                    monsterLabel.setIcon(currentImage);
                    tempkills= tempkills+1*multiplier;
                    if(kills%5==0)
                    {
                        multiplier++;
                    }
                }
                labelDisplay();
            }
            if(action.equals("Collect"))
            {
                coins+=tempkills;
                tempkills=0;
                labelDisplay();
            }
            if (action.equals("Level Up"))
            {
                if (coins >= needed)
                {
                    damage++;
                    coins-=needed;
                    needed+=5;
                    labelDisplay();
                }

            }
        }

    }
}