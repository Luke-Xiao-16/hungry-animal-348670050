

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author Yee
 * @version Dec 12
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        MyWorld w = (MyWorld) getWorld();
        if(getY() >= w.getHeight()) {
            w.gameOver();
            w.removeObject(this);
        }
    }
    
    public void setSpeed(int spd) {
        speed = spd;   
    }
}
