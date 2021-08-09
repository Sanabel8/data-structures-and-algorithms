#  Stack and a Queue Implementation
# Stacks and Queues
<!-- Short summary or background information -->
A stack is a data structure that consists of Nodes. Each Node references the next Node in the stack, but does not reference its previous.
A Queue type of Data Structure.
Chain of nodes, each node references to thee next one but not vice versa.
## Challenge
<!-- Description of the challenge -->
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
queue method :
enqueue(T value)
dequeue() 
peek()
isEmpty()
toString()
## push
Arguments: value
adds a new node with that value to the top of the stack with an O(1) Time performance.
## pop
Arguments: none
Returns: the value from node from the top of the stack
Removes the node from the top of the stack
Should raise exception when called on empty stack
## peek
Arguments: none
Returns: Value of the node located at the top of the stack
Should raise exception when called on empty stack
## is empty
Arguments: none
Returns: Boolean indicating whether or not the stack is empty.
Queue


stack method :
push(int value)
pop()
peek() 
isEmpty()
toString()
## enqueue
Arguments: value
adds a new node with that value to the back of the queue with an O(1) Time performance.
## dequeue
Arguments: none
Returns: the value from node from the front of the queue
Removes the node from the front of the queue
Should raise exception when called on empty queue
## peek
Arguments: none
Returns: Value of the node located at the front of the queue
Should raise exception when called on empty stack
## is empty
Arguments: none
Returns: Boolean indicating whether or not the queue is empty
## API

<!-- Description of each method publicly available to your Stack and Queue-->
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



# Challenge Summary
<!-- Description of the challenge -->
This challenge is about how to Implement a Queue using two Stacks, and apply enqueue and edqueue on it 
## Whiteboard Process
<!-- Embedded whiteboard image -->
[stack-queue-pseudo](stack-queue-pseudo.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 Gig o/complexity
 space: o(n)
 time :  o(n)

