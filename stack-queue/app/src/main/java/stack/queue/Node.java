package stack.queue;

public class Node<T> {
  public T value;
  Node<T> next;

  public Node(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }
}
