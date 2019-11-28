package mn.asu.teamLaSquadra.game;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class choicePartTwo {
    private int pressed = 0;
    private Prologue information = new Prologue();

    public int choiceSelect(int input, Button exitButton, Choice choice, Stage primaryStage) throws FileNotFoundException {

        if(input==15)
        {
            Image backPrison;
            try {
                choice.nextChoice(backPrison = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile())),
                        "You are back in prison for disagreeing with the Prime Minister." +
                                "\n Retard", "Okay", "Exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed=15;
        }

        if(input==16)
        {
            Image freedom;
            try {
                choice.nextChoice(freedom = new Image(new FileInputStream(getClass().getClassLoader().getResource("freedom.png").getFile())),
                        "Nice! You are a completely free man now as long as you" +
                                "\n abide by the state's laws", "Okay", "Exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed=16;
        }
        if(input==17)
        {
            try {
                information.changer(primaryStage, "World War 2 begins in 1939 September 1st, When Germany invades" +
                        "\n Poland, which would be considered the final straw for France and Britain. They officially declare war. " +
                        "\n " +
                        "\n " +
                        "\n .");
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return pressed;
    }
}
