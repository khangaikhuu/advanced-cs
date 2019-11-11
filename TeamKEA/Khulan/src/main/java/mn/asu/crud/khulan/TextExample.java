package mn.asu.crud.khulan;


import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TextExample extends Application {
    @Override
    public void start(Stage stage) {
        Text text = new Text();
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));
        text.setX(50);
        text.setY(130);
        text.setFill(Color.BROWN);
        text.setStrokeWidth(2);
        text.setStroke(Color.BLUE);
        text.setText("Let's Learn French");
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
