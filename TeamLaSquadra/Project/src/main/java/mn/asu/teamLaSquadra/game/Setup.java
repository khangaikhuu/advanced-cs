package mn.asu.teamLaSquadra.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Setup {

    private HBox hLayout;
    private StackPane mainRoot;
    private Prologue prologue = new Prologue();

    public void characterSelect(StackPane root) throws FileNotFoundException {

        hLayout = new HBox();

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

        mainRoot = root;
        HitlerButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                mainRoot.getChildren().remove(hLayout);
                prologue.prologue(mainRoot);
            }
        });
    }
}
