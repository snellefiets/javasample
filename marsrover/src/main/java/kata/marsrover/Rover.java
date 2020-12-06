package kata.marsrover;

public class Rover {

    private int xPosition = 0;
    private int yPosition = 0;
    private String direction = "N";

    public String execute(String command) {
        if ("L".equals(command)) {
            direction = "W";
        } else if ("LL".equals(command)) {
            direction = "S";
        } else if ("LLL".equals(command)) {
            direction = "E";
        } else if ("LLLL".equals(command)) {
            direction = "N";
        } else if ("LLLLL".equals(command)) {
            direction = "W";
        } else {
            yPosition += command.length();
        }

        return String.format("%d-%d- %s", xPosition, yPosition, direction);
    }
}
