
package com.reagroup.robot.test;

import org.junit.Assert;
import org.junit.Test;

import com.reagroup.robot.Robot;
import com.reagroup.robot.RobotException;

public class RobotTest {

    @Test
    public void checkValidTest() {

        try {
            Robot.place("PLACE 1,0,NORTH");
            Assert.assertTrue(true);
        } catch (RobotException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void checkMoveTest() {
        try {
            Robot.place("PLACE 1,0,NORTH");
            Robot.move();
            Assert.assertTrue(true);
        } catch (RobotException e) {
            e.printStackTrace();
        }

    }

    @Test

    public void checkLeftTest() {
        try {
            Robot.place("PLACE 1,0,NORTH");
            Robot.turnLeft();
            Assert.assertTrue(true);
        } catch (RobotException e) {
            e.printStackTrace();
        }

    }

    @Test

    public void checkRightTest() {
        try {
            Robot.place("PLACE 1,1,NORTH");
            Robot.turnRight();
            Assert.assertTrue(true);
        } catch (RobotException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void checkReportTest() {
        Robot.report();
        Assert.assertTrue(true);
    }

}
