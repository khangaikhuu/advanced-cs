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
    private Scene choiceScene = new Scene(vChoice,1366,768);
    private Ending ending = new Ending();
    private Stage endingStage = new Stage();
    private choiceFinder finder = new choiceFinder();
    private choicePartOne one = new choicePartOne();
    private choicePartTwo two = new choicePartTwo();


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




    public void firstChoice(final Stage primaryStage) throws FileNotFoundException {

        endingStage=primaryStage;

        Image firstScene = new Image(new FileInputStream(getClass().getClassLoader().getResource("prison.png").getFile()));

        storyInfo.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        choiceOne.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        choiceTwo.setFont(Font.font("Arial", FontWeight.BOLD, 30));

        sceneView.setFitHeight(700);
        sceneView.setFitWidth(768);

        sceneView.setImage(firstScene);
        storyImage.setGraphic(sceneView);

        hLayout.setAlignment(Pos.CENTER);

        hLayout.getChildren().addAll(choiceOne, choiceTwo);
        vChoice.getChildren().addAll(storyImage, storyInfo, hLayout);
        vChoice.setAlignment(Pos.CENTER);
        primaryStage.setScene(choiceScene);
        primaryStage.setFullScreen(true);
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
                        break;
                    case 10:
                        pressed=12;
                        break;
                    case 12:
                        pressed=14;
                        break;
                    case 13:
                        pressed=15;
                        break;
                    case 14:
                        pressed=17;
                        break;
                    case 15:
                        pressed=18;
                        break;
                    case 18:
                        pressed=20;
                        break;
                    case 16:
                        pressed=19;
                        break;
                    case 19:
                        pressed=21;
                        break;
                }

                    try {
                        pres = finder.choiceSelect(pressed, choiceOne, Choice.this,primaryStage);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                try {
                    pres = one.choiceSelect(pressed, choiceOne,Choice.this);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    pres = two.choiceSelect(pressed, choiceOne,Choice.this,sceneView);
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
                        break;
                    case 10:
                        pressed = 13;
                        break;
                    case 12:
                        pressed=14;
                        break;
                    case 13:
                        pressed=16;
                        break;
                    case 14:
                        pressed=17;
                        break;
                    case 15:
                        pressed=18;
                        break;
                    case 18:
                        pressed=20;
                        break;
                    case 16:
                        pressed=19;
                        break;
                    case 19:
                        pressed=21;
                        break;
                }

                    try {
                        pres = finder.choiceSelect(pressed, choiceTwo,Choice.this,primaryStage);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                try {
                    pres = one.choiceSelect(pressed, choiceTwo,Choice.this);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    pres = two.choiceSelect(pressed, choiceTwo,Choice.this,sceneView);
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
}
