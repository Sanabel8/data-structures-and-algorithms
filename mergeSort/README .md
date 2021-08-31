# Challenge Summary
<!-- Description of the challenge -->
In this directory, you will learn about merge sort algorithm and its implementation in Java
Merge Sort: is one of the most popular sorting algorithms that is based on the principle of Divide and Conquer Algorithm.
## Whiteboard Process
<!-- Embedded whiteboard image -->
![merge-sorting](mergeSort/merg-pic.jpg)
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Gig o/complexity
space: o(n)
time :O(n*log n)

## Solution
<!-- Show how to run your code, and examples of it in action -->
 ``` System.out.println(new App().getGreeting());
      int arr[] = { 8,4,23,42,16,15};

      MergeSort test = new MergeSort();
      test.mergeSorting(arr, 0, arr.length - 1);

      System.out.print("Merg Sort array:"+"[ ");
      int n = arr.length;
      for (int i = 0; i < n; ++i) {
        System.out.print(arr[i] + " ");
      }
      System.out.println("]");
```
* the ruslt :Merg Sort array:[ 4 8 15 16 23 42 ]