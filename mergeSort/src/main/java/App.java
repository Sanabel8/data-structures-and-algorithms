/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
      int arr[] = { 8,4,23,42,16,15};

      MergeSort test = new MergeSort();
      test.mergeSorting(arr, 0, arr.length - 1);

      System.out.print("Merg Sort array:"+"[ ");
      int n = arr.length;
      for (int i = 0; i < n; ++i) {
        System.out.print(arr[i] + " ");
      }
      System.out.println("]");
    }
}