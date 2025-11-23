package projects.p1.plantsVsZombies;

import projects.p1.control.Controller;
import projects.p1.logic.Game;
import projects.p1.logic.GamePrinter;

public class PlantsVsZombies {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Game game = new Game();
        Controller controller = new Controller(game);
        controller.run();
    }
}