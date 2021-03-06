/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LibraryTest {

  @Test
  public void testSortDifferentValue(){
    int [] array = {2,8,52,74,65,3};
    QuickSort test =new QuickSort();
    test.quickSort(array,0,5);
    assertEquals("[2, 3, 8, 52, 65, 74]", Arrays.toString(array));
  }
  @Test
  public void testSortRepetition(){
    int [] array = {2,8,2,74,65,3};
    QuickSort test =new QuickSort();
    test.quickSort(array,0,5);
    assertEquals("[2, 2, 3, 8, 65, 74]", Arrays.toString(array));
  }
  @Test
  public void testSortminusValue(){
    int [] array = {2,-8,2,-2,3,55};
    QuickSort test =new QuickSort();
    test.quickSort(array,0,5);
    assertEquals("[-8, -2, 2, 2, 3, 55]", Arrays.toString(array));
  }
}
