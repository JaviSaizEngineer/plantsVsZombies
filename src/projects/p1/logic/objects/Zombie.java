package projects.p1.logic.objects;

import projects.p1.logic.Game;

public class Zombie {
    private Game game;
    private int idZombie;
    private int resistencia;
    private int danio;
    private int velocidad;
    private int coordX;
    private int coordY;

    public Zombie(Game game, int coordX, int coordY){
        this.game=game;
        this.resistencia = 5;
        this.danio = 1;
        this.velocidad = 2;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String toString() {
        return "Z [" + this.idZombie + "]";
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
