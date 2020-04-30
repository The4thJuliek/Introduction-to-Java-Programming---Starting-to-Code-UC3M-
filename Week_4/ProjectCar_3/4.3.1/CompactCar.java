import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CompactCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompactCar extends Car
{
    /**
     * Act - do whatever the CompactCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     /**
     * Constructor
     */
    public CompactCar(String file1, String file2, int turnfast){
        super(file1, file2); // Invokes the constructor of the Car class
    }
    
    /**
     * Turn the car to the left every time the key "left" is pressed
     */    
    public void turnLeft(){
        if (Greenfoot.isKeyDown("left")){ 
            turn(-8);
        }
    }
    
    /**
     * Turn the car to the left every time the key "right" is pressed
     */    
    public void turnRight(){
        if (Greenfoot.isKeyDown("right")){ 
            turn(8);
        }
    }
}
