package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class HTMLCode {
	
	
	public void func(TextField field1 , TextField field2 , DatePicker field3 ,
						 TextField field6,TextField field7,TextField field8,TextField field9,
						TextField field10 ,TextField field11) {
		
	String html =" <!DOCTYPE html>\n" + 
			" <html>\n" + 
			" <head>\n" + 
			" 	\n" + 
			" </head>\n" + 
			" <body style='background-color: lightgrey ;'>\n" + 
			" 	<div style='margin: auto ; background-color:  whitesmoke;  width: 50%; padding: 30px;'>\n" + 
			" 		<div style='text-align: center'>\n" + 
			" 			<h2 style='margin: 0;'>Steb Alein</h2>\n" + 
			" 			<span> 809 United Nation Plazza New York, NY 1001</span><br>\n" + 
			" 			<span>stebalein@gmail.com \n" + 
			" 				<span>0182033889934</span>\n" + 
			" 			</span>\n" + 
			" 		</div>\n" + 
			" 		<div>\n" + 
			" 			<h3>\n" + 
			" 				<u>Education</u>\n" + 
			" 			</h3>\n" + 
			" 			<h4 style='margin: 0'>University of wisconsin, Madison , WI \n" + 
			" 				<span style='float: right ; font-size: 12px'> Aug 2014 - May 2015</span>\n" + 
			" 			</h4>\n" + 
			" 			<span>Non-degree Inteenational student, Computer Science</span>\n" + 
			" 			<span style='float: right; font-size: 12px'>GPA: 3.33</span><br>\n" + 
			" 			<span>Brazil Scientific Mobility Program, fully founded scholarship recipient</span>\n" + 
			" 			<h5 style='margin-bottom: 0'>Federal University of Rio de Janerio, Brazil\n" + 
			" 				<span style='float: right; font-size: 12px'>Expected Graduation : December 2016</span>\n" + 
			" 			</h5>\n" + 
			" 			<span>Bechelor of science, Computer Science</span>\n" + 
			" 		</div>\n" + 
			" 		<div>\n" + 
			" 			<h3>\n" + 
			" 				<u>Skills</u>\n" + 
			" 			</h3>\n" + 
			" 			<span>\n" + 
			" 				<b>Programming :</b>\n" + 
			" 			</span>\n" + 
			" 			<span> C++ , Java , Paython , JS</span><br>\n" + 
			" 			<span>\n" + 
			" 				<b>Lab : </b>\n" + 
			" 			</span>\n" + 
			" 			<span> Control System, Fluid Machanics, Solid Machanics, Conversatioinal French</span><br>\n" + 
			" 			<span>\n" + 
			" 				<b>Language : </b>\n" + 
			" 			</span>\n" + 
			" 			<span> Native Portuguese, Advanced English, Conversational French</span>\n" + 
			" 		</div>\n" + 
			" 		<div>\n" + 
			" 			<h3>\n" + 
			" 				<u>Experience</u>\n" + 
			" 			</h3>\n" + 
			" 			<h5 style='margin-bottom: 0'>IBM Brazil, Sao Paulo, Brazil \n" + 
			" 				<span style='float: right;font-size: 12px'>May 2013 - Aug 2013</span>\n" + 
			" 			</h5>\n" + 
			" 			<span>Software Intern</span>\n" + 
			" 			<ul style='margin-top: 0'>\n" + 
			" 				<li>Creating new application for migration data between system</li>\n" + 
			" 				<li>Tested five new software releases for kodak picture kiosk</li>\n" + 
			" 				<li>Assisted a caseload of customers from seven states with IT issues</li>\n" + 
			" 			</ul>\n" + 
			" 			<h5 style='margin-bottom: 0'>Federal University of Rio de Janerio, Brazil \n" + 
			" 				<span style='float: right;font-size: 12px'>Feb 2013 - May 2013</span>\n" + 
			" 			</h5>\n" + 
			" 			<span>Research Assistant</span>\n" + 
			" 			<ul style='margin-top: 0'>\n" + 
			" 				<li>Collected and managed data</li>\n" + 
			" 				<li>Examined pros and cons of existing programming language to develop new programming</li>\n" + 
			" 				<li>Assisted a caseload of customers from seven states with IT issues</li>\n" + 
			" 			</ul> \n" + 
			" 		</div>\n" + 
			" 		<div>\n" + 
			" 			<h3>\n" + 
			" 				<u>Additional Information</u>\n" + 
			" 			</h3>\n" + 
			" 			<span>\n" + 
			" 				<b>Work Authorization: </b>\n" + 
			" 			</span>\n" + 
			" 			<span>J-1 visa holder: Sponsorship and work authorization provided by the Institution of International Education</span><br>\n" + 
			" 			<span>\n" + 
			" 				<b>Honors : </b>\n" + 
			" 			</span>\n" + 
			" 			<span> PIBID recipient</span><br>\n" + 
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
		
		field1.setText("");
	}
		
	}


