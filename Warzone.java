import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Warzone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warzone extends World
{
    private GreenfootSound music= new GreenfootSound("warzoneSound.mp3");
    /**
     * Constructor for objects of class Warzone.
     * 
     */
    public Warzone()
    {    
        super(34, 20, 30); 
        prepare();
    }
    private void prepare()
    {
        music.playLoop();
        music.setVolume(40);
        
        
        int xWall = 7;
        int yWall = 0;
        int yB = 4;
        int xBar = 11;
        int yBar = 4;
        for(int i = 0;i<12;i++)
        {
            addObject(new Barrol(),9,yBar);
            addObject(new Barrol(),24,yBar);
            yBar++;
        }
        for(int i = 0;i<12;i++)
        {
            addObject(new Barrol(),xBar,2);
            addObject(new Barrol(),xBar,17);
            xBar++;
        }
        for (int i = 0;i<12;i++)       
        {
            addObject(new Barrol(),11,yB);
            addObject(new Barrol(),12,yB);
            addObject(new Barrol(),13,yB);
            addObject(new Barrol(),14,yB);
            addObject(new Barrol(),15,yB);
            addObject(new Barrol(),16,yB);
            addObject(new Barrol(),17,yB);
            addObject(new Barrol(),18,yB);
            addObject(new Barrol(),19,yB);
            addObject(new Barrol(),20,yB);
            addObject(new Barrol(),21,yB);
            addObject(new Barrol(),22,yB);
            yB++;
        }
        for(int i = 0;i < 20;i++)
        {
            addObject(new Wall(),7,yWall);
            addObject(new Wall(),26,yWall);
            addObject(new Wall(),xWall,0);
            addObject(new Wall(),xWall,29);
            
            yWall = yWall + 1;
            xWall = xWall + 1;
        }
        LebensanzeigeRot lebensanzeigerot = new LebensanzeigeRot();
        addObject(lebensanzeigerot,3,0);
        
        LebensanzeigeBlue lebensanzeigeblue = new LebensanzeigeBlue();
        addObject(lebensanzeigeblue,30,0);
        
        PlayerRed playerred = new PlayerRed(lebensanzeigerot);
        addObject(playerred,8,1);
        
        PlayerBlue playerblue = new PlayerBlue(lebensanzeigeblue);
        addObject(playerblue,25,18);
        
        addObject(new Wall(),9,2);
        addObject(new Wall(),10,2);
        addObject(new Wall(),9,3);
        
        addObject(new Wall(),23,2);
        addObject(new Wall(),24,2);
        addObject(new Wall(),24,3);
        
        addObject(new Wall(),9,17);
        addObject(new Wall(),10,17);
        addObject(new Wall(),9,16);
        
        addObject(new Wall(),23,17);
        addObject(new Wall(),24,17);
        addObject(new Wall(),24,16);
        
        addObject(new Barrol(),25,8);
        addObject(new Barrol(),25,9);
        addObject(new Barrol(),25,10);
        addObject(new Barrol(),25,11);
        
        addObject(new Barrol(),15,1);
        addObject(new Barrol(),16,1);
        addObject(new Barrol(),17,1);
        addObject(new Barrol(),18,1);
        
        addObject(new Barrol(),8,8);
        addObject(new Barrol(),8,9);
        addObject(new Barrol(),8,10);
        addObject(new Barrol(),8,11);
        
        addObject(new Barrol(),15,18);
        addObject(new Barrol(),16,18);
        addObject(new Barrol(),17,18);
        addObject(new Barrol(),18,18);
        
    }
}
