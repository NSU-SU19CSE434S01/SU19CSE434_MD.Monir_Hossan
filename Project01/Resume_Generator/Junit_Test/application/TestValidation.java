package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sun.jdi.InternalException;



class TestValidation {
	
	private static  Validation testValidation;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		testValidation = new Validation();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		testValidation = null;
	}
	
	/*
	 In this stringTest() method the acceptance input is only String with both capital & small Alphabet & 
	 input alphabet can be multiple & the character length is 2 to 15 then it will pass the test
	 The regular expression for this test case is "[a-z A-Z]{2,15}$"
	 If any number and any other character is given as input it will not pass the test case.  
	*/
	@Test
	void stringTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.isStringOnlyAlphabet("MD MONIR") , true);
			assertEquals(testValidation.isStringOnlyAlphabet("Hossan23") , false);
			
			assertTrue(testValidation.isStringOnlyAlphabet("Raju"));
			assertFalse(testValidation.isStringOnlyAlphabet ("Raju23"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	This test method is checking perfect date format as 2009/12/10, year must be length of 4 then / 
	then month must be length of 2 then / then date must be length of 2 then it will pass this test case.
	The regular expression for this test case is "[0-9]{4}/[0-9]{2}/[0-9]{2}"
	Otherwise it will not pass this test case 
	*/
	@Test
	void validateDateTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.validateDate("2009/12/22") , true);
			assertEquals(testValidation.validateDate("3/5/20098") , false);
			
			assertTrue(testValidation.validateDate("2022/11/20"));
			assertFalse(testValidation.validateDate ("3454jj"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 	In this validateNationalityTest() method the acceptance input is only String with 
	 	both capital & small Alphabet & input alphabet can be multiple then it will pass the test
	 	The regular expression for this test case is "[a-z A-Z]{2,15}$"
	 	If any number and any other character is given as input it will not pass the test case.
	*/
	@Test
	void validateNationalityTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.isStringOnlyAlphabet("Bengladeshi") , true);
			assertEquals(testValidation.isStringOnlyAlphabet("Bangladeshi221") , false);
			
			assertTrue(testValidation.isStringOnlyAlphabet("American"));
			assertFalse(testValidation.isStringOnlyAlphabet ("American546"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 	The Regular expression for contact validation is "([0-9+]{0,4}[0][1])+[0-9]{9}"
	 	Here the input character is only 0-9, and the contact must have 01 in first and
	 	then 9 digit & contact can have country "0088" code or "+" before 01.
	 	The total length of contact can be 11 or 11 to 15 after that test case will pass
	 	Otherwise test case will fail.
	*/
	@Test
	void contactValidationTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.validateContact("008801345654321") , true);
			assertEquals(testValidation.validateContact("0888883") , false);
			
			assertTrue(testValidation.validateContact("+01343213453"));
			assertFalse(testValidation.validateContact ("333454jj"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
  	The regular expression is "[a-z A-Z0-9.,-:_#(/S)]{10,50}"
  	Mailing address can have 10 to 50 character including alphabet, numeric and some special character
  	mention in regular expression then test case will pass.	
	 */	
	@Test
	void mailingAddressValidateTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.mailingAddressValidate("Road 07 , House (194/A) , Block: C-.") , true);
			assertEquals(testValidation.mailingAddressValidate("dd445@@$!^+=?><") , false);
			
			assertTrue(testValidation.mailingAddressValidate("Road 07 , House_ (194/A) , Block: C."));
			assertFalse(testValidation.mailingAddressValidate ("dd445@@$!^+=?><"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}

	/*
	 Email need 4 different part including "abc@gmail.com" or "12abc.ab_@aanytext.anydomain" this format have to have in any 
	 email id then it will pass the test case 
	 The regular expression for email is "[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+" 
	 If any email id does not follow the above email format the test case will fail
	*/
	
	@Test
	void emailValidationTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.emailValidation("abc@gmail.com") , true);
			assertEquals(testValidation.emailValidation("asddn.com") , false);
			
			assertTrue(testValidation.emailValidation("1abc_e@gmail.com"));
			assertFalse(testValidation.emailValidation ("avbv@.com"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 	The institution name can have this " A-Z , a-z , & : . () , - " character and will pass the test
		The regular expression is "[a-z A-z&:.(),-]*"
		Except this character the test case will fail
	*/
	@Test
	void validateInstitutionNameTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.validateInstitutionName("BN School, & College") , true);
			assertEquals(testValidation.validateInstitutionName("!23College@") , false);
			
			assertTrue(testValidation.validateInstitutionName("Dhaka School College (Dhaka)"));
			assertFalse(testValidation.validateInstitutionName("666ggjv)"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 	The regular expression is "[0-9]{1}[.][0-9]{2}"
	 	The accepted input for GPA field 0-9 including a '.'. The format must be satisfy '0.00', 
	 	Before the '.' must be 1 digit and after '.' 2 digit then test case will pass.
	*/
	@Test
	void validateGPATest() throws Exception {
	
		try {
			
			assertEquals(testValidation.validateGPA("3.44") , true);
			assertEquals(testValidation.validateGPA("22.00") , false);
			
			assertTrue(testValidation.validateGPA("5.00"));
			assertFalse(testValidation.validateGPA ("22e.44"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
 	The regular expression is "[a-zA-Z]{3}[ ][0-9]{4}[ ][-][ ][a-zA-Z]{3}[ ][0-9]{4}"
 	All session and duration field must have this format, i.e: "Aug 2012 - Jan 2016" that means
 	session have to have month name in 3 character & year in 4 digit and there must be a hyphen between
 	start and end session then the test case will pass.
	 */
	@Test
	void validateSessionTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.validateSession("Aug 2012 - Jan 2013") , true);
			assertEquals(testValidation.validateSession("22-12k") , false);
			
			assertTrue(testValidation.validateSession("jul 2015 - dec 2018"));
			assertFalse(testValidation.validateSession ("Aug 12-13 Jan"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 In this validateDepartmentest() method the acceptance input is only String with both capital & 
	 small Alphabet & input alphabet can be multiple & the character length is 2 to 15 then it will
	 pass the test The regular expression for this test case is "[a-z A-Z]{2,15}$"
	 If any number and any other character is given as input it will not pass the test case.  
	*/
	@Test
	void validateDepartmentest() throws Exception {
	
		try {
			
			assertEquals(testValidation.isStringOnlyAlphabet("Science") , true);
			assertEquals(testValidation.isStringOnlyAlphabet("Science211") , false);
			
			assertTrue(testValidation.isStringOnlyAlphabet("CSE"));
			assertFalse(testValidation.isStringOnlyAlphabet ("/CSE/BBA/"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 	The regular expression is "[a-zA-Z0-9 +/.:(',*&)#]{10,120}"
	 	The 3 skill fields have to satisfy the above regex including all alphabet, numeric and some special 
	 	character length can be minimum 10 character & maximum 120 character then test case will pass.
	 */
	@Test
	void skillValidationtest() throws Exception {
	
		try {
			
			assertEquals(testValidation.skillValidation("Java, C++, C#, (JvaScript) 99") , true);
			assertEquals(testValidation.skillValidation("$Java, C*, c--") , false);
			
			assertTrue(testValidation.skillValidation("BANGLA, Eng, Swiming, :"));
			assertFalse(testValidation.skillValidation ("~???__^^"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 	The regular expression is "[a-z A-Z(,.:')]{5,50}"
	 	The both reference name must be 5 to 50 character and can have only alphabet and some special character
	 	mention in the above regex. Otherwise test case will fail.
	 */
	@Test
	void referenceNameValidationtest() throws Exception {
	
		try {
			
			assertEquals(testValidation.referenceNameValidation("Md. KamruJ Jaman (PhD)") , true);
			assertEquals(testValidation.referenceNameValidation("Hal uddin 098 +Phd") , false);
			
			assertTrue(testValidation.referenceNameValidation("Md Nayeem Hossain (Phd:Dhaka)"));
			assertFalse(testValidation.referenceNameValidation ("23 Habsa(0)"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 	The regular expression is "[a-z A-Z0-9&,(:'.)-]{5,120}"
	 	The both designation field must be 5 to 120 character and can have alphabet, numeric
	 	 and some special character mention in the above regex. Then the test case will pass.
	 */
	@Test
	void designationValidateTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.designationValidate("Associate Professor & Lecturer,(NSU 2018 - Present)") , true);
			assertEquals(testValidation.designationValidate("+% asoo 99 Professor") , false);
			
			assertTrue(testValidation.designationValidate("Associate Professor , (NSU 2018 - Present)"));
			assertFalse(testValidation.designationValidate ("shJD ** sdjk JDHC"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
	 	The regular expression is "[a-z A-Z0-9:(,.')-_/]{5,50}"
	 	Here in Additional title can have 5 to 50 character & it can be also null.
	 	Input parameter accepts all alphabet a-z numeric value and some other character.
	 	If it is more than 50 or less than 5 then test case will fail.
	*/
	@Test
	void additionalInfoTitleTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.additionalInfoTitle("Work Authorization: ") , true);
			assertEquals(testValidation.additionalInfoTitle("+%Work Authorization: Work Authorization:Work Authorization:  ") , false);
			
			assertTrue(testValidation.additionalInfoTitle("Seminars/Conferences:"));
			assertFalse(testValidation.additionalInfoTitle ("Hons"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	/*
 	The regular expression is [a-z A-Z0-9:(,.')-_/&+@#$<>]{15,200}"
 	Here in Additional description can have 15 to 200 character & it can be also null.
 	Input parameter accepts all alphabet a-z numeric value and some other character. The input string must be
 	between 15 to 200. Other wise test case will not pass.
*/
	
	@Test
	void additionalInfoDesTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.additionalInfoDes("J-1 visa holder: Sponsorship & work authorization provided by "
					+ "the Institution of <International Education>") , true);
			assertEquals(testValidation.additionalInfoDes("PIBID rcipient") , false);
			
			assertTrue(testValidation.additionalInfoDes("IEEE International Conference on (e-science)"));
			assertFalse(testValidation.additionalInfoDes ("^%~Hons"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	
}
