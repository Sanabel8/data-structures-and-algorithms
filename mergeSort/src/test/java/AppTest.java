/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void testMergSort() {
           int[] arr = {8, 4, 23, 42, 16, 15};

      MergeSort test = new MergeSort();
      test.mergeSorting(arr, 0, arr.length - 1);

      System.out.print("Merg Sort array:"+"[ ");
      int n = arr.length;
      for (int i = 0; i < n; ++i) {
        System.out.print(arr[i] + " ");
      }
      System.out.println("]");
      assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(arr));
    }
  @Test public void testMergSortwithMinusValue() {
    int[] arr = {8, 4, -23, -42, 16, 15};

    MergeSort test = new MergeSort();
    test.mergeSorting(arr, 0, arr.length - 1);

    System.out.print("Merg Sort array:"+"[ ");
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("]");
    assertEquals("[-42, -23, 4, 8, 15, 16]", Arrays.toString(arr));
  }

  @Test public void testMergSortwithrepetiveValue() {
    int[] arr = {16,8,4,16,20, 16, 15};

    MergeSort test = new MergeSort();
    test.mergeSorting(arr, 0, arr.length - 1);

    System.out.print("Merg Sort array:"+"[ ");
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("]");
    assertEquals("[4, 8, 15, 16, 16, 16, 20]", Arrays.toString(arr));
  }
}