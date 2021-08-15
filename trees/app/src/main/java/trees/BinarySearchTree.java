package trees;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {
  Node<T> current = root;


  public void add(T value) {
    Node<T> newNode = new Node<T>(value);

    if (this.current == null) {
      root = newNode;
      return;
    } else {
      while (current != null) {
        if (current.value.compareTo(value) == 0) {
          System.out.println("the Node found");
          break;
        } else {
          if (current.value.compareTo(value) < 0) {
            if (current.right != null) {
              current = current.right;
              continue;
            } else {
              current.right = newNode;
              break;
            }
          } else {
            if (current.left != null) {
              current = current.left;
              continue;
            } else {
              current.left = newNode;
              break;
            }

          }

        }
      }
    }
  }

  public boolean contains(T value) {
    while (this.current != null) {
      if (current.value.compareTo(value) == 0) {
        return true;
      } else {
        if (current.value.compareTo(value) < 0) {
          if (current.right != null) {
            current = current.right;
            continue;
          } else {
            return false;
          }
        } else {
          if (current.left != null) {
            current = current.left;
            continue;
          } else {
            return false;
          }
        }
      }
    }
    return false;
  }
}
