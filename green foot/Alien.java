import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class Alien extends Actor
{

    public Alien()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }

    public void act() 
    {
        
    }    
    
    public void displayMessage(String msg){
    
        Message m = new Message();
        m.setText(msg);
        GumballWorld g = (GumballWorld) getWorld();
        g.addObject(m,120,550);
        Greenfoot.delay(80);
        g.removeObject(m);
    }
}
