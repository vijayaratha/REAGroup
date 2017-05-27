
package com.reagroup.robot.test;

import org.junit.Assert;
import org.junit.Test;

import com.reagroup.robot.Robot;
import com.reagroup.robot.RobotException;

public class RobotTest {

    @Test
    public void checkValidPlaceCommandExceptionThrown() {
        try {
            Robot.checkPlace("MOVE");
        } catch (RobotException e) {
            Assert.assertTrue(true);
        }

    }

    @Test
    public void checkMoveNoException() {
        Robot.move();
        Assert.assertTrue(true);
    }

    @Test

    public void checkLeftNoException() {
        Robot.turnLeft();
        Assert.assertTrue(true);
    }

    @Test

    public void checkRightNoException() {
        Robot.turnRight();
        Assert.assertTrue(true);
    }

    @Test
    public void checkReportNoException() {
        Robot.report();
        Assert.assertTrue(true);
    }

    @Test
    public void checkFallConditionNoException() {
        Robot.checkFall();
        Assert.assertTrue(true);
    }
}
