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
		
	String html =" <!DOCTYPE html><html><head></head>"
			+ "<body style='background-color: lightgrey ;'>"
			
			+ "<div style='margin: auto ; background-color:  whitesmoke;  width: 50%; padding: 30px;'>"
			+ "<div style='text-align: center'><h2 style='margin: 0;'>Steb Alein</h2>"
			+ "<span> 809 United Nation Plazza New York, NY 1001</span><br><span>stebalein@gmail.com <span>0182033889934</span></span></div>"
			
			+ "<div><h3><u>Education</u></h3><h4 style='margin: 0'>University of wisconsin, Madison , WI <span style='float: right ; font-size: 12px'> Aug 2014 - May 2015</span></h4>"
			+ "<span>Non-degree Inteenational student, Computer Science</span><span style='float: right; font-size: 12px'>GPA: 3.33</span><br>"
			+ "<span>Brazil Scientific Mobility Program, fully founded scholarship recipient</span>"
			+ "<h5 style='margin-bottom: 0'>Federal University of Rio de Janerio, Brazil<span style='float: right; font-size: 12px'>Expected Graduation : December 2016</span> </h5>"
			+ "<span>Bechelor of science, Computer Science</span></div>"
			
			+ "<div><h3><u>Skills</u></h3><span><b>Programming :</b></span><span> C++ , Java , Paython , JS</span><br>"
			+ "<span><b>Lab : </b></span><span> Control System, Fluid Machanics, Solid Machanics, Conversatioinal French</span><br>"
			+ "<span><b>Language : </b></span><span> Native Portuguese, Advanced English, Conversational French</span></div>"
			
			+ "<div><h3><u>Experience</u></h3><h5 style='margin-bottom: 0'>IBM Brazil, Sao Paulo, Brazil <span style='float: right;font-size: 12px'>May 2013 - Aug 2013</span></h5>"
			+ "<span>Software Intern</span><ul style='margin-top: 0'><li>Creating new application for migration data between system</li>"
			+ "<li>Tested five new software releases for kodak picture kiosk</li><li>Assisted a caseload of customers from seven states with IT issues</li></ul>"
			
			+ "<h5 style='margin-bottom: 0'>Federal University of Rio de Janerio, Brazil <span style='float: right;font-size: 12px'>Feb 2013 - May 2013</span></h5>"
			+ "<span>Research Assistant</span><ul style='margin-top: 0'><li>Collected and managed data</li>"
			+ "<li>Examined pros and cons of existing programming language to develop new programming</li>"
			+ "<li>Assisted a caseload of customers from seven states with IT issues</li></ul> </div> "
						
			+ "<div><h3><u>Additional Information</u></h3>"
			+ "<span><b>Work Authorization: </b></span><span>J-1 visa holder: Sponsorship and work authorization provided by the Institution of International Education</span><br>"
			+ "<span><b>Honors : </b></span>"
			+ "<span> PIBID recipient</span><br>"
			+ "<span><b>Seminars/Conferences: </b></span>"
			+ "<span> IEEE International Conference on e-science</span></div>"
			+ "<span><b>Activities: </b></span>"
			+ "<span>Founder, Brazil club of the University of Madison, Wisconsin</span></div>"
			
			+"</div></body></html>";
		
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


