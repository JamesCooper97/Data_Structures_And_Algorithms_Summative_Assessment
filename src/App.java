import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage stage) {

        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root);
        stage.setFullScreen(true);;
        stage.setTitle("Vaccine Tracker");
        stage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
