import java.util.ArrayList;
import java.util.List;

public class BinaryTrees {
  public BinaryTrees(){}
  public List<Integer> list = new ArrayList<>();
  public Node root;

  public BinaryTrees(Node root){
    this.root=root;
  }

  public List preOrdeMethod(Node root) {
    try {
      if (root != null) {
        list.add((Integer) root.value);
        preOrdeMethod(root.left);
        preOrdeMethod(root.right);
        return (ArrayList) list;
      }
    }catch (Exception e){
      System.out.println("error happend");
    }
    return null;
  }

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

}
