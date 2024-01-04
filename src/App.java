import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) {

        Label firstNameLabel = new Label("First name:");
        TextField firstNameField = new TextField();
        Label lastNameLabel = new Label("Last name");
        TextField lastNameField = new TextField();
        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();
        

        BorderPane root = new BorderPane();
        root.setTop(createToolBar());
        root.getChildren().addAll(firstNameLabel, firstNameField, lastNameLabel, lastNameField, ageLabel, ageField);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);;
        stage.setTitle("Vaccine Tracker");
        stage.show();
    }

    private ToolBar createToolBar(){
        ToolBar toolBar = new ToolBar();
        Button createPatientButton = new Button("Create Patient");
        Button recordVaccineButton = new Button("Record Vaccine");
        toolBar.getItems().addAll(createPatientButton,recordVaccineButton);

        return toolBar;
    }
    
}
