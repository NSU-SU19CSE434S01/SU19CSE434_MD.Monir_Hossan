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
	Label age = new Label("Age");
	Label Present_address = new Label("Present Address");
	Label Permanent_address = new Label("Permanent Address");
	Label nationality = new Label("Nationality");
	Label contact = new Label("Contact");
	Label email = new Label("Email");
	Label skills = new Label("Your Skills");
	
	TextField FName_field = new TextField();
	TextField LName_field = new TextField();
	TextField DoBirth_Field = new TextField();
	TextField Age_field = new TextField();
	TextField PreAdress_field = new TextField();
	TextField PerAddress_field = new TextField();
	TextField Nationality_field = new TextField();
	TextField Contact_field = new TextField();
	TextField Email_field = new TextField();
	TextField Skill_field1 = new TextField();
	TextField Skill_field2 = new TextField();
	
	
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
		leftGrid.setHgap(25);
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
		GridPane.setConstraints(age, 2, 2);
		GridPane.setConstraints(Present_address, 0, 3);
		GridPane.setConstraints(Permanent_address, 2, 3);
		GridPane.setConstraints(nationality, 0, 4);
		GridPane.setConstraints(contact, 2, 4);
		GridPane.setConstraints(email, 0, 5);
		GridPane.setConstraints(skills, 0, 0);
		
		GridPane.setConstraints(FName_field, 1, 1);
		GridPane.setConstraints(LName_field, 3, 1);
		GridPane.setConstraints(DoBirth_Field, 1, 2);
		GridPane.setConstraints(Age_field, 3, 2);
		GridPane.setConstraints(PreAdress_field, 1, 3);
		GridPane.setConstraints(PerAddress_field, 3, 3);
		GridPane.setConstraints(Nationality_field, 1, 4);
		GridPane.setConstraints(Contact_field, 3, 4);
		GridPane.setConstraints(Email_field, 1, 5);
		GridPane.setConstraints(Skill_field1, 0, 1);
		GridPane.setConstraints(Skill_field2, 0, 2);
	
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
		
		
		leftGrid.getChildren().addAll(title2 , firstName , FName_field , lastName ,LName_field ,  birth , DoBirth_Field , age ,
								Age_field ,Present_address , PreAdress_field , Permanent_address , PerAddress_field ,
								nationality , Nationality_field , contact,
									Contact_field , email , Email_field);
		
		middleGrid.getChildren().addAll(skills , Skill_field1 , Skill_field2);		
		
		buttonContainer.getChildren().addAll(btn1, btn2 , btn3);	
		
		

		Scene scene = new Scene(Whole_container , 1200 , 800);
		scene.getStylesheets().add("application.css");
		window.setScene(scene);
		window.show();
		
	}
	
	
	
	public void createHtml() {
		
		HTMLCode html = new HTMLCode();
		
		html.func(FName_field, LName_field, DoBirth_Field, Age_field,
								PreAdress_field, PerAddress_field, Nationality_field, Contact_field,
								Email_field, Skill_field1, Skill_field2);
		
		
	}

	
}
