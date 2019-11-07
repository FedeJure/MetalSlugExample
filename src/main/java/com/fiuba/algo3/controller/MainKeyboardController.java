package main.java.com.fiuba.algo3.controller;

import main.java.com.fiuba.algo3.vista.PlayerView;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MainKeyboardController implements EventHandler<KeyEvent> {

  private PlayerView playerView;

  public MainKeyboardController(PlayerView playerView) {
    this.playerView = playerView;
  }

  public void handle(KeyEvent event) {

    if (event.getCode() == KeyCode.W) {
      playerView.moveVertical(-10);
    }
    if (event.getCode() == KeyCode.S) {
      playerView.moveVertical(10);
    }
    if (event.getCode() == KeyCode.D) {
      playerView.moveHorizontal(10);
    }
    if (event.getCode() == KeyCode.A) {
      playerView.moveHorizontal(-10);
    }
    event.consume();
  }

}