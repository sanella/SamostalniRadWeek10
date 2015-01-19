package Zadatak1a;


public class BinaryTree {

	private int value;

	public BinaryTree(int value) {
		this.value = value;
	}

	static class Node {
		Node left;

		Node right;

		int value;

		public Node(int value) {
			this.value = value;
		}
	}

	Node root;

	public boolean firstCompare(Node t1, Node t2) {

		while (t1.value != t2.value) {
			firstCompare(t1.right, t2);
			firstCompare(t1.left, t2);
		}
		return secondCompare(t1, t2);
	}

	public boolean secondCompare(Node t1, Node t2) {
		if (t1.right.value == t2.right.value && t1.left.value == t2.left.value) {
			secondCompare(t1.right, t2.right);
			secondCompare(t1.left, t2.left);
			return true;

		}
		return false;
	}


	
	public void addNodes(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode;
				if (value < focusNode.value) {
					focusNode = focusNode.left;
					if (focusNode == null) {
						parent.left = newNode;
						return;

					} else {
						focusNode = focusNode.right;
						if (focusNode == null) {
							parent.right = newNode;
							return;

						}
					}
				}
			}
		}

	}

	
	
	public static void main(String[] args) {
		
	}
}
