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
    private VBox vLayout = new VBox();
    private Scene scene= new Scene(vLayout, 1550, 1070);
    private Button startButton;
    private Button exitButton;
    private Setup setup = new Setup();


    private Ending ending = new Ending();

    @Override
    public void start(final Stage primaryStage) throws FileNotFoundException {
        //makes local variables to save space on the JVM
        startButton = new Button("START");
        exitButton = new Button("EXIT");

        //enlarges buttons by making text larger
        startButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));
        exitButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));

        startButton.setOnAction(new EventHandler<ActionEvent>() {
             public void handle(ActionEvent e) {
                 HBox charLayout  = null;
                 try {
                     setup.characterSelect(primaryStage);
                 } catch (FileNotFoundException ex) {
                     ex.printStackTrace();
                 }

            }
        });
        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) exitButton.getScene().getWindow();
                stage.close();
            }
        });

        //sets all items in vertical layout to center
        vLayout.setAlignment(Pos.CENTER);

        //adds 2 buttons to vertical layout
        vLayout.getChildren().add(startButton);
        vLayout.getChildren().add(exitButton);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();

        if(false) {
            //first choice






            VBox endingLayout = ending.ending("World War 2 ends with the unconditional surrender of the Axis Powers" +
                    "\nthus ending the most violent struggle in human history. Adolf Hitler commits suicide, The Japanese surrender after" +
                    "\n two nuclear as well as Italy surrendering and switching sides.");

        }

    }

    }

