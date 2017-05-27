
package com.reagroup.robot.test;

import org.junit.Test;

public class RobotTest {

    @Test
    public void checkValidPlaceCommandExceptionThrown() {
        Robot.checkPalce("MOVE");

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
    public void checkReportNoException(){
        Robot.report();
        assertTrue();
    }
    
    @Test
    public void checkFallConditionNoException(){
        Robot.checkFall();
        assertTrue();
    }
}
