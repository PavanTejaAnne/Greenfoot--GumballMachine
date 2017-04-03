import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;

/**
 * Write a description of class GumballWorld here.
 * 
 * @PavanTeja 
 * @3.0.4(03/03/17)
 */
public class GumballWorld extends World
{
    HashMap<Integer, Picker> pickerHash = new HashMap();
    HashMap<Integer, Gumball> gumballHash = new HashMap();
    
    
    //Constructor for objects of GumballWorld.
     
    public GumballWorld()
    {    
        // New world with 600x400 cells (cell size 1x1 pixels) 
        super(800, 600, 1); 
        prepare();
        
    }

      //Prepare the world for the start of the program.
    
    private void prepare()
    {
        

        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 367, 237);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;

        Inspector inspector = new Inspector();
        addObject(inspector, 533, 291);
        
        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(730, 94);
        pickerHash.put(0,randompicker);
        
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 470);
        pickerHash.put(1,greenpicker);
        
        gumballHash.put(0,new RedGumball());
        gumballHash.put(1,new BlueGumball());
        gumballHash.put(2,new GreenGumball());
        
        gumballmachine.setinspector(inspector);
        
        
    }
    
    public HashMap getpickerMap(){
        return pickerHash;
    }
    
    public HashMap getgumballMap(){
        return gumballHash;
    }
    
}
