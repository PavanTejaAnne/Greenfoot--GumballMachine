import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void pickGumball(){
        Message m = new Message();
        Message m2 = new Message();
        GumballWorld g = (GumballWorld) getWorld();
        Gumball gumball = (Gumball) g.getgumballMap().get(2);
        g.addObject(gumball, 400, 350);
        moveToPicker(gumball);
        displayMessage("Go green");
        g.removeObject(gumball);
        
    }
    
    public void moveToPicker(Gumball blob){
        
        blob.turnTowards(680, 441);
        for(int i=0;i<42;i++){
            blob.move(5);
            Greenfoot.delay(1);
        }
    }
}
