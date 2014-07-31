import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExplosionBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplosionBlue extends Explosion
{
    private GreenfootImage image1;
    private String image;
    public ExplosionBlue(String imageName)
    {
        image = imageName;
        image1 = new GreenfootImage(image);
        setImage(image1);
    }
    public void act() 
    {
        disappear();
    }    
    public int timeToStay = 5;
    public void disappear()
    {
        timeToStay = timeToStay - 1;
        if(timeToStay == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
