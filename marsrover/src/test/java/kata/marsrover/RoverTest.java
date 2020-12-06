package kata.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    private Rover rover;

    @BeforeEach
    void setUp() {
        rover = new Rover();
    }

    @Test
    void should_start_at_0_0_N() {
        assertThat(rover.execute("")).isEqualTo("0-0- N");
    }

    @Test
    void should_move() {
        assertThat(rover.execute("M")).isEqualTo("0-1- N");
    }

}
