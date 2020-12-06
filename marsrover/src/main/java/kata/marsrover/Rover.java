package kata.marsrover;

public class Rover {

    private int xPosition = 0;
    private int yPosition = 0;
    private String direction = "N";

    public String execute(String command) {
        if (command.startsWith("L")) {
            for (int i = 0; i < command.length(); i++) {
                turnLeft();
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
}
