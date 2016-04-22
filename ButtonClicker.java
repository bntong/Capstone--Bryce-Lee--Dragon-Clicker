import javax.swing.*; // JFrame, JButton, JPanel, JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class ButtonClicker
{
    private static final int FRAME_WIDTH= 350;// in pixels
    private static final int FRAME_HEIGHT= 500;
    private String action;
    private int health;
    private int coins;
    private int kills;
    private JFrame frame;// Frames can only have one component
    private JButton button;
    private JButton button2;
    private JPanel panel;
    private JPanel panelTop;
    private JLabel label;

    public ButtonClicker()
    {
        this.health= 100;
        this.frame= new JFrame();
        this.panel= new JPanel();
        this.panelTop= new JPanel();
        this.label= new JLabel();
        BorderLayout layout= new BorderLayout();;
        
        this.button= new JButton("Attack");

        this.panelTop.add(this.label,layout.NORTH);
        this.panel.add(this.button);
        // We put the buttons in the panel, then we add it to frame
        this.button2= new JButton("Collect");
        this.panel.add(this.button2);
        this.frame.add(panelTop,layout.NORTH);
        this.frame.add(panel,layout.SOUTH);

        ClickListener listener= new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);

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
              health-= 5;
              if (health<=0)
                {
                health=100;
                kills++;
               }
              label.setText("HP is now" + health);
            }
            if(action.equals("Collect"))
            {
                coins+=kills;
            }
            
        }

    }
}