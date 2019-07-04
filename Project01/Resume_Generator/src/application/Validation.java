package application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class Validation {
	
	


	
	public boolean isStringOnlyAlphabet(String str) 
    { 	

		
        return ((str != null) 
                && (!str.equals("")) 
                && (str.matches("^[a-zA-Z]*$"))); 
        
    
    }
	
	
public boolean emailValidation(TextField textfield , String emailText) {
			
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(emailText);
		
		if( m.find() && m.group().equals(emailText)) {
			
			textfield.setStyle("-fx-text-inner-color: none ;"
					+ " -fx-border-color: none; -fx-border-width: 2px ;");
			System.out.println("Email is Valid");
				return true;
			}
			else {
				
				//showAlert("Invalid" , "Email is not valid" , "Please enter a valid Email with ab@aaa.com format");
				
				textfield.setStyle("-fx-text-inner-color: red; -fx-border-color: red;"
						+ " -fx-border-width: 2px ;");

				return false;
			}	
		
		
	}
	
public boolean validateContact(TextField textfield , String str) {
		
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(str);
		
		if(str.length() == 11 && m.find() && m.group().equals(str)) {
			
			textfield.setStyle("-fx-text-inner-color: none ;"
					+ " -fx-border-color: none; -fx-border-width: 2px ;");
			
			System.out.println("Number is Valid");
				return true;
			}
			else {
				textfield.setStyle("-fx-text-inner-color: red; -fx-border-color: red;"
						+ " -fx-border-width: 2px ;");
				//showAlert("Invalid" , "Contact is not valid" , "Please enter a valid contact with 11 digit!!");
				return false;
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
