import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LebensanzeigeRot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LebensanzeigeRot extends Lebensanzeige
{
    private GreenfootImage image1 = new GreenfootImage("Lebensanzeig_rot.png");
    private GreenfootImage image2 = new GreenfootImage("Lebensanzeig_rot_gold.png");
    private GreenfootImage image3 = new GreenfootImage("Lebensanzeig_rot4.png");
    private GreenfootImage image4 = new GreenfootImage("Lebensanzeig_rot3.png");
    private GreenfootImage image5 = new GreenfootImage("Lebensanzeig_rot2.png");
    private GreenfootImage image6 = new GreenfootImage("Lebensanzeig_rot1.png");
    private GreenfootImage image7 = new GreenfootImage("Lebensanzeig_rot0.png");
    public int HProt = 5;
    public void act() 
    {
        setImage();
   }
       public void HPup()
   {
       HProt++;
   }
   public void HPdown()
   {
       HProt--;
    }
   public void setImage()
    {
        switch(HProt)
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
