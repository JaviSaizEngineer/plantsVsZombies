package logic.objects;

import logic.Game;

public class Sunflower {
    private Game game;
    private static int numSunflowers = 0;
    private final int idSunflower;
    public final static int COSTE = 20;
    public final static int RESISTENCIA = 1;
    public final static int FRECUENCIA = 10;
    public final static int DANIO = 0;
    private int coordX;
    private int coordY;

    public Sunflower(Game game, int coordX, int coordY){
        this.game = game;
        this.coordX = coordX;
        this.coordY = coordY;
        this.idSunflower = numSunflowers;
        numSunflowers++;
    }

    public String toString() {
        return "S [" + this.idSunflower + "]";
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

    public int getIdSunflower(){
        return this.idSunflower;
    }
}
