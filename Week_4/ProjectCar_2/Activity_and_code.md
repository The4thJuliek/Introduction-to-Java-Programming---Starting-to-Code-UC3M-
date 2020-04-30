(Note - Car class returns errors!)

Activity:

1. Modify the code in the class MyWorld to change the resolution of the scene. Try with different resolutions until you get one that covers your whole screen.

2. Modify the code in the class MyWorld to create four instances of the “Car” class in the four corners of the scene.

3. Modify the code in the classes MyWorld and Car so that two cars can be controlled with different keyboards. Examples:

  a. Car1 controlled with “up”, “down”, “left”, “right” and “space”
  b. Car2 controlled with “w”, “s”, “a”, “d”, and “e”


Code (courtesy user artsaia):

1) Instance variables for the names of the keys in the Car class:

private String forwardKey;
private String backwardKey;
private String leftKey;
private String rightKey;
private String spaceKey;

2) Add getters and setters for each of them. E.g.:

/** * Setter for forwardKey */ private void setForwardKey(String forwardKey) { this.forwardKey = forwardKey; }

/**
 Getter for forwardKey
 *
private String getForwardKey()
{
    return forwardKey;
}

3) Update all the movement methods to use your getters instead of typed names of the keys. E.g.:

/** * Move the car forward every time the key "up" is pressed */

public void moveForward(){
    if (Greenfoot.isKeyDown(getForwardKey())){
        move(5);
    }
}

4) Update your constructor to accept not just two images, but also the keys, and set them:

 public Car(String file1, String file2, String forwardKey, String backwardKey, String leftKey, String rightKey, String spaceKey)
{
    setImage1(file1); // Sets the attribute image1 to file1
    setImage2(file2); // Sets the attribute image2 to file2

    setForwardKey(forwardKey);
    setBackwardKey(backwardKey);
    setLeftKey(leftKey);
    setRightKey(rightKey);
    setSpaceKey(spaceKey);

    setImage(file1); // Sets the image that appears in the screen at the beginning to the one in file1
}

5) Update your MyWorld class with the key names you like. E.g.

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
