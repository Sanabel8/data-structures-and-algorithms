package code.challenge5;

import java.util.ArrayList;

public class LinkedList {
  Node head;
  private int length;

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

//   public void insertBefore(int value , int newData){
//     Node newNode = new Node(newData);
//     if (head == null) {
//       head = newNode;
//     } else if (head.value == value) {
//       Node theRightNode = head;
//       head = newNode;
//       newNode.next = theRightNode;
//     } else {
//       Node current = head;
//       while (current != null) {
//         if (current.value == value) {
//           Node nextNode = current.next;
//           current.next = newNode;
//           newNode.next = nextNode;
//         }
//         current = current.next;
//       }
//     }
//   }
public String insertBefore( int value, int newNum){
  Node newNode = new Node(newNum);
  Node current = head;
  if (head ==null){
    return null;
  }else {
    while (current !=null&& current.next.value !=value) {
      current=current.next;
    }
    newNode.next=current.next;
    current.next= newNode;
  }
  String result = " insert before: "+ newNode.next.value+" the added node : "+newNode.value;
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
    System.out.println("the list :"+kList);
    return  "k["+k+"] = "+ kList.get((x - 1) - k);

  }
}


}
