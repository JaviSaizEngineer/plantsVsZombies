package logic.lists;

import logic.Game;
import logic.objects.Zombie;

public class ZombieList {
    private Zombie[] arrayZmobies;
    private Game game;
    private int numZombies;

    public ZombieList(Game game) {
        this.game = game;
        this.arrayZmobies = new Zombie[5];
        this.numZombies = 0;
    }

    public void addZombie(Zombie zombie){
        if(this.numZombies < 5){
            arrayZmobies[this.numZombies] = zombie;
            this.numZombies++;
        }
    }




}
