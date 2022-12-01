import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World.
 * 
 * @author (Yee) 
 * @version (Nov 30)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Label score;
    int scoreval;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Elephant ele = new Elephant();
        addObject(ele, 300, 200);
        score = new Label(0, 80);
        scoreval=0;
        addObject(score,50,50); 
        
        makeApple();
        
    }
    
    public void gameOver() {
        Label over = new Label("Game Over", 100);
        addObject(over, 300, 200);
    }
    
    public void increaseScore() {
        scoreval++;
        score.setValue(scoreval);
    }
    
    public void makeApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, 0);
    }
}
