package com.barak.asher.keepup;

import android.support.annotation.NonNull;

/**
 * Immutable representation of the state of the game.
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

  public int getPlayerXPos() {
    return playerXPos;
  }

  @NonNull
  public static GameState getInitial() {
    return new GameState(0, 0, 0, 0);
  }

  /**
   * Updates game state.
   * @param elapsedTimeMs Time elapsed since last update.
   * @return A new (immutable) @GameState object.
   */
  public GameState update(int elapsedTimeMs) {
    return new GameState(
            calculateNewXPos(elapsedTimeMs),
            calculateNewYPos(elapsedTimeMs),
            calculateNewXSpeed(elapsedTimeMs),
            calculateNewYSpeed(elapsedTimeMs)
    );
  }

  @org.jetbrains.annotations.Contract(pure = true)
  private int calculateNewYSpeed(int elapsedTimeMs) {
    return 0;
  }

  private int calculateNewXSpeed(int elapsedTimeMs) {
    return 0;
  }

  private int calculateNewYPos(int elapsedTimeMs) {
    return 0;
  }

  private int calculateNewXPos(int elapsedTimeMs) {
    return 0;
  }
}
