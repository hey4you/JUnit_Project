package ch.bbw.Juinit_Project;

import org.junit.Test;

import junit.framework.TestCase;

 class CalculatorTest extends TestCase {
	Calculator testEE;
	
	//Test für Summe
	@Test
	public void testSummeZweiPositiveIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.summe(10, 15) == 25);
	}
	
	@Test 
	public void testSummeZweiNegativeIsOK(){
		testEE = new Calculator();
		assertTrue(testEE.summe(-3, -3) == -6);
	}
	
	//Test für Differenz
	@Test
	public void testDiffZweiPositiveIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.diff(12, 6) == 6);
	}
	
	//Test für Product
	@Test 
	public void testProductZweiPositiveIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.product(2, 10) == 20);
	}
	
	@Test
	public void testProductZweiNegativeIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.product(-10, -10) == -100);
	}
	
	//Test für Quotienten
	@Test
	public void testQuotientZweiPositiveIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.quets(12, 6) == 2);
	}
	
	@Test
	public void testQuotientZweistelligIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.quets(20, 10) == 2);
	}
	
	@Test
	public void testQuotientQuets1SmallerThanQuets2(){
		testEE = new Calculator();
		assertTrue(testEE.quets(10, 20) == 0.5);
	}
}
