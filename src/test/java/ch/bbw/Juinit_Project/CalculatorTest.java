package ch.bbw.Juinit_Project;

import org.junit.Test;

import junit.framework.TestCase;

 class CalculatorTest extends TestCase {
	Calculator testEE;
	
	@Test
	public void testSummeZweiPositiveIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.summe(10, 15) == 25);
	}
	
	@Test
	public void testDiffZweiPositiveIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.diff(12, 6) == 2);
	}
}
