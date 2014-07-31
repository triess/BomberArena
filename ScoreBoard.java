import greenfoot.*;  // (World, Actor, GreenfootImage und Greenfoot)
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

/**
 * Das ScoreBoard wird verwendet, um die Ergebnisse auf dem Bildschirm anzuzeigen. 
 * Es kann etwas Text und einige Zahlen anzeigen.
 * 
 * @author M Kolling
 * @version 1.0
 */
public class ScoreBoard extends Actor
{
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 300;
	
    public ScoreBoard(String winner)
    {
        makeImage("Spiel beendet",winner);
    }
    
    public ScoreBoard()
    {
        makeImage("Spieler1: W,A,S,D - Laufen"," Space - Bombe","Spieler2: Pfeiltasten - Laufen "," L - Bombe");
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Erzeugt das Bild der Anzeigetafel.
     */
    private void makeImage(String title, String winner)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(255,255,255, 128));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 60, 100);
        image.drawString(winner, 60, 200);
        setImage(image);
    }
    
    private void makeImage(String str1,String str2,String str3,String str4)
    {
        GreenfootImage image = new GreenfootImage(900, 500);

        image.setColor(new Color(255,255,255, 128));
        image.fillRect(0, 0, 900, 500);
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, 900-10, 500-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(str1, 60, 100);
        image.drawString(str2, 60, 200);
        image.drawString(str3, 60, 300);
        image.drawString(str4, 60, 400);
        setImage(image);
    }
}
