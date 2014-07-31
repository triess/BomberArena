
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BombRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BombBlue extends Bombs
{
    public GreenfootSound bombensound=new GreenfootSound("bombensound.mp3");
    public BombBlue(int Range)
    {
        range = Range; 
    }
    public void act() 
    {
      getXandY();
      countingdown();  
    }
    public int countdown = 6;
    public int range;
    public int x;
    public int y;
    public void getXandY()
    {
        x = getX();
        y = getY();
    }
    public void countingdown()
    {
        countdown = countdown -1;
        if(countdown == 0)
        {
            bombensound.setVolume(15);
            bombensound.play();
            boom();
        }
    }
    public void boom()
    {
            getWorld().addObject(new ExplosionRed("ExplosionBlauMitte.png"),x,y);
            if(range==1)
            {
                if(getOneObjectAtOffset(0,1,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauUnten.png"),x,y+1);
                }
            
                if(getOneObjectAtOffset(0,-1,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauOben.png"),x,y-1);
                }
            
                if(getOneObjectAtOffset(-1,0,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauLinks.png"),x-1,y);
                }
            
                if(getOneObjectAtOffset(1,0,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauRechts.png"),x+1,y);
                }
            }
            
            if(range==2)
            {
                if(getOneObjectAtOffset(0,1,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauHoch.png"),x,y+1);
                }
            
                if(getOneObjectAtOffset(0,-1,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauHoch.png"),x,y-1);
                }
            
                if(getOneObjectAtOffset(-1,0,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauSeite.png"),x-1,y);
                }
            
                if(getOneObjectAtOffset(1,0,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauSeite.png"),x+1,y);
                }
                
                //range=2
                 if(getOneObjectAtOffset(0,2,Wall.class) == null && getOneObjectAtOffset(0,1,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauUnten.png"),x,y+2);
                 }
                 
                 if(getOneObjectAtOffset(0,-2,Wall.class) == null && getOneObjectAtOffset(0,-1,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauOben.png"),x,y-2);
                 }
                 
                 if(getOneObjectAtOffset(2,0,Wall.class) == null && getOneObjectAtOffset(1,0,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauRechts.png"),x+2,y);
                 }
                 
                 if(getOneObjectAtOffset(-2,0,Wall.class) == null && getOneObjectAtOffset(-1,0,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauLinks.png"),x-2,y);
                 }
            }
            
            if(range>=3)
            {
                if(getOneObjectAtOffset(0,1,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauHoch.png"),x,y+1);
                }
            
                if(getOneObjectAtOffset(0,-1,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauHoch.png"),x,y-1);
                }
            
                if(getOneObjectAtOffset(-1,0,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauSeite.png"),x-1,y);
                }
            
                if(getOneObjectAtOffset(1,0,Wall.class) == null)
                {
                    getWorld().addObject(new ExplosionRed("ExplosionBlauSeite.png"),x+1,y);
                }
                
                //range=2
                  if(getOneObjectAtOffset(0,2,Wall.class) == null && getOneObjectAtOffset(0,1,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauHoch.png"),x,y+2);
                 }
                 
                 if(getOneObjectAtOffset(0,-2,Wall.class) == null && getOneObjectAtOffset(0,-1,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauHoch.png"),x,y-2);
                 }
                 
                 if(getOneObjectAtOffset(2,0,Wall.class) == null && getOneObjectAtOffset(1,0,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauSeite.png"),x+2,y);
                 }
                 
                 if(getOneObjectAtOffset(-2,0,Wall.class) == null && getOneObjectAtOffset(-1,0,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauSeite.png"),x-2,y);
                 }
                 
                 //range>2
                  if(getOneObjectAtOffset(0,3,Wall.class) == null && getOneObjectAtOffset(0,2,Wall.class) == null && getOneObjectAtOffset(0,1,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauUnten.png"),x,y+3);
                 }
                 
                 if(getOneObjectAtOffset(0,-3,Wall.class) == null && getOneObjectAtOffset(0,-2,Wall.class) == null && getOneObjectAtOffset(0,-1,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauOben.png"),x,y-3);
                 }
                 
                 if(getOneObjectAtOffset(3,0,Wall.class) == null && getOneObjectAtOffset(2,0,Wall.class) == null && getOneObjectAtOffset(1,0,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauRechts.png"),x+3,y);
                 }
                 
                 if(getOneObjectAtOffset(-3,0,Wall.class) == null && getOneObjectAtOffset(-2,0,Wall.class) == null && getOneObjectAtOffset(-1,0,Wall.class) == null)
                 {
                     getWorld().addObject(new ExplosionRed("ExplosionBlauLinks.png"),x-3,y);
                 }
            }
            
            getWorld().removeObject(this);        
    }
    }
   
