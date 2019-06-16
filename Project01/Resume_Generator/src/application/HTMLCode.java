package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.scene.control.TextField;

public class HTMLCode {
	
	
	public void func(TextField field1 , TextField field2 , TextField field3 ,TextField field4 ,
						TextField field5, TextField field6,TextField field7,TextField field8,TextField field9,
						TextField field10 ,TextField field11) {
		
	String html = "<div style ='background-color: gray ; width : 300px ; float : right;'><h1>Name :" + field1.getText() +  field2.getText() +"</h1></div>";
		
		File ff = new File("/Users/MDMONIRHOSSAN/Documents/CSE434/Project01/Resume.html");
		
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter(ff));
			b.write(html);
			b.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		field1.setText("");
	}
		
	}


