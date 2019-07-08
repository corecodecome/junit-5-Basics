package io.javabrains;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestStrings {
	@Test
	void test3() {
		String str1 = "Hello";
		String str2 = "Hello";
		Assert.assertEquals(str1, str2);
		if(str1 == str2) {
			System.out.println("Test3 is passed");
		}
		else if (str1 != str2) {
			System.out.println("Test3 is failed");			
		}
	}
}
