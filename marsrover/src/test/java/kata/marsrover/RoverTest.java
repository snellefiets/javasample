package kata.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest
    @CsvSource({
            "M, 0-1- N",
            "MM, 0-2- N",
            "MMM, 0-3- N",
            "MMMM, 0-4- N"
    })
    void should_move(String givenCommand, String expectedResult) {
        assertThat(rover.execute(givenCommand)).isEqualTo(expectedResult);
    }

    @Test
    void should_turn_left() {
        assertThat(rover.execute("L")).isEqualTo("0-0- W");
    }

    @Test
    void should_turn_left_twice() {
        assertThat(rover.execute("LL")).isEqualTo("0-0- S");
    }

}
