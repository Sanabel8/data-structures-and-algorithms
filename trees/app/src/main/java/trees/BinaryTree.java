package trees;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
  Node<T> root;
  String preOrderResult = "";
  String InOrderResult = "";
  String postOrderResult = "";

  public BinaryTree(){ }

  public String preOrder(Node<T> node){

    preOrderResult += node.value+" => ";
    if(node.left != null){
      preOrder(node.left);
    }
    if(node.right != null){
      preOrder(node.right);
    }
    return preOrderResult;

  }

  public String inOrder(Node<T> node){

    if(node.left != null){
      inOrder(node.left);
    }
    InOrderResult += node.value+ "=>";
    if(node.right != null){
      inOrder(node.right);
    }
   return InOrderResult;
  }

  public String postOrder(Node<T> node){
    if(node.left != null){
      postOrder(node.left);
    }
    if(node.right != null){
      postOrder(node.right);
    }
    postOrderResult += node.value+ " => ";
    return postOrderResult;
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
