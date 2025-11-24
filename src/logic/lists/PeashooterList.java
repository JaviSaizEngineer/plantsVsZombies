package logic.lists;

import logic.Game;
import logic.objects.Peashooter;

import java.util.ArrayList;
import java.util.Iterator;

public class PeashooterList {
    private ArrayList<Peashooter> arrayPeashooters;
    private Game game;

    public PeashooterList(Game game) {
        this.game = game;
        this.arrayPeashooters = new ArrayList<>();
    }

    public void addPeashooter(Peashooter peashooter){
        this.arrayPeashooters.add(peashooter);
    }

    public void removePeashooter(int idPeashooter){
        Iterator<Peashooter> it = arrayPeashooters.iterator();

        while(it.hasNext()){
            Peashooter p = it.next();
            if(p.getIdPeashooter() == idPeashooter){
                it.remove();
            }
        }
    }
}
