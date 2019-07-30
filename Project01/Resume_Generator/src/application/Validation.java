package application;

import java.io.File;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;

public class Validation {
	
	public boolean isStringOnlyAlphabet(String str) 
    { 	
		Pattern p = Pattern.compile("[a-z A-Z]{3,15}$");
		Matcher m = p.matcher(str);
		
		if( m.find() && m.group().equals(str) && !str.equals("")){
				return true;
			}
			else {
				//showAlertError("String Error" , "This is not a String", "Please correct String");
				return false;
			}
		
//        return ((str != null) 
//                && (!str.equals("")) 
//                && (str.matches("^[a-zA-Z]*$"))); 
        
    
    }	
public boolean emailValidation(String emailText) {
			
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(emailText);
		
		if( m.find() && m.group().equals(emailText)) {
				return true;
			}
			else {
				
				return false;
			}
		
		
		
	}

	public boolean validateDate(String str) {
		Pattern p = Pattern.compile("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}");
		Matcher m = p.matcher(str);
		
		if(m.find() && m.group().equals(str)&& !str.equals("")) {
				return true;
			}
			else {
				
				return false;
			}			
	
}

public boolean mailingAddressValidate(String mailingAddress) {
	
	Pattern p = Pattern.compile("[a-z A-Z0-9.,-:_#(/S)]{10,50}");
	Matcher m = p.matcher(mailingAddress);

	if( m.find() && m.group().equals(mailingAddress) && !mailingAddress.equals("")) {
			return true;
		}
		else {

			return false;
		}
}
	
public boolean validateContact(String str) {
		
		Pattern p = Pattern.compile("([0-9+]{0,4}[0][1])+[0-9]{9}");
		Matcher m = p.matcher(str);
		
		if( m.find() && m.group().equals(str)) {
				return true;
			}
			else {
				return false;
			}			
		
	}
		public boolean validateInstitutionName(String str) {
			
		Pattern p = Pattern.compile("[a-z A-z&:.(),-]*");
		Matcher m = p.matcher(str);
		
		if(m.find() && m.group().equals(str)&& !str.equals("")) {
						
			System.out.println("Institution Name is Valid");
				return true;
			}
			else {
				
				return false;
			}			
		
		}
	public boolean validateGPA(String str) {
	
	Pattern p = Pattern.compile("[0-9]{1}[.][0-9]{2}");
	Matcher m = p.matcher(str);
	
	if(m.find() && m.group().equals(str)) {
					
		System.out.println("GPA is Valid");
			return true;
		}
		else {
			
			return false;
		}			
	
}	
	public boolean validateSession(String str) {
		
	Pattern p = Pattern.compile("[a-zA-Z]{3}[ ][0-9]{4}[ ][-][ ][a-zA-Z]{3}[ ][0-9]{4}");
	Matcher m = p.matcher(str);
	
	if(m.find() && m.group().equals(str)) {
					
		System.out.println("Sessiion is Valid");
			return true;
		}
		else {
			
			return false;
		}			
	
}
	public boolean skillValidation(String str) {
		
	Pattern p = Pattern.compile("[a-zA-Z0-9 +/.:(',*&)#]{10,120}");
	Matcher m = p.matcher(str);
	
	if(m.find() && m.group().equals(str)&& !str.equals("")) {

			return true;
		}
		else {
			
			return false;
		}			
	
}
	public boolean referenceNameValidation(String str) 
    { 	


		Pattern p = Pattern.compile("[a-z A-Z(,.:')]{5,50}");
		Matcher m = p.matcher(str);
		
		
		if( m.find() && m.group().equals(str) && !str.equals("")){
			

			System.out.println("Only Alphabet String is Valid");
				return true;
			}
			else {

				return false;
			}
    }
	
	public boolean designationValidate(String str) 
    { 	


		Pattern p = Pattern.compile("[a-z A-Z0-9&,(:'.)-]{5,120}");
		Matcher m = p.matcher(str);
		
		
		if( m.find() && m.group().equals(str) && !str.equals("")){
			
				return true;
			}
			else {

				return false ;
			}
    }
	public boolean additionalInfoTitle(String str) {
		
		Pattern p = Pattern.compile("[a-z A-Z0-9:(,.')-_/]{5,50}");
		Matcher m = p.matcher(str);
		
		if( m.find() && m.group().equals(str)) {
				return true;
			}
			else {
				
				return false;
			}
	}
	public boolean additionalInfoDes(String str) {
		
		Pattern p = Pattern.compile("[a-z A-Z0-9:(,.')-_/&+@#$<>]{15,200}");
		Matcher m = p.matcher(str);
		
		if( m.find() && m.group().equals(str)) {
				return true;
			}
			else {
				
				return false;
			}
	}
	
	public boolean showAlertError(String title , String headerText , String contentText) {
		
		 Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);
		alert.showAndWait();
		
		return true;
	}



	
	

}
