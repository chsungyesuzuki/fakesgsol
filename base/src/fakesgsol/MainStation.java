package fakesgsol;

import fakesgsol.event.Event;
import fakesgsol.event.Station;
import fakesgsol.event.TransferEvent;

public class MainStation implements Station {
    private static final MainStation instance=new MainStation();
    private MainStation(){}
    public static MainStation getInstance(){return instance;}
    public void getOff(Event passenger){
        if(passenger instanceof TransferEvent&&((TransferEvent) passenger).type== TransferEvent.Type.toPregame){
            Main.startPregame();
        }
    }
}
