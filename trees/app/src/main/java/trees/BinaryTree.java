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

//  public ArrayList treeBreadthFirst(BinaryTree<T> binaryTree){
//   if(binaryTree.root == null){
//     return null;
//     }
//    List<T> list = new ArrayList<>();
//    Queue<T> queue = new LinkedList<>();
//    queue.add((T) binaryTree.root);
//    while (!queue.isEmpty()){
//      Node currentNode = (Node) queue.peek();
////      System.out.print(tempNode.data);
//      System.out.print(currentNode.data + " ");
//      if (currentNode.left != null) {
//        queue.add((T) currentNode.left);
//      }
//      if (currentNode.right != null) {
//        queue.add((T) currentNode.right);
//      }
//      list.add(queue.peek());
//    }
//    return (ArrayList) list;
//  }
  public LinkedList<Node> linkedList = new LinkedList<>();
  public  ArrayList<Integer> list = new ArrayList<>();

  public ArrayList<Integer> breadthFirst(BinaryTree tree) {
    if (root != null) {
      linkedList.add(tree.root);
      while (!linkedList.isEmpty()) {
        Node node = linkedList.remove();
        list.add(node.data);

        if (node.left != null) {
          linkedList.add(node.left);
        }
        if (node.right != null) {
          linkedList.add(node.right);
        }
      }
    }
    return list;
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
