/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
      System.out.println(new App().getGreeting());

// code 15
      BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
      Node<Integer> root = new Node<>(8);
      Node<Integer> n1 = new Node<>(2);
      Node<Integer> n2 = new Node<>(11);
      Node<Integer> n3 = new Node<>(7);
      Node<Integer> n4 = new Node<>(5);
      Node<Integer> n5 = new Node<>(9);
      Node<Integer> n6 = new Node<>(4);

      binarySearchTree.root = root;
      binarySearchTree.root.left = n1;
      binarySearchTree.root.right = n2;
      binarySearchTree.root.left.left = n3;
      binarySearchTree.root.left.right = n4;
      binarySearchTree.root.right.left = n5;
      binarySearchTree.root.right.right = n6;

      binarySearchTree.add(1);
      binarySearchTree.add(3);
      binarySearchTree.add(6);
      binarySearchTree.add(12);
      binarySearchTree.add(18);
      System.out.println(binarySearchTree.inOrder(root));
      System.out.println(binarySearchTree.contains(5));
      System.out.println(binarySearchTree.contains(17));
      System.out.println(binarySearchTree.contains(12));
      System.out.println(binarySearchTree.contains(4));


      BinaryTree bt = new BinaryTree();
      //Add nodes to the binary tree
      bt.root = new Node(20);
      bt.root.left = new Node(25);
      bt.root.right = new Node(54);
      bt.root.left.left = new Node(74);
      bt.root.right.left = new Node(85);
      bt.root.right.right = new Node(22);

      //Display largest node in the binary tree
      System.out.println("maximum node is: " + bt.findMaximaumValue(bt.root));
      //cc17
      System.out.println(bt.breadthFirstTree(root));

    }

}
