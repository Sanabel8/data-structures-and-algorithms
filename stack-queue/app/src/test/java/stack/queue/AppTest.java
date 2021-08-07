/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
  }

  //test for stack
  @Test
  void testPushStackoneNode() {
    Stack<Integer> stack = new Stack<>();
    stack.push(8);
    stack.push(8);
    stack.push(8);
//can I use the assertEquals or assertNotNull(stack) the both pass.
    assertEquals("TOP\n" +
      "{ 8 }\n" +
      "{ 8 }\n" +
      "{ 8 }\n", stack.toString());
    assertNotNull(stack);
  }

  @Test
  void testPushStackMultipleNode() {
    Stack<Integer> stack = new Stack<>();
    stack.push(8);
    stack.push(8);
    stack.push(8);
//can I use the assertEquals or assertNotNull(stack) the both pass.
    assertEquals("TOP\n" +
      "{ 8 }\n" +
      "{ 8 }\n" +
      "{ 8 }\n", stack.toString());
    assertNotNull(stack);
  }

  @Test
  void testPopStackoneNode() {
    Stack<Integer> stack = new Stack<>();
    stack.push(8);
    stack.pop();
    assertEquals("TOP\n", stack.toString());
    assertNotNull(stack);
  }

  @Test
  void testPopStackMulltiple() {
    Stack<Integer> stack = new Stack<>();
    stack.push(8);
    stack.push(8);
    stack.push(8);
    stack.push(8);
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    assertEquals("TOP\n", stack.toString());
    assertNotNull(stack);
  }

  @Test
  void testPeekStack() {
    Stack<Integer> stack = new Stack<>();
    stack.push(9);
    stack.push(19);
    stack.push(29);
    Integer expected = 29;
    assertEquals(expected, stack.peek());
    assertNotNull(stack);
  }

  @Test
  void TeststackEmpty() {
    Stack<Integer> stack = new Stack<>();
    assertEquals("TOP\n", stack.toString());
  }

  @Test
  void testpeekEmptyStack() {
    Stack<Integer> stack = new Stack<>();
    assertThrows(Exception.class, () -> stack.peek());
  }

  //test for queue
  @Test
  void testEnqueue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    assertEquals("FRONT -> { 1 } -> { 2 } -> { 3 } -> { 4 } -> REAR", queue.toString());
    assertNotNull(queue);
  }

  @Test
  void testdequeue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.dequeue();
    assertEquals("FRONT -> { 1 } -> REAR", queue.toString());
    assertNotNull(queue);
  }

  @Test
  void testpeekQueue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.peek();
    assertNotNull(queue);
  }

  @Test
  void testIsEmptyQueue() {
    Queue<Integer> queue = new Queue<>();
    queue.isEmpty();
    assertEquals("FRONT -> REAR", queue.toString());
    assertNotNull(queue);
  }

  @Test
  void testnullQueue() {
    Queue<Character> queue = new Queue<>();
    assertNull(queue.front);
  }
}
