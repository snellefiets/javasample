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
            "MMMM, 0-4- N",
            "RM, 1-0- E",
            "RMM, 2-0- E",
    })
    void should_move(String givenCommand, String expectedResult) {
        assertThat(rover.execute(givenCommand)).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "RL, 0-0- N",
            "RLL, 0-0- W",
            "RLLL, 0-0- S",
            "RLLLL, 0-0- E",
            "LR, 0-0- N",
            "LRR, 0-0- E",
            "LRRR, 0-0- S",
            "LRRRR, 0-0- W",
            "RRRRR, 0-0- E",
            "LLLLL, 0-0- W",
            "RLRL, 0-0- N"
    })
    void should_turn(String givenCommand, String expectedResult) {
        assertThat(rover.execute(givenCommand)).isEqualTo(expectedResult);
    }

}
