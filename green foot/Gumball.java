import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gumball here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class Gumball extends Actor
{

    public Gumball()
    {
        GreenfootImage image = getImage() ;
        image.scale( 50, 50 ) ; 
    }

    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {          
            World world = getWorld();
            world.removeObject( this ) ;
            
        }
    }    
}
