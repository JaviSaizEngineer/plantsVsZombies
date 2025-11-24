package plantsVsZombies;

import control.Controller;
import logic.Game;

public class PlantsVsZombies {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Game game = new Game();
        Controller controller = new Controller(game);
        controller.run();
    }
}