import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class Inspector extends Alien
{   
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Inspector(){
        
        GreenfootImage image = getImage() ;
        image.scale( 180, 177 ) ; 
    
    }
    
    public void act() 
    {
        // Add your action code here.
        
    }    
    

    
    public void inspectCoin(Coin c){
        
        
        if(c.getClass() == Quarter.class){
            pickPicker();
            GumballWorld gw = (GumballWorld) getWorld();
            gw.addObject( new Quarter(), 68, 156 ) ;
 
        }
        
        if(c.getClass() == FakeQuarter.class){
            GumballWorld gw = (GumballWorld) getWorld();
            gw.addObject( new FakeQuarter(), 66, 258 ) ;
            moveInspector();
            displayMessage("Fake quarter alert!", 400, 400);
        }
        
        if(c.getClass() == Penny.class){
            GumballWorld gw = (GumballWorld) getWorld();
            gw.addObject( new Penny(), 57, 71 ) ;
            moveInspector();
            displayMessage("Thats just a penny. We need a quarter!", 400, 400);
        }
            
    }
    
    public void pickPicker(){
        GumballWorld g = (GumballWorld) getWorld();
        int type = Greenfoot.getRandomNumber(g.getpickerMap().size());
        Picker picker = (Picker) g.getpickerMap().get(type);
        picker.pickGumball();
        
        
    }
    
    public void moveInspector(){
       
        for(int i=0;i<20;i++){
            this.move(5);
            Greenfoot.delay(1);
        }
        for(int i=20;i>0;i--){
            this.move(-5);
            Greenfoot.delay(1);
        }
        
        
    }
    
    public void displayMessage(String msg, int x, int y){
    
        Message m = new Message();
        m.setText(msg);
        GumballWorld g = (GumballWorld) getWorld();
        g.addObject(m,120,550);
        Greenfoot.delay(100);
        g.removeObject(m);
    }
}
