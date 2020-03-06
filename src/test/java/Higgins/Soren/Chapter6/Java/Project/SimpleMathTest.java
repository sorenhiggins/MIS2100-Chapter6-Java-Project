package Higgins.Soren.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	
	
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath math = new SimpleMath();
		assertEquals(0,math.divide(0, 7),0.01);
	}
	@Test
	public void testThatSmallerNumeratorReturnsDecimal() {
		SimpleMath math1 = new SimpleMath();
		assertEquals(0.25,math1.divide(1, 4),0.01);
	}
	@Test(expected = ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath math2 = new SimpleMath();
		math2.divide(6, 0);
	}
}
