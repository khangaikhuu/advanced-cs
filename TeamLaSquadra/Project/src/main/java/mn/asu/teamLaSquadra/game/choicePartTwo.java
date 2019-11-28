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
                information.changer(primaryStage, "You are now playing the first chapter of a historical WW2 game" +
                        "\n you will play as Adolf Hitler in the first chapter and your goal is to reach the highest seat of power" +
                        "\n in order to play this game it is both educational and at the same time assessing your knowledge on the topics" +
                        "\n presented. You must know which choices will lead to your claim to power or your downfall" +
                        "\n you must CHOOSE carefully or else you will lose.");
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return pressed;
    }
}
