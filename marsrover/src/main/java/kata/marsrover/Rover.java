package kata.marsrover;

public class Rover {

    private int xPosition = 0;
    private int yPosition = 0;
    private String direction = "N";

    public String execute(String command) {
        if ("L".equals(command)) {
            direction = "W";
        } else {
            yPosition += command.length();
        }

        return String.format("%d-%d- %s", xPosition, yPosition, direction);
    }
}
