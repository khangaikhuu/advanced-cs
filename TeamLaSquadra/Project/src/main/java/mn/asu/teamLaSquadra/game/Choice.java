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



                try {
                    pres = choiceFinder.choiceSelect(1,choiceOne);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                switch (pres)
                {
                    case 0:
                        pressed=3;
                    case 2:
                        pressed=4;
                    case 4:
                        pressed=6;
                    case 6:
                        pressed=8;
                }


            }
        });
        choiceTwo.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {

                if(pressed==0)
                {
                    pressed=2;
                }

                try {
                    pres=choiceFinder.choiceSelect(pressed,choiceTwo);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                switch (pres)
                {
                    case 0:
                        pressed=5;
                    case 1:
                        pressed=4;
                    case 4:
                        pressed=7;
                    case 6:
                        pressed=9;
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




