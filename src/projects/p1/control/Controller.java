package projects.p1.control;

import projects.p1.logic.Game;
import projects.p1.logic.GamePrinter;

import java.util.Scanner;

public class Controller {
    private Game game;
    private Scanner in;
    private boolean finalizarPartida;
    private GamePrinter gamePrinter;
    private String command;

    public Controller(Game game){
        this.game=game;
    }

    public void run(){
        while(!finalizarPartida){
            gamePrinter= new GamePrinter(this.game);
            System.out.println(game.toString());
            System.out.print("Command > ");
            in = new Scanner(System.in);
            command = in.nextLine();
            System.out.println(command);
        }
    }
}
