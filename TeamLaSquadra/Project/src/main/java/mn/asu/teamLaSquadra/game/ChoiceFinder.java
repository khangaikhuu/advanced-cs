package mn.asu.teamLaSquadra.game;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChoiceFinder {
    public void choiceSelect() throws FileNotFoundException {


        if (buttonCounter1 == 1 && buttonCounter2 == 1) {
            Image sceneKampf;
            try {
                nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                        "The next day in prison is here.", "get out of bed", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(buttonCounter1);
        }

        if (buttonCounter1 == 2  && buttonCounter2 == 1) {
            Image sceneDayPrison;
            try {
                nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/dayprison.jpg")),
                        "The guard is calling you out.", "yes", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        if (buttonCounter1 == 3  && buttonCounter2 == 1) {
            Image sceneDayPrison;
            try {
                nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/leavingPrison.jpg")),
                        "The Bavarian Supreme Cour has pardoned your treason, " +
                                "/n and you are released from prison after only a year, in 20 December 1924.", "Pack up your stuff and leave", "Leave");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
}
