package logic;

import logic.lists.PeashooterList;
import logic.lists.SunflowerList;
import logic.lists.ZombieList;

import java.util.Random;

public class Game {
    private PeashooterList peashooterList;
    private SunflowerList sunflowerList;
    private ZombieList zombieList;
    private int contadorCiclos;
    private int numSoles;
    private Random rand;

    public Game(){
        this.contadorCiclos=0;
        this.numSoles=50;
    }

    public void update(){

    }

    public int getContadorCiclos() {
        return this.contadorCiclos;
    }

    public void setContadorCiclos(int contadorCiclos) {
        this.contadorCiclos = contadorCiclos;
    }

    public int getNumSoles(){
        return this.numSoles;
    }

    public void setNumSoles(int numSoles){
        this.numSoles = numSoles;
    }
}
