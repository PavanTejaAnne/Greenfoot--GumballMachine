import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public RandomPicker(){
        GreenfootImage image = getImage() ;
        image.scale( 120, 160 ) ; 
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void pickGumball(){
        Message m1 = new Message();
        Message m2 = new Message();
        GumballWorld g = (GumballWorld) getWorld();
        int gumType = Greenfoot.getRandomNumber(g.getgumballMap().size());
        Gumball gumball = (Gumball) g.getgumballMap().get(gumType);
        g.addObject(gumball, 400, 350);
        moveToPicker(gumball);
        displayMessage("Gotcha Gotcha!");
        g.removeObject(gumball);

        
    }
    
    public void moveToPicker(Gumball b){
        
        b.turnTowards(648, 94);
        for(int i=0;i<75;i++){
            b.move(5);
            Greenfoot.delay(1);
        }
        
    }

    
}
