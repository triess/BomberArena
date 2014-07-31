import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worlds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worlds extends Buttons
{
    /**
     * Act - do whatever the Worlds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            
            getWorld().addObject(new MountainButton(), 16, 5);
            getWorld().addObject(new WarzoneButton(), 16, 8);
			getWorld().removeObjects(getObjectsInRange(9000, Help.class));
            getWorld().removeObject(this);
        }
    }    
}
