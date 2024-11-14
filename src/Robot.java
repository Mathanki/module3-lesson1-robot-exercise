/**
 * Robot class defines its attributes and methods
 * @version - 1.0
 * @author - Mathanki Nirojan
 */
public class Robot {

    // Battery level percentage (0 to 100)
    int batteryLevel = 100;

    // Current speed of the robot
    int speed = 0;

    // Name of the robot
    String name = "Robo";

    //weight of robot
    int weight = 10;

    //color of robot
    String color = "black";

    /**
     * default constructor
     */
    public Robot(){

    }

    /**
     * This method increases the speed field to simulate the robot
     * moving and prints a message.
     */
    public void move() {
        this.speed = 5;
        System.out.println(this.name + " is moving at speed " + this.speed + " mph.");
    }

    /**
     * This method sets speed to 0 and prints a message indicating
     * the robot has stopped
     */
    public void stop() {
        this.speed = 0;
        System.out.println(this.name + " has stopped.");
    }

    /**
     * This method sets batteryLevel to 100 and prints a message
     * about the battery status
     */
    public void chargeBattery() {
        this.batteryLevel = 100;
        System.out.println(this.name + "'s battery is fully charged.");
    }

    /**
     * This method prints the current batteryLevel of the robot
     */
    public void checkBatteryLevel() {
        System.out.println(this.name + "'s current battery level is " + this.batteryLevel + "%.");
    }

    /**
     * This method print the robot name with color and weight
     */
    public void diaplayInfo(){
        System.out.println(this.name + "'s color is " + this.color +" and weight is "+ this.weight);
    }

}
