package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Facto {

	@Test
	void test() {
		 Factorial f=new  Factorial();
		int res= f.calculateFactorial(4);
		assertEquals(24,res);


	}

}
