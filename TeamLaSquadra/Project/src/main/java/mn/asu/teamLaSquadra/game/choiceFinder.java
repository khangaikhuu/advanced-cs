package mn.asu.teamLaSquadra.game;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class choiceFinder {
    private int pressed = 0;
    private choicePartOne one = new choicePartOne();
    private choicePartTwo two = new choicePartTwo();

    public int choiceSelect(int input, Button exitButton, Choice choice,Stage primaryStage) throws FileNotFoundException {

        if(input==1)
        {
            Image sceneKampf;
            try {

                choice.nextChoice(sceneKampf = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile())),
                        "You have added a new page on your book.", "exit", "sleep");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            pressed=1;
        }

        if(input==2)
        {
            Image sceneKampf;
            try {
                choice.nextChoice(sceneKampf = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile())),
                        "You couldn't sleep because you didn't write last night.", "just lie there", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            pressed=2;
        }

        if(input==3)
        {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }

        if (input==4) {
            Image sceneKampf;
            try {
                choice.nextChoice(sceneKampf = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile())),
                        "The next day in prison is here.", "get out of bed", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            pressed=4;
        }

        if(input==5)
        {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }


        if (input==6) {
            Image sceneDayPrison;
            try {
                choice.nextChoice(sceneDayPrison = new Image(new FileInputStream(getClass().getClassLoader().getResource("dayprison.jpg").getFile())),
                        "The guard is calling you out.", "yes", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed=6;
        }

        if(input==7)
        {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }

        if (input==8) {
            Image sceneDayPrison;
            try {
                choice.nextChoice(sceneDayPrison = new Image(new FileInputStream(getClass().getClassLoader().getResource("leavingPrison.jpg").getFile())),
                        "The Bavarian Supreme Cour has pardoned your treason, \n" +
                                "and you are released from prison after only a year\n" +
                                ", in 20 December 1924.", "Pack up your stuff and leave", "Leave");
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

        if (input==10)
        {
            Image partyScene;
            try {
                choice.nextChoice(partyScene = new Image(new FileInputStream(getClass().getClassLoader().getResource("heinrichHeld.jpg").getFile())),
                        "The Nazi Party and it's affiliates have been banned in Bavaria. " +
                                "The Prime Minister, Heinrich Held wants to meet with you in " +
                                "January 4th. Go to the meeting?", "Reorganize party", "go to meeting");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed=10;
        }

        if (input==11)
        {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
            pressed=11;
        }

        try {
            pressed=one.choiceSelect(pressed, exitButton,choice);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            pressed=two.choiceSelect(pressed, exitButton,choice);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //ending.ending("World War 2 ends with the unconditional surrender of the Axis Powers" +
        //                    "\nthus ending the most violent struggle in human history. Adolf Hitler commits suicide, The Japanese surrender after" +
        //                    "\n two nuclear as well as Italy surrendering and switching sides.",endingStage);

        //ending.ending("Because you left your valuable book behind in prison you have no material to sway the public opinion, so you retire and become a simple salary man.",endingStage);

        return pressed;
    }
}
