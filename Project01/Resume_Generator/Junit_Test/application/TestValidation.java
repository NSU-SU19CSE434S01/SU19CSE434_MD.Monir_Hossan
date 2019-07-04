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
			
			assertEquals(testValidation.isStringOnlyAlphabet("MDMONIR") , true);
			assertEquals(testValidation.isStringOnlyAlphabet("Hossan23") , false);
			
			assertTrue(testValidation.isStringOnlyAlphabet("Raju"));
			assertFalse(testValidation.isStringOnlyAlphabet ("Raju23"));
		}
		catch(InternalException e){
			e.printStackTrace();
		}
		
	}

}
