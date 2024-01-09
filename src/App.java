import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.Date;

public class App extends Application{

    private DatePicker doseDatePicker;
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        TestClass t = new TestClass();
        t.setupTestData();
        VBox root = new VBox();
        root.getChildren().addAll(createToolBar(),dosesTableView(), patientsTableView());

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
        Button generateReport = new Button("Generate Vaccine Report");
        Button sortByLastname = new Button("Sort By Last Name");
        Button nextVaccine = new Button("Patient wait list");
        Button seeAllergyCount = new Button("See Allergy Count");
        Button threeVaccines = new Button("3 Vaccine Patients");
        Button elderlyPatients = new Button("Elderly patients with fewer than 3 doses");

        createPatientButton.setOnAction(e -> newPatientForm());
        recordVaccineButton.setOnAction(e -> newVaccinationForm());
        generateReport.setOnAction(e -> generateReports());

        toolBar.getItems().addAll(createPatientButton,recordVaccineButton,generateReport);

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

        dosesTable.setItems(Doses.doses);
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
        Label allergyLabel = new Label("Allergy");
        ChoiceBox<Allergy> allergyChoice = new ChoiceBox<>();
        for (Allergy allergy : Allergies.allergies){
            allergyChoice.getItems().add(allergy);
        }
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> VaccineManager.submitNewPatient(firstNameField, lastNameField, ageField, allergyChoice.getValue()));
        patientFields.getChildren().addAll(firstNameLabel,firstNameField,lastNameLabel,lastNameField,ageLabel,ageField, allergyLabel, allergyChoice, submitButton);
        Scene patientForm = new Scene(patientFields);
        patientFormStage.setTitle("Patient Form");
        patientFormStage.setScene(patientForm);
        patientFormStage.show();
    }

    public void newVaccinationForm(){
        Stage vaccinationFormStage = new Stage();

        VBox patientColumn = new VBox();
        VBox submitDateColumn = new VBox();
        HBox vaccinationFields = new HBox();

        Label patientLabel = new Label("Select a Patient");
        TableView patientsTable = patientsTableView();
        TableView.TableViewSelectionModel selectionModel = patientsTable.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.SINGLE);
        ObservableList selectedPatient =
                selectionModel.getSelectedItems();

        patientColumn.getChildren().addAll(patientLabel,patientsTable);

        Label doseDateLabel = new Label("Please pick a dose date");
        DatePicker doseDatePicker = new DatePicker();

        Button submitVaccineButton = new Button("Submit");
        submitVaccineButton.setOnAction(e -> VaccineManager.submitNewDose(doseDatePicker.getValue(),(Patient) selectedPatient.get(0)));

        submitDateColumn.getChildren().addAll(doseDateLabel,doseDatePicker,submitVaccineButton);

        vaccinationFields.getChildren().addAll(patientColumn, submitDateColumn);

        Scene vaccinationForm = new Scene(vaccinationFields);
        vaccinationFormStage.setTitle("Vaccination Form");
        vaccinationFormStage.setScene(vaccinationForm);
        vaccinationFormStage.show();

    }

    private TableView patientsTableView(){
        TableView patientsTable = new TableView();
        TableColumn<Patient, Long> idCol = new TableColumn<>("Patient ID");
        idCol.setCellValueFactory(
                new PropertyValueFactory<>("ID"));
        TableColumn<Patient, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("FirstName"));
        TableColumn<Patient, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("LastName"));
        TableColumn<Patient, String> ageCol = new TableColumn<>("Age");
        ageCol.setCellValueFactory(
                new PropertyValueFactory<>("Age"));
        TableColumn<Patient, String> allergiesCol = new TableColumn<>("Allergies");
        allergiesCol.setCellValueFactory(
                new PropertyValueFactory<>("Allergy"));
        TableColumn<Dose, String> recommendedVaccineCol = new TableColumn<>("Vaccine Type");
        recommendedVaccineCol.setCellValueFactory(
                new PropertyValueFactory<>("VaccineType"));
        patientsTable.getColumns().add(idCol);
        patientsTable.getColumns().add(firstNameCol);
        patientsTable.getColumns().add(lastNameCol);
        patientsTable.getColumns().add(ageCol);
        patientsTable.getColumns().add(allergiesCol);
        patientsTable.getColumns().add(recommendedVaccineCol);

        patientsTable.setItems(Patients.patients);
        return patientsTable;
    }

    private DatePicker datePicker(){
        doseDatePicker = new DatePicker();
        return doseDatePicker;
    }

    private TableView vaccineReport(){
        TableView vaccineCountTable = new TableView();
        TableColumn<Patient, Long> idCol = new TableColumn<>("Patient ID");
        idCol.setCellValueFactory(
                new PropertyValueFactory<>("ID"));
        TableColumn<Dose, String> recommendedVaccineCol = new TableColumn<>("Vaccine Type");
        recommendedVaccineCol.setCellValueFactory(
                new PropertyValueFactory<>("VaccineType"));
        TableColumn<Patient, String> countCol = new TableColumn<>("Administered");
        countCol.setCellValueFactory(
                new PropertyValueFactory<>("doseCount"));

        vaccineCountTable.getColumns().add(idCol);
        vaccineCountTable.getColumns().add(recommendedVaccineCol);
        vaccineCountTable.getColumns().add(countCol);

        vaccineCountTable.setItems(Vaccine.vaccines);
        return vaccineCountTable;
    }

    public void generateReports(){
        Stage reports = new Stage();
        VBox root = new VBox();
        root.getChildren().addAll(vaccineReport());

        VaccineManager.setVaccineCount();

        Scene scene = new Scene(root);
        reports.setScene(scene);
        reports.setTitle("Reports");
        reports.show();
    }

}
