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

public class Choice
{
    private ImageView sceneView;
    private Label storyInfo;
    private Button choiceOne;
    private Button choiceTwo;
    private int buttonCounter1=0;
    private int buttonCounter2 = 0;

    public void firstChoice(StackPane root) throws FileNotFoundException {

        VBox vChoice = new VBox();
        HBox hLayout = new HBox();
        choiceOne = new Button("Write more for your book, Mein Kampf");
        choiceTwo = new Button("Take the day off, and hit the sack");
        Label storyImage = new Label();
        storyInfo = new Label("It is another quiet day. Most of the guards are out, and your cellmates are sleeping. What do you do?");
        Image firstScene = new Image(new FileInputStream("C:/Users/G8/Desktop/advanced-cs/TeamLaSquadra/Project/src/main/resources/prison.png"));
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
                buttonCounter1++;
                //second choice
                Image sceneKampf;
                try {
                    nextChoice(sceneKampf = new Image(new FileInputStream("C:/Users/G8/Desktop/advanced-cs/TeamLaSquadra/Project/src/main/resources/prison.png")), "You have written a new page in your book. You write about your aspirations and hopes about the country.", "Ok", "Quit");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
        choiceTwo.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonCounter2++;
                //second choice
                Image sceneKampf;
                try {
                    nextChoice(sceneKampf = new Image(new FileInputStream("C:/Users/G8/Desktop/advanced-cs/TeamLaSquadra/Project/src/main/resources/prison.png")), "choice2.", "choice2", "choice");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    private void nextChoice(Image nextScene, String textInfo,String buttonDes1, String buttonDes2) throws FileNotFoundException {

        sceneView.setImage(nextScene);
        storyInfo.setText(textInfo);
        choiceOne.setText(buttonDes1);
        choiceTwo.setText(buttonDes2);
        if(buttonCounter1 == 1 && buttonCounter2 == 0)
        {
            Image sceneKampf;
            nextChoice(sceneKampf = new Image(new FileInputStream("C:/Users/G8/Desktop/advanced-cs/TeamLaSquadra/Project/src/main/resources/prison.png")), "You have writte and hopes about the country.", "no", "yes");
        }
    }


}
