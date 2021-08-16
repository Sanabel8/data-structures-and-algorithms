package trees;

public class Queue<T> {
  Node<T> front;
  Node<T> rear;
  public void enqueue(T value) {
    Node<T> newNode = new Node<>(value);
    if(this.front == null){
      this.front=newNode;
      this.rear=newNode;
    }
    this.rear.next = newNode;
    this.rear = newNode;
    System.out.println("new node from back " + this.rear.value);
  }
  public T dequeue() {
    if (front == null) {
      try {
        throw new Exception("fff");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }else{
      Node<T> temp = this.front;
      this.front = front.next;
      this.front = temp;
      temp.next = null;
//      return this.front.value;
    }
    return this.front.value;
  }

  public T peek() {
    if (this.front == null) {
      try {
        throw new Exception("the queue is empty");
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      System.out.println("the peek from queue class :"+this.front.value);
      return this.front.value;
    }
    return this.front.value;
  }

  public boolean isEmpty() {
    if (this.front == null) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    String result = "FRONT -> ";
    Node<T> current = this.front;
    while(current != null){
      result += "{ " + current.value + " } -> ";
      current = current.next;
    }
    result += "REAR";
    return result;
  }
}
