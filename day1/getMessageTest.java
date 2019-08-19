package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getMessageTest {

	@Test
	void test() {
		helloworld hw=new hw();
		String actual=hw.getMessage("helloworld");
		String expected="helloworld";
		fail("Not yet implemented");
		assertEquals(actual,expected);
	}

}
