package stack.queue;

public class Node<T> {
  public T value;
  Node<T> next;
  Node<T> right;
  Node<T> left;
  public Node(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public Node(T value, Node<T> right, Node<T> left) {
    this.value = value;
    this.right = right;
    this.left = left;
  }
}
