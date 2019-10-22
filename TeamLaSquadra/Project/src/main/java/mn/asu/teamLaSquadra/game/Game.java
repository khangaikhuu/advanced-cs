package mn.asu.teamLaSquadra.game;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Game extends Application
{
    private StackPane root = new StackPane();
    private Scene scene= new Scene(root, 1910, 1070);
    private VBox vLayout;
    private Button startButton;
    private Button exitButton;
    private Setup setup = new Setup();

    private Choice choice = new Choice();
    private Ending ending = new Ending();
    private Prologue prologue = new Prologue();
    private boolean next = false;

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        //makes local variables to save space on the JVM
        vLayout = new VBox();
        startButton = new Button("START");
        exitButton = new Button("EXIT");

        //enlarges buttons by making text larger
        startButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));
        exitButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));

        startButton.setOnAction(new EventHandler<ActionEvent>() {
             public void handle(ActionEvent e) {
                 root.getChildren().remove(vLayout);
                 HBox charLayout  = null;
                 try {
                     next = setup.characterSelect(root);
                 } catch (FileNotFoundException ex) {
                     ex.printStackTrace();
                 }

            }
        });

        //sets all items in vertical layout to center
        vLayout.setAlignment(Pos.CENTER);

        //adds 2 buttons to vertical layout
        vLayout.getChildren().add(startButton);
        vLayout.getChildren().add(exitButton);
        root.getChildren().add(vLayout);
        primaryStage.setScene(scene);
        primaryStage.show();


        root.getChildren().remove(prologueLayout);

        VBox vChoice = choice.firstChoice(root);

        Image sceneKampf;
        choice.nextChoice(sceneKampf = new Image(new FileInputStream("C:/Users/G8/Desktop/advanced-cs/TeamLaSquadra/Project/src/main/resources/prison.png")),"You have written a new page in your book. You write about your aspirations and hopes about the country.","Ok","Quit");

        root.getChildren().remove(vChoice);

        VBox endingLayout = ending.ending("World War 2 ends with the unconditional surrender of the Axis Powers" +
                "\nthus ending the most violent struggle in human history. Adolf Hitler commits suicide, The Japanese surrender after" +
                "\n two nuclear as well as Italy surrendering and switching sides.");

        root.getChildren().add(endingLayout);


    }

    }

