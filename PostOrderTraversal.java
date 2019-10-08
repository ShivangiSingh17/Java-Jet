import java.util.Stack;

public class PostOrderTraversal {
	private static void performPostOrderTraversal(TreeNode root) {
		Stack<TreeNode> nodeStack = new Stack<>();
		nodeStack.push(root);

		while (!nodeStack.isEmpty()) {
			TreeNode top = nodeStack.peek();

			if ((top.leftNode == null || top.leftNode.visited == true)
					&& (top.rightNode == null || top.rightNode.visited == true)) {
				System.out.println(top.value);
				nodeStack.pop();
				continue;
			}
			if (top.rightNode != null && !top.rightNode.visited) {
				nodeStack.push(top.rightNode);
				top.rightNode.visited = true;
			}
			if (top.leftNode != null && !top.leftNode.visited) {
				nodeStack.push(top.leftNode);
				top.leftNode.visited = true;
			}
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		TreeNode child1 = new TreeNode(4);
		TreeNode child2 = new TreeNode(6);
		TreeNode child3 = new TreeNode(1);
		TreeNode child4 = new TreeNode(5);
		TreeNode child5 = new TreeNode(7);
		TreeNode child7 = new TreeNode(4);
		TreeNode child8 = new TreeNode(10);
		TreeNode child10 = new TreeNode(6);
		TreeNode child12 = new TreeNode(8);
		TreeNode child15 = new TreeNode(11);

		root.leftNode = child1;
		root.rightNode = child2;

		child1.leftNode = child3;
		child1.rightNode = child4;
		child2.leftNode = child5;
		child3.leftNode = child7;
		child3.rightNode = child8;
		child4.rightNode = child10;
		child5.rightNode = child12;
		child8.leftNode = child15;

		performPostOrderTraversal(root);
	}
}

class TreeNode {
	int value;
	boolean visited;
	TreeNode leftNode = null;
	TreeNode rightNode = null;

	public TreeNode(int value) {
		this.value = value;
	}
}
