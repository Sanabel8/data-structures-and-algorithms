/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class Library {
  public static void main(String[] args) {
    int [] array ={5,42,85,74,69,2};
    System.out.println("before sorting");
    for (int i:array ) {
      System.out.println(i +" ");
    }
    InsertSort insertSort = new InsertSort();
    insertSort.sortArray(array);

    System.out.println("after sorting");
    for (int i:array ) {
      System.out.print(i +" ");
    }
  }

}
