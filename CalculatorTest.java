package stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("stringcalculator.CalculatorTest");
    }
@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
