# Trees Challenge cc15
<!-- Short summary or background information -->
This challenge about how to build a binary tree, store Nodes in it and apply Depth First methods.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

* Node : Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.


### Create a Binary Tree class
Define a method for each of the depth first traversals:
* pre order  =>  String preOrder(Node<T> node)
* in order   => String inOrder(Node<T> node)
* post order which returns an array of the values, ordered appropriately.  => String postOrder(Node<T> node)

### Create a Binary Search Tree class and create  methods:
* Add
Arguments: value
Return: nothing
Adds a new node with that value in the correct location in the binary search tree.
void add(T value) 

* Contains 
Argument: value
Returns: boolean indicating whether or not the value is in the tree at least once.

boolean contains(T value)

# Challenge Summary cc16  Extending an Implementation
<!-- Description of the challenge -->
Find the maximum value stored in the binary tree.
## Whiteboard Process
<!-- Embedded whiteboard image -->
[tree-max](trees/tree-max.jpg)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Gig o/complexity
space: o(n)
time :  o(n)
## Solution
<!-- Show how to run your code, and examples of it in action -->

      BinaryTree bt = new BinaryTree();
      //Add nodes to the binary tree
      bt.root = new Node(20);
      bt.root.left = new Node(25);
      bt.root.right = new Node(54);
      bt.root.left.left = new Node(74);
      bt.root.right.left = new Node(85);
      bt.root.right.right = new Node(22);

      //Display largest node in the binary tree
      System.out.println("maximum node is: " + bt.findMaximaumValue(bt.root));
      output = 85


      
# Challenge Summary cc17  tree-breadth-first
<!-- Description of the challenge -->
Traverse the input tree using a Breadth-first approach
## Whiteboard Process
<!-- Embedded whiteboard image -->
[tree-breadth-first](trees/Breadth-first.jpg)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Gig o/complexity
space: o(n)
time :  o(n)


      