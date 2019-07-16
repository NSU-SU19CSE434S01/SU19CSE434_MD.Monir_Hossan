package application;
	

import java.io.File;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Main extends Application {
	
	BorderPane Whole_container = new BorderPane();
	GridPane leftGrid = new GridPane();
	VBox middleGrid = new VBox(10);
	HBox titleContainer = new HBox();
	HBox bottomAddInfo = new HBox(20);
	HBox buttonContainer = new HBox(20);
	HBox gpaContainer1 = new HBox(20);
	HBox gpaContainer2 = new HBox(20);
	HBox gpaContainer = new HBox(20);

	
	HBox experience01_container = new HBox(10);
	HBox experience02_container = new HBox(10);
	
	HBox addInfoContainer1 = new HBox(10);
	HBox addInfoContainer2 = new HBox(10);
	
	VBox rightContainer = new VBox(10);
	
	FileChooser fileChooser = new FileChooser();
	
	Label title , title2 ,firstName, lastName, birth, nationality, Mailing_address,
	contact, email , skills,programming,others,	 title3,ssc,gpa1, session1, hsc, gpa2,
	session2, undergraduate, cgpa, session3, experience, reference, additionalInfo, cvFormat,
	importantLink;
	
	TextField FName_field,
	 LName_field, Nationality_field, Mailing_field , Contact_field, Email_field, 
	 programming_Skill_field1, language_skill_field, others_Skill_field2,Ssc_field, Gpa1_field,
	 session1_field, department1_field, Hsc_field, Gpa2_field,
	 session2_field,department2_field,Undergraduate_field,Cgpa_field,session3_field,department3_field ,
	 experience1_field, duration1_field,point01_field,point02_field,point03_field,experience2_field,
	 duration2_field,point011_field,point012_field,point013_field, reference1, reference2, addInfoTitle1,
	 addInfoDescription1,  addInfoTitle2,  addInfoDescription2, link_field1, link_field2;
	
	ImageView imageView;
	
	DatePicker DoBirth_Field;
	
	RadioButton rb1 , rb2;
	ToggleGroup group ;
	
	Button btn1, btn2, btn3,chooseFile;
	
	Validation validation = new Validation();
	
	
	public static void main(String[] args) {
		
		launch(args);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
	
	
		Stage window = primaryStage;
		window.setTitle("Resume Generator");

		

		Whole_container.setLeft(leftGrid);
		Whole_container.setCenter(middleGrid);
		Whole_container.setTop(titleContainer);
		Whole_container.setBottom(buttonContainer);
		
		
		Whole_container.setRight(rightContainer);

		rightContainer.setPadding(new Insets (30));
		rightContainer.setStyle("-fx-background-color : #1B4F72  ");

		
		
		title = new Label("Generate Your Resume Here!!");
		title2 = new Label("PERSONAL INFORMATION");
		firstName = new Label("First Name");
		lastName = new Label("Last Name");
		 birth = new Label("Date of Birth");
		 nationality = new Label("Nationality");
		 Mailing_address = new Label("Mailing Address");
		 contact = new Label("Contact");
		 email = new Label("Email");
		 skills = new Label("Your Skills");
		 programming = new Label("Programming");
		 others = new Label("Others");
	
		 
		 FName_field = new TextField();
		 LName_field = new TextField();
		 DoBirth_Field = new DatePicker();
		 Nationality_field = new TextField();
		 Mailing_field = new TextField();
		 Contact_field = new TextField();
		 Email_field = new TextField();
		 programming_Skill_field1 = new TextField();
		 language_skill_field = new TextField();
		 others_Skill_field2 = new TextField();
		
		
		 
		 title3 = new Label("EDUCATION");
		 ssc = new Label("SSC/O Lavel");
		 gpa1 = new Label("GPA");
		 session1 = new Label("Session");
		 hsc = new Label("HSC/A Lavel");
		 gpa2 = new Label("GPA");
		 session2 = new Label("Session");
		 undergraduate = new Label("Uudergraduate");
		 cgpa = new Label("CGPA");
		 session3 = new Label("Session");
		 
		 Ssc_field = new TextField();
		 Gpa1_field = new TextField();
		 session1_field = new TextField();
		 department1_field = new TextField();
		 Hsc_field = new TextField();
		 Gpa2_field = new TextField();
		 session2_field = new TextField();
		 department2_field = new TextField();
		 Undergraduate_field = new TextField();
		 Cgpa_field = new TextField();
		 session3_field = new TextField();
		 department3_field = new TextField();
		 
		 
		 experience = new Label("Experiences");	
		 experience1_field = new TextField();
		 duration1_field = new TextField();
		 point01_field= new TextField();
		 point02_field = new TextField();
		 point03_field = new TextField();
		 experience2_field = new TextField();
		 duration2_field = new TextField();
		 point011_field = new TextField();
		 point012_field = new TextField();
		 point013_field = new TextField();
		
	 
		 reference = new Label("References");
		 reference1 = new TextField();
		 reference2 = new TextField();
		 
		 importantLink = new Label("Important Link");
		 link_field1 = new TextField();
		 link_field2 = new TextField();
		
		 additionalInfo = new Label("Additional Information");
		 addInfoTitle1 = new TextField();
		 addInfoDescription1 = new TextField();
		 addInfoTitle2 = new TextField();
		 addInfoDescription2 = new TextField();
		
		 imageView = new ImageView();
		
		 cvFormat = new Label("Resume Format");
		 rb1 = new RadioButton("USA");
		 rb2 = new RadioButton("Bangladesh");
		
		 group = new ToggleGroup();
		
		
		 btn1 = new Button();
		 btn2 = new Button();
		 btn3 = new Button();
		
		 chooseFile = new Button("Choose Image");
		
			labelCSS();
			styleProperty();
		
		
		GridPane.setConstraints(title2, 0, 0 , 2 , 1);
		GridPane.setConstraints(firstName, 0, 1);
		GridPane.setConstraints(lastName, 2, 1);
		GridPane.setConstraints(birth, 0, 2);
		GridPane.setConstraints(nationality, 2, 2);
		GridPane.setConstraints(Mailing_address, 0, 3);
		GridPane.setConstraints(contact, 2, 4);
		GridPane.setConstraints(email, 0, 4);
		GridPane.setConstraints(FName_field, 1, 1);
		GridPane.setConstraints(LName_field, 3, 1);
		GridPane.setConstraints(DoBirth_Field, 1, 2);
		GridPane.setConstraints(Nationality_field, 3, 2);
		GridPane.setConstraints(Mailing_field, 1, 3 , 4 , 1);
		GridPane.setConstraints(Contact_field, 3, 4);
		GridPane.setConstraints(Email_field, 1, 4);
		
		GridPane.setConstraints(title3, 0, 5);
		GridPane.setConstraints(ssc, 0, 6);
		GridPane.setConstraints(gpaContainer1, 3, 6);
		GridPane.setConstraints(session1, 0, 7);
		GridPane.setConstraints(session1_field, 1, 7);
		GridPane.setConstraints(department1_field, 2, 7 , 2 ,1);
		GridPane.setConstraints(hsc, 0, 8);
		GridPane.setConstraints(session2, 0, 9);
		GridPane.setConstraints(session2_field, 1, 9);
		GridPane.setConstraints(department2_field, 2, 9 , 2 ,1);
		GridPane.setConstraints(gpaContainer2, 3, 8);
		GridPane.setConstraints(undergraduate, 0, 10);
		GridPane.setConstraints(gpaContainer, 3, 10);
		GridPane.setConstraints(session3, 0, 11);
		GridPane.setConstraints(session3_field, 1, 11);
		GridPane.setConstraints(department3_field, 2, 11 , 2 ,1);
		
		GridPane.setConstraints(Ssc_field, 1, 6 , 2 ,1);
		GridPane.setConstraints(Hsc_field, 1, 8 , 2 ,1);
		GridPane.setConstraints(Undergraduate_field, 1, 10 , 2 ,1);
		
		GridPane.setConstraints(additionalInfo, 0, 12 );
		GridPane.setConstraints(addInfoContainer1, 0, 13 ,4 ,1 );
		GridPane.setConstraints(addInfoContainer2, 0, 14  ,4 ,1);
		
		
		GridPane.setConstraints(skills, 0, 0 );
		GridPane.setConstraints(programming, 0, 1);
		GridPane.setConstraints(others, 0, 2);
		GridPane.setConstraints(programming_Skill_field1, 0, 1 , 3 ,1);
		GridPane.setConstraints(language_skill_field, 0, 2 , 3 ,1);
		GridPane.setConstraints(others_Skill_field2, 0, 3 , 3 ,1);
		
		
		
		

		btn1.setText("Generate");
		btn1.setOnAction(e -> { 
							createHtml() ;
							validionAllField();
							//validation.validateContact(Contact_field.getText());
							//validation.emailValidation(Email_field.getText());
							//window.close();
							System.out.println(DoBirth_Field.getValue().toString());
						}
							);
		
		btn2.setText("Cencel");
		btn2.setOnAction(e -> window.close());
		
		btn3.setText("Clear");
		btn3.setOnAction(e -> clearAllField());
		
		
		
		chooseFile.setOnAction(e -> {
           File selectedFile = fileChooser.showOpenDialog(primaryStage);
            
            if(selectedFile != null) {
            	
            	Image image;
				try {
					image = new Image(selectedFile.toURL().toString());
					imageView.setImage(image);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	FName_field.setText(selectedFile.getAbsolutePath());
            }
        } );
		

		
			
			
			gpaContainer1.getChildren().addAll( Gpa1_field );
			gpaContainer2.getChildren().addAll( Gpa2_field);
			gpaContainer.getChildren().addAll( Cgpa_field );
			
		
		leftGrid.getChildren().addAll(title2 , firstName , FName_field , lastName ,LName_field ,  birth , DoBirth_Field ,
				Mailing_address , Mailing_field ,
								nationality , Nationality_field , contact,
									Contact_field , email , Email_field, title3 , ssc, hsc,  undergraduate, 
									Ssc_field, session1 , session1_field ,department1_field , Hsc_field, session2 , session2_field ,
									department2_field ,Undergraduate_field,gpaContainer1,
									gpaContainer2, gpaContainer , session3 , session3_field ,department3_field ,
									additionalInfo , addInfoContainer1 ,addInfoContainer2);
		
		middleGrid.getChildren().addAll(skills ,programming_Skill_field1 , others_Skill_field2,
				language_skill_field ,experience , 
				experience01_container,point01_field,point02_field,point03_field,experience02_container,point011_field,
				point012_field,point013_field,reference,reference1,reference2 , importantLink,
				 link_field1,link_field2);
		
		experience01_container.getChildren().addAll(experience1_field , duration1_field);
		experience02_container.getChildren().addAll(experience2_field,duration2_field);
		
		addInfoContainer1.getChildren().addAll(addInfoTitle1,addInfoDescription1);
		addInfoContainer2.getChildren().addAll(addInfoTitle2,addInfoDescription2);
		
		rightContainer.getChildren().addAll(imageView , chooseFile,cvFormat,rb1,rb2 , btn1, btn2, btn3);
		
		//buttonContainer.getChildren().addAll(btn1, btn2 , btn3 );	
		


		
		Scene scene = new Scene(Whole_container);
		scene.getStylesheets().add("application.css");
		window.setScene(scene);
		window.show();
		
	}
	
	
	public void clearAllField() {
		
		TextField field [] = {FName_field,
				 LName_field, Nationality_field, Mailing_field , Contact_field, Email_field, 
				 programming_Skill_field1, language_skill_field, others_Skill_field2,Ssc_field, Gpa1_field,
				 session1_field, department1_field, Hsc_field, Gpa2_field,
				 session2_field,department2_field,Undergraduate_field,Cgpa_field,session3_field,department3_field ,
				 experience1_field, duration1_field,point01_field,point02_field,point03_field,experience2_field,
				 duration2_field,point011_field,point012_field,point013_field, reference1, reference2, addInfoTitle1,
				 addInfoDescription1,  addInfoTitle2,  addInfoDescription2, link_field1, link_field2};
		
		
		for(int i = 0 ; i < field.length ; i++) {
			
			field[i].clear();

		}
		DoBirth_Field.setValue(null);
	}
	public void validionAllField() {
		
		//java.sql.Date gettedDatePickerDate = java.sql.Date.valueOf(DoBirth_Field.getValue());
		
		
		String defaultColor = "-fx-border-color: none; -fx-border-color: none;-fx-text-inner-color: none;" ;
		String redColor = "-fx-border-color: red; -fx-border-width: 2px ;-fx-text-inner-color: red;" ;
		
		if(validation.isStringOnlyAlphabet(FName_field.getText()) == true ) {
			FName_field.setStyle(defaultColor);
		}
		else {
			FName_field.setStyle(redColor);
		}
		if( validation.isStringOnlyAlphabet(LName_field.getText()) == true ) {
			LName_field.setStyle(defaultColor);
		}
		else {
			LName_field.setStyle(redColor);
		}
		if(validation.isStringOnlyAlphabet(Nationality_field.getText()) == true ) {
			Nationality_field.setStyle(defaultColor);
		}
		else {
			Nationality_field.setStyle(redColor);
		}
		if(validation.validateContact(Contact_field.getText()) == true) {
			Contact_field.setStyle(defaultColor);
		}
		else {
			Contact_field.setStyle(redColor);
		}
		
		if(validation.emailValidation(Email_field.getText()) == true) {
			Email_field.setStyle(defaultColor);
		}
		else {
			Email_field.setStyle(redColor);
		}
		if(validation.validateInstitutionName(Ssc_field.getText()) == true) {
			Ssc_field.setStyle(defaultColor);
		}
		else {
			Ssc_field.setStyle(redColor);
		}
		
		if( validation.validateInstitutionName(Hsc_field.getText()) == true) {
			Hsc_field.setStyle(defaultColor);
		}
		else {
			Hsc_field.setStyle(redColor);
		}
		if( validation.validateInstitutionName(Undergraduate_field.getText()) == true) {
			Undergraduate_field.setStyle(defaultColor);
		}
		else {
			Undergraduate_field.setStyle(redColor);
		}
		if(validation.validateGPA(Gpa1_field.getText()) == true) {
			Gpa1_field.setStyle(defaultColor);
		}
		else {
			Gpa1_field.setStyle(redColor);
		}
		
		if( validation.validateGPA(Gpa2_field.getText()) == true) {
			Gpa2_field.setStyle(defaultColor);
		}
		else {
			Gpa2_field.setStyle(redColor);
		}
		if( validation.validateGPA(Cgpa_field.getText()) == true) {
			Cgpa_field.setStyle(defaultColor);
		}
		else {
			Cgpa_field.setStyle(redColor);
		}
		if(validation.validateSession(session1_field.getText()) == true) {
			session1_field.setStyle(defaultColor);
		}
		else {
			session1_field.setStyle(redColor);
		}
		
		if( validation.validateSession(session2_field.getText()) == true) {
			session2_field.setStyle(defaultColor);
		}
		else {
			session2_field.setStyle(redColor);
		}
		if( validation.validateSession(session3_field.getText()) == true) {
			session3_field.setStyle(defaultColor);
		}
		else {
			session3_field.setStyle(redColor);
		}
		if(validation.isStringOnlyAlphabet(department1_field.getText()) == true) {
			department1_field.setStyle(defaultColor);
		}
		else {
			department1_field.setStyle(redColor);
		}
		
		if( validation.isStringOnlyAlphabet(department2_field.getText()) == true) {
			department2_field.setStyle(defaultColor);
		}
		else {
			department2_field.setStyle(redColor);
		}
		if( validation.isStringOnlyAlphabet(department3_field.getText()) == true) {
			department3_field.setStyle(defaultColor);
		}
		else {
			department3_field.setStyle(redColor);
		}
//		if( validation.validateDate(DoBirth_Field.getValue().toString()) == false) {
//			DoBirth_Field.setStyle(defaultColor);
//		}
//		else  {
//			DoBirth_Field.setStyle(redColor);
//		}
		
		if( validation.mailingAddressValidate(Mailing_field.getText()) == true) {
			Mailing_field.setStyle(defaultColor);
		}
		else {
			Mailing_field.setStyle(redColor);
		}
		
		
		
		
		
		//showAlert("Error" , "Red color text box are invalid" , "Please give valid input");
	}
	
	public void createHtml() {
	
	HTMLCode html = new HTMLCode();
	
	if(rb1.isSelected() == true) {
		
		
//		if(FName_field.getText().isEmpty()) {
//			FName_field.setStyle("-fx-border-color: red; -fx-border-width: 2px ;");
//			LName_field.setStyle("-fx-border-color: red; -fx-border-width: 2px ;");
//		}
//		else {
//			FName_field.setStyle("-fx-border-color: none;");
//			LName_field.setStyle("-fx-border-color: none;");
//		}
	}
	
			html.func(FName_field, LName_field, DoBirth_Field, Nationality_field,
					Mailing_field, Email_field,  Contact_field,Ssc_field,Gpa1_field,session1_field,department1_field,			
					Hsc_field,Gpa2_field,session2_field,department2_field,Undergraduate_field,Cgpa_field,session3_field,
				department3_field,	
				programming_Skill_field1,language_skill_field, others_Skill_field2,
				experience1_field,duration1_field,point01_field,point02_field,point03_field,
				experience2_field,duration2_field,point011_field,
			point012_field,point013_field,addInfoTitle1,addInfoDescription1,addInfoTitle2,addInfoDescription2);
		
	
	}
	
	public void styleProperty() {
		
		
		setPromptText();

		setStyle();
		

		setPadding();
	
		setPrewidthHeight();
		
		titleContainer.setAlignment(Pos.CENTER);
		
		titleContainer.getChildren().add(title);

		leftGrid.setVgap(20);
		leftGrid.setHgap(20);
		
		buttonContainer.setAlignment(Pos.BASELINE_RIGHT);
			
		DoBirth_Field.setEditable(false);
		
		title.setAlignment(Pos.CENTER);
		title.getStyleClass().add("title");
	
		rb1.setToggleGroup(group);
		rb1.setSelected(true);
		rb1.setTextFill((Color.web("white")));
		rb2.setToggleGroup(group);
		rb2.setTextFill((Color.web("white")));
		
		
	}
	public void setPadding() {
		titleContainer.setPadding(new Insets(10));
		leftGrid.setPadding(new Insets(10));
		middleGrid.setPadding(new Insets(10));
		buttonContainer.setPadding(new Insets(10, 60 , 50, 0));

		reference.setPadding(new Insets(0 , 0 ,0 , 0 ));
		cvFormat.setPadding(new Insets(150 ,  0, 0 , 30));
		rb1.setPadding(new Insets(0,  0, 0 , 30));
		rb2.setPadding(new Insets(0,  0, 60 , 30));
	
	}
	public void setPrewidthHeight() {
		imageView.setFitHeight(150);
		imageView.setFitWidth(150);
		

		Gpa1_field.setPrefWidth(120);
		Gpa2_field.setPrefWidth(120);
		Cgpa_field.setPrefWidth(120);

		
		addInfoDescription1.setPrefWidth(400);
		addInfoDescription2.setPrefWidth(400);
		
		programming_Skill_field1.setPrefWidth(500);
		
		programming_Skill_field1.setPrefWidth(260);
		others_Skill_field2.setPrefWidth(260);
		
		
		experience1_field.setPrefWidth(250);
		experience2_field.setPrefWidth(250);
		
		btn1.setPrefSize(150, 35);
		btn2.setPrefSize(150, 35);
		btn3.setPrefSize(150, 35);
	}
	public void setPromptText() {
		
		Gpa1_field.setPromptText("GPA");
		session1_field.setPromptText("Ex: 2012-2013");
		department1_field.setPromptText("Department");
		Gpa2_field.setPromptText("GPA");
		session2_field.setPromptText("Ex: 2013-2014");
		department2_field.setPromptText("Department");
		Cgpa_field.setPromptText("CGPA");
		session3_field.setPromptText("Ex: 2014-2018");
		department3_field.setPromptText("Department");
		
		addInfoTitle1.setPromptText("Title");
		addInfoDescription1.setPromptText("Description");
		addInfoTitle2.setPromptText("Title");
		addInfoDescription2.setPromptText("Description");
		
		programming_Skill_field1.setPromptText("Programming Skills");
		language_skill_field.setPromptText("Others");
		others_Skill_field2.setPromptText("Languages");
		
		experience1_field.setPromptText("Experience 01");
		duration1_field.setPromptText("Duration");
		point01_field.setPromptText(">>");
		point02_field.setPromptText(">>");
		point03_field.setPromptText(">>");
		experience2_field.setPromptText("Experience 02");
		
		duration2_field.setPromptText("Duration");
		point011_field.setPromptText(">>");
		point012_field.setPromptText(">>");
		point013_field.setPromptText(">>");
		
		
		reference1.setPromptText("Reference 01");
		reference2.setPromptText("Reference 02");
		
		link_field1.setPromptText("Link 01");
		link_field2.setPromptText("Link 02");
	}
	
	public void setStyle() {
		titleContainer.setStyle("-fx-background-color : #1B4F72  ");
		leftGrid.setStyle("-fx-background-color: #1B4F72  ");
		middleGrid.setStyle("-fx-background-color: #1B4F72  ");
		buttonContainer.setStyle("-fx-background-color : #1B4F72  ");
		
		imageView.setStyle("-fx-image : url(file:/Users/MDMONIRHOSSAN/Desktop/images.png);");
		
		title.setStyle("-fx-font-weight: bold;"
				+"-fx-font-size: 30px;"
				+"-fx-text-fill: white;");	

		
		btn1.setStyle("-fx-background-color: #66BB6A");
		btn2.setStyle("-fx-background-color: #EF5350");
		btn3.setStyle("-fx-background-color: #FF9800");
	}
	
	public void labelCSS() {
		
	Label[] allLabel = { firstName , lastName ,  birth ,
			Mailing_address ,
			nationality , contact,
				 email , ssc, hsc,  undergraduate, 
				session1 ,  session2 , 
				 session3 };
	Label[] allTitle = {title3 ,additionalInfo,title2 , skills ,experience ,reference , 
			cvFormat,importantLink};
	
	
		for(int i = 0 ; i <allLabel.length; i++) {
			
			allLabel[i].setStyle("-fx-font-weight: bold;"
					+"-fx-font-size: 14px;"
					+"-fx-text-fill: #FF9800 ;");
		}
		
		for(int i = 0 ; i <allTitle.length; i++) {
					
					allTitle[i].setStyle("-fx-font-weight: bold;"
							+"-fx-font-size: 20px;"
							+"-fx-text-fill: white;");	
				}
	}
	
	
	public boolean showAlert(String title , String headerText , String contentText) {
		
		 Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);
		alert.showAndWait();
		
		return true;
	}
	
	

}
