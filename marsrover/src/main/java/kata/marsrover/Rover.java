package kata.marsrover;

public class Rover {

    private Coordinate position = new Coordinate(0, 0);
    private String direction = "N";

    public String execute(String command) {

        for (char c : command.toCharArray()) {
            if ('L' == c) {
                turnLeft();
            } else if ('M' == c) {
                move();
            } else {
                turnRight();
            }
        }

        return String.format("%d-%d- %s", position.getX(), position.getY(), direction);
    }

    private void move() {
        if ("W".equals(direction)) {
            position.setX( position.getX() - 1);
        } else if ("S".equals(direction)) {
            position.setY( position.getY() - 1);
        } else if ("N".equals(direction)) {
            position.setY( position.getY() + 1);
        } else {
            position.setX( position.getX() + 1);
        }
    }

    private void turnLeft() {
        if ("N".equals(direction)) {
            direction = "W";
        } else if ("W".equals(direction)) {
            direction = "S";
        } else if ("S".equals(direction)) {
            direction = "E";
        } else if ("E".equals(direction)) {
            direction = "N";
        }
    }

    private void turnRight() {
        if ("N".equals(direction)) {
            direction = "E";
        } else if ("E".equals(direction)) {
            direction = "S";
        } else if ("S".equals(direction)) {
            direction = "W";
        } else if ("W".equals(direction)) {
            direction = "N";
        }
    }
}
