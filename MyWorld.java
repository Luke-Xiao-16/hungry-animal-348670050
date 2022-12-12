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
    Label lvl;
    int scoreval;
    int level;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        Elephant ele = new Elephant();
        addObject(ele, 300, 325);
        scoreval = 0;
        score = new Label(scoreval, 80);
        addObject(score,50,50); 
        level = 1;
        lvl = new Label("Level: " + level,55);
        addObject(lvl, 105, 350);
        makeApple();
        
    }
    
    public void gameOver() {
        Label over = new Label("Game Over", 100);
        addObject(over, 300, 200);
    }
    
    public void increaseScore() {
        scoreval++;
        score.setValue(scoreval);
        
        if(scoreval % 5 == 0) {
            level+=1;
            lvl.setValue("Level: " + level);
        }
    }
    
    public void makeApple() {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple, x, 0);
    }
}
