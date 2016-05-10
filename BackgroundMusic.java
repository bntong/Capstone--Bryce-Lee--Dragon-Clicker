import java.applet.*; // AudioClip, Applet
import java.net.URL;
/**
 * BackgroundMusic will play the start the background music when the program runs.
 * 
 * @author Bryce Lee 
 * @version 4/28/2016
 */
public class BackgroundMusic
{
    /**
     * This is the constructor of Background Music. 
     */
    public BackgroundMusic() throws Exception
    {
      URL music= this.getClass().getClassLoader().getResource("Dragonforce-TTFAF.wav");
      AudioClip clip= Applet.newAudioClip(music);
      clip.loop();
      
    }
    /**
     * Will start the music when the program is run.
     */
    public static void main(String[] args) throws Exception
    {
        BackgroundMusic music= new BackgroundMusic();
    }   
}
