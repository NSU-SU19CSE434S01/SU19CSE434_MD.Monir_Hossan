package application;
	

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	
	BorderPane Whole_container = new BorderPane();
	GridPane leftGrid = new GridPane();
	GridPane middleGrid = new GridPane();
	HBox titleContainer = new HBox();
	HBox buttonContainer = new HBox(20);
	
	Label title = new Label("Generate Your Resume Here!!");
	Label title2 = new Label("PERSONAL INFORMATION");
	Label firstName = new Label("First Name");
	Label lastName = new Label("Last Name");
	Label birth = new Label("Date of Birth");
	Label nationality = new Label("Nationality");
	//Label age = new Label("Age");
	Label Present_address = new Label("Present Address");
	Label Permanent_address = new Label("Permanent Address");
	Label contact = new Label("Contact");
	Label email = new Label("Email");
	Label skills = new Label("Your Skills");
	
	Label title3 = new Label("EDUCATION");
	Label ssc = new Label("SSC");
	Label gpa1 = new Label("GPA");
	Label hsc = new Label("HSC");
	Label gpa2 = new Label("GPA");
	Label undergraduate = new Label("Uudergraduate");
	Label cgpa = new Label("CGPA");
	
	TextField FName_field = new TextField();
	TextField LName_field = new TextField();
	TextField DoBirth_Field = new TextField();
	TextField Nationality_field = new TextField();
	//TextField Age_field = new TextField();
	TextField PreAdress_field = new TextField();
	TextField PerAddress_field = new TextField();
	TextField Contact_field = new TextField();
	TextField Email_field = new TextField();
	TextField Skill_field1 = new TextField();
	TextField Skill_field2 = new TextField();
	
	TextField Ssc_field = new TextField();
	TextField Gpa1_field = new TextField();
	TextField Hsc_field = new TextField();
	TextField Gpa2_field = new TextField();
	TextField Undergraduate_field = new TextField();
	TextField Cgpa_field = new TextField();
	
	
	Button btn1 = new Button();
	Button btn2 = new Button();
	Button btn3 = new Button();
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Stage window = primaryStage;
		window.setTitle("Resume Generator");
		

		Whole_container.setLeft(leftGrid);
		Whole_container.setCenter(middleGrid);
		Whole_container.setTop(titleContainer);
		Whole_container.setBottom(buttonContainer);

		titleContainer.setAlignment(Pos.CENTER);
		titleContainer.setPadding(new Insets(30));
		titleContainer.setStyle("-fx-background-color : #336699");
		titleContainer.getChildren().add(title);
		
		leftGrid.setVgap(20);
		leftGrid.setHgap(20);
		leftGrid.setPadding(new Insets(15));
		
	
		

		middleGrid.setVgap(15);
		middleGrid.setPadding(new Insets(30));
		
		buttonContainer.setAlignment(Pos.BASELINE_RIGHT);
		buttonContainer.setPadding(new Insets(30));
		buttonContainer.setStyle("-fx-background-color : #336699");
		
		GridPane.setConstraints(title2, 0, 0 , 2 , 1);
		GridPane.setConstraints(firstName, 0, 1);
		GridPane.setConstraints(lastName, 2, 1);
		GridPane.setConstraints(birth, 0, 2);
		GridPane.setConstraints(nationality, 2, 2);
		//GridPane.setConstraints(age, 2, 2);
		GridPane.setConstraints(Present_address, 0, 3);
		GridPane.setConstraints(Permanent_address, 2, 3);
		GridPane.setConstraints(contact, 2, 4);
		GridPane.setConstraints(email, 0, 4);
		GridPane.setConstraints(skills, 0, 0);
		
		GridPane.setConstraints(title3, 0, 5);
		GridPane.setConstraints(ssc, 0, 6);
		GridPane.setConstraints(gpa1, 2, 6);
		GridPane.setConstraints(hsc, 0, 7);
		GridPane.setConstraints(gpa2, 2, 7);
		GridPane.setConstraints(undergraduate, 0, 8);
		GridPane.setConstraints(cgpa, 2, 8);
		
		
		GridPane.setConstraints(FName_field, 1, 1);
		GridPane.setConstraints(LName_field, 3, 1);
		GridPane.setConstraints(DoBirth_Field, 1, 2);
		GridPane.setConstraints(Nationality_field, 3, 2);
		//GridPane.setConstraints(Age_field, 3, 2);
		GridPane.setConstraints(PreAdress_field, 1, 3);
		GridPane.setConstraints(PerAddress_field, 3, 3);
		GridPane.setConstraints(Contact_field, 3, 4);
		GridPane.setConstraints(Email_field, 1, 4);
		GridPane.setConstraints(Skill_field1, 0, 1);
		GridPane.setConstraints(Skill_field2, 0, 2);
		
		GridPane.setConstraints(Ssc_field, 1, 6);
		GridPane.setConstraints(Gpa1_field, 3, 6);
		GridPane.setConstraints(Hsc_field, 1, 7);
		GridPane.setConstraints(Gpa2_field, 3, 7);
		GridPane.setConstraints(Undergraduate_field, 1, 8);
		GridPane.setConstraints(Cgpa_field, 3, 8);
	
		title.setAlignment(Pos.CENTER);
		title.getStyleClass().add("title");
		title.setStyle("-fx-font-weight: bold;"
						+"-fx-font-size: 30px;"
						+"-fx-text-fill: white;");	
		
		title2.setStyle("-fx-font-size: 15px;"  +
						"-fx-font-weight: bold;");
		

		Skill_field1.setPrefWidth(260);
		Skill_field2.setPrefWidth(260);


		btn1.setText("Generate");
		btn1.setOnAction(e -> createHtml());
		
		btn2.setText("Cencel");
		btn2.setOnAction(e -> window.close());
		
		btn3.setText("Clear");
		
		
		leftGrid.getChildren().addAll(title2 , firstName , FName_field , lastName ,LName_field ,  birth , DoBirth_Field ,
								Present_address , PreAdress_field , Permanent_address , PerAddress_field ,
								nationality , Nationality_field , contact,
									Contact_field , email , Email_field, title3 , ssc, gpa1, hsc, gpa2, undergraduate, 
									cgpa,Ssc_field, Gpa1_field,Hsc_field,Gpa2_field,Undergraduate_field, Cgpa_field);
		
		middleGrid.getChildren().addAll(skills , Skill_field1 , Skill_field2);		
		
		buttonContainer.getChildren().addAll(btn1, btn2 , btn3);	
		
		

		Scene scene = new Scene(Whole_container , 1200 , 800);
		scene.getStylesheets().add("application.css");
		window.setScene(scene);
		window.show();
		
	}
	
	
	
	public void createHtml() {
		
		HTMLCode html = new HTMLCode();
		
		html.func(FName_field, LName_field, DoBirth_Field,
								PreAdress_field, PerAddress_field, Nationality_field, Contact_field,
								Email_field, Skill_field1, Skill_field2);
		
		
	}

	
}
