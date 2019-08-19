package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Validmarks {

	@Test
	void test() {
		Markvalidator mv=new Markvalidator();
		boolean b=mv.isPass(70);
		assertEquals(true,b);
		
		char h=mv.markgrade(70);
		assertEquals('C',h);
		
	}

}
