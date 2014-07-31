import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class PlayerRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerRed extends Player
{
    private int bombReloadTime = 10;
    private int reloadTimeDelay;
    private int HP = 5;
    private LebensanzeigeRot anzeige;
    private int range=1;
    private GreenfootSound fail= new GreenfootSound("failSound.mp3");
    public int x;
    public int y;
    public PlayerRed(LebensanzeigeRot lebensanzeige)
    {
        anzeige = lebensanzeige;
    }
    public void act() 
    {
        move();
        placeBomb();
        managePowerUps();
        manageHP();
    }    
    
    
    public void managePowerUps()
    {
        Actor Healpot = this.getOneObjectAtOffset(0,0,Healpot.class);
        if(Healpot != null)
        {
            if(HP<=5)
            {
                HP++;
                anzeige.HPup();
            }
            getWorld().removeObject(Healpot);
        }
        Actor CDBomb = this.getOneObjectAtOffset(0,0,CDBomb.class);
        if( CDBomb!= null )
        {
            bombReloadTime--;
            getWorld().removeObject(CDBomb);
        }
        Actor RangeUp = this.getOneObjectAtOffset(0,0,RangeUp.class);
        if( RangeUp!= null )
        {
            range++;
            getWorld().removeObject(RangeUp);
        }
    }
    
    public void manageHP()
    {
        if(getOneObjectAtOffset(0,0,Explosion.class) != null)
        {
            HP--;
            anzeige.HPdown();
        }
        
        if(HP <= 0)
        {
            getWorld().addObject(new ScoreBoard("Blau gewinnt"),getWorld().getWidth()/2,getWorld().getHeight()/2);
            fail.setVolume(60);
            fail.play();
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void move()
    {
      x = getX();
      y = getY();
        if(Greenfoot.isKeyDown("d") & getOneObjectAtOffset(1, 0, Barrier.class)== null & getOneObjectAtOffset(1,0,Bombs.class)== null)
      {
          setLocation(x + 1, y);
      }    
      else if(Greenfoot.isKeyDown("a") & getOneObjectAtOffset(-1, 0, Barrier.class)== null & getOneObjectAtOffset(-1,0,Bombs.class)== null)
      {
          setLocation(x - 1, y);
      }    
      else if(Greenfoot.isKeyDown("w") & getOneObjectAtOffset(0, -1, Barrier.class)== null & getOneObjectAtOffset(0,-1,Bombs.class)== null)
      {
          setLocation(x, y - 1);
      }    
      else if(Greenfoot.isKeyDown("s") & getOneObjectAtOffset(0, 1, Barrier.class)== null & getOneObjectAtOffset(0,1,Bombs.class)== null)
      {
          setLocation(x, y + 1);
      } 
    }
    public void placeBomb()
    {
        reloadTimeDelay++;
        if(Greenfoot.isKeyDown("space"))
        {
            if(bombReloadTime <= reloadTimeDelay)
            {
                getWorld().addObject(new BombRed(range),x,y);
                reloadTimeDelay = 0;
            }
        }
    }
}
