package projects.p1.logic.objects;

import projects.p1.logic.Game;

public class Sunflower {
    private int idSunflower;
    private int coste;
    private int resistencia;
    private int frecuencia;
    private int danio;
    private int coordX;
    private int coordY;
    private Game game;

    public Sunflower(Game game, int coordX, int coordY){
        this.game = game;
        this.coste = 20;
        this.resistencia = 1;
        this.frecuencia = 10;
        this.danio = 0;
        this.coordX = coordX;
        this.coordY = coordY;
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
}
