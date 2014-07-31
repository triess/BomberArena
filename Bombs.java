import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bombs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bombs extends Actor
{
    /**
     * Act - do whatever the Bombs wants to do. This method is called whenever
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
        Actor PlayerRed = this.getOneObjectAtOffset(0,0,PlayerRed.class);
        if(PlayerRed != null)
        {
            getWorld().removeObject(PlayerRed);
        }
        Actor PlayerBlue = this.getOneObjectAtOffset(0,0,PlayerBlue.class);
        if(PlayerBlue != null)
        {
            getWorld().removeObject(PlayerBlue);
        }
    }
}
