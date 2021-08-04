package code.challenge5;
import java.util.ArrayList;

public class LinkedList {
  Node head;
  private int length;
  int size;

  //insert value to the end
  public String insert(int newNode) {
    Node new_node = new Node(newNode);
    new_node.next =head;
    head =new_node;
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

  public int append(int value) {
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
    return value;
  }

  public String insertBefore(int value, int newNum) {
    Node newNode = new Node(newNum);
    Node current = head;
    if (head == null) {
      return null;
    } else {
      while (current != null && current.next.value != value) {
        current = current.next;
      }
      newNode.next = current.next;
      current.next = newNode;
    }
    String result = " insert before: " + newNode.next.value + " the added node : " + newNode.value;
    System.out.println(result);
    return result;
  }

  public void insertAfter(int value, int newNum) {
    Node newNode = new Node(newNum);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current != null) {
        if (current.value == value) {
          Node nextNode = current.next;
          current.next = newNode;
          newNode.next = nextNode;
        }
        current = current.next;
      }
    }

  }

  public String kLocation(int k) {
    int x = 0;
    if (head == null) {
      return "Null";
    } else {
      ArrayList<Integer> kList = new ArrayList<>();
      Node current = head;
      while (current != null) {
        kList.add(current.value);
        current = current.next;
        x++;
      }
      if (k < 0 || k > x) {
        return "Exception";
      }
      System.out.println("the list :" + kList);
      return "k[" + k + "] = " + kList.get((x - 1) - k);

    }
  }

  public Node zipLists(LinkedList list1, LinkedList list2) {
    if (list1.head == null) {
      return list2.head;
    } else if (list2.head == null) {
      return list1.head;
    } else {
      Node current1 = list1.head;
      Node current2 = list2.head;
      Node first, second;
      while (current1 != null && current2 != null) {
        first=current1.next;
        second=current2.next;

        current2.next=first;
        current1.next=current2;

        current1=first;
        current2=second;
      }
      return list1.head;
    }

  }

  public int getHead() {
    return this.head.value;
  }
}
