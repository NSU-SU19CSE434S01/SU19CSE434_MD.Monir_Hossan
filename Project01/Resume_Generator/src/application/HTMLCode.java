package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class HTMLCode {
	
	
	public void func(TextField firstName , TextField lastName , DatePicker dateOfBirth , TextField nationality,TextField address,
						 TextField email,TextField contact,TextField SSC,TextField sscGPA , TextField sscSession,
						 TextField sscDepartment, TextField HSC, TextField hscGPA, TextField hscSession,
						 TextField hscDepartment, TextField undergraduate, TextField undergraduateCgpa, TextField undergraduateSession,
						 TextField undergraduateDepartment,TextField programmingSkill,
						 TextField languageSkill,TextField otherSkill,TextField experience01,
						 TextField experience01Duration,TextField experience01_1,TextField experience01_2,
						 TextField experience01_3,TextField experience02,TextField experience02Duration,
						 TextField experience02_1 ,TextField experience02_2,TextField experience02_3,
						 TextField additionalTitle1,TextField additionalDes1,TextField additionalTitle2,TextField additionalDes2
						 ) {
		
		//java.sql.Date gettedDatePickerDate = java.sql.Date.valueOf(field3.getValue());
		
	String html =" <!DOCTYPE html>\n" + 
			" <html>\n" + 
			" <head>\n" + 
			" 	\n" + 
			" </head>\n" + 
			" <body style='background-color: lightgrey ;'>\n" + 
			" 	<div style='margin: auto ; background-color:  whitesmoke;  width: 50%; padding: 30px;'>\n" + 
			" 		<div style='text-align: center'>\n" + 
			" 			<h2 style='margin: 0;'>" + firstName.getText()+ " " + lastName.getText() + "</h2>\n" + 
			" 			<span>"+ address.getText() +"</span><br>\n" + 
			" 			<span>"+ email.getText() +"\n" + 
			" 				<span>"+ contact.getText() +"</span>\n" + 
			" 			</span>\n" + 
			" 		</div>\n" + 
			" 		<div>\n" + 
			" 			<h3>\n" + 
			" 				<u>Education</u>\n" + 
			" 			</h3>\n" + 
			" 			<h4 style='margin: 0'>"+ HSC.getText() + "\n" + 
			" 				<span style='float: right ; font-size: 12px'>"+hscSession.getText() +"</span>\n" + 
			" 			</h4>\n" + 
			" 			<span>"+hscDepartment.getText()+"</span>\n" + 
			" 			<span style='float: right; font-size: 12px'>"+hscGPA.getText()+"</span><br>\n" + 
			
			" 			<h5 style='margin-bottom: 0'>"+undergraduate.getText()+"\n" + 
			" 				<span style='float: right; font-size: 12px'>"+undergraduateSession.getText()+"</span>\n" + 
			" 			<span style='float: right; font-size: 12px'>"+undergraduateCgpa.getText()+"</span><br>\n" +
			" 			</h5>\n" + 
			" 			<span>"+ undergraduateDepartment.getText()+"</span>\n" + 
			" 		</div>\n" + 
			" 		<div>\n" + 
			" 			<h3>\n" + 
			" 				<u>Skills</u>\n" + 
			" 			</h3>\n" + 
			" 			<span>\n" + 
			" 				<b>Programming :</b>\n" + 
			" 			</span>\n" + 
			" 			<span>"+programmingSkill.getText()+"</span><br>\n" + 
			" 			<span>\n" + 
			" 				<b>Language: </b>\n" + 
			" 			</span>\n" + 
			" 			<span>"+languageSkill.getText()+"</span><br>\n" + 
			" 			<span>\n" + 
			" 				<b>Others : </b>\n" + 
			" 			</span>\n" + 
			" 			<span>"+otherSkill.getText()+"</span>\n" + 
			" 		</div>\n" + 
			" 		<div>\n" + 
			" 			<h3>\n" + 
			" 				<u>Experience</u>\n" + 
			" 			</h3>\n" + 
			" 			<h5 style='margin-bottom: 0'>"+experience01.getText()+" \n" + 
			" 				<span style='float: right;font-size: 12px'>"+experience01Duration.getText()+"</span>\n" + 
			" 			</h5>\n" + 
			" 			<ul style='margin-top: 0'>\n" + 
			" 				<li>"+experience01_1.getText()+"</li>\n" + 
			" 				<li>"+experience01_2.getText()+"</li>\n" + 
			" 				<li>"+experience01_3.getText()+"</li>\n" + 
			" 			</ul>\n" + 
			" 			<h5 style='margin-bottom: 0'>"+experience02.getText()+" \n" + 
			" 				<span style='float: right;font-size: 12px'>"+experience02Duration.getText()+"</span>\n" + 
			" 			</h5>\n" +  
			" 			<ul style='margin-top: 0'>\n" + 
			" 				<li>"+experience02_1.getText()+"</li>\n" + 
			" 				<li>"+experience02_2.getText()+"</li>\n" + 
			" 				<li>"+experience02_3.getText()+"</li>\n" + 
			" 			</ul> \n" + 
			" 		</div>\n" + 
			" 		<div>\n" + 
			" 			<h3>\n" + 
			" 				<u>Additional Information</u>\n" + 
			" 			</h3>\n" + 
			" 			<span>\n" + 
			" 				<b>"+additionalTitle1.getText()+" : </b>\n" + 
			" 			</span>\n" + 
			" 			<span>"+additionalDes1.getText()+"</span><br>\n" + 
			" 			<span>\n" + 
			" 				<b>"+additionalTitle2.getText()+": </b>\n" + 
			" 			</span>\n" + 
			" 			<span>"+additionalDes2.getText()+"</span><br>\n" + 
			" 			<span>\n" + 
			" 				<b>Seminars/Conferences: </b>\n" + 
			" 			</span>\n" + 
			" 			<span> IEEE International Conference on e-science</span>\n" + 
			" 		</div>\n" + 
			" 		\n" + 
			" 		<span>\n" + 
			" 			<b>Activities: </b>\n" + 
			" 		</span>\n" + 
			" 		<span>Founder, Brazil club of the University of Madison, Wisconsin</span>\n" + 
			" 	</div>\n" + 
			" </div>\n" + 
			"</body>\n" + 
			"</html>";
		
		File filePath = new File("/Users/MDMONIRHOSSAN/Documents/CSE434/Project01/Resume.html");
		
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter(filePath));
			b.write(html);
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		firstName.setText("");
	}
		
	}


