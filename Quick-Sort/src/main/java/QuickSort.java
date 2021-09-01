public class QuickSort {

 public static void swapFun(int[] array, int a, int b)
  {
    int currentArr = array[a];
    array[a] = array[b];
    array[b] = currentArr;
  }
 public static int dividedFun(int[] array, int down, int up) {
   int center = array[up];
    int i = (down - 1);

    for(int j = down; j <= up - 1; j++)
    {
      if (array[j] < center){
        i++;
        swapFun(array, i, j);
      }
    }
    swapFun(array, i + 1, up);
    return (i + 1);
  }
  static void quickSort(int[] array, int down, int up)
  {
    if (down < up){
      int devidedIndex= dividedFun(array, down, up);
      quickSort(array, down, devidedIndex - 1);
      quickSort(array, devidedIndex + 1, up);
    }
  }
}
