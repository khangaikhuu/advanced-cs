package mn.asu.teamLaSquadra;

import javafx.application.Application;
import mn.asu.teamLaSquadra.game.Game;

public class InitialApp {
    public static void main(String [] args)
    {
        Application.launch(String.valueOf(new Game()));
    }
}
