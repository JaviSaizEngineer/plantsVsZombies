package logic;
import myStringUtils.MyStringUtils;

public class GamePrinter {
    private Game game;
    public GamePrinter(Game game){
        this.game=game;
    }

    public String toString() {
        int rows = 4;
        int cols = 8;
        int cellSize = 7;

        StringBuilder sb = new StringBuilder();

        String hLine = MyStringUtils.repeat("-", 63);
        String spaces = MyStringUtils.repeat(" ", cellSize);

        for (int i = 0; i < rows; i++) {
            sb.append(" ");
            sb.append(hLine);
            sb.append("\n");
            for (int j = 0; j < cols; j++) {
                sb.append("|");
                sb.append(spaces);
            }
            sb.append("|\n");
        }
        sb.append(" ");
        sb.append(hLine);
        sb.append("\n");

        return sb.toString();
    }
}
