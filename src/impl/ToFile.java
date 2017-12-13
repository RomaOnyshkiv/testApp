package impl;

import helper.PreferMessage;
import interfaces.Print;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ToFile extends PreferMessage implements Print {

    private File file = new File("src/files/output.txt");

    @Override
    public void print(String msg) {

        String out = preferMessage(msg);
        try {
            FileWriter fw = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fw);
            writer.println(out);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
