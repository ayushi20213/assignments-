package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sumofnumtest {

	@Test
	void test() {
		SumOfNumbers sn=new SumOfNumbers();
		int b=sn.sumOfEvenNumbers(0, 10);
		assertEquals(30,b);
		
		int s=sn.sumOfOddNumbers(1,10);
		assertEquals(25,s);
		
	}

}
