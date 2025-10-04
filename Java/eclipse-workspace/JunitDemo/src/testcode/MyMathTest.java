package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import businesscode.MyMath;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Oct 4, 2025
 * Time     :12:58:28 PM
 * project  :JunitDemo
*/

class MyMathTest {

	private MyMath m;
	
	@BeforeEach
	void setUp() throws Exception {
		m = new MyMath();
	}

	@AfterEach
	void tearDown() throws Exception {
	m = null;
	}

	@Test
	void testSum() {
		System.out.println("Test with 3 Numbers");
		assertEquals(10, m.sum(new int[] {5,3,2}));
	}
	
	@Test
	void testSum2() {
		System.out.println("Test with 5 Nos");
		assertEquals(101, m.sum(new int[] {55,10,6,20,10}));
	}
	

	@Test
	void testSum3() {
		System.out.println("Test with Empty array");
		assertEquals(0, m.sum(new int[] {}));
	}
	

	@Test
	void testSum4() {
		System.out.println("Test with one element");
		assertEquals(5, m.sum(new int[] {5}));
	}

}
