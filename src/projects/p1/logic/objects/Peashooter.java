package projects.p1.logic.objects;

import projects.p1.logic.Game;

public class Peashooter {
    private Game game;
    private int idPeashooter;
    private int coste;
    private int resistencia;
    private int frecuencia;
    private int danio;
    private int coordX;
    private int coordY;

    public Peashooter(Game game, int coordX, int coordY){
        this.game = game;
        this.coste = 50;
        this.resistencia = 3;
        this.frecuencia = 1;
        this.danio = 1;

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
}
