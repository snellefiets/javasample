package com.tdd.game_of_life;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TickAGameToNextGenerationIT {

    @Test
    void should_kill_a_cell_dueTo_too_few_neighbours() {
        final World givenWorld = new World(2, 2);
        givenWorld.setAlive(0,0);
        final GameService gameService = new GameService();
        gameService.start(givenWorld);
        final World resultingWorld = gameService.tick();
        assertThat(resultingWorld.isCellALive(0,0)).isFalse();
    }
}
