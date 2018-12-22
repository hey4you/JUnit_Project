package ch.bbw.Juinit_Project;

import org.junit.Test;


import static org.junit.Assert.*;

public class CalculatorTest {
	Calculator testEE;
	
	//Test für Summe
	@Test
	public void testSummeZweiPositiveIsOk(){
		testEE = new Calculator();
		assertTrue(testEE.summe(10, 15) == 25);
	}
	@Test
	public void testSummeZweiNegativeIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.summe(-7, -7) == -14);
	}

	@Test
	public void testSummePositivUndNegativeIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.summe(9, -7) == 2);
	}

	@Test
	public void testSummeZeroIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.summe(-10, 10) == 0);
	}

	@Test
	public void testSummeMaxValueUndMinValueIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}

	@Test
	public void testSummeMaxValueUndZeroIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.summe(Integer.MAX_VALUE, 0) == 2147483647);
	}

	@Test
	public void testSummeMaxValueUndIsMinValueIsFalse1() {
		testEE = new Calculator();
		assertTrue(testEE.summe(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
	}

	@Test
	public void testSummeMaxValueIsFalse() {
		testEE = new Calculator();
		assertTrue(testEE.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -2);
	}

	@Test
	public void testdiffZweiNegativeIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.diff(-10, -9) == -1);
	}

	@Test
	public void testdiffPositivUndNegativeIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.diff(10, -5) == 15);
	}

	@Test
	public void testdiffIS0ZeroIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.diff(5, 5) == 0);
	}

	@Test
	public void testSubtraktionMaxValueUndZeroIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.diff(Integer.MAX_VALUE, 0) == 2147483647);
	}

	@Test
	public void testSubtraktionMinValueUndZeroIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.diff(Integer.MIN_VALUE, 0) == -2147483648);
	}

	@Test
	public void testSubtraktionMaxValueUnd1IsMinValueIsFalse() {
		testEE = new Calculator();
		assertTrue(testEE.diff(Integer.MIN_VALUE, 1) == Integer.MAX_VALUE);
	}

	@Test
	public void testSubtraktionMinValueUndMaxValueIsFalse() {
		testEE = new Calculator();
		assertTrue(testEE.diff(Integer.MIN_VALUE, Integer.MAX_VALUE) == 1);
	}
	
	@Test
	public void testMultiplikation0Und0IsOk() {
		testEE = new Calculator();
		assertTrue(testEE.product(0, 0) == 0);
	}

	@Test
	public void testMultiplikationZweiNegativeIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.product(-20, -2) == 40);
	}

	@Test
	public void testMultiplikationPositivUndNegativeIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.product(-30, 2) == -60);
	}

	@Test
	public void testMultiplikationZeroIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.product(5, 0) == 0);
	}

	@Test
	public void testMultiplikationZeroIsOk2() {
		testEE = new Calculator();
		assertTrue(testEE.product(0, 5) == 0);
	}

	@Test
	public void testMultiplikationMaxValueUnd1IsMinValueIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.product(Integer.MAX_VALUE, -1) == -2147483647);
	}

	@Test
	public void testDivisionZweiNegativeIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.quets(-15, -3) == 5);
	}

	@Test
	public void testDivisionPositivUndNegativeIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.quets(-50, 10) == -5);
	}

	@Test
	public void testDivisionZweiGleicheZahlenIsOk() {
		testEE = new Calculator();
		assertTrue(testEE.quets(10, 10) == 1);
	}

	@Test
	public void testDivision0DurchQuetsIsOk() {

		testEE = new Calculator();
		assertTrue(testEE.quets(0, 6) == 0);
	}
	//Schows exeption if devided by Zero
	@Test(expected = java.lang.ArithmeticException.class)
	public void divideBy0ExceptionExpected() {
		testEE.diff(20, 0);
	}

	@Test
	public void testDivisionMaxValueUnd1IsOk() {
		testEE = new Calculator();
		assertTrue(testEE.quets(Integer.MIN_VALUE, 1) == Integer.MIN_VALUE);
	}
	
	@Test
	public void divideBy0ExceptionUnexpected() throws ArithmeticException {
		testEE.quets(35, 1);
	}
}
