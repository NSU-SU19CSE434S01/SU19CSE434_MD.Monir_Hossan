package application;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class validationTest {

	@Test
	public void test() {
		Main main = new Main();
		
		int test = main.add(3 , 4);
		
		assertEquals(7 , test);

	}

}
