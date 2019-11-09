package main.java.com.fiuba.algo3.controller;

import main.java.com.fiuba.algo3.modelo.Map;
import main.java.com.fiuba.algo3.modelo.Player;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MainKeyboardController implements EventHandler<KeyEvent> {

  private Player player;
  private Map map;

  public MainKeyboardController(Player player, Map map) {
    this.player = player;
    this.map = map;
  }

  public void handle(KeyEvent event) {

    if (event.getCode() == KeyCode.W) {
      map.movePositionableToUp(this.player);          
    }
    if (event.getCode() == KeyCode.S) {
      map.movePositionableToDown(this.player);            
    }
    if (event.getCode() == KeyCode.D) {
      map.movePositionableToRigth(this.player);      
    }
    if (event.getCode() == KeyCode.A) {
      map.movePositionableToLeft(this.player);      
    }
    event.consume();
  }

}