package unitTesting;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestLogic {
	@Test
	public void testFindMax() {
		assertEquals(4, Calculation.findMax(new int[] {1,3,4,2}));
		assertEquals(-1, Calculation.findMax(new int [] {-12,-3,-15,-1,-5,-6,-2}));
		assertEquals(0, Calculation.findMax(new int [] {-12,-3,-15,-1,-5,0,-6,-2}));
		assertEquals(1, Calculation.findMax(new int [] {-12,-3,-15,0,-1,-5,1,-6,-2}));
	}

} 
