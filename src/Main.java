import acts.Actions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Actions actions = new Actions();
        try {
            actions.actions();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
