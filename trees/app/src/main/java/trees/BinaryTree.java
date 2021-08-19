package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {
  Node<T> root;
  String preOrderResult = "";
  String InOrderResult = "";
  String postOrderResult = "";
  private Node<T> node;
  List<Integer> orderList = new ArrayList<>();
  List<Node> list2ForNode = new ArrayList<Node>();

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

  //cc17
  public ArrayList<Integer> breadthFirstTree(Node tree){

    list2ForNode.add(tree);
    while (list2ForNode.size()!=0) {
      Node node= list2ForNode.get(0);
      orderList.add((Integer) node.value);
      list2ForNode.remove(0);
      if(node.left != null){
        list2ForNode.add(node.left);
      }
      if(node.right != null){
        list2ForNode.add(node.right);
      }
      System.out.println(orderList+"sssss");
    }
    return (ArrayList<Integer>) orderList;
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
