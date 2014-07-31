import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class LebensanzeigeBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LebensanzeigeBlue extends Lebensanzeige
{
    private GreenfootImage image1 = new GreenfootImage("Lebensanzeig_blau.png");
    private GreenfootImage image2 = new GreenfootImage("Lebensanzeig_blau-gold.png");
    private GreenfootImage image3 = new GreenfootImage("Lebensanzeig_blau4.png");
    private GreenfootImage image4 = new GreenfootImage("Lebensanzeig_blau3.png");
    private GreenfootImage image5 = new GreenfootImage("Lebensanzeig_blau2.png");
    private GreenfootImage image6 = new GreenfootImage("Lebensanzeig_blau1.png");
    private GreenfootImage image7 = new GreenfootImage("Lebensanzeig_blau0.png");
    public int HPblau = 5;
   /**
     * Animate the display to count up (or down) to the current target value.
     */
    public void act() 
    {
        
    }
   public void HPup()
   {
       HPblau++;
       setImage();
       act();
    }
   public void HPdown()
   {
       HPblau--;
       setImage();
    }
   public void setImage()
   {
        switch(HPblau)
        {
            case 0: setImage(image7);
            break;
            case 1: setImage(image6);
            break;
            case 2: setImage(image5);
            break;
            case 3: setImage(image4);
            break;
            case 4: setImage(image3);
            break;
            case 5: setImage(image1);
            break;
            case 6: setImage(image2);
            break;
            default: setImage(image1);
            break;
        }

    }
}