package control;

import logic.Game;
import logic.GamePrinter;

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
            System .out.println("Number of cycles: " + this.game.getContadorCiclos());
            System .out.println("Sun coins: " + this.game.getNumSoles());
            System .out.println("Remaining zombies: "+"\n");
            System.out.println(gamePrinter.toString());
            System.out.print("Command > ");
            in = new Scanner(System.in);
            command = in.nextLine();
            System.out.println(command);
        }
    }
}
