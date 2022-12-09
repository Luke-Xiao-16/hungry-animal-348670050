import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Yee 
 * @version Dec 9
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    public TitleScreen()
    {    
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 200);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare() {
        Elephant elephant = new Elephant();
        addObject(elephant, 479, 87);
    }
}
