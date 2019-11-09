package main.java.com.fiuba.algo3.modelo;

import java.util.HashMap;

public class Map extends Observable {
    private static final int heigth = 5;
    private static final int width = 10;
    private HashMap<String, Cell> cells;    

    public Map() {
        super();
        cells = new HashMap<String,Cell>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                cells.put(new Position(i,j).toString(), new Cell());
            }
            
        }
    }

    public void positionate(Positionable positionable, Position position) {
        cells.get(position.toString()).occupy(positionable);
        positionable.setPosition(position);
        notifyObservers();
    }

    public int getHeigth() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }

    public void movePositionableToLeft(Positionable positionable) {
        movePositionableTo(positionable, new Position(positionable.getPosition().getX() -1,
                                            positionable.getPosition().getY()));
    }

    public void movePositionableToRigth(Positionable positionable) {
        movePositionableTo(positionable, new Position(positionable.getPosition().getX() +1,
                                            positionable.getPosition().getY()));
    }

    public void movePositionableToUp(Positionable positionable) {
        movePositionableTo(positionable, new Position(positionable.getPosition().getX(),
                                            positionable.getPosition().getY() +1));
    }
    public void movePositionableToDown(Positionable positionable) {
        movePositionableTo(positionable, new Position(positionable.getPosition().getX(),
                                            positionable.getPosition().getY() -1));
    }

    private void movePositionableTo(Positionable positionable, Position position) {
        Cell fromMove = cells.get(positionable.getPosition().toString());
        if (!fromMove.hasOccupant(positionable)) {
            throw new RuntimeException("There is no target!");
        }
        Cell toMove = cells.get(position.toString());
        toMove.occupy(positionable);
        fromMove.dropOccupant();
    }
}