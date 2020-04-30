import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that creates a new world: MyWorld
 * 
 * @Java MOOC team, UC3M
 * @1.0
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(900, 700, 1); 
        setBackground("road.jpg");
        
        String buttons1[]={"up","down","left","right","space"};
        String buttons2[]={"w","s","a","d","space"};
        
        populateWorld();
    }
    
    public void populateWorld()
{
    Car car1 = new Car(new String("car1.png"), new String("car2.png"), new String ("up"), new String ("down"), new String ("left"), 
    new String ("right"), new String ("space"));
    Car car2 = new Car(new String("car3.png"), new String("car4.png"), 
    new String ("w"), new String ("z"), new String ("a"), 
    new String ("s"), new String ("space"));

    addObject(car1, 100, 400);
    addObject(car2, 400, 100);
    }
}
