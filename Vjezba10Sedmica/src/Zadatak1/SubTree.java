package Zadatak1;

public class SubTree {

	public static boolean isSubTreeVal(BinaryTree t1, BinaryTree t2) {
		if (t2 == null)
			return true;
		if (t1 == null)
			return false;
		if (t1.value == t2.value) {
			if (isSubTreeVal(t1.left, t2.left)
					&& isSubTreeVal(t1.right, t2.right))
				return true;
		}
		return isSubTreeVal(t1.left, t2) || isSubTreeVal(t1.right, t2);
	}

	public static void main(String[] args) {
		BinaryTree t1 = new BinaryTree(1);
		t1.left = new BinaryTree(3);
		t1.left.right = new BinaryTree(6);
		t1.left.right.right = new BinaryTree(21);
		t1.left.left = new BinaryTree(7);
		t1.left.left.left = new BinaryTree(22);
		
		t1.right = new BinaryTree(5);
		t1.right.left = new BinaryTree(9);
		t1.right.left.right = new BinaryTree(6);
		t1.right.left.left = new BinaryTree(4);
		t1.right.right = new BinaryTree(10);
		t1.right.right.right = new BinaryTree(9);
		t1.right.right.left = new BinaryTree(7);

		BinaryTree t2 = new BinaryTree(3);
		t2.left = new BinaryTree(7);
		t2.left.left = new BinaryTree(22);
		t2.right = new BinaryTree(6);
		t2.right.right = new BinaryTree(21);

		
		BinaryTree t3 = new BinaryTree(1);
		t3.left = new BinaryTree(3);
		t3.right = new BinaryTree(5);
		
		System.out.println("t1 i t2");

		if (isSubTreeVal(t1, t2)) {
			System.out.println("jeste");
		} else {
			System.out.println("Nije");
		}
		
		System.out.println("t1 i t2");

		if (isSubTreeVal(t1, t3)) {
			System.out.println("jeste");
		} else {
			System.out.println("Nije");
		}
	}

}
