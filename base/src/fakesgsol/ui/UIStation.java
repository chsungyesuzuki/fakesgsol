package fakesgsol.ui;

import fakesgsol.event.Event;
import fakesgsol.event.Station;
import fakesgsol.event.StopEvent;

public class UIStation implements Station {
    UI owner;
    private static final UIStation instance = new UIStation();
    private UIStation(){}
    public static UIStation getInstance(){return instance;}
    public void getOff(Event passenger){
        if(passenger instanceof StopEvent){
            owner.stop();
        }
    }
}
