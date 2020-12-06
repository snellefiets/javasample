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

    @ParameterizedTest
    @CsvSource({
            "L, 0-0- W",
            "LL, 0-0- S",
            "LLL, 0-0- E",
            "LLLL, 0-0- N",
            "LLLLL, 0-0- W"
    })
    void should_turn_left(String givenCommand, String expectedResult) {
        assertThat(rover.execute(givenCommand)).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "R, 0-0- E",
            "RR, 0-0- S",
            "RRR, 0-0- W",
            "RRRR, 0-0- N",
            "RRRRR, 0-0- E",
    })
    void should_turn_right(String givenCommand, String expectedResult) {
        assertThat(rover.execute(givenCommand)).isEqualTo(expectedResult);
    }

}
