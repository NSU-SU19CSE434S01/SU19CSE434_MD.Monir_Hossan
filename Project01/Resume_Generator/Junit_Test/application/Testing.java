package application;


import static org.junit.Assert.*;


import org.junit.jupiter.api.Test;

class Testing {

	
	@Test
	public void test() {
		Main main = new Main();
		
		boolean test = main.isStringOnlyAlphabet("Hello6");
		
		assertEquals(false , test);
		

	}


}
