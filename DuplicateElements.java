package hacker_rank;

import java.util.*;
/* Remove multiple duplicates in a non-decreasing-order linked list 
 * */

class NodeL {
	int data;
	NodeL next;

	NodeL(int d) {
		data = d;
		next = null;
	}
}

class DuplicateElements {

	public static NodeL removeDuplicates(NodeL head) {
		// if no head or no element after head
		if (head == null || head.next == null) {
			return head;
		}

		// head is previous and current is next element after head
		NodeL prev = head;
		NodeL current = prev.next;

		// traverse the linked list
		while (current != null) {

			// if data is duplicate, cut the link of the duplicate
			if (prev.data == current.data) {
				prev.next = current.next;
				// just move the current, compare with previous again (for more duplicates)
				current = current.next;
			} else {
				// move both previous and current
				prev = current;
				current = current.next;
			}
		}
		return head;
	}

	public static NodeL insert(NodeL head, int data) {
		NodeL p = new NodeL(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			NodeL start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;
		}
		return head;
	}

	public static void display(NodeL head) {
		NodeL start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NodeL head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
		sc.close();
	}
}