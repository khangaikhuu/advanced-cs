package mn.asu.teamLaSquadra.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Ending
{
    private Button exitButton;
    private Label ending;
    VBox vLayout = new VBox();
    private Scene endingScene = new Scene(vLayout,1550,1070);


    public void ending(String epilogue, Stage primaryStage)
    {
    exitButton = new Button("Exit");

    HBox hLayout = new HBox();
    ending = new Label(epilogue);
    ending.setFont(Font.font("Arial", FontWeight.BOLD, 25));
    exitButton.setFont(Font.font("Arial", FontWeight.BOLD, 50));

    hLayout.getChildren().add(exitButton);
    hLayout.setAlignment(Pos.CENTER);
    vLayout.getChildren().addAll(ending, hLayout);
    vLayout.setAlignment(Pos.CENTER);

    exitButton.setOnAction(new EventHandler<ActionEvent>() {
        public void handle(ActionEvent event) {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        }
    });

    primaryStage.setScene(endingScene);
    }
}
