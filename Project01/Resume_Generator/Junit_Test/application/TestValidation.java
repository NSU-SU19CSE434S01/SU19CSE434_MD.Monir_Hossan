package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sun.jdi.InternalException;



class TestValidation {

	Main ne = new Main();
	
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
	 In this stringTest() method the acceptance input is only String with both capital & small Alphabet & input alphabet can be multiple then 
	 it will pass the test
	 The regular expression for this test case is "[a-z A-Z]*"
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
	This test method is checking perfect date format as 2009/12/10, year must be length of 4 then / then month must be length of 2
	then / then date must be length of 2 then it will pass this test case.
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
	
	@Test
	void contactValidationTest() throws Exception {
	
		try {
			
			assertEquals(testValidation.validateContact("01345654321") , true);
			assertEquals(testValidation.validateContact("0888883") , false);
			
			assertTrue(testValidation.validateContact("01343213453"));
			assertFalse(testValidation.validateContact ("333454jj"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
	
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
	
	@Test
	void validateGPATest() throws Exception {
	
		try {
			
			assertEquals(testValidation.validateGPA("3.44") , true);
			assertEquals(testValidation.validateGPA("22") , false);
			
			assertTrue(testValidation.validateGPA("5.00"));
			assertFalse(testValidation.validateGPA ("22e.44"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}
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
	
}
