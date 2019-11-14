package mn.asu.teamLaSquadra.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Prologue
{
    private Choice choice = new Choice();
    private VBox vLayout = new VBox();
    private VBox iLayout = new VBox();
    private Scene prologueScene= new Scene(vLayout,1550,1070);
    private Scene instructionScene = new Scene(iLayout, 1550, 1070);



    public void prologue(final Stage primaryStage, final String introduction) {
        Button ContinueButton = new Button("Continue");
        HBox hLayout = new HBox();
        Label prologue = new Label(introduction);

        prologue.setFont(Font.font("Arial", FontWeight.BOLD, 25));

        ContinueButton.setFont(Font.font("Arial", FontWeight.BOLD, 50));

        hLayout.getChildren().add(ContinueButton);
        hLayout.setAlignment(Pos.BOTTOM_RIGHT);
        vLayout.getChildren().addAll(prologue, hLayout);
        vLayout.setAlignment(Pos.CENTER);

        primaryStage.setScene(prologueScene);
        primaryStage.setFullScreen(true);

        ContinueButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                try {
                        instructions(primaryStage);
                    } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
        private void instructions(Stage primaryStage)
        {
            Button ContinueButton = new Button("Continue");
            HBox hLayout = new HBox();
            Label instructions = new Label("You are now playing the first chapter of a historical WW2 game" +
                    "\n you will play as Adolf Hitler in the first chapter and your goal is to reach the highest seat of power" +
                    "\n in order to play this game it is both educational and at the same time assessing your knowledge on the topics" +
                    "\n presented. You must know which choices will lead to your claim to power or your downfall" +
                    "\n you must CHOOSE carefully.");

            instructions.setFont(Font.font("Arial", FontWeight.BOLD, 25));

            ContinueButton.setFont(Font.font("Arial", FontWeight.BOLD, 50));

            hLayout.getChildren().add(ContinueButton);
            hLayout.setAlignment(Pos.BOTTOM_RIGHT);
            iLayout.getChildren().addAll(instructions, hLayout);
            iLayout.setAlignment(Pos.CENTER);

            primaryStage.setScene(instructionScene);
            primaryStage.setFullScreen(true);

            final Stage finalSecondStage = primaryStage;
            ContinueButton.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent actionEvent) {
                    try {
                        choice.firstChoice(finalSecondStage);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
}
