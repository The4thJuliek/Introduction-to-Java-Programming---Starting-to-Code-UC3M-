Activity:

1. Modify the code so that the car gets automatically teletransported (i.e., without user interaction) into the top-right corner of the scenario.

2. Modify the code in the Car class to remove the car from the scenario if it touches the edges. Tip: you may need to get the world of this Car from the Car class.

3. Modify the code so that the background of the scenario changes whenever the car reaches the garage.



*Solution for Activity 2 and 3 (SPOILER)
discussion posted about a month ago by NghiaNguyen95

I struggled with trying to use removeObject() and setBackground() from the Car class.
Only was able to solve it once I looked it up online and realized that the tip "You may need to get the world of this Car from the Car class) means this:

getWorld().removeObject(this); & getWorld().setBackground("road2.jpg");

Just in case anyone else got stuck.*
