import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }  
    public void destroyAndKill()
    {
        Actor Barrol = this.getOneObjectAtOffset(0,0,Barrol.class);
        if(Barrol != null)
        {
            getWorld().removeObject(Barrol);
        }
    }
}
