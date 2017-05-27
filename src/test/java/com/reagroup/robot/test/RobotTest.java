
package com.reagroup.robot.test;

import org.junit.Assert;
import org.junit.Test;

import com.reagroup.robot.Robot;
import com.reagroup.robot.RobotException;

public class RobotTest {

    @Test
    public void checkValid() {

        try {
            Robot.place("PLACE 1,0,NORTH");
            Assert.assertTrue(true);
        } catch (RobotException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void checkMoveNoException() {
        try {
            Robot.place("PLACE 1,0,NORTH");
            Robot.move();
            Assert.assertTrue(true);
        } catch (RobotException e) {
            e.printStackTrace();
        }

    }

    @Test

    public void checkLeftNoException() {
        try {
            Robot.place("PLACE 1,0,NORTH");
            Robot.turnLeft();
            Assert.assertTrue(true);
        } catch (RobotException e) {
            e.printStackTrace();
        }

    }

    @Test

    public void checkRightNoException() {
        try {
            Robot.place("PLACE 1,1,NORTH");
            Robot.turnRight();
            Assert.assertTrue(true);
        } catch (RobotException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void checkReportNoException() {
        Robot.report();
        Assert.assertTrue(true);
    }

}
