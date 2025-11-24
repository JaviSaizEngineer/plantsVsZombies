package logic.objects;

import logic.Game;

public class Zombie {
    private Game game;
    private static int numZombies = 0;
    private final int idZombie;
    public final static int RESISTENCIA = 5;
    public final static int DANIO = 1;
    public final static int VELOCIDAD = 2;
    private int coordX;
    private int coordY;

    public Zombie(Game game, int coordX, int coordY){
        this.game=game;
        this.coordX = coordX;
        this.coordY = coordY;
        this.idZombie = numZombies;
        numZombies++;
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
