package logic.lists;

import logic.Game;
import logic.objects.Sunflower;

import java.util.ArrayList;
import java.util.Iterator;

public class SunflowerList {
    private ArrayList<Sunflower> arraySunflowers;
    private Game game;

    public SunflowerList(Game game) {
        this.game = game;
        this.arraySunflowers = new ArrayList<>();
    }

    public void addSunflower(Sunflower sunflower){
        this.arraySunflowers.add(sunflower);
    }

    public void removeSunflower(int idSunflower){
        Iterator<Sunflower> it = arraySunflowers.iterator();

        while(it.hasNext()){
            Sunflower s = it.next();
            if(s.getIdSunflower() == idSunflower){
                it.remove();
            }
        }
    }
}
