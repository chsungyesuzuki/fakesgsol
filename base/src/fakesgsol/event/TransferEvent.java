package fakesgsol.event;

public class TransferEvent extends Event {
    public static enum Type{
        toPregame,toGame
    }
    public final Type type;
    public TransferEvent(Type type,Station destination){this.type=type;this.destination=destination;}
}
