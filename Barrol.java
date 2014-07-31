import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrol extends Barrier
{
    /**
     * Act - do whatever the Barrol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        die();
    }    
    public void die()
    {
        if(getOneObjectAtOffset(0,0, Explosion.class) != null)
        {
            int x = getX();
            int y = getY();
            int a = Greenfoot.getRandomNumber(100);
            if(a <= 4)
            {
                getWorld().addObject(new Healpot(),x,y);
            }
            else if(a > 4 & a <= 8)
            {
                getWorld().addObject(new CDBomb(),x,y);
            }
            else if(a > 8 & a <= 10)
            {
                getWorld().addObject(new RangeUp(),x,y);
            }
            getWorld().removeObject(this);
        }
    }
}
