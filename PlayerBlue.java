
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class PlayerBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerBlue extends Player
{
    private int bombReloadTime = 8;
    private int reloadTimeDelay;
    private int HP = 5;
    private int range = 1;
    private GreenfootSound fail= new GreenfootSound("failSound.mp3");
    private LebensanzeigeBlue anzeige;

    public int x;
    public int y;

    public boolean BarrierLeft1;
    public boolean BarrierRight1;
    public boolean BarrierTop1;
    public boolean BarrierBottom1;
    public boolean BarrierTopRight;
    public boolean BarrierTopLeft;
    public boolean BarrierBottomLeft;
    public boolean BarrierBottomRight;

    public int WalkingDirection;
	
	
    public PlayerBlue(LebensanzeigeBlue lebensanzeige)
    {
        anzeige = lebensanzeige;
        WalkingDirection = Greenfoot.getRandomNumber(3)+1;
    }
	
    public void act() 
    {
       reloadTimeDelay++;
       placeBomb();
       move();
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
    
    public void move()
    {
      x = getX();
      y = getY();
        if(Greenfoot.isKeyDown("right") & getOneObjectAtOffset(1, 0, Barrier.class)== null & getOneObjectAtOffset(1,0,Bombs.class)== null)
      {
          setLocation(x + 1, y);
      }    
      else if(Greenfoot.isKeyDown("left") & getOneObjectAtOffset(-1, 0, Barrier.class)== null & getOneObjectAtOffset(-1,0,Bombs.class)== null)
      {
          setLocation(x - 1, y);
      }    
      else if(Greenfoot.isKeyDown("up") & getOneObjectAtOffset(0, -1, Barrier.class)== null & getOneObjectAtOffset(0,-1,Bombs.class)== null)
      {
          setLocation(x, y - 1);
      }    
      else if(Greenfoot.isKeyDown("down") & getOneObjectAtOffset(0, 1, Barrier.class)== null & getOneObjectAtOffset(0,1,Bombs.class)== null)
      {
          setLocation(x, y + 1);
      } 
    }
    
    public void placeBomb()
    {
        reloadTimeDelay++;
        if(Greenfoot.isKeyDown("l"))
        {
            if(bombReloadTime <= reloadTimeDelay)
            {
                getWorld().addObject(new BombBlue(range),x,y);
                reloadTimeDelay = 0;
            }
        }
    }
    
    public void manageHP()
    {
        if(getOneObjectAtOffset(0,0,Explosion.class)!= null)
        {
            HP--;
            anzeige.HPdown();
        }
       
        if(HP <= 0)
        {
            getWorld().addObject(new ScoreBoard("Rot gewinnt"),getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().removeObject(this);
            fail.setVolume(60);
            fail.play();
            Greenfoot.stop();
        }
    }
   
}
