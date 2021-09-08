public class Node<K, V> {
  K key;
  V value;

  int key2;
  Node left, right;
  int hashCode;
  Node<K, V> next;

  public Node(K key, V value, int hashCode) {
    this.key = key;
    this.value = value;
    this.hashCode = hashCode;
  }

  public Node(V value) {
    this.value = value;
  }

  public Node(Node left, Node right) {
    this.left = left;
    this.right = right;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }
}
