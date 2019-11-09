package main.java.com.fiuba.algo3.modelo;

import java.lang.RuntimeException;

public class Cell {
    private Positionable occupant;

    public void occupy(Positionable occupant) {
        if (this.occupant != null) {
            throw new RuntimeException();
        }
        this.occupant = occupant;
    }

    public boolean hasOccupant(Positionable occupant) {
        return occupant == this.occupant;
    }

    public void dropOccupant() {
        occupant = null;
    }
}