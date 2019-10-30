package mn.asu.teamLaSquadra.game;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChoiceFinder {
    private Choice choice;
    public void choiceSelect(boolean choice1, boolean choice2, boolean choice3, boolean choice4, boolean choice5, boolean choice6, boolean choice7, boolean choice8, boolean choice9, Button exitButton) throws FileNotFoundException{



        if (choice4) {
            Image sceneKampf;
            try {
                choice.nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                        "The next day in prison is here.", "get out of bed", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        if (choice6) {
            Image sceneDayPrison;
            try {
                choice.nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/dayprison.jpg")),
                        "The guard is calling you out.", "yes", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        if (choice8) {
            Image sceneDayPrison;
            try {
                choice.nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/leavingPrison.jpg")),
                        "The Bavarian Supreme Cour has pardoned your treason, " +
                                "/n and you are released from prison after only a year, in 20 December 1924.", "Pack up your stuff and leave", "Leave");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
