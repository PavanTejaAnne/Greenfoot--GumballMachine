import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class Coin extends Actor
{

    public void act() 
    {
        int jerry, nibbles ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            jerry=mouse.getX();  
            nibbles=mouse.getY();  
            setLocation(jerry, nibbles);  
        } 
    }
    
}
