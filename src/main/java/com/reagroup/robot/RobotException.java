package com.reagroup.robot;

/**
 * Custom exception to be thrown for error conditions.
 * 
 *
 * @version $Rev$ $Date$
 */
public class RobotException extends Exception {

    private static final long serialVersionUID = 1L;

    public RobotException(String message) {
        super(message);
    }

    public RobotException(String message, Throwable e) {
        super(message, e);
    }

}
