import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    private int score = 0;
    
    
    
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        turn(Greenfoot.getRandomNumber(10) - 5);
        move(5);
        int x = getX();
        int y = getY();
        if (x > 600 || y < 0 || y > 400){
         x = 0;
         y = Greenfoot.getRandomNumber(400);
         setRotation(0);
         setLocation(x,y);
         
            
        }
        // check if bee runs into flowr 
        boolean contactFlower = isTouching(Flower.class);
       
        //System.out.println(contactFlower);
        if(contactFlower) {
            Flower plant = (Flower) getOneIntersectingObject (Flower.class);
            int plantScore = plant.getScore();
            score = plantScore + score;
            removeTouching(Flower.class);
            
            
            
        }
        //check if been runs into cacti
        boolean contactCactus = isTouching(Cactus.class);
        boolean contactBee = isTouching(bee.class);
        if(contactCactus) {
            Cactus plant = (Cactus) getOneIntersectingObject (Cactus.class);
          int plantScore = plant.getScore();
          score = score - plantScore;
          removeTouching(Cactus.class);
            
        }
        if (score >= 15) { 
        BeeWin winscreen = new BeeWin();
        Greenfoot.setWorld(winscreen);
        }
        if (score <= -15) { 
        DolphinWin winscreen = new DolphinWin();
        Greenfoot.setWorld(winscreen);
        
        }
            
      
        
       
       
    }    
}
