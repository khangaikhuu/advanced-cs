package mn.asu.teamLaSquadra.game;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class choicePartOne {

    int pressed = 0;

    public int choiceSelect(int input, Button exitButton, Choice choice) throws FileNotFoundException {

        pressed=input;

        if (input == 12) {
            Image reOrganize;
            try {
                choice.nextChoice(reOrganize = new Image(new FileInputStream(getClass().getClassLoader().getResource("heinrichHeld.jpg").getFile())),
                        "You attempt to reorganize the Nazi Party without knowledge of the new laws" +
                                "\n due to not going to the meeting. You are back in prison.", "continue", "continue");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed=12;
        }

        if (input == 13) {
            Image meeting;
            try {
                choice.nextChoice(meeting = new Image(new FileInputStream(getClass().getClassLoader().getResource("lieutenant.png").getFile())),
                        "You are at the meeting. Do you agree to respect the authority" +
                                "\n of the state and to only seek power through democracy?", "No", "Yes");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed=13;
        }

        if (input == 14) {
            Image gameOver;
            try {
                choice.nextChoice(gameOver = new Image(new FileInputStream(getClass().getClassLoader().getResource("gameOver.png").getFile())),
                        "Game Over", "exit", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed=14;
        }

        if(input==17) {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }


        return pressed;
    }
}
