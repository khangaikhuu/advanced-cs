package mn.asu.teamLaSquadra.game;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Ending
{
    private Button exitButton;
    private Label ending;

    public VBox ending(String epilogue)
    {
    exitButton = new Button("Exit");
    VBox vLayout = new VBox();
    HBox hLayout = new HBox();
    ending = new Label(epilogue);
    ending.setFont(Font.font("Arial", FontWeight.BOLD, 25));
    exitButton.setFont(Font.font("Arial", FontWeight.BOLD, 50));

    hLayout.getChildren().add(exitButton);
    hLayout.setAlignment(Pos.CENTER);
    vLayout.getChildren().addAll(ending, hLayout);
    vLayout.setAlignment(Pos.CENTER);

    return vLayout;
    }
}