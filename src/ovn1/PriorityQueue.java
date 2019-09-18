package ovn1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue {

	private static class PriorityItem implements Comparable<PriorityItem> {

		int priority;
		String value;

		public PriorityItem(int priority, String value) {
			this.priority = priority;
			this.value = value;
		}

		public int compareTo(PriorityItem other) {
			return other.priority - priority;
		}

	}

	private static final int DEFAULT_PRIORITY = 0;
	private static final int DEFAULT_MAX_ELEMENTS = 256;

	private final int MAX_ELEMENTS;

	private List<PriorityItem> queue = new ArrayList<>();

	public PriorityQueue() {
		this(DEFAULT_MAX_ELEMENTS);
	}

	public PriorityQueue(int maxElements) {
		MAX_ELEMENTS = maxElements;
	}

	public void enqueue(String value) {
		enqueue(DEFAULT_PRIORITY, value);
	}

	public void enqueue(int priority, String value) {
		if (queue.size() == MAX_ELEMENTS)
			throw new IllegalStateException("Queue is full");

		queue.add(new PriorityItem(priority, value));
		Collections.sort(queue);
	}

	// TODO: Ska returnera null om kön är tom
	public String dequeue() {
		return queue.remove(0).value;
	}

	// TODO: Ska returnera null om kön är tom
	public String dequeueAlternative() {
		String value = peek();
		queue.remove(0);
		return value;
	}

	// TODO: Ska returnera null om kön är tom
	public String peek() {
		if (queue.isEmpty())
			return null;
		else
			return queue.get(0).value;
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}

}
