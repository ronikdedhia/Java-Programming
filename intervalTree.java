/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class intervalTree {
	static class Interval {
		int low, high;

		public Interval(int low, int high) {
			this.low = low;
			this.high = high;
		}

		public String toString() {
			return "[" + this.low + "," + this.high + "]";
		}
	}

	static class Node {
		Interval range;
		Node left, right;
		int max;

		public Node(Interval range, int max) {
			this.range = range;
			this.max = max;
		}

		public String toString() {
			return "[" + this.range.low + ", "
					+ this.range.high + "] "
					+ "max = " + this.max + "\n";
		}
	}

	public static Node insert(Node root, Interval x) {
		if (root == null) {
			return new Node(x, x.high);
		}
		if (x.low < root.range.low) {
			root.left = insert(root.left, x);
		} else {
			root.right = insert(root.right, x);
		}
		if (root.max < x.high) {
			root.max = x.high;
		}
		return root;
	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root);
		inOrder(root.right);
	}

	public static Interval isOverlapping(Node root,
			Interval x) {
		if (root == null) {
			// return a dummy interval range
			return new Interval(-1, -1);
		}
		// if x overlaps with root's interval
		if ((x.low > root.range.low
				&& x.low < root.range.high)
				|| (x.high > root.range.low
						&& x.high < root.range.high)) {
			return root.range;
		} else if (root.left != null
				&& root.left.max > x.low) {
			// the overlapping node may be present in left
			// child
			return isOverlapping(root.left, x);
		} else {
			return isOverlapping(root.right, x);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j, n;
		int[] a = new int[10];
		int[] b = new int[10];
		System.out.println("Enter number of nodes");
		n = sc.nextInt();
		Node root = insert(null, new Interval(10, 30));
		for (j = 0; j < n; j++) {
			a[j] = sc.nextInt();
			b[j] = sc.nextInt();
			root = insert(null, new Interval(a[j], b[j]));
			System.out.println(
				"Overlaps with "
						+ isOverlapping(root, new Interval(5, 6)));
			

			// root = insert(root, new Interval(10, 30));
			// root = insert(root, new Interval(17, 19));
			// root = insert(root, new Interval(5, 20));
			// root = insert(root, new Interval(12, 15));
			// root = insert(root, new Interval(30, 40));

		}
		
		

		System.out.println(
				"Inorder traversal of constructed Interval Tree is");
		inOrder(root);
		System.out.println();
		Interval i = new Interval(5, 6);
		// System.out.println("Searching for interval " + i);
		// System.out.println(
		// 		"Overlaps with "
		// 				+ isOverlapping(root, new Interval(5, 6)));
	}

}
