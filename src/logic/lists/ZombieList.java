package logic.lists;

import logic.Game;
import logic.objects.Zombie;

import java.util.ArrayList;
import java.util.Iterator;

public class ZombieList {
    private ArrayList<Zombie> arrayZombies;
    private Game game;

    public ZombieList(Game game) {
        this.game = game;
        this.arrayZombies = new ArrayList<>();
    }

    public void addZombie(Zombie zombie){
        this.arrayZombies.add(zombie);
    }

    public void removeZombie(int idZombie){
        Iterator<Zombie> it = arrayZombies.iterator();

        while(it.hasNext()){
            Zombie z = it.next();
            if(z.getIdZombie() == idZombie){
                it.remove();
            }
        }
    }




}
