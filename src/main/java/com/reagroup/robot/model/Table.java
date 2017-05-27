package com.reagroup.robot.model;

/**
 * Table model class
 * 
 *
 * @version $Rev$ $Date$
 */
public class Table {

    private int xPoint = -1;
    private int yPoint = -1;   
    private String direction;

    public Table(){
        
    }
    
    public Table(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public int getxPoint() {
        return xPoint;
    }

    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;

    }

    public int getyPoint() {
        return yPoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;

    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
        
    }

}
