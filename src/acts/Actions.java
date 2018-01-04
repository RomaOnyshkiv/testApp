package acts;


import helper.PreferMessage;
import impl.ToConsole;
import impl.ToFile;

import java.util.Scanner;

public class Actions {

    private PreferMessage preferMessage = new PreferMessage();
    private ToFile toFile = new ToFile();
    private ToConsole toConsole = new ToConsole();
    private Scanner reader = new Scanner(System.in);

    public void actions(){

        System.out.println("Type text");
        String message = reader.next();

        while (true) {
            System.out.println("Type 1 - to print in file, or 2 - to print to console");
            int chose = reader.nextInt();
            switch (chose) {
                case 1:
                    toFile.print(preferMessage.preferMessage(message));
                    break;
                case 2 :
                    toConsole.print(preferMessage.preferMessage(message));
                    break;
                default:
                    System.out.println("Incorrect choice");
            }

            System.out.println("Type text, or 'Q' or 'EXIT' for exit");
            message = reader.next();

            if (message.equalsIgnoreCase("q") || message.equalsIgnoreCase("exit")){
                System.exit(0);
            }

        }


    }
}
