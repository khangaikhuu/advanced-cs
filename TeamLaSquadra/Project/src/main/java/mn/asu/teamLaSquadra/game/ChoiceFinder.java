package mn.asu.teamLaSquadra.game;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChoiceFinder {
    private Choice choice = new Choice(this);
    private int pressed = 0;
    public int choiceSelect(int input, Button exitButton) throws FileNotFoundException{

        if(input==1)
        {
            Image sceneKampf;
            try {
                choice.nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                        "You have added a new page on your book.", "exit", "sleep");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            input=1;
        }

        if(input==2)
        {
            Image sceneKampf;
            try {
                choice.nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                        "You couldn't sleep because you didn't write last night.", "just lie there", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            input=2;
        }

        if(input==3)
        {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }

        if (input==4) {
            Image sceneKampf;
            try {
                choice.nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                        "The next day in prison is here.", "get out of bed", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            input=4;
        }

        if(input==5)
        {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }


        if (input==6) {
            Image sceneDayPrison;
            try {
                choice.nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/dayprison.jpg")),
                        "The guard is calling you out.", "yes", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            input=6;
        }

        if(input==7)
        {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }

        if (input==8) {
            Image sceneDayPrison;
            try {
                choice.nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/leavingPrison.jpg")),
                        "The Bavarian Supreme Cour has pardoned your treason, " +
                                "/n and you are released from prison after only a year, in 20 December 1924.", "Pack up your stuff and leave", "Leave");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed=8;
        }

        if(input==9)
        {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }

        return pressed;
    }

}
