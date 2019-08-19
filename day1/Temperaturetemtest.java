package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Temperaturetemtest {

	@Test
	void testMain() {
		Temperature temp=new Temperature();
		Double Farenheit=temp.convertToFarenheit(20.00);
		
		assertEquals(68.00,Farenheit);
		
		Double celcius=temp.convertTocelcius(68.00);
		assertEquals(20.00,celcius);
		
		
		
		
	
	}

	
}
