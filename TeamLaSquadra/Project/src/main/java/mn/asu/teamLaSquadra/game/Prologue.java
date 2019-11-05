package mn.asu.teamLaSquadra.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.io.FileNotFoundException;

public class Prologue
{
    private StackPane prologueRoot;
    private ChoiceFinder choiceFinder = new ChoiceFinder();
    private Choice choice = new Choice(choiceFinder);


    public void prologue(StackPane root)
    {
        Button ContinueButton = new Button("Continue");
        final VBox vLayout = new VBox();
        HBox hLayout = new HBox();
        Label prologue = new Label("This story depicts the rise and fall of one of the main belligerents in the most bloody struggle " +
                                    "\nin human history. This game is made for educational purposes only. Adolf Hitler was born in " +
                                    "\nthe small town of Braunau-am-Inn on the 20th of April, 1889 in Austria. " +
                                    "\n He was the fourth of six children. His mother was Klara Hitler and his father was Alois Hitler." +
                                    "\n Alois worked as a border control clerk, and Klara was a housekeeper.He wasn’t very academically talented," +
                                    "\n but he showed some artistic skills. When Adolf was 11, his brother Edmund suddenly died," +
                                    "\n causing Adolf to become very introverted and detached. ");

        prologue.setFont(Font.font("Arial", FontWeight.BOLD, 25));

        ContinueButton.setFont(Font.font("Arial", FontWeight.BOLD, 50));

        hLayout.getChildren().add(ContinueButton);
        hLayout.setAlignment(Pos.BOTTOM_RIGHT);
        vLayout.getChildren().addAll(prologue, hLayout);
        vLayout.setAlignment(Pos.CENTER);

        root.getChildren().add(vLayout);
        prologueRoot = root;
        ContinueButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                prologueRoot.getChildren().remove(vLayout);
                try {
                    choice.firstChoice(prologueRoot);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
