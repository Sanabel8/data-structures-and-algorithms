package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
  Node<T> root;
  String preOrderResult = "";
  String InOrderResult = "";
  String postOrderResult = "";
  private Node<T> node;


  public BinaryTree() {
  }

  public String preOrder(Node<T> node) {

    preOrderResult += node.value + " => ";
    if (node.left != null) {
      preOrder(node.left);
    }
    if (node.right != null) {
      preOrder(node.right);
    }
    return preOrderResult;

  }

  public String inOrder(Node<T> node) {

    if (node.left != null) {
      inOrder(node.left);
    }
    InOrderResult += node.value + "=>";
    if (node.right != null) {
      inOrder(node.right);
    }
    return InOrderResult;
  }

  public String postOrder(Node<T> node) {
    if (node.left != null) {
      postOrder(node.left);
    }
    if (node.right != null) {
      postOrder(node.right);
    }
    postOrderResult += node.value + " => ";
    return postOrderResult;
  }

  // code challenge16
  int maximum = Integer.MIN_VALUE;
  int minumum = Integer.MAX_VALUE;

  public int findMaximaumValue(Node node){
    // check if the rout is empty
    if (root == null) {
      System.out.println("tree is empty");
      return 0;
    }else{
      int leftMax;
      int rightMax;
      int max = (int) node.value;
      // find max in the left side
      if (node.left != null){
        leftMax = findMaximaumValue(node.left);
        max = Math.max(max,leftMax);
      }
      // find max in the right side
      if (node.right != null){
        rightMax = findMaximaumValue(node.right);
        max = Math.max(max,rightMax);
      }
      return max;
    }
}

  @Override
  public String toString() {
    return "BinaryTree{" +
      "root=" + root +
      ", preOrderResult='" + preOrderResult + '\'' +
      ", InOrderResult='" + InOrderResult + '\'' +
      ", postOrderResult='" + postOrderResult + '\'' +
      '}';
  }
}
