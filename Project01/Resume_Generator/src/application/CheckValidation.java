package application;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CheckValidation {
  
	Validation validation = new Validation();
	
public void fieldForUsFormat(TextField firstName , TextField lastName, 
		TextField nationality,TextField address,TextField email,TextField contact,TextField HSC, 
		TextField hscGPA, TextField hscSession,TextField hscDepartment, TextField undergraduate,
		TextField undergraduateCgpa,TextField undergraduateSession,
		 TextField undergraduateDepartment,TextField programmingSkill,
		 TextField languageSkill,TextField otherSkill,TextField experience01,
		 TextField experience01Duration,TextField experience01_1,TextField experience01_2,
		 TextField experience01_3,TextField experience02,TextField experience02Duration,
		 TextField experience02_1 ,TextField experience02_2,TextField experience02_3,
		 TextField additionalTitle1,TextField additionalDes1,TextField additionalTitle2,
		 TextField additionalDes2
		 ) {
		
		String defaultColor = "-fx-border-color: none; -fx-border-color: none;-fx-text-inner-color: none;" ;
		String redColor = "-fx-border-color: red; -fx-border-width: 2px ;-fx-text-inner-color: red;" ;
		
		if(validation.isStringOnlyAlphabet(firstName.getText()) == true ) {
			firstName.setStyle(defaultColor);
		}
		else {
			firstName.setStyle(redColor);
		}
		if( validation.isStringOnlyAlphabet(lastName.getText()) == true ) {
			lastName.setStyle(defaultColor);
		}
		else {
			lastName.setStyle(redColor);
		}
		if(validation.isStringOnlyAlphabet(nationality.getText()) == true ) {
			nationality.setStyle(defaultColor);
		}
		else {
			nationality.setStyle(redColor);
		}
		if(validation.validateContact(contact.getText()) == true) {
			contact.setStyle(defaultColor);
		}
		else {
			contact.setStyle(redColor);
		}
		
		if(validation.emailValidation(email.getText()) == true) {
			email.setStyle(defaultColor);
		}
		else {
			email.setStyle(redColor);
		}
		if( validation.mailingAddressValidate(address.getText()) == true) {
			address.setStyle(defaultColor);
		}
		else {
			address.setStyle(redColor);
		}
		if( validation.validateInstitutionName(HSC.getText()) == true) {
			HSC.setStyle(defaultColor);
		}
		else {
			HSC.setStyle(redColor);
		}
		if( validation.validateGPA(hscGPA.getText()) == true) {
			hscGPA.setStyle(defaultColor);
		}
		else {
			hscGPA.setStyle(redColor);
		}
		if( validation.validateSession(hscSession.getText()) == true) {
			hscSession.setStyle(defaultColor);
		}
		else {
			hscSession.setStyle(redColor);
		}
		if( validation.isStringOnlyAlphabet(hscDepartment.getText()) == true) {
			hscDepartment.setStyle(defaultColor);
		}
		else {
			hscDepartment.setStyle(redColor);
		}
		if( validation.validateInstitutionName(undergraduate.getText()) == true) {
			undergraduate.setStyle(defaultColor);
		}
		else {
			undergraduate.setStyle(redColor);
		}
		if( validation.validateGPA(undergraduateCgpa.getText()) == true) {
			undergraduateCgpa.setStyle(defaultColor);
		}
		else {
			undergraduateCgpa.setStyle(redColor);
		}
		if( validation.validateSession(undergraduateSession.getText()) == true) {
			undergraduateSession.setStyle(defaultColor);
		}
		else {
			undergraduateSession.setStyle(redColor);
		}
		if( validation.isStringOnlyAlphabet(undergraduateDepartment.getText()) == true) {
			undergraduateDepartment.setStyle(defaultColor);
		}
		else {
			undergraduateDepartment.setStyle(redColor);
		}
		if( validation.skillValidation(programmingSkill.getText()) == true) {
			programmingSkill.setStyle(defaultColor);
		}
		else {
			programmingSkill.setStyle(redColor);
		}
		if( validation.skillValidation(languageSkill.getText()) == true ) {
			languageSkill.setStyle(defaultColor);
			
		}
		else {
			languageSkill.setStyle(redColor);
		}
		if( validation.skillValidation(otherSkill.getText()) == true ) {
			otherSkill.setStyle(defaultColor);
			
		}
		else {
			otherSkill.setStyle(redColor);
		}
		if( validation.validateInstitutionName(experience01.getText()) == true) {
			experience01.setStyle(defaultColor);
		}
		else {
			experience01.setStyle(redColor);
		}
		if( validation.validateInstitutionName(experience02.getText()) == true) {
			experience02.setStyle(defaultColor);
		}
		else {
			experience02.setStyle(redColor);
		}
		if( validation.validateSession(experience01Duration.getText()) == true) {
			experience01Duration.setStyle(defaultColor);
		}
		else {
			experience01Duration.setStyle(redColor);
		}
		if( validation.validateSession(experience02Duration.getText()) == true) {
			experience02Duration.setStyle(defaultColor);
		}
		else {
			experience02Duration.setStyle(redColor);
		}
		if( validation.additionalInfoTitle(additionalTitle1.getText()) == true) {
			additionalTitle1.setStyle(defaultColor);
		}
		else {
			additionalTitle1.setStyle(redColor);
		}
		if( validation.additionalInfoDes(additionalDes1.getText()) == true) {
			additionalDes1.setStyle(defaultColor);
		}
		else {
			additionalDes1.setStyle(redColor);
		}
		if( validation.additionalInfoTitle(additionalTitle2.getText()) == true) {
			additionalTitle2.setStyle(defaultColor);
		}
		else {
			additionalTitle2.setStyle(redColor);
		}
		if( validation.additionalInfoDes(additionalDes2.getText()) == true) {
			additionalDes2.setStyle(defaultColor);
		}
		else {
			additionalDes2.setStyle(redColor);
		}
		
	}


public void validionAllFieldBDFormat(TextField SSC,
		TextField sscGPA , TextField sscSession,TextField sscDepartment,DatePicker dateOfBirth,
		TextField reference1, TextField reference2) {
	
	//java.sql.Date gettedDatePickerDate = java.sql.Date.valueOf(DoBirth_Field.getValue());
	
	String defaultColor = "-fx-border-color: none; -fx-border-color: none;-fx-text-inner-color: none;" ;
	String redColor = "-fx-border-color: red; -fx-border-width: 2px ;-fx-text-inner-color: red;" ;
	
	
	if(validation.validateInstitutionName(SSC.getText()) == true) {
		SSC.setStyle(defaultColor);
	}
	else {
		SSC.setStyle(redColor);
	}
	
	
	if(validation.validateGPA(sscGPA.getText()) == true) {
		sscGPA.setStyle(defaultColor);
	}
	else {
		sscGPA.setStyle(redColor);
	}
	
	
	if(validation.validateSession(sscSession.getText()) == true) {
		sscSession.setStyle(defaultColor);
	}
	else {
		sscSession.setStyle(redColor);
	}
	
	
	if(validation.isStringOnlyAlphabet(sscDepartment.getText()) == true) {
		sscDepartment.setStyle(defaultColor);
	}
	else {
		sscDepartment.setStyle(redColor);
	}
	
	if( validation.validateDate(dateOfBirth.getValue().toString()) == false) {
		dateOfBirth.setStyle(defaultColor);
	}
	else  {
		dateOfBirth.setStyle(redColor);
	}
	if(validation.referenceNameValidation(reference1.getText()) == true ) {
		reference1.setStyle(defaultColor);
	}
	else {
		reference1.setStyle(redColor);
	}
	if(validation.referenceNameValidation(reference2.getText()) == true ) {
		reference2.setStyle(defaultColor);
	}
	else {
		reference2.setStyle(redColor);
	}
	//showAlert("Error" , "Red color text box are invalid" , "Please give valid input");
}
	
	
}
