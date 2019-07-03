package application;


import static org.junit.Assert.*;


import org.junit.jupiter.api.Test;

class Testing {

	
	@Test
	public void test() {
		Main main = new Main();
		
		boolean test = main.isStringOnlyAlphabet("Hello6");
		
		boolean test2 = main.validateContact("12345666543");
		
		assertEquals(false , test);
		
		assertEquals(true , test2);
		

	}


}
