/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.pop(); //will pop the last node added
        stack.peek() ;
        stack.isEmpty() ;
      System.out.println("From App "+stack.toString());


      Queue<Integer> queue = new Queue<>();
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      queue.enqueue(4);


      queue.dequeue();
      queue.peek();
      queue.isEmpty();
      System.out.println("the dequeue node  "+queue.dequeue());
      System.out.println(queue.toString());

      //cc11

      PseudoQueue stack1 = new PseudoQueue();

      stack1.enqueue(20);
      stack1.enqueue(15);
      stack1.enqueue(10);

      System.out.println(stack1);


      stack1.enqueue(5);
      System.out.println(stack1);

      System.out.println(stack1.dequeue());
      System.out.println(stack1);

      System.out.println(stack1.dequeue());
      System.out.println(stack1);

      stack1.enqueue(7);
      System.out.println(stack1);

    // cc13
      ValidateBrackets a = new ValidateBrackets();
     System.out.println("ValidateBrackets: "+a.ValidateBrackets(")"));
      System.out.println(a.ValidateBrackets("}"));



    }

}