import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mountains here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mountains extends World
{
    private GreenfootSound music= new GreenfootSound("mountainSound.mp3");
    /**
     * Constructor for objects of class Mountains.
     * 
     */
    public Mountains()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(34, 20, 30); 
        
        prepare();
    }
    

    public void prepare()
    {
        music.playLoop();
        music.setVolume(30);
        
        int xWall=7;
        int yWall=0;
        for(int i = 0;i < 20;i++)
        {
            addObject(new Wall(),7,yWall);
            addObject(new Wall(),26,yWall);
            addObject(new Wall(),xWall,0);
            addObject(new Wall(),xWall,29);

            yWall = yWall + 1;
            xWall = xWall + 1;
        }
        int x=9;
        for(int i=0;i<4;i++)
        {
            addObject(new Wall(), x, 2);
            addObject(new Wall(),x, 4);
            addObject(new Wall(), x, 6);
            addObject(new Wall(),x, 8);
            addObject(new Wall(),x, 11);
            addObject(new Wall(), x, 13);
            addObject(new Wall(),x, 15);
            addObject(new Wall(), x, 17);
            x=x+2;
        }
        int z=18;
        for(int i=0;i<4;i++)
        {
            addObject(new Wall(), z, 2);
            addObject(new Wall(),z, 4);
            addObject(new Wall(), z, 6);
            addObject(new Wall(),z, 8);
            addObject(new Wall(),z, 11);
            addObject(new Wall(), z, 13);
            addObject(new Wall(),z, 15);
            addObject(new Wall(), z, 17);
            z=z+2;
        }
        int a=8;
        int b=3;
        for(int i=0;i<3;i++)
        {
            a=8;
            for(int i2=0;i2<18;i2++)
            {
                    addObject(new Barrol(),a,b);
                    a++;
                }
                b=b+2;
        }
        b=12;
        for(int i=0;i<3;i++)
        {
            a=8;
            for(int i2=0;i2<18;i2++)
            {

                addObject(new Barrol(),a,b);
                a++;
            }
            b=b+2;
        } 
        LebensanzeigeRot lebensanzeigerot = new LebensanzeigeRot();
        addObject(lebensanzeigerot,3,0);

        LebensanzeigeBlue lebensanzeigeblue = new LebensanzeigeBlue();
        addObject(lebensanzeigeblue,30,0);

        PlayerRed playerred = new PlayerRed(lebensanzeigerot);
        addObject(playerred,8,1);

        PlayerBlue playerblue = new PlayerBlue(lebensanzeigeblue);
        addObject(playerblue,25,18);
        
        Barrol barrol = new Barrol();
        addObject(barrol, 16, 18);
        Barrol barrol2 = new Barrol();
        addObject(barrol2, 17, 18);
        Barrol barrol3 = new Barrol();
        addObject(barrol3, 16, 1);
        Barrol barrol4 = new Barrol();
        addObject(barrol4, 17, 1);
        Barrol barrol5 = new Barrol();
        addObject(barrol5, 16, 9);
        Barrol barrol6 = new Barrol();
        addObject(barrol6, 17, 9);
        Barrol barrol7 = new Barrol();
        addObject(barrol7, 17, 10);
        Barrol barrol8 = new Barrol();
        addObject(barrol8, 16, 10);
        Barrol barrol9 = new Barrol();
        addObject(barrol9, 16, 11);
        Barrol barrol11 = new Barrol();
        addObject(barrol11, 17, 11);
        Barrol barrol12 = new Barrol();
        addObject(barrol12, 17, 8);
        Barrol barrol13 = new Barrol();
        addObject(barrol13, 16, 8);
        
       
    }
}
