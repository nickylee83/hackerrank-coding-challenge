package hacker_rank;

import java.util.LinkedList;

public class Queue {
	LinkedList<Integer> queue = new LinkedList<Integer>();

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return queue.size();
	}

	public void enqueue(int item) {
		queue.addLast(item);
	}

	public int dequeue() {
		return queue.removeFirst();
	}

	public int peek() {
		return queue.peek();
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();

		System.out.println("Empty = " + q.isEmpty());
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(5);
		System.out.println("Size = " + q.size());
		
		q.dequeue();
		System.out.println("Peek = " + q.peek());
		q.dequeue();
		System.out.println(q.size());
	}

}
