/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

      String text = "Once upon a time, there was a brave princess who...";
      String words = Reapeating.repeitingWords(text);
      if (!words.equals("Try Again ,No Repeating Words"))
        System.out.println("repeated word .... " + words);
      else
        System.out.println("Try Again ,No Repeating Words");

    }




}
