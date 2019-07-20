package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class HTMLCodeForBD {
	
	public void htmlForBd (TextField firstName , TextField lastName , DatePicker dateOfBirth , TextField nationality,
			TextField address,
			 TextField email,TextField contact,TextField SSC,TextField sscGPA , TextField sscSession,
			 TextField sscDepartment, TextField HSC, TextField hscGPA, TextField hscSession,
			 TextField hscDepartment, TextField undergraduate, TextField undergraduateCgpa, TextField undergraduateSession,
			 TextField undergraduateDepartment,TextField programmingSkill,
			 TextField languageSkill,TextField otherSkill,TextField experience01,
			 TextField experience01Duration,TextField experience01_1,TextField experience01_2,
			 TextField experience01_3,TextField experience02,TextField experience02Duration,
			 TextField experience02_1 ,TextField experience02_2,TextField experience02_3,
			 TextField additionalTitle1,TextField additionalDes1,TextField additionalTitle2,TextField additionalDes2,
			 TextField reference1,TextField designation1, TextField reference2, TextField designation2, TextField link1, TextField link2 ,  String imagePath
			 ) {
		
		String htmlCode = "<html lang=\"en\">\n" + 
				"\n" + 
				"<head>\n" + 
				"    <meta charset=\"UTF-8\">\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" + 
				"    <title>Bangladesh Resume</title>\n" + 
				"</head>\n" + 
				"\n" + 
				"<body style='background-color: lightgrey ;'>\n" + 
				"    <div style='margin: auto ; background-color:  whitesmoke;  width: 50%; padding: 30px;'>\n" + 
				"\n" + 
				"        <div>\n" + 
				"           <img src='"+ imagePath +"' height='140' width='140' style=' float: right'><br><br>\n" + 
				"            <h3 style='margin: 0;'>" + firstName.getText() + "</h3>\n" + 
				"            <span>" + address.getText() + "</span><br>\n" + 
				"\n" + 
				"            <span>\n" + 
				"                <b>Email: </b><span>" + email.getText() + "</span>\n" + 
				"            </span><br>\n" + 
				"            <span>\n" + 
				"                <b>Cell: </b><span>"+ contact.getText() +"</span>\n" + 
				"            </span><br><br>\n" + 
				"        </div><br><br>\n" + 
				"\n" + 
				"        <div>\n" + 
				"            <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>CAREER OBJECTIVE</b></div>\n" + 
				"            <p>To work in challenging environment, achive skilld in the respective field and work for the simultaneous progression of organization and myself</p>\n" + 
				"        </div>\n" + 
				"\n" + 
				"        <div>\n" + 
				"            <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>WORKING EXPERENCES</b></div>\n" + 
				"            <div>\n" + 
				"                <h4 style='margin-bottom: 0px'>"+ experience01.getText() + " " + experience01Duration.getText()+"</h4>\n" + 
				"                <label>"+experience01_1.getText()+"</label><br>\n" + 
				"                <label>"+experience01_2.getText()+"</label><br>\n" + 
				"                <label>"+experience01_3.getText()+"</label><br>\n" + 
				"            </div>\n" + 
				"            <div>\n" + 
				"                <h4 style='margin-bottom: 0px'>"+experience02.getText()+" " +experience02Duration.getText()+"</h4>\n" + 
				"                <label>"+experience02_1.getText()+"Collected and managed data</label><br>\n" + 
				"                <label>"+experience02_2.getText()+"</label><br>\n" + 
				"                <label>"+experience02_3.getText()+"</label><br>\n" + 
				"            </div>\n" + 
				"        </div><br>\n" + 
				"\n" + 
				"        <div>\n" + 
				"                <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>EDUCATIONAL QUALIFICATION</b></div> \n" + 
				"            <div> \n" + 
				"                <h4 style=\"margin-bottom: 0\"><u>B.Sc/BBA(Undergraduate):</u></h4>\n" + 
				"                <label><pre>Institute   :  "+undergraduate.getText()+"</pre></label>\n" + 
				"                <label><pre>CGPA        :  "+undergraduateCgpa.getText()+"</pre></label>\n" + 
				"                <label><pre>Session     :  "+undergraduateSession.getText()+"</pre></label>\n" + 
				"                <label><pre>Department  :  "+undergraduateDepartment.getText()+"</pre></label>\n" + 
				"            </div>\n" + 
				"            <div>\n" + 
				"                    <h4 style=\"margin-bottom: 0\"><u>Higher Secondary Certificate(H.S,C):</u></h4>\n" + 
				"                    <label><pre>Institute   :  "+HSC.getText()+"</pre></label>\n" + 
				"                    <label><pre>GPA         :  "+ hscGPA.getText()+"</pre></label>\n" + 
				"                    <label><pre>Session     :  "+hscSession.getText()+"</pre></label>\n" + 
				"                    <label><pre>Department  :  "+hscDepartment.getText()+"</pre></label>\n" + 
				"                </div>\n" + 
				"                <div>\n" + 
				"                        <h4 style=\"margin-bottom: 0\"><u>Secondary School Certificate(S.S.C):</u></h4>\n" + 
				"                        <label><pre>Institute   :  "+SSC.getText()+"</pre></label>\n" + 
				"                        <label><pre>GPA         :  "+sscGPA.getText()+"</pre></label>\n" + 
				"                        <label><pre>Session     :  "+sscSession.getText()+"</pre></label>\n" + 
				"                        <label><pre>Department  :  "+sscDepartment.getText()+"</pre></label>\n" + 
				"                </div>\n" + 
				"        </div>\n" + 
				"    </div>\n" + 
				"    <div style='margin: auto ; background-color:  whitesmoke;  width: 50%; padding: 30px; margin-top: 40px'>\n" + 
				"        <div>\n" + 
				"            <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>SKILLS</b></div>\n" + 
				"            <h4 style=\"margin-bottom: 0\"><u>Programming Skills : </u></h4><span>" +programmingSkill.getText()+ "</span>\n" + 
				"            <h4 style=\"margin-bottom: 0\"><u>Language Skills : </u></h4><span>" +languageSkill.getText()+ "</span>\n" + 
				"            <h4 style=\"margin-bottom: 0\"><u>Others Skills : </u></h4><span>" +otherSkill.getText()+ "</span></p>\n" + 
				"       </div> <br>\n" + 
				"       <div>\n" + 
				"        <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>ADDiTIONAL INFORMATION</b></div>\n" + 
				"        <h4><u>" +additionalTitle1.getText()+ " : </u></h4><span>" +additionalDes1.getText()+ "</span>\n" + 
				"        <h4><u>" +additionalTitle2.getText()+ " :</u></h4><span>" +additionalDes2.getText()+ "</span>\n" + 
				"       </div> <br>  \n" + 
				"       <div>\n" + 
				"        <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>IMPORTANT LINKS</b></div> \n" + 
				"        <p><b>Website Link : </b>" +link1+ " </p>\n" + 
				"        <p><b>Project Link : </b>" +link2+ " </p>\n" + 
				"       </div> \n" + 
				"       <div>\n" + 
				"        <div style=\" box-sizing: border-box;width: 100%; padding: 10px;background-color: rgb(187, 181, 181);\"><b>REFERENCES</b></div> \n" + 
				"        <h4 style=\"margin-bottom: 0\">" +reference1.getText()+ "</h4><br>\n" + 
				"        <span>" +designation1.getText()+ "</span>\n" + 
				"        <h4 style=\"margin-bottom: 0\">" +reference2.getText()+ "</h4><br>\n" + 
				"        <span>" +designation2.getText()+ "</span>\n" + 
				"       </div>\n" + 
				"    </div>\n" + 
				"</body>\n" + 
				"\n" + 
				"</html>";
		
		
		
		File filePath = new File("/Users/MDMONIRHOSSAN/Documents/CSE434/Project01/Resume.html");
		
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter(filePath));
			b.write(htmlCode);
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//firstName.setText("");
	}

		
	}
	
