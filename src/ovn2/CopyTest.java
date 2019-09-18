package ovn2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CopyTest {

	final int[] DEFAULT_DATA = {0,1,2,3,4};
	
	@Test
	public void copy_all() {
		
		
		int[] copy = ArrayMethods.copy(DEFAULT_DATA, 0, 4);
//		int[] copy = ArrayMethods.copy(org, 0, 5);
//		int[] copy = new int[5];
//		ArrayMethods.copy(org, copy, 0, 4);
//		ArrayMethods.copy(org, copy, 0, 5);
		
		assertArrayEquals(DEFAULT_DATA, copy);
		assertNotSame(DEFAULT_DATA, copy);
	}
	
	@Test
	public void copy_half() {
		int[] copy = ArrayMethods.copy(DEFAULT_DATA, 1, 3);
		int[] expected = {1,2,3};
		assertArrayEquals(expected, copy);
	}
	
}
