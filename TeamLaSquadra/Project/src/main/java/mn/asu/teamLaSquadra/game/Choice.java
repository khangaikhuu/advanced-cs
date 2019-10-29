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

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Choice {
    private ImageView sceneView;
    private Label storyInfo;
    private Button choiceOne;
    private Button choiceTwo;
    private int buttonCounter1 = 0;
    private int buttonCounter2 = 0;

    public void firstChoice(StackPane root) throws FileNotFoundException {

        VBox vChoice = new VBox();
        HBox hLayout = new HBox();
        choiceOne = new Button("Write more for your book, Mein Kampf");
        choiceTwo = new Button("Take the day off, and hit the sack");
        Label storyImage = new Label();
        storyInfo = new Label("It is another quiet day. Most of the guards are out, and your cellmates are sleeping. What do you do?");
        Image firstScene = new Image(new FileInputStream("Project/src/main/resources/prison.png"));
        sceneView = new ImageView();

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

                if (buttonCounter1 == 0 && buttonCounter2 == 0) {
                    buttonCounter1++;
                    //first choice
                    Image sceneKampf;
                    try {
                        nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                                "You couldn't sleep last night, because you didn't write.", "just lie there", "exit");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                buttonCounter1++;
                try {
                    thirdChoice();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        choiceTwo.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {

                if (buttonCounter1 == 0 && buttonCounter2 == 0) {
                    buttonCounter2++;
                    //second choice
                    Image sceneKampf;
                    try {
                        nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                                "You couldn't sleep last night, because you didn't write.", "just lie there", "exit");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                buttonCounter2++;
                try {
                    thirdChoice();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void nextChoice(Image nextScene, String textInfo, String buttonDes1, String buttonDes2) throws FileNotFoundException {

        sceneView.setImage(nextScene);
        storyInfo.setText(textInfo);
        choiceOne.setText(buttonDes1);
        choiceTwo.setText(buttonDes2);
    }

    private void thirdChoice() throws FileNotFoundException {


        if (buttonCounter1 == 1 && buttonCounter2 == 0) {
            Image sceneKampf;
            try {
                nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                        "The next day in prison is here.", "get out of bed", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        if (buttonCounter1 == 0 && buttonCounter2 == 1) {
            Image sceneKampf;
            try {
                nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                        "You have added a page on your book.", "exit", "sleep");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        if (buttonCounter1 == 0 && buttonCounter2 == 2) {
            Image sceneKampf;
            try {
                nextChoice(sceneKampf = new Image(new FileInputStream("Project/src/main/resources/prison.png")),
                        "just lie there.", "just lie there", "exit");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

            if (buttonCounter1 == 0 && buttonCounter2 == 2) {
                Image sceneDayPrison;
                try {
                    nextChoice(sceneDayPrison = new Image(new FileInputStream("Project/src/main/resources/dayprison.png")),
                            "The next day has arrived.", "get out of bed", "Sleep");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }





