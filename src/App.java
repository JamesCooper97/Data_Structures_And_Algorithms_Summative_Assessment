import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Date;

public class App extends Application{

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        TestClass t = new TestClass();
        t.setupTestData();
        VBox root = new VBox();
        root.getChildren().addAll(createToolBar(),dosesTableView());
        
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

        createPatientButton.setOnAction(e -> newPatientForm());

        toolBar.getItems().addAll(createPatientButton,recordVaccineButton);

        return toolBar;
    }

    private TableView dosesTableView(){
        TableView dosesTable = new TableView();
        TableColumn<Patient, Long> idCol = new TableColumn<>("Patient ID");
        idCol.setCellValueFactory(
                new PropertyValueFactory<>("patientID"));
        TableColumn<Patient, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("patientFirstName"));
        TableColumn<Patient, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("patientLastName"));
        TableColumn<Patient, String> ageCol = new TableColumn<>("Age");
        ageCol.setCellValueFactory(
                new PropertyValueFactory<>("patientAge"));
        TableColumn<Patient, String> allergiesCol = new TableColumn<>("Allergies");
        allergiesCol.setCellValueFactory(
                new PropertyValueFactory<>("patientAllergy"));
        TableColumn<Dose, String> recommendedVaccineCol = new TableColumn<>("Vaccine Type");
        recommendedVaccineCol.setCellValueFactory(
                new PropertyValueFactory<>("vaccine"));
        TableColumn<Dose, Date> dateCol = new TableColumn<>("Date");
        dateCol.setCellValueFactory(
                new PropertyValueFactory<>("date"));

        dosesTable.getColumns().add(idCol);
        dosesTable.getColumns().add(firstNameCol);
        dosesTable.getColumns().add(lastNameCol);
        dosesTable.getColumns().add(ageCol);
        dosesTable.getColumns().add(allergiesCol);
        dosesTable.getColumns().add(recommendedVaccineCol);
        dosesTable.getColumns().add(dateCol);


        //dosesTable.setItems(TestClass.doses);
        for (Object obj: TestClass.doses){
            dosesTable.getItems().add(obj);
        }
        return dosesTable;
    }

    private void newPatientForm(){
        Stage patientFormStage = new Stage();
        VBox patientFields = new VBox();
        Label firstNameLabel = new Label("First name:");
        TextField firstNameField = new TextField();
        Label lastNameLabel = new Label("Last name");
        TextField lastNameField = new TextField();
        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField(); //Need to change to accept only integers
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> checkPatientFieldsAndSubmit(firstNameField, lastNameField, ageField));
        patientFields.getChildren().addAll(firstNameLabel,firstNameField,lastNameLabel,lastNameField,ageLabel,ageField,submitButton);
        Scene patientForm = new Scene(patientFields);
        patientFormStage.setTitle("Patient Form");
        patientFormStage.setScene(patientForm);
        patientFormStage.show();
    }

    private void checkPatientFieldsAndSubmit(TextField firstName, TextField lastName, TextField age){

    }
}
