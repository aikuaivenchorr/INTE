package ovn2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LargestTest {

	@Test
	void largest_null_IAE() {
		assertThrows(IllegalArgumentException.class, () -> {
			ArrayMethods.largest(null);
			});
	}

	@Test
	void largest_empty_IAE() {
		int[] arr = {};
		
		assertThrows(IllegalArgumentException.class, () -> {
			ArrayMethods.largest(arr);
			});
	}

	@Test
	void largest_first() {
		int[] arr = {3,2,1};
		assertEquals(3, ArrayMethods.largest(arr));
	}

	@Test
	void largest_mid() {
		int[] arr = {1, 3,2};
		assertEquals(3, ArrayMethods.largest(arr));
	}
	
	@Test
	void largest_last() {
		int[] arr = {1,2,3};
		assertEquals(3, ArrayMethods.largest(arr));
	}

	@Test
	void largest_duplicates() {
		int[] arr = {1,2,3,2,3,1};
		assertEquals(3, ArrayMethods.largest(arr));
	}

	@Test
	void largest_negativenumbers() {
		int[] arr = {-1,-2,-3};
		assertEquals(-1, ArrayMethods.largest(arr));
	}


}
