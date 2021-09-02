# Quick Sort - Code Challenge: Class 28

# Challenge Summary
<!-- Description of the challenge -->

QuickSort is a Divide and Conquer algorithm. It choose an element as center and devided the given array around the choose center.

## Whiteboard Process
<!-- Embedded whiteboard image -->

![quick-sort](Quick-Sort/quickStor.jpg)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Gig o/complexity
space: o(n)
time :O(n)
## Solution

<!-- Show how to run your code, and examples of it in action -->

```
    int[] array = {55,76,47,36,12,32,22,52};
    int n = array.length;

    QuickSort.quickSort(array, 0, n - 1);
    System.out.print("Quick Sort array: [");

    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
```

* the result : Quick Sort array: [12 22 32 36 47 52 55 76 ]