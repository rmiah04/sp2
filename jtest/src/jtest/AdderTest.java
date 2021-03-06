/**
 * 
 */
package jtest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author rmiah04
 *
 */
public class AdderTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		int input1 = 4;
		int input2 = 5;
		int expectedOutput = 9;

		Adder addObj = new Adder();

		int actualOutput = addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	
	@Test
	public void test2() {
		int input1 = 7;
		int input2 = 4;
		int expectedOutput = 11;

		Adder addObj = new Adder();

		int actualOutput = 	addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	@Test
	public void test3() {
		int input1 = 7;
		int input2 = 6;
		int expectedOutput = 13;

		Adder addObj = new Adder();

		int actualOutput = 	addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	@Test
	public void test4() {
		int input1 = 7;
		int input2 = 3;
		int expectedOutput = 11;

		Adder addObj = new Adder();

		int actualOutput = 	addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	
	@Test
	public void test5() {
		int input1 = 14;
		int input2 = 3;
		int expectedOutput = 11;

		Adder addObj = new Adder();

		int actualOutput = 	addObj.sub(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	@Test
	public void test6() {
		int input1 = 14;
		int input2 = 7;
		int expectedOutput = 7;

		Adder addObj = new Adder();

		int actualOutput = 	addObj.sub(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	@Test
	public void test7() {
		int input1 = 14;
		int input2 = 3;
		int expectedOutput = 8;

		Adder addObj = new Adder();

		int actualOutput = 	addObj.sub(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	@Test
	public void test8() {
		int input1 = 18;
		int input2 = 3;
		int expectedOutput = 15;

		Adder addObj = new Adder();

		int actualOutput = 	addObj.sub(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);

	}
	
	private int expected;

	@Before
	public void setUp() throws Exception {
		expected =1;
	}

	@Test
	public void testWithSetUp() {
		int input1 = 0;
		int input2 = 1;
		int expectedOutput = expected;

		Adder addObj = new Adder();

		int actualOutput = addObj.add(input1,input2);

		assertEquals("Wronge answer!", expectedOutput, actualOutput);
	}
	private static int firstInput;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		firstInput = 1;
	}

	@Test
	public void testWithSetUpBeforeClass() {
		int input1 = firstInput;
		int input2 = 11;
		int expectedOutput = 12;

		Adder addObj = new Adder();

		int actualOutput = addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	@Test
	public void testss() {
		int input1 = firstInput;
		int input2 = expected;
		int expectedOutput = 12;

		Adder addObj = new Adder();

		int actualOutput = addObj.add(input1,input2);

		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	
	}

	


}
