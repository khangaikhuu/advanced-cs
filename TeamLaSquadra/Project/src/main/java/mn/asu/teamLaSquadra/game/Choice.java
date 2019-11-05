package mn.asu.teamLaSquadra.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Choice {

    private ImageView sceneView;
    private Label storyInfo;
    private Button choiceOne;
    private Button choiceTwo;
    private Label storyImage;
    private int buttonCounter1 = 0;
    private int buttonCounter2 = 0;
    private int pressed;
    private int pres;
    private VBox vChoice;
    private HBox hLayout;
    private ChoiceFinder choiceFinder;
    public Choice(ChoiceFinder choiceFinder)
    {
        sceneView = new ImageView();
        storyInfo = new Label("It is another quiet day. Most of the guards are out, and your cellmates are sleeping. What do you do?");
        choiceOne = new Button("Write");
        choiceTwo = new Button("Sleep");
        storyImage = new Label();
        pressed = 0;
        vChoice = new VBox();
        hLayout  = new HBox();
        this.choiceFinder = choiceFinder;
    }




    public void firstChoice(StackPane root) throws FileNotFoundException {

        Image firstScene = new Image(new FileInputStream("Project/src/main/resources/prison.png"));

        storyInfo.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        choiceOne.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        choiceTwo.setFont(Font.font("Arial", FontWeight.BOLD, 30));

        sceneView.setFitHeight(700);
        sceneView.setFitWidth(1920);

        sceneView.setImage(firstScene);
        storyImage.setGraphic(sceneView);

        hLayout.setAlignment(Pos.CENTER);

        hLayout.getChildren().addAll(choiceOne, choiceTwo);
        vChoice.getChildren().addAll(storyImage, storyInfo, hLayout);
        vChoice.setAlignment(Pos.CENTER);
        root.getChildren().add(vChoice);
        //button handler
        choiceOne.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(pressed==0)
                {
                    pressed=1;
                }

                switch (pres) {
                    case 1:
                        pressed = 3;
                        break;
                    case 2:
                        pressed = 4;
                        break;
                    case 4:
                        pressed = 6;
                        break;
                    case 6:
                        pressed = 8;
                        break;
                }

                    try {
                        pres = choiceSelect(pressed, choiceOne);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }


            }
        });
        choiceTwo.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {

                if(pressed==0)
                {
                    pressed=2;
                }

                switch (pres) {
                    case 1:
                        pressed = 4;
                        break;
                    case 2:
                        pressed = 5;
                        break;
                    case 4:
                        pressed = 7;
                        break;
                    case 6:
                        pressed = 9;
                        break;
                }

                    try {
                        pres = choiceSelect(pressed, choiceTwo);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }


            }
        });
    }

    public void nextChoice(Image nextScene, String textInfo, String buttonDes1, String buttonDes2) throws FileNotFoundException {

        sceneView.setImage(nextScene);
        storyInfo.setText(textInfo);
        choiceOne.setText(buttonDes1);
        choiceTwo.setText(buttonDes2);

    }

    private int choiceSelect(int input, Button exitButton) throws FileNotFoundException{

        if(input==1)
        {
            Image sceneKampf;
            try {
                nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
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
                nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
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
                nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
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
                nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/dayprison.jpg")),
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
                nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/leavingPrison.jpg")),
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

        return pressed;
    }

}




