package application;
	

import java.io.File;
import java.net.MalformedURLException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Main extends Application {
	
	BorderPane Whole_container = new BorderPane();
	GridPane leftGrid = new GridPane();
	VBox middleGrid = new VBox(10);
	HBox titleContainer = new HBox();
	HBox bottomAddInfo = new HBox(20);
	HBox buttonContainer = new HBox(20);
	HBox gpaContainer = new HBox(15);
	HBox gpaContainer1 = new HBox(20);
	HBox gpaContainer2 = new HBox(20);
	HBox bottomcontainer = new HBox(20);
	
	HBox experience01_container = new HBox(10);
	HBox experience02_container = new HBox(10);
	
	HBox addInfoContainer1 = new HBox(10);
	HBox addInfoContainer2 = new HBox(10);
	
	VBox rightContainer = new VBox(10);
	
	FileChooser fileChooser = new FileChooser();
	
	Label title = new Label("Generate Your Resume Here!!");
	Label title2 = new Label("PERSONAL INFORMATION");
	Label firstName = new Label("First Name");
	Label lastName = new Label("Last Name");
	Label birth = new Label("Date of Birth");
	Label nationality = new Label("Nationality");
	Label Mailing_address = new Label("Mailing Address");
	Label contact = new Label("Contact");
	Label email = new Label("Email");
	Label skills = new Label("Your Skills");
	Label programming = new Label("Programming");
	Label others = new Label("Others");
	
	
	TextField FName_field = new TextField();
	TextField LName_field = new TextField();
	DatePicker DoBirth_Field = new DatePicker();
	TextField Nationality_field = new TextField();
	TextField Mailing_field = new TextField();
	TextField Contact_field = new TextField();
	TextField Email_field = new TextField();
	TextField programming_Skill_field1 = new TextField();
	TextField others_Skill_field2 = new TextField();
	TextField language_skill_field = new TextField();
	
	
	
	Label title3 = new Label("EDUCATION");
	Label ssc = new Label("SSC/A Lavel");
	Label gpa1 = new Label("GPA");
	Label session1 = new Label("Session");
	Label hsc = new Label("HSC/O Lavel");
	Label gpa2 = new Label("GPA");
	Label session2 = new Label("Session");
	Label undergraduate = new Label("Uudergraduate");
	Label cgpa = new Label("CGPA");
	Label session3 = new Label("Session");
	
	TextField Ssc_field = new TextField();
	TextField Gpa1_field = new TextField();
	TextField session1_field = new TextField();
	TextField department1_field = new TextField();
	TextField Hsc_field = new TextField();
	TextField Gpa2_field = new TextField();
	TextField session2_field = new TextField();
	TextField department2_field = new TextField();
	TextField Undergraduate_field = new TextField();
	TextField Cgpa_field = new TextField();
	TextField session3_field = new TextField();
	TextField department3_field = new TextField();
	
	Label experience = new Label("Experiences");	
	TextField experience1_field = new TextField();
	TextField duration1_field = new TextField();
	TextField point01_field= new TextField();
	TextField point02_field = new TextField();
	TextField point03_field = new TextField();
	TextField experience2_field = new TextField();
	TextField duration2_field = new TextField();
	TextField point011_field = new TextField();
	TextField point012_field = new TextField();
	TextField point013_field = new TextField();
	
	
	Label additionalInfo = new Label("Additional Information");
	TextField addInfoTitle1 = new TextField();
	TextField addInfoDescription1 = new TextField();
	TextField addInfoTitle2 = new TextField();
	TextField addInfoDescription2 = new TextField();
	TextField addInfoTitle3 = new TextField();
	TextField addInfoDescription3 = new TextField();
	
	ImageView imageView = new ImageView();
	
//	Image image = new Image("file:/Users/MDMONIRHOSSAN/Downloads/Ashik.jpg ");
	
	
	Button btn1 = new Button();
	Button btn2 = new Button();
	Button btn3 = new Button();
	
	Button chooseFile = new Button("Choose Image");
	
	
	
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

		rightContainer.setPadding(new Insets (10));
		rightContainer.setStyle("-fx-background-color : #336699");

		
		
		titleContainer.setAlignment(Pos.CENTER);
		titleContainer.setPadding(new Insets(10));
		titleContainer.setStyle("-fx-background-color : #336699");
		titleContainer.getChildren().add(title);
		
		leftGrid.setVgap(20);
		leftGrid.setHgap(20);
		leftGrid.setPadding(new Insets(10));
		leftGrid.setStyle("-fx-background-color: #336699");
		
	
		middleGrid.setPadding(new Insets(10));
		middleGrid.setStyle("-fx-background-color: #336699");
		
		
		buttonContainer.setAlignment(Pos.BASELINE_RIGHT);
		buttonContainer.setPadding(new Insets(10));
		buttonContainer.setStyle("-fx-background-color : #336699");
		
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
		
		
		
		programming_Skill_field1.setPrefWidth(500);
		
		
		Cgpa_field.setPrefWidth(50);
		
		
		title.setAlignment(Pos.CENTER);
		title.getStyleClass().add("title");
		title.setStyle("-fx-font-weight: bold;"
						+"-fx-font-size: 30px;"
						+"-fx-text-fill: white;");	
		
		title2.setStyle("-fx-font-size: 15px;"  +
						"-fx-font-weight: bold;");
		

		programming_Skill_field1.setPrefWidth(260);
		others_Skill_field2.setPrefWidth(260);

		btn1.setText("Generate");
		btn1.setOnAction(e -> createHtml());
		
		btn2.setText("Cencel");
		btn2.setOnAction(e -> window.close());
		
		btn3.setText("Clear");
		btn3.setOnAction(e -> System.out.println(isStringOnlyAlphabet(LName_field.getText())));
		
		
		
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
		
		
		imageView.setFitHeight(150);
		imageView.setFitWidth(150);
		
		
		
		imageView.setStyle("-fx-image : url(file:/Users/MDMONIRHOSSAN/Desktop/images.png)");
		
		gpaContainer1.getChildren().addAll( Gpa1_field );
		gpaContainer2.getChildren().addAll( Gpa2_field);
		gpaContainer.getChildren().addAll( Cgpa_field );
		Cgpa_field.setPrefWidth(120);
		Gpa1_field.setPrefWidth(120);
		Gpa2_field.setPrefWidth(120);
		
		Gpa1_field.setPromptText("GPA");
		department1_field.setPromptText("Department");
		Gpa2_field.setPromptText("GPA");
		department2_field.setPromptText("Department");
		Cgpa_field.setPromptText("CGPA");
		department3_field.setPromptText("Department");
		
		addInfoTitle1.setPromptText("Title");
		addInfoDescription1.setPrefWidth(400);
		addInfoDescription1.setPromptText("Description");
		addInfoTitle2.setPromptText("Title");
		addInfoDescription2.setPrefWidth(400);
		addInfoDescription2.setPromptText("Description");
		
		DoBirth_Field.setEditable(false);
		
		programming_Skill_field1.setPromptText("Programming Skills");
		language_skill_field.setPromptText("Others");
		others_Skill_field2.setPromptText("Languages");
		
		experience1_field.setPromptText("Experience 01");
		experience1_field.setPrefWidth(250);
		duration1_field.setPromptText("Duration");
		point01_field.setPromptText(">>");
		point02_field.setPromptText(">>");
		point03_field.setPromptText(">>");
		experience2_field.setPromptText("Experience 02");
		experience2_field.setPrefWidth(250);
		duration2_field.setPromptText("Duration");
		point011_field.setPromptText(">>");
		point012_field.setPromptText(">>");
		point013_field.setPromptText(">>");
		
		
		
		
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
				point012_field,point013_field);
		
		experience01_container.getChildren().addAll(experience1_field , duration1_field);
		experience02_container.getChildren().addAll(experience2_field,duration2_field);
		
		addInfoContainer1.getChildren().addAll(addInfoTitle1,addInfoDescription1);
		addInfoContainer2.getChildren().addAll(addInfoTitle2,addInfoDescription2);
		
		rightContainer.getChildren().addAll(imageView , chooseFile);
		
		buttonContainer.getChildren().addAll(bottomAddInfo,btn1, btn2 , btn3);	
		bottomAddInfo.setAlignment(Pos.BOTTOM_LEFT);
		bottomAddInfo.getChildren().addAll(addInfoTitle3,addInfoDescription3);
		
		
		Scene scene = new Scene(Whole_container);
		scene.getStylesheets().add("application.css");
		window.setScene(scene);
		window.show();
		
	}
	
	
	
	public static boolean isStringOnlyAlphabet(String str) 
    { 	
		
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$"))); 
        
    
    }
	
	
	public void createHtml() {
		
		HTMLCode html = new HTMLCode();
		
		html.func(FName_field, LName_field, DoBirth_Field, Nationality_field,
				Mailing_field, Email_field,  Contact_field,Ssc_field,Gpa1_field,session1_field,department1_field,
				Hsc_field,Gpa2_field,session2_field,department2_field,Undergraduate_field,Cgpa_field,session3_field,
				department3_field,
				programming_Skill_field1,language_skill_field, others_Skill_field2,
				experience1_field,duration1_field,point01_field,point02_field,point03_field,
				experience2_field,duration2_field,point011_field,
				point012_field,point013_field,addInfoTitle1,addInfoDescription1,addInfoTitle2,addInfoDescription2);
		
		
	}
	

	
}
