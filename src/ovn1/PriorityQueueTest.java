package ovn1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PriorityQueueTest {

	PriorityQueue pq = new PriorityQueue();

	@Test
	void basicFunctionality() {
		pq.enqueue(5, "A");

		assertEquals("A", pq.peek());
		assertEquals("A", pq.dequeue());
	}

	@Test
	void peekOnEmptyQueueReturnsNull() {
		assertNull(pq.peek());
	}

	@Test
	void isEmptyOnEmptyQueue() {
		assertTrue(pq.isEmpty());
	}
	
	@Test
	void isEmptyOnNonEmptyQueue() {
		assertFalse(pq.isEmpty());
	}
	
}

