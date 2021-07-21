package com.programs;

public class Main {
    public static void moveRobot(Robot robot, int toX, int toY) {
        if(robot.getX() > toX){
            while(robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        if(robot.getX() < toX){
            while(robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while(robot.getX() != toX) {
            robot.stepForward();
        }
        if(robot.getY() < toY){
            while(robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
        if(robot.getY() > toY){
            while(robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        while(robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, -10, -10);
        robot.getLocation();
    }

}
