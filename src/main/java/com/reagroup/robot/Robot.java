package com.reagroup.robot;

import com.reagroup.robot.model.Table;

/**
 * Class process all Robot commands
 * 
 *
 * @version $Rev$ $Date$
 */
public class Robot {

    private static Table table = new Table();

    public static void process(String command) throws RobotException {

        if (command.contains(RobotConstants.PLACE)) {
            try {
                place(command);
            } catch (RobotException e) {
                e.printStackTrace();
            }
        } else if (!command.contains(RobotConstants.PLACE)
            && isValidCommand()) {

            if (RobotConstants.LEFT.equals(command)) {
                turnLeft();
            }
            if (RobotConstants.RIGHT.equals(command)) {
                turnRight();
            }
            if (RobotConstants.MOVE.equals(command)) {
                move();
            }
            if (RobotConstants.REPORT.equals(command)) {
                report();
            }
        }

    }

    /**
     * Move the robot to next cubic in the same direction
     */
    public static void move() throws RobotException {

        if (RobotConstants.NORTH.equals(table.getDirection())) {
            table.setyPoint(table.getyPoint() + 1);
        } else if (RobotConstants.EAST.equals(table.getDirection())) {
            table.setxPoint(table.getxPoint() + 1);
        } else if (RobotConstants.WEST.equals(table.getDirection())) {
            table.setxPoint(table.getxPoint() - 1);
        } else if (RobotConstants.SOUTH.equals(table.getDirection())) {
            table.setyPoint(table.getyPoint() - 1);
        }

        checkFall();

    }

    /**
     * Turn the robot to it's left side
     */
    public static void turnLeft() {

        if (RobotConstants.NORTH.equals(table.getDirection())) {
            table.setDirection(RobotConstants.WEST);
        } else if (RobotConstants.EAST.equals(table.getDirection())) {
            table.setDirection(RobotConstants.NORTH);
        } else if (RobotConstants.WEST.equals(table.getDirection())) {
            table.setDirection(RobotConstants.SOUTH);
        } else if (RobotConstants.SOUTH.equals(table.getDirection())) {
            table.setDirection(RobotConstants.EAST);
        }

    }

    /**
     * Turn the robot to it's right side
     */
    public static void turnRight() {

        if (RobotConstants.NORTH.equals(table.getDirection())) {
            table.setDirection(RobotConstants.EAST);
        } else if (RobotConstants.EAST.equals(table.getDirection())) {
            table.setDirection(RobotConstants.SOUTH);
        } else if (RobotConstants.WEST.equals(table.getDirection())) {
            table.setDirection(RobotConstants.NORTH);
        } else if (RobotConstants.SOUTH.equals(table.getDirection())) {
            table.setDirection(RobotConstants.WEST);
        }
    }

    private static void checkFall() throws RobotException {
        if (table.getyPoint() > 4 || table.getyPoint() < 0) {
            table.setyPoint(table.getyPoint() - 1);
            throw new RobotException(
                "Can not move or place .Y point exceeds the table size");
        }
        if (table.getxPoint() > 4 || table.getxPoint() < 0) {
            table.setxPoint(table.getxPoint() - 1);
            throw new RobotException(
                "Can not move or place.X point exceeds the table size");
        }

    }

    /**
     * Report the Robot position
     */
    public static void report() {
        System.out.println(" Position of the Robot is :" + table.getxPoint()
            + ", " + table.getyPoint() + ", " + table.getDirection());
    }

    /**
     * Set the table position
     * 
     * @param command
     * @throws RobotException
     */
    public static void place(String command) throws RobotException {
        String cmd = command.substring(6);

        String[] valueArray = cmd.split(",");

        table.setxPoint(Integer.parseInt(valueArray[0]));
        table.setyPoint(Integer.parseInt(valueArray[1]));
        table.setDirection(valueArray[2]);
        checkFall();
    }

    private static boolean isValidCommand() {
        if (table.getxPoint() == -1 || table.getyPoint() == -1) {
            return false;
        }
        return true;
    }

}
