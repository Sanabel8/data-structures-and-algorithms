package stack.queue;

public class Stack<T> {
  Node<T> top;

  public void push(int value) {
    Node<T> newNode = new Node(value);
    if (top == null) {
      top = newNode;
    } else {
      Node<T> store = top;
      top = newNode;
      newNode.next = store;
    }
    System.out.println(newNode.getValue());
  }
  public T pop() {
    if (top == null) {
      throw new IllegalArgumentException("Empty");
    } else {
      T popped = this.top.value;
      Node<T> temp = this.top;
      this.top = this.top.next;
      temp.next = null;
      System.out.println("pop node " + popped);
      return popped;
    }
  }
    public T peek() {

    if (this.top != null) {
      System.out.println("peek value : "+this.top.value);
      return this.top.value;
    }
    return this.top.value;
    }
  public boolean isEmpty(){
    if (this.top == null) {
//      System.out.println("the top"+this.top);
      return true;
    } else {
      return false;
    }
  }
  @Override
  public String toString() {
    String result = "TOP\n";
    Node<T> current = this.top;
    while(current != null){
      result += "{ " + current.value + " }\n";
      current = current.next;
    }
    return result;
  }
}
