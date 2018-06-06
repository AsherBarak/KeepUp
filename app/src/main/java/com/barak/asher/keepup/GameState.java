package com.barak.asher.keepup;

/**
 * Immutable representation of the state of the game
 */
public class GameState {
    /**
     * Gameplay is only in portrait mode.
     * All measures are in game units.
     * Speeds are in game units per MS.
     */

    private int playerXPos = -1;
    private int playerYPos = -1;
    private int playerXSpeed = -1;
    private int playerYSpeed = -1;

    private GameState(int playerXPos, int playerYPos, int playerXSpeed, int playerYSpeed) {
        this.playerXPos = playerXPos;
        this.playerYPos = playerYPos;
        this.playerXSpeed = playerXSpeed;
        this.playerYSpeed = playerYSpeed;
    }

    public int GetPlayerXPos() {
        return playerXPos;
    }

    public static GameState GetInitial() {
        return new GameState(0, 0,0, 0);
    }

    public GameState Update(int elapsedTimeMS) {
        return new GameState(
                CalculateNewXPos(elapsedTimeMS),
                CalculateNewYPos(elapsedTimeMS),
                CalculateNewXSpeed(elapsedTimeMS),
                CalculateNewYSpeed(elapsedTimeMS)
        );
    }

    @org.jetbrains.annotations.Contract(pure = true)
    private int CalculateNewYSpeed(int elapsedTimeMS) {
        return 0;
    }

    private int CalculateNewXSpeed(int elapsedTimeMS) {
        return 0;
    }

    private int CalculateNewYPos(int elapsedTimeMS) {
        return 0;
    }

    private int CalculateNewXPos(int elapsedTimeMS) {
        return 0;
    }


}
