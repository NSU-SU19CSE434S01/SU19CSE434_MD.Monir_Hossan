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
	
}
