package fizbuzz;

import static org.junit.Assert.*;

import fizbuzz.FuzzLogic;
import org.junit.Before;
import org.junit.Test;

public class TestFuzzLogic {

	FuzzLogic fuzzLogic=null;
	
	@Before
	public void setUp() throws Exception {
		fuzzLogic=new FuzzLogic();
	}

	@Test
	public void shouldReturOneWhenInputIsOne() {
		String number=fuzzLogic.isNumberFuzzBuzz(1);
		assertEquals("1", number);
	}
	
	@Test
	public void shouldReturnTwoWhenInputIsTwo() {
		String number=fuzzLogic.isNumberFuzzBuzz(2);
		assertEquals("2", number);
	}
	@Test
	public void shouldReturnFuzzWhenInputIsThree() {
		String number=fuzzLogic.isNumberFuzzBuzz(3);
		assertEquals("Fuzz", number);
	}
	@Test
	public void shouldReturnBuzzWhenInputIsFive() {
		String number=fuzzLogic.isNumberFuzzBuzz(5);
		assertEquals("Buzz", number);
	}
	@Test
	public void shouldReturnFuzzWhenInputIsNine() {
		String number=fuzzLogic.isNumberFuzzBuzz(9);
		assertEquals("Fuzz", number);
	}
	@Test
	public void shouldReturnFuzzWhenInputIsTen() {
		String number=fuzzLogic.isNumberFuzzBuzz(10);
		assertEquals("Buzz", number);
	}
	@Test
	public void shouldReturnFuzzBuzzWhenInputIsFiften() {
		String number=fuzzLogic.isNumberFuzzBuzz(15);
		assertEquals("FuzzBuzz", number);
	}
	
	

}
