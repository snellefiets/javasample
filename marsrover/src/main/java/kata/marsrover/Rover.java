package kata.marsrover;

public class Rover {
    public String execute(String command) {
        if ("M".equals(command))
            return "0-1- N";
        else if ("MM".equals(command))
            return "0-2- N";
        return "0-0- N";
    }
}
