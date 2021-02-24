package hacker_rank;

import java.util.*;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class LinkedListInteger {

	public static Node insert(Node head, int data) {
		// create a new node to be inserted
		Node tempNode = new Node(data);
		// nothing in here, we insert our node in the first position
		if (head == null) {
			head = tempNode;
		} else {
			// at least one node is here, then find the last node
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			// last node found, put new node after it
			current.next = tempNode;
		}
		// return one node as the pointer is moving
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}