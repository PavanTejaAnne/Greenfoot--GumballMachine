import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueGumball here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class BlueGumball extends Gumball
{
    /**
     * Act - do whatever the BlueGumball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {          
            World world = getWorld();
            world.removeObject( this ) ;
            
        }
    }    
}
