package mn.asu.teamLaSquadra.game;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Prologue
{
    private Button ContinueButton = new Button("Continue");

    public void prologue(StackPane root, Button HitlerButton, Button LockedStalinButton, HBox hLayout)
    {
        hLayout.getChildren().removeAll(HitlerButton,LockedStalinButton);
        VBox vLayout = new VBox();
        Label prologue = new Label("This story depicts the rise and fall of one of the main belligerents in the most bloody struggle\n in human history. This game is made for educational purposes only.");
        Label prologue2 = new Label("Adolf Hitler was born in the small town of Braunau-am-Inn on the 20th of April, 1889 in Austria.\n He was the fourth of six children. His mother was Klara Hitler and his father was Alois Hitler.\n Alois worked as a border control clerk, and Klara was a housekeeper.He wasn’t very academically talented,\n but he showed some artistic skills. When Adolf was 11, his brother Edmund suddenly died,\n causing Adolf to become very introverted and detached. ");

        prologue.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        prologue2.setFont(Font.font("Arial", FontWeight.BOLD, 25));

        ContinueButton.setFont(Font.font("Arial", FontWeight.BOLD, 50));

        vLayout.getChildren().addAll(prologue, prologue2, ContinueButton);
        vLayout.setAlignment(Pos.CENTER);
        root.getChildren().add(vLayout);
    }
}
