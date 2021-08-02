package linked.list;

public class LinkedList {
  Node head;
  int size;

  //insert value to the end
  public String insert(int value) {
    Node addedNode = new Node(value);
    Node current = head;
    if (head == null) {
      head = addedNode;
    } else {
      while (current.next != null) {
        current = current.next;
      }
      current.next = addedNode;
    }
    return null;
  }

  // added value to the begining of linkelist
  public String add(int newNode) {
    Node new_node = new Node(newNode);
    new_node.next = head;
    head = new_node;
    return null;
  }

  public boolean includes(int value) {
    Node current = this.head;
    while (current != null) {
      if (current.value == value) {
        System.out.println("true");
        return true;
      }
      current = current.next;
    }
    System.out.println("false");
    return false;
  }


  public String tostring() {
    //Node current will point to head
    Node current = head;
    String resulte = "";
    if (head == null) {
      System.out.println("List is empty");
//      return;
    }
    while (current != null) {
      //Prints each node by incrementing pointer

      resulte += "{" + current.value + "} ->";

      System.out.print("{" + current.value + "} ->");
      current = current.next;
    }
    System.out.println("NULL");
    return resulte + "NULL";
  }

  public void append(int value) {
    Node addedNode = new Node(value);
    Node addedValue = head;
    if (head == null) {
      head = addedNode;
    } else {
      while (addedValue.next != null) {
        addedValue = addedValue.next;

      }
      addedValue.next = addedNode;
    }
  }

  public void insertBefore(int data, int newData) {
    Node newNode = new Node(data);
    newNode.value = newData;
    //to check if the head is empty
    if (head == null) {
      return;
    }
    Node current = head;
    Node beforeCurrent = head;
    while (current.next != null) {
      if (current.value == data) {
        beforeCurrent.next = newNode;
        newNode.next = current;
      }
      beforeCurrent.next = current;
      current = current.next;
    }
    beforeCurrent.next = newNode;
    newNode.next = current;

  }

  public void insertAfter(int data, int newValue) {
    Node newNode = new Node(data);
    newNode.value = newValue;
    if (head == null) {
      return;
    }
    Node current = head;
    Node afterCurrent = head;
    while (current.next != null) {
      if (current.value == data) {
        afterCurrent.next = newNode;
        newNode.next = current;
      }
      afterCurrent.next = current;
      current = current.next;
    }
    afterCurrent.next = newNode;
    newNode.next = current;
  }
}
