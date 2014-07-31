import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExplosionBlue here.
 * 
 * @author Tim
 * @version 1.0
 */
public class ExplosionBlue extends Explosion
{
    private GreenfootImage image1;
	private String image;
	public int timeToStay = 5;
	
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
    
    public void disappear()
    {
        timeToStay = timeToStay - 1;
        if(timeToStay == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
