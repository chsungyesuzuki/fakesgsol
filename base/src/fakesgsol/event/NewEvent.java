package fakesgsol.event;

public class NewEvent extends Event{
    public static enum Type{
        BUS,PREGAME,GAME,UI
    }
    public final Type type;
    public NewEvent(Type type,Station destination){this.type=type;this.destination=destination;}
}
