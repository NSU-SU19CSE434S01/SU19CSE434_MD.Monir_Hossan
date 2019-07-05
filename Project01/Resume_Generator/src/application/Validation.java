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
	
	
public boolean emailValidation(String emailText) {
			
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(emailText);
		
		
		if( m.find() && m.group().equals(emailText)) {
			

			System.out.println("Email is Valid");
				return true;
			}
			else {

				return false;
			}
		
		
		
	}
	
public boolean validateContact(String str) {
		
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(str);
		
		if(str.length() == 11 && m.find() && m.group().equals(str)) {
						
			System.out.println("Number is Valid");
				return true;
			}
			else {
				
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
