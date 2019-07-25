package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class HTMLCode {
	
	String div01 = " <div>\n" + 
			"            <img src='/Users/MDMONIRHOSSAN/Desktop/images.png' height='140' width='140' style=' float: right'>\n" + 
			"            <h3 style='margin: 0;'>Md Maruf Ahmmad Chowdory</h3>\n" + 
			"            <span>Flat: 503, Block: A, Road: 07, Uttara, DHAKA</span><br>\n" + 
			"            <span>\n" + 
			"                <b>Email: </b><span>mdraju018934@gmail.com</span>\n" + 
			"            </span><br>\n" + 
			"            <span>\n" + 
			"                <b>Cell: </b><span>01712345013</span>\n" + 
			"            </span>\n" + 
			"        </div>";
	String div02 = " <div>\n" + 
			"            <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>CAREER OBJECTIVE</b></div>\n" + 
			"            <p>To work in challenging environment, achive skilld in the respective field and work for the simultaneous progression of organization and myself</p>\n" + 
			"        </div>";
	String div03 = "<div>\n" + 
			"            <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>WORKING EXPERENCES</b></div>\n" + 
			"            <div>\n" + 
			"                <h4 style='margin-bottom: 0px'>American & Efird Limited (November 2011 - July 2013)</h4>\n" + 
			"                <label>Follow up and collection of cutomer acceotence on Export Documents Collection of Utilization Declaration</label>\n" + 
			"                <label>Reporting to the management of cutomers acceptence area</label>\n" + 
			"                <label>Update datbase on customers acceptence</label>\n" + 
			"                <label>Instant Problem solver and Relationship with buyer</label>\n" + 
			"            </div>\n" + 
			"            <div>\n" + 
			"                <h4 style='margin-bottom: 0px'>Federal University of Rio de Janerio, Brazil (November 2011 - July 2013)</h4>\n" + 
			"                <label>Collected and managed data</label>\n" + 
			"                <label>Examined pros and cons of existing programming language to develop new programming</label>\n" + 
			"                <label></label>\n" + 
			"                <label>Assisted a caseload of customers from seven states with IT issues</label>\n" + 
			"            </div>\n" + 
			"        </div>";
	String div04 = "<div>\n" + 
			"                <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>EDUCATIONAL QUALIFICATION</b></div> \n" + 
			"            <div> \n" + 
			"                <h4 style=\"margin-bottom: 0\"><u>Bechelor of Computer Science & Engineering(Undergraduate):</u></h4>\n" + 
			"                <label><pre>Institute   :  North South University(NSU)</pre></label>\n" + 
			"                <label><pre>CGPA        :  3.44 </pre></label>\n" + 
			"                <label><pre>Session     :  Aug 2012 - Jan 2016</pre></label>\n" + 
			"                <label><pre>Department  :  Major in CSE </pre></label>\n" + 
			"            </div>\n" + 
			"            <div>\n" + 
			"                    <h4 style=\"margin-bottom: 0\"><u>Higher Secondary Certificate(H.S,C):</u></h4>\n" + 
			"                    <label><pre>Institute   :  Dhaka City College</pre></label>\n" + 
			"                    <label><pre>GPA         :  3.44 </pre></label>\n" + 
			"                    <label><pre>Session     :  Aug 2012 - Jan 2016</pre></label>\n" + 
			"                    <label><pre>Department  :  Science </pre></label>\n" + 
			"                </div>\n" + 
			"                <div>\n" + 
			"                        <h4 style=\"margin-bottom: 0\"><u>Secondary School Certificate(S.S.C):</u></h4>\n" + 
			"                        <label><pre>Institute   :  Rajuk Model School</pre></label>\n" + 
			"                        <label><pre>GPA         :  3.44 </pre></label>\n" + 
			"                        <label><pre>Session     :  Aug 2012 - Jan 2016</pre></label>\n" + 
			"                        <label><pre>Department  :  Science </pre></label>\n" + 
			"                </div>\n" + 
			"        </div>";
	String div05 = "<div>\n" + 
			"            <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>SKILLS</b></div>\n" + 
			"            <p style=\"margin-bottom: 0\"><b>Programming Skills : </b><span> Java , C++ , HTML , CSS , JavaScript , C# , Swift</span></p>\n" + 
			"            <p style=\"margin-bottom: 0\"><b>Language Skills : </b><span> Bangla , English , Hindi , Spanish</span></p>\n" + 
			"            <p style=\"margin-bottom: 0\"><b>Others Skills : </b><span> Football , Live coding , Swiming, Racing</span></p>\n" + 
			"       </div>     ";
	String div06 = "<div>\n" + 
			"        <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>ADDiTIONAL INFORMATION</b></div>\n" + 
			"        <h4><u>Conferences Attend : </u></h4><span>IEEE Conference on internation competition of robotics in canada, Aug 2018</span>\n" + 
			"        <h4><u>Workshop on Programming :</u></h4><span>ACM Conference on internation competition of robotics in canada, Aug 2018</span>\n" + 
			"       </div> <br>  ";
	String div07 = "<div>\n" + 
			"        <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>IMPORTANT LINKS</b></div> \n" + 
			"        <p><b>Website Link : </b> file:///Users/MDMONIRHOSSAN/Documents/CSE434/Project01/Resume2.html</p>\n" + 
			"        <p><b>Project Link : </b> file:///Users/MDMONIRHOSSAN/Documents/CSE434/Project01/Resume2.html</p>\n" + 
			"       </div> ";
	String div08 = "<div>\n" + 
			"        <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>REFERENCES</b></div> \n" + 
			"        <h4 style=\"margin-bottom: 0\">Dr. Monjurul Alam (PhD)</h4><br>\n" + 
			"        <span>Associate Professor , School of Bussiness , North South University</span>\n" + 
			"        <h4 style=\"margin-bottom: 0\">Dr. Monjurul Alam (PhD)</h4><br>\n" + 
			"        <span>Associate Professor , School of Bussiness , North South University</span>\n" + 
			"       </div>";
	
	public void htmlGenerateForUS(TextField firstName , TextField lastName , DatePicker dateOfBirth , TextField nationality,TextField address,
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
		
	String htmlForUSFormat =" <!DOCTYPE html>\n" + 
			" <html>\n" + 
			" <head>\n" + 
			" 	\n" + 
			" </head>\n" + 
			" <body style='background-color: lightgrey ;'>\n" + 
			" 	<div style='margin: auto ; background-color:  whitesmoke;  width: 50%; padding: 30px;'>\n" + 
			" 		<div style='text-align: center'>\n" + 
			" 			<h2 style='margin: 0;'>" + firstName.getText()+ " " + lastName.getText() + "</h2>\n" + 
			" 			<span>"+ address.getText() +"</span><br>\n" + 
			" 			<span>"+ email.getText() +",\n" + 
			" 				<span>"+ contact.getText() +"</span><br>\n" + 
			" 				<span><b>Nationality : </b>"+ nationality.getText() +"</span>\n" + 
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
			" 			<span>"+ undergraduateDepartment.getText()+"</span>\n" + 
			" 			<span style='float: right; font-size: 12px'>"+undergraduateCgpa.getText()+"</span><br>\n" +
			" 			</h5>\n" + 
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
			" 	</div>\n" + 
			" </div>\n" + 
			"</body>\n" + 
			"</html>";
		
	
		File filePath = new File("/Users/MDMONIRHOSSAN/Documents/CSE434/Project01/Resume.html");
		
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter(filePath));
			b.write(htmlForUSFormat);
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//firstName.setText("");
	}
		
	}


