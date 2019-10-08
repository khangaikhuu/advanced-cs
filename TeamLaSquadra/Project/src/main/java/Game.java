import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class Game extends Application
{
    public static void main(String [] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        //makes vertical layout
        VBox vLayout = new VBox();


        Button startButton = new Button("START");
        Button exitButton = new Button("EXIT");

        startButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));
        exitButton.setFont(Font.font("Arial", FontWeight.BOLD, 100));

        BackgroundImage background= new BackgroundImage(new Image("https://www.historyonthenet.com/wp-content/uploads/2014/11/450223-M-0000R-001.jpg",32,32,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER,
                new BackgroundSize(10,10,false,false,false,false));

        vLayout.setBackground(new Background(background));

        vLayout.setAlignment(Pos.CENTER);
        vLayout.getChildren().add(startButton);
        vLayout.getChildren().add(exitButton);
        Scene scene= new Scene(vLayout, 1920, 1080);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public void characterSelect()
    {
        HBox hLayout = new HBox();
        Button HitlerButton = new Button();
        Button LockedStalinButton = new Button();
        Label HitlerLabel = new Label();
        Label LockedStalinLabel = new Label();



    }
    public void prologue()
    {
        Label GamePrologue = new Label("This story depicts the rise and fall of one of the main belligerents in the most bloody struggle in human history. This game is made for educational purposes only.");

    }
}
