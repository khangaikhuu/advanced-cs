package mn.asu.teamLaSquadra.game;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Game extends Application
{
    private VBox vLayout= new VBox();
    private Scene scene= new Scene(vLayout, 500, 500);
    private Button startButton = new Button("START");
    private Button exitButton = new Button("EXIT");
    @Override
    public void start(Stage primaryStage)
    {

        startButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));
        exitButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));

        BackgroundImage background= new BackgroundImage(new Image("https://www.historyonthenet.com/wp-content/uploads/2014/11/450223-M-0000R-001.jpg",32,32,false,true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(500,500,false,false,false,false));

        vLayout.setBackground(new Background(background));

        vLayout.setAlignment(Pos.CENTER);
        vLayout.getChildren().add(startButton);
        vLayout.getChildren().add(exitButton);

        primaryStage.setScene(scene);
        primaryStage.show();
        characterSelect();
    }

    private void characterSelect()
    {
        vLayout.getChildren().removeAll(startButton,exitButton);
        Button HitlerButton = new Button();
        Button LockedStalinButton = new Button();
        vLayout.getChildren().add(HitlerButton);
        vLayout.getChildren().add(LockedStalinButton);
    }
}
