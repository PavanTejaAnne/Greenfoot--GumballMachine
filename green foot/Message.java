import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage image;

    
    public Message()
    {
       image = new GreenfootImage(650,50);
       setImage(image);     
    }

    public void setText( String msg)
    {
        GumballWorld g = (GumballWorld) getWorld();
        image.clear();
        image.setColor( java.awt.Color.getHSBColor(169, 100, 68) ) ;
        image.fill() ;
        image.setColor( java.awt.Color.BLACK ) ;
        image.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 18));
        image.drawString( msg, 250, 25 );  

    }

    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {          
            World world = getWorld();
            world.removeObject( this ) ;
            
        }
    }    
}

