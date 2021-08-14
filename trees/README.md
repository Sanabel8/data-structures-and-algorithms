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
