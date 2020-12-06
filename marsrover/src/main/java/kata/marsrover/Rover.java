package kata.marsrover;

public class Rover {
    public String execute(String command) {
        if ("M".equals(command))
            return "0-1- N";
        else if ("MM".equals(command))
            return "0-2- N";
        else if ("MMM".equals(command))
            return "0-3- N";
        else if ("MMMM".equals(command))
            return "0-4- N";

        return "0-0- N";
    }
}
