import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant charChar.
 * 
 * @author (Bryan Y) 
 * @version (Nov 30)
 */
public class Elephant extends Actor
{
    public void act()
    {
         if(Greenfoot.isKeyDown("left")) {
             move(-1);
         } else if(Greenfoot.isKeyDown("right")) {
             move(1);
         }
         eat();
    }
    public void eat() {
        if(isTouching(Apple.class)) {
            removeTouching(Apple.class);
            ((MyWorld) getWorld()).makeApple();
            ((MyWorld) getWorld()).increaseScore();
        }
    }
}
