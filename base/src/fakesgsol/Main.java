package fakesgsol;

import fakesgsol.event.Bus;
import fakesgsol.game.Game;
import fakesgsol.game.Pregame;
import fakesgsol.ui.UI;

public class Main {
    private static Bus bus;
    public static void main(String[]args){
        try {
            bus = new Bus();
            new UI(bus).start();
        }catch(Throwable e){
            e.printStackTrace();
        }
    }
    public static void startPregame(){
        new Pregame(bus).start();
    }
    public static void startGame(){
        new Game().start();
    }
}
