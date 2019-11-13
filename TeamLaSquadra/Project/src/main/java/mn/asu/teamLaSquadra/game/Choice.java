package mn.asu.teamLaSquadra.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
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
    private int pressed;
    private int pres;
    private VBox vChoice = new VBox();
    private HBox hLayout;
    private Scene choiceScene = new Scene(vChoice,1550,1000);
    private Ending ending = new Ending();
    private Stage endingStage;
    public Choice()
    {
        sceneView = new ImageView();
        storyInfo = new Label("It is another quiet day. Most of the guards are out, and your cellmates are sleeping. What do you do?");
        choiceOne = new Button("Write");
        choiceTwo = new Button("Sleep");
        storyImage = new Label();
        pressed = 0;
        hLayout  = new HBox();
    }




    public void firstChoice(Stage primaryStage) throws FileNotFoundException {

        endingStage=primaryStage;

        Image firstScene = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile()));

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
        primaryStage.setScene(choiceScene);
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
                    case 8:
                        pressed=10;
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
                    case 8:
                        pressed = 11;
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

                nextChoice(sceneKampf = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile())),
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
                nextChoice(sceneKampf = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile())),
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
                nextChoice(sceneKampf = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile())),
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
                nextChoice(sceneDayPrison = new Image(new FileInputStream(getClass().getClassLoader().getResource("dayprison.jpg").getFile())),
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
                nextChoice(sceneDayPrison = new Image(new FileInputStream(getClass().getClassLoader().getResource("leavingPrison.jpg").getFile())),
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
                nextChoice(partyScene = new Image(new FileInputStream(getClass().getClassLoader().getResource("heinrichHeld.jpg").getFile())),
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

        if(input==12)
        {

        }

        if(input==13)
        {

        }

        if(input==14)
        {

        }

        if(input==15)
        {

        }

        if(input==16)
        {

        }

        //ending.ending("World War 2 ends with the unconditional surrender of the Axis Powers" +
        //                    "\nthus ending the most violent struggle in human history. Adolf Hitler commits suicide, The Japanese surrender after" +
        //                    "\n two nuclear as well as Italy surrendering and switching sides.",endingStage);

        //ending.ending("Because you left your valuable book behind in prison you have no material to sway the public opinion, so you retire and become a simple salary man.",endingStage);

        return pressed;
    }


}
