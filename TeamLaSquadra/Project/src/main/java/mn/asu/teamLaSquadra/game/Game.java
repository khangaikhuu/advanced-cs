package mn.asu.teamLaSquadra.game;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Game extends Application
{
    private Pane root = new StackPane();
    private Scene scene= new Scene(root, 500, 500);
    private VBox vLayout;
    private Button startButton;
    private Button exitButton;
    private Setup setup = new Setup();
    private Prologue prologue = new Prologue();



    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        //makes local variables to save space on the JVM
        vLayout = new VBox();
        startButton = new Button("START");
        exitButton = new Button("EXIT");
        HBox hLayout = new HBox();

        //enlarges buttons by making text larger
        startButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));
        exitButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));

        //sets all items in vertical layout to center
        vLayout.setAlignment(Pos.CENTER);

        //adds 2 buttons to vertical layout
        vLayout.getChildren().add(startButton);
        vLayout.getChildren().add(exitButton);
        root.getChildren().add(vLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
        root.getChildren().remove(vLayout);

        HBox charLayout  =setup.characterSelect();
        root.getChildren().add(charLayout);

        root.getChildren().remove(charLayout);
        root.getChildren().add(prologue.prologue());

    }

    }

