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

import java.io.FileNotFoundException;

public class Game extends Application
{
    private StackPane root = new StackPane();
    private VBox vLayout= new VBox();
    private Scene scene= new Scene(root, 500, 500);
    private Button startButton = new Button("START");
    private Button exitButton = new Button("EXIT");
    private HBox hLayout = new HBox();


    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        startButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));
        exitButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));

        vLayout.setAlignment(Pos.CENTER);
        vLayout.getChildren().add(startButton);
        vLayout.getChildren().add(exitButton);
        root.getChildren().add(vLayout);
        primaryStage.setScene(scene);
        primaryStage.show();

        Setup setup = new Setup();
        setup.characterSelect(root,startButton,exitButton,hLayout,vLayout);

    }





}
