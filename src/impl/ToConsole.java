package impl;

import helper.PreferMessage;
import interfaces.Print;

public class ToConsole extends PreferMessage implements Print {


    @Override
    public void print(String msg) {
        System.out.println(preferMessage(msg));
    }
}
