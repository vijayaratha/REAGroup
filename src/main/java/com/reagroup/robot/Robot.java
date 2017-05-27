package com.reagroup.robot;

/**
 * Class process all Robot commands
 * 
 *
 * @version $Rev$ $Date$
 */
public class Robot {

    public static void checkPlace(String command) throws RobotException {
        if (!RobotConstants.PLACE.equals(command) && !checkValidCommand()) {
            throw new RobotException(
                "This command can not be executed :" + command);
        } else {
            place(command);
        }
    }

    public static void move() {

    }

    public static void turnLeft() {

    }

    public static void turnRight() {

    }
    
    public static void checkFall(){
        
    }

    public static void report() {
        System.out.println(" Position of the Robot is :");
    }

    private static void place(String command) {
        // TODO Auto-generated method stub

    }

    private static boolean checkValidCommand() {
        // TODO Auto-generated method stub
        return false;
    }

}
