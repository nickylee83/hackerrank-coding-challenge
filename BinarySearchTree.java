package hacker_rank;

import java.util.*;

class BinNode {
	BinNode left, right;
	int data;

	BinNode(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinarySearchTree {

	public static int getHeight(BinNode root) {
		if (root == null) {
			return -1;
		}

		int leftCount = 0;
		int rightCount = 0;

		if (root.left != null) {
			leftCount = 1 + (getHeight(root.left));
		}

		if (root.right != null) {
			rightCount = 1 + (getHeight(root.right));

		}
		return Math.max(leftCount, rightCount);
	}

	public static BinNode insert(BinNode root, int data) {
		if (root == null) {
			return new BinNode(data);
		} else {
			BinNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		BinNode root = null;

		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}

		int height = getHeight(root);
		System.out.println(height);
		sc.close();
	}
}