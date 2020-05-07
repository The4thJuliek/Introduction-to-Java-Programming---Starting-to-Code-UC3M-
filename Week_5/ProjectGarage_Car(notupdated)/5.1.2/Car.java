import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;

/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @1.0
 */
public class Car extends Actor
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    boolean areHeadlightsOn = false;            // State of headlights (on => true; off => false)
    
    String image1 = new String("car1.png");
    String image2 = new String("car2.png");
    
    boolean isKeyDown = false;
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage garage){
        theGarage=garage;
    }
    /**
     * Method that is being always invoked when the program is running
     */
    public void act(){
        moveForward();
        moveBack();
        turnLeft();
        turnRight();
        turnHeadlightsOn();
        turnHeadlightsOff();
        checkGarage();
        checkEdges();
    }    

    /**
     * Move the car forward every time the key "up" is pressed
     */
    public void moveForward(){
        if (Greenfoot.isKeyDown("up")){
            move(5);
        }
    }
    
    /**
     * Move the car back every time the key "down" is pressed
     */
    public void moveBack(){
        if (Greenfoot.isKeyDown("down")){
            move(-1);
        }
    }    
    
    /**
     * Turn the car to the left every time the key "left" is pressed
     */    
    public void turnLeft(){
        if (Greenfoot.isKeyDown("left")){ 
            turn(-4);
        }
    }
    
    /**
     * Turn the car to the right every time the key "right" is pressed
     */      
    public void turnRight(){
        if (Greenfoot.isKeyDown("right")){ 
            turn(4);
        }
    }
    
    /**
     * Turn the headlights on when the key "space" is pressed.
     * The attribute isKeyDown is used to prevent setting the headlights on and off when the key "space" is pressed (and remains pressed for some time)
     */      
    public void turnHeadlightsOn(){
        if (Greenfoot.isKeyDown("space") && !isKeyDown){
            if (areHeadlightsOn == false){
                areHeadlightsOn = true;
                setImage(image2);
                System.out.println ("Lights on");
                isKeyDown = true;
            }

        }
        if (!Greenfoot.isKeyDown("space") && isKeyDown){
            isKeyDown = false;
        }           
    }   

    /**
     * Turn the headlights off when the key "space" is pressed.
     * The attribute isKeyDown is used to prevent setting the headlights off and on when the key "space" is pressed (and remains pressed for some time)
     */          
    public void turnHeadlightsOff(){
        if (Greenfoot.isKeyDown("space") && !isKeyDown){
            if (areHeadlightsOn == true){
                areHeadlightsOn = false;
                setImage(image1);
                isKeyDown = true;
            }

        }
        if (!Greenfoot.isKeyDown("space") && isKeyDown){
            isKeyDown = false;
        }           
    }      
     /**
     * Check whether the car has reached the garage or not
     */    
    public void checkGarage(){
        if(this.intersects(theGarage));{
           System.out.println("Congratulations! You have reached the garage.");
           theGarage.setImage("house-opened.png");
           Greenfoot.stop();
        }
    } 
    /**
     * Check whether the car hits the edges
     */    
    public void checkEdges(){
        if(this.isAtEdge());{
           System.out.println("Game over! You crashed the car.");
           Greenfoot.stop();
        }
    }
}
