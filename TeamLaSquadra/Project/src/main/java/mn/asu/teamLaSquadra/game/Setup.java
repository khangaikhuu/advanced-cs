package mn.asu.teamLaSquadra.game;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Setup {
    public void characterSelect(StackPane root, Button startButton, Button exitButton, HBox hLayout, VBox vLayout) throws FileNotFoundException {


        vLayout.getChildren().removeAll(startButton,exitButton);
        Button HitlerButton = new Button();
        Button LockedStalinButton = new Button();
        hLayout.getChildren().add(HitlerButton);
        hLayout.getChildren().add(LockedStalinButton);

        Image HitlerImage = new Image(new FileInputStream("C:/Users/G8/Desktop/advanced-cs/TeamLaSquadra/Project/src/main/resources/hitler.png"));
        Image StalinImage = new Image(new FileInputStream("C:/Users/G8/Desktop/advanced-cs/TeamLaSquadra/Project/src/main/resources/stalin.png"));

        ImageView HitlerView = new ImageView();
        ImageView StalinView = new ImageView();


        HitlerView.setFitHeight(400);
        HitlerView.setFitWidth(300);

        StalinView.setFitHeight(400);
        StalinView.setFitWidth(300);

        HitlerView.setImage(HitlerImage);
        StalinView.setImage(StalinImage);

        HitlerButton.setGraphic(HitlerView);
        LockedStalinButton.setGraphic(StalinView);
        hLayout.setAlignment(Pos.CENTER);
        root.getChildren().add(hLayout);

        Prologue prologue = new Prologue();
        prologue.prologue(root, HitlerButton, LockedStalinButton,hLayout);
    }
}
