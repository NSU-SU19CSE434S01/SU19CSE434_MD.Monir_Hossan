package application;
	


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Stage window = primaryStage;
		window.setTitle("Resume Generator");
		
		StackPane stack = new StackPane();
		stack.setStyle("-fx-padding: 40");
		stack.setStyle("-fx-background-color: #336699");
		
		HBox hbox1 = new HBox(50);
		hbox1.setAlignment(Pos.TOP_CENTER);
		hbox1.setStyle("-fx-padding: 30");
		
		Label title = new Label("Generate Your Resume Here!!");
		title.setStyle("-fx-font-weight: bold;"
						+"-fx-font-size: 30px;"
						+"-fx-text-fill: white;");
		
		HBox hbox2 = new HBox(50);
		hbox2.setAlignment(Pos.BOTTOM_RIGHT);
		hbox2.setStyle("-fx-padding: 30");
		
		Button btn1 = new Button();
		btn1.setText("Generate");
		btn1.setOnAction(e -> System.out.println("Generated your Resume"));
		
		Button btn2 = new Button();
		btn2.setText("Cencel");
		btn2.setOnAction(e -> window.close());
		
		
		hbox1.getChildren().add(title);
		hbox2.getChildren().addAll(btn1 , btn2);
		
		stack.getChildren().addAll(hbox1 , hbox2);
		Scene scene = new Scene(stack , 1300 , 700);
		
		
		window.setScene(scene);
		window.show();
		
	}

	
}
