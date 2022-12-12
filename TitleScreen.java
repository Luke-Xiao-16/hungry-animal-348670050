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
        prepare();
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
        elephant.setLocation(502,119);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,242,285);
        label.setLocation(405,272);
        Label label2 = new Label("<--  & --> to Move", 30);
        addObject(label2,163,336);
        label2.setLocation(166,335);
        label.setLocation(363,261);
        label.setLocation(246,269);
        label.setLocation(291,263);
        label.setLocation(301,261);
        label2.setLocation(496,39);
        elephant.setLocation(469,104);
        label2.setLocation(456,32);
        label2.setLocation(463,39);
        elephant.setLocation(457,131);
        elephant.setLocation(451,124);
        label2.setLocation(485,59);
        label2.setLocation(437,50);
    }
}
