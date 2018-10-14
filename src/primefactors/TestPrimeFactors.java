package primefactors;

import static java.util.Arrays.asList;
import static java.util.Collections.EMPTY_LIST;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestPrimeFactors {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void oneHasNotAPrimeNumber() {
		assertEquals(EMPTY_LIST, PrimeFactor.computePrimeFactor(1));
	}

	@Test
	public void twoHasAPrimeNumber() {
		assertEquals(asList(2), PrimeFactor.computePrimeFactor(2));
	}

	@Test
	public void threeHasAprimeNumber() {
		assertEquals(asList(3), PrimeFactor.computePrimeFactor(3));
	}
	
	@Test
	public void fourHasATwoPrimeFactor() {
		assertEquals(asList(2,2), PrimeFactor.computePrimeFactor(4));
	}
	
	@Test
	public void sixHasTwoAndThreeTimesTwoPrimeFactor() {
		assertEquals(asList(2,3), PrimeFactor.computePrimeFactor(6));
	}
	
	@Test
	public void sixHasThreeTimesTwoPrimeFactor() {
		assertEquals(asList(2,2,2), PrimeFactor.computePrimeFactor(8));
	}
	
	@Test
	public void nineHasTwoTimesThreePrimeFactor() {
		assertEquals(asList(3,3), PrimeFactor.computePrimeFactor(9));
	}

}
