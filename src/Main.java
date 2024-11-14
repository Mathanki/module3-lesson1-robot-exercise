//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Main method use to run application
 * @version - 1.0
 * @author - Mathanki Nirojan
 */
public class Main {
    public static void main(String[] args) {

        // Create a new Robot object
        Robot myRobot = new Robot();

        // Make the robot move
        myRobot.move();

        // Check battery level
        myRobot.checkBatteryLevel();

        // Stop the robot
        myRobot.stop();

        // Charge the robot's battery
        myRobot.chargeBattery();

        //Display Info of robot
        myRobot.diaplayInfo();
    }
}