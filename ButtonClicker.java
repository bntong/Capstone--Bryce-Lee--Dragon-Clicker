import javax.swing.*; // JFrame, JButton, JPanel, JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class ButtonClicker
{
    private static final int FRAME_WIDTH= 350;// in pixels
    private static final int FRAME_HEIGHT= 500;
    private String action;
    // 
    private int health;
    private int coins;
    private int kills;
    private int tempkills;
    private int multiplier;
    private int damage;
    private int needed; //coins for levelup
    // Variables 
    private JFrame frame;// Frames can only have one component
    // Frame^^^^^
    private JButton buttonAttack;
    private JButton buttonCollect;
    private JButton buttonLevelUp;
    // Buttons^^^^^
    private JPanel panel;
    private JPanel panelTop;
    // Panels^^^^^
    private JLabel label;
    private JLabel label2;
    // Labels^^^^^
    private JPanel monsterPanel;
    
    public ButtonClicker()
    {
        this.health= 100;
        this.coins= 0;
        this.kills=0;
        this.tempkills=0;
        this.multiplier=1;
        this.damage= 5;
        this.needed= 5;
        // variables
        this.frame= new JFrame();
        this.panel= new JPanel();
        this.panelTop= new JPanel();
        this.monsterPanel= new JPanel();
        this.label= new JLabel();
        this.label2= new JLabel();
        BorderLayout layout= new BorderLayout();;
        
        this.buttonAttack= new JButton("Attack");
        this.buttonCollect= new JButton("Collect");
        this.buttonLevelUp= new JButton("Level Up");
        // Making the buttons
        this.panelTop.add(this.label,layout.NORTH);
        this.panelTop.add(this.label2,layout.SOUTH);
  
        // We put the buttons in the panel, then we add it to frame
        this.panel.add(this.buttonAttack);
        this.panel.add(this.buttonCollect);
        this.panel.add(this.buttonLevelUp);
        //
        this.frame.add(panelTop,layout.NORTH);
        this.frame.add(panel,layout.SOUTH);
        
        ClickListener listener= new ClickListener();
        buttonAttack.addActionListener(listener);
        buttonCollect.addActionListener(listener);
        buttonLevelUp.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main (String[] args)
    {
        ButtonClicker view= new ButtonClicker();
    }

    public class ClickListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
            action=event.getActionCommand();
            if(action.equals("Attack"))
            {
              health-= damage;
              if (health<=0)
                {
                health=100;
                kills++;
                tempkills= tempkills+1*multiplier;
                if(kills%5==0)
                {
                    multiplier++;
                }
               }
              label.setText("HP: " + health+"\t"+" Coins: " +coins+" Kills: "+kills);
              label2.setText("You need: "+ needed+" coins to level");
            }
            if(action.equals("Collect"))
            {
                coins+=tempkills;
                tempkills=0;
                label.setText("HP: " + health+"\t"+" Coins: " +coins+" Kills: "+kills);
                label2.setText("You need: "+ needed+" coin to level");
            }
            if (action.equals("Level Up"))
            {
                if (coins >= needed)
                {
                    damage++;
                    coins-=needed;
                    needed+=5;
                    label.setText("HP: " + health+"\t"+" Coins: " +coins+" Kills: "+kills);
                    label2.setText("You need: "+ needed+" coin to level");
                }
            }
        }

    }
}