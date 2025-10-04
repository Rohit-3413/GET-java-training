package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Author   :Rohit.10.Gupta
 * Date     :Oct 4, 2025
 * Time     :1:08:52 PM
 * project  :JunitDemo
*/

class AssertionTest {

	@Test
	void test() {
		//Variable declaration		
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;		
		
        int[] airethematicArrary1 = { 1, 2, 3 ,77};					
        int[] airethematicArrary2 = { 1, 2, 3 ,77};	
			
        Integer string6 =10;	

        //Assert statements	
        	assertEquals(string1, string2);
        	assertNotEquals(string2, 100);
        	assertSame(string2, string2);
        	assertNotSame(string1, string3);
        	assertNotNull(string1);
        	assertNull(string5);
        	assertTrue(variable1 < variable2);
        	assertArrayEquals(airethematicArrary1, airethematicArrary2);
        	assertEquals(string6, 10);
        	assertNotEquals(string6, "20");
	}

}
