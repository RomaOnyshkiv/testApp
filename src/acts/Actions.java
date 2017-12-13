package acts;


import helper.PreferMessage;
import impl.ToConsole;
import impl.ToFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actions {

    private PreferMessage preferMessage = new PreferMessage();
    private ToFile toFile = new ToFile();
    private ToConsole toConsole = new ToConsole();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String in, chose;

    public void actions() throws IOException{

        System.out.println("Type text");
        in = reader.readLine();

        while (true) {
            System.out.println("Type 1 - to print in file, or 2 - to print to console");
            chose = reader.readLine();
            switch (chose) {
                case "1":
                    toFile.print(preferMessage.preferMessage(in));
                    break;
                case "2" :
                    toConsole.print(preferMessage.preferMessage(in));
                    break;
                default:
                    System.out.println("Incorrect choice");
            }

            System.out.println("Type text, or 'Q' or 'EXIT' for exit");
            in = reader.readLine();

            if (in.equalsIgnoreCase("q") || in.equalsIgnoreCase("exit")){
                System.exit(0);
            }

        }


    }
}
