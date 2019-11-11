package mn.asu.crud.khulan;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChangeBackground {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMDocument.fxml"));
        Scene scene = new Scene((root));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Launch(args);
    }
}
