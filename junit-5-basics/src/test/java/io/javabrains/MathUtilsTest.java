package io.javabrains;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

class MathUtilsTest {

	@Test
	void test() {
		System.out.println("This test is ran");
	}
	
	@Test	
	void test2() {
		MathUtils Calc = new MathUtils();
		int sum = Calc.add (2, 2);
		if (sum != 4) {
			System.out.println("Test2 Sum is failed");
		}
		else if (sum == 4) {
			System.out.println("Test2 Sum is passed");			
		}
		
		double division = Calc.div (9.3, 3.1);
		if (division != 3) {
			System.out.println("Test2 Div is failed");
		}
		else if (division == 3) {
			System.out.println("Test2 Div is passed");
		}
		
		int multip = Calc.multi (2, 8);
		if (multip != 16) {
			System.out.println("Test2 Multi is failed");
		}
		else if (multip == 16) {
			System.out.println("Test2 Multi is passed");			
			}
	Assert.assertEquals(sum, 4, 0);
    Assert.assertEquals(division, 3, 0);
    Assert.assertEquals(multip, 16, 0);
	}
}