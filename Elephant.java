import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Elephant charChar.
 * 
 * @author (Bryan Y) 
 * @version (Nov 30)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleR = new GreenfootImage[8];
    GreenfootImage[] idleL = new GreenfootImage[8];
    int speed = 5;
    int imgIndex = 0;
    
    String facing = "right";
    SimpleTimer animTimer = new SimpleTimer();
    
    public Elephant() {
        for(int i = 0; i < idleR.length; i++) {
            idleR[i] = new GreenfootImage("images/elephant_idle/idle"+i+".png");
            idleR[i].scale(100,100);
        }
        for(int i = 0; i < idleL.length; i++) {
            idleL[i] = new GreenfootImage("images/elephant_idle/idle"+i+".png");
            idleL[i].mirrorHorizontally();
            idleL[i].scale(100,100);
        }
        
        setImage(idleR[0]);
    }
    
    public void act() {
         if(Greenfoot.isKeyDown("left") && getX() > 50) {
             move(-1*speed);
             facing="left";
         } else if(Greenfoot.isKeyDown("right") && getX() < 550) {
             move(1*speed);
             facing="right";
         }
         eat();
         animate();
    }
    
    public void animate() {
        if(animTimer.millisElapsed() < 150) return;
        animTimer.mark();
        
        setImage(facing.equals("right")?idleR[imgIndex]:idleL[imgIndex]);
        imgIndex= (imgIndex+1) % idleR.length;
    }
    
    public void eat() {
        if(isTouching(Apple.class)) {
            removeTouching(Apple.class);
            ((MyWorld) getWorld()).makeApple();
            ((MyWorld) getWorld()).increaseScore();
            elephantSound.play();
        }
    }
}
