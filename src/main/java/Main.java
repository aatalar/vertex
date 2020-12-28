import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        TerminalSize terminalSize = terminal.getTerminalSize();

        terminal.moveCursor(6,6);
        Write("PLEASE SELECT PLAYING GROUND",terminal);
    }
    private static void Write(String print, Terminal terminal) {
        char[] printToChar = print.toCharArray();
        for (int i=0;i<print.length();i++)
        {
            terminal.putCharacter(printToChar[i]);
        }
    }
}
