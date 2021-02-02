package fakesgsol.game;

import fakesgsol.event.Bus;

public class Pregame {
    private Bus bus;
    public Pregame(Bus bus){this.bus=bus;}
    public void start(){}
    public Game startGame(){return null;}
}
