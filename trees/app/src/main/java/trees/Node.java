package trees;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
  T value;
 Node <T> left;
 Node <T> right;
 int data;
  Node<T> next;



  public Node(T value) {
    this.value = value;
    this.data = data;

  }
  public T getValue() {
    return value;
  }

}
