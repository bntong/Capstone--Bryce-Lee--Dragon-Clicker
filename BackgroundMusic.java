import java.awt.*;
import java.applet.*; // AudioClip, Applet
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.util.Scanner;
/**
 * BackgroundMusic will play the start the background music when the program runs.
 * 
 * @author Bryce Lee 
 * @version 4/28/2016
 */
public class BackgroundMusic
{
    public BackgroundMusic() throws Exception
    {
      //String name= "file://Dragonforce-TTFAF.wav";
      URL music= this.getClass().getClassLoader().getResource("Dragonforce-TTFAF.wav");
      AudioClip clip= Applet.newAudioClip(music);
      clip.play();
      
      Scanner scan= new Scanner(System.in);
    }
    public static void main(String[] args) throws Exception
    {
        BackgroundMusic music= new BackgroundMusic();
    }   
}
