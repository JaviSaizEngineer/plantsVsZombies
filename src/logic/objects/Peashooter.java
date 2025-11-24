package logic.objects;

import logic.Game;

public class Peashooter {
    private Game game;
    private static int numPeashooters = 0;
    private final int idPeashooter;
    public final static int COSTE = 50;;
    public final static int RESISTENCIA = 3;
    public final static int FRECUENCIA = 1;
    public final static int DANIO = 1;
    private int coordX;
    private int coordY;

    public Peashooter(Game game, int coordX, int coordY){
        this.game = game;
        this.idPeashooter = numPeashooters;
        numPeashooters++;
    }

    public String toString() {
        return "Z [" + this.idPeashooter+ "]";
    }

    public int getCoordX(){
        return this.coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY(){
        return this.coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getIdPeashooter(){
        return this.idPeashooter;
    }
}
