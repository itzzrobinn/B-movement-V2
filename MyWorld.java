import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        bee bee1 = new bee();
        addObject(bee1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        Dolphin dolphin1 = new Dolphin();
        addObject(dolphin1,Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        for (int i = 0; i < 9; i++) {
         Cactus cactus1 = new k();
         addObject(cactus1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
         Cactus cactus2 = new lemur();
         addObject(cactus2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
         Cactus cactus3 = new rocket();
         addObject(cactus3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
         Flower flower1 = new banan();
         addObject(flower1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
         Flower flower2 = new guy();
         addObject(flower2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
         Flower flower3 = new pengu();
         addObject(flower3, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));

        }
    }
    public void act()
    {
     if(numberOfObjects()==2){ 
         TieScreen tiescreen = new TieScreen();
         Greenfoot.setWorld(tiescreen);
     
     
     
     
        }
    }
}
