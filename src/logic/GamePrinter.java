package logic;
import myStringUtils.MyStringUtils;

public class GamePrinter {
    private Game game;
    public GamePrinter(Game game){
        this.game=game;
    }

    public String toString(){
        int cellSize = 7;
        String space = " ";
        String vDelimiter = "|";
        String hDelimiter = "-";
        String str = "";

        for(int i=0;i<9;i++){
                if(i%2==0){
                    str = str.concat(space);
                    for(int j=0;j<8;j++) {
                        str = str.concat(MyStringUtils.repeat(hDelimiter, 10));
                    }
                }
                else{
                    for(int j=0;j<8;j++) {
                        str = str.concat(vDelimiter);
                        str = str.concat(MyStringUtils.repeat(space,9));
                    }
                    str=str.concat(vDelimiter);
                }
                str = str.concat("\n");
        }

        return str;
    }
}
