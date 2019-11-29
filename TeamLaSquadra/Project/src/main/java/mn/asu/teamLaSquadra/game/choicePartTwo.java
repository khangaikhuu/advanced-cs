package mn.asu.teamLaSquadra.game;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class choicePartTwo {

    int pressed=0;

    public int choiceSelect(int input, Button exitButton, Choice choice) throws FileNotFoundException {

        pressed=input;

        if (input == 15) {
            Image backPrison;
            try {
                choice.nextChoice(backPrison = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile())),
                        "You are back in prison for disagreeing with the Prime Minister." +
                                "\n Retard", "Okay", "Exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed = 15;
        }

        if (input == 16) {
            Image freedom;
            try {
                choice.nextChoice(freedom = new Image(new FileInputStream(getClass().getClassLoader().getResource("freedom.jpg").getFile())),
                        "Nice! You are a completely free man now as long as you" +
                                "\n abide by the state's laws", "Okay", "Exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            pressed = 16;
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


        if (input == 17) {
                Image freedom;
                try {
                    choice.nextChoice(freedom = new Image(new FileInputStream(getClass().getClassLoader().getResource("freedom.png").getFile())),
                            "\n After the formation of the National Socialist Party, Adolf Hitler gains as much power as he can. " +
                                    "\n Once Adolf Hitler was appointed chancellor he made haste to to eliminate anybody who opposed him." +
                                    "\n The national socialist party even people who aided him in his rise to power. This is where the night" +
                                    "\n of the long knives take place. Starting from June 30th of 1934 to July 2nd. He decided the National Socialist Party's" +
                                    "\n original paramilitary organization was threat him. Hitler sent out his Schutzstaffel officers to begin purging  " +
                                    "\n the members of the Sturmabteilung such as its leader Ernst Rohm who was one Hitler's original followers during his rise" +
                                    "\n after the elimination of Sturmabteilung and the consolidation of the Gestapo and Schutzstaffel the Nazi party's power was unmatched" +
                                    "\n in the country.", "....", "Continue");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                pressed = 17;


        }
        return pressed;
    }
}
