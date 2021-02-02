package fakesgsol.ui;

import fakesgsol.MainStation;
import fakesgsol.event.Bus;
import fakesgsol.event.TransferEvent;

import java.io.Console;
import java.io.PrintStream;

public class UI {
    private Console console;
    private Bus bus;
    private Thread uIThread;
    public final UIStation station=UIStation.getInstance();
    public UI(Bus bus){this.bus=bus;}
    public void start(){
        console=System.console();
        printStart();
        uIThread=new Thread(this::processOutOfGame);
        uIThread.start();
    }
    private static void printStart(){
        PrintStream out = System.out;
        out.println("fakesgsol");
        out.println("Copyright chsungyesuzuki 2021");
        out.println("nemm is under GPL 3.0 or later. To check see gpl-3.0.txt or https://www.gnu.org/licenses/gpl-3.0.en.html.");
        out.println("\"https://github.com/chsungyesuzuki/fakesgsol\"");
    }
    private void processOutOfGame(){
        while(true){
            String cmd=console.readLine();
            if(cmd.equals("startPregame")){
                bus.getOn(new TransferEvent(TransferEvent.Type.toPregame, MainStation.getInstance()));
                processInPregame();
            }else if(cmd.equals("help")){
                helpOutOfGame();
            }else{
                throw new IllegalArgumentException("type \"help\".");
            }
        }
    }
    private static void helpOutOfGame(){
        PrintStream out=System.out;
        out.println("\"help\" to help;");
        out.println("\"startPregame\" to start pregame, which is necessary if you want to play;");
    }
    private void processInPregame(){}
    private void processInGame(){}
    void stop(){uIThread.interrupt();}
}
