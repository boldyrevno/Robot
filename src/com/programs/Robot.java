package com.programs;
public class Robot {

    private  int x;
    private  int y;
    private  Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void  getLocation() {
        System.out.print(x + " " + y);
        switch (direction) {
            case LEFT -> System.out.println(" Направлен влево");
            case RIGHT -> System.out.println(" Направлен вправо");
            case UP -> System.out.println(" Направлен вверх");
            case DOWN -> System.out.println(" Направлен вниз");
        }
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (getDirection()) {
            case UP -> direction = Direction.LEFT;
            case DOWN -> direction = Direction.RIGHT;
            case LEFT -> direction = Direction.DOWN;
            case RIGHT -> direction = Direction.UP;
        }
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (getDirection()) {
            case UP -> direction = Direction.RIGHT;
            case DOWN -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.UP;
            case RIGHT -> direction = Direction.DOWN;
        }
        System.out.println("Поворот направо");
     }

    public void stepForward() {
        //Шаг вперёд
        if(getDirection() == Direction.UP) y++;
        if(getDirection() == Direction.RIGHT) x++;
        if(getDirection() == Direction.DOWN) y--;
        if(getDirection() == Direction.LEFT) x--;
        System.out.println("Шаг вперёд");
    }

}
