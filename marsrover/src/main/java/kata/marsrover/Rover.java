package kata.marsrover;

public class Rover {

    private int xPosition = 0;
    private int yPosition = 0;
    private String direction = "N";

    public String execute(String command) {
        if (command.startsWith("L") || command.startsWith("R")) {
            for (char c : command.toCharArray()) {
                if ('L' == c) {
                    turnLeft();
                } else {
                    turnRight();
                }
            }
        } else {
            yPosition += command.length();
        }

        return String.format("%d-%d- %s", xPosition, yPosition, direction);
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
