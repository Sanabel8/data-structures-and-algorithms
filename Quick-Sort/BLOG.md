# Code Challenge: Class 28 -Quick Sort

# passes ![quick-sort](Quick-Sort/blog.jpg)

# Pseudo Code

```ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

 ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

 ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```

# code

```public static void swapFun(int[] array, int a, int b) {
    int currentArr = array[a];
    array[a] = array[b];
    array[b] = currentArr;
  }
 public static int dividedFun(int[] array, int down, int up) {
   int center = array[up];
    int i = (down - 1);

    for(int j = down; j <= up - 1; j++) {
      if (array[j] < center){
        i++;
        swapFun(array, i, j);
      }
    }
    swapFun(array, i + 1, up);
    return (i + 1);
  }
  static void quickSort(int[] array, int down, int up) {
    if (down < up){
      int devidedIndex= dividedFun(array, down, up);
      quickSort(array, down, devidedIndex - 1);
      quickSort(array, devidedIndex + 1, up);
    }
  }
```
