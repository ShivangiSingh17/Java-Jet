class Node // a class that contains a node and the left and right child of the node
{
  int key;
  Node left, right;
  
  public void Node(int item)
  {
    key = item;
    left = null;
    right = null;
  }
}
class binaryTree
{
  Node root; // creation of the root node
  binaryTree(int value) //parameterized contructor
  {
    root = new Node(value);
  }
  binaryTree() //default constructor
  {
    root = null;
  }
  public static void main()
  {
    binaryTree sampleTree = new binaryTree(); //an instance of the class binaryTree
    sampleTree.root = new Node(10); //assign a value to the node
    sampleTree.root.left = new Node(20); //assign a value to the left subtree
    sampleTree.root.right = new Node(30); //assign a value to the right subtree
    sampleTree.root.left.left = new Node(40); //assign a value to the left node of the left subtree
    sampleTree.root.left.right = new Node(50); //assign a value to the right node of the left subtree
  }
 }
