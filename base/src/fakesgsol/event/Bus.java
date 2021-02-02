package fakesgsol.event;

public class Bus {
    public Bus(){}
    public void getOn(Event passenger){}
    private void operate(Event passenger){passenger.destination.getOff(passenger);}
}
