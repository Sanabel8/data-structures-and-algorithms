package code.challenge5;

public class LinkedList {
  Node head;
  //insert value to the end
  public String insert(int value){
    Node addedNode =new Node(value);
    Node current = head;
    if(head == null){
      head =addedNode;
    }else{
      while (current.next != null){
        current =current.next;
      }
      current.next = addedNode;
    }
    return null;
  }

  // added value to the begining of linkelist
  public String add(int newNode){
    Node new_node = new Node(newNode);
    new_node.next =head;
    head =new_node;
    return null;
  }

  public boolean includes(int value){
    Node current= this.head;
    while (current !=null ) {
      if(current.value == value){
        System.out.println("true");
        return true;
      }
      current=current.next;
    }
    System.out.println("false");
    return false;
  }



  public String tostring() {
    //Node current will point to head
    Node current = head;
    String resulte ="";
    if(head == null) {
      System.out.println("List is empty");
//      return;
    }
    while(current != null) {
      //Prints each node by incrementing pointer

      resulte +="{"+current.value + "} ->";

      System.out.print("{"+current.value + "} ->");
      current = current.next;
    }
    System.out.println("NULL");
    return resulte+"NULL";
  }
}
