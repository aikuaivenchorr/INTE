package ovn2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EqualsTest {

	@Test
	void equals_both_null() {
		assertTrue(ArrayMethods.equals(null, null));
	}
	
}