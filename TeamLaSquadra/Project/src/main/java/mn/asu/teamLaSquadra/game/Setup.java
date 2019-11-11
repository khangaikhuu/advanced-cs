package mn.asu.teamLaSquadra.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

public class Setup {

    private HBox hLayout = new HBox();
    private Prologue prologue = new Prologue();
    private Scene setupScene = new Scene(hLayout,1550,1070);

    public void characterSelect(final Stage primaryStage) throws FileNotFoundException {

        Button HitlerButton = new Button();

        Button LockedStalinButton = new Button();


        hLayout.getChildren().add(HitlerButton);
        hLayout.getChildren().add(LockedStalinButton);

        Image HitlerImage = new Image(new FileInputStream(getClass().getClassLoader().getResource("hitler.png").getFile()));
        Image StalinImage = new Image(new FileInputStream(getClass().getClassLoader().getResource("stalin.png").getFile()));

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



        primaryStage.setScene(setupScene);

        HitlerButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                prologue.prologue(primaryStage);
            }
        });
    }
}
