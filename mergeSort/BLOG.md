# Merge Sort

## Pseudo Code

ALGORITHM Mergesort(arr)
DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
DECLARE i <-- 0
DECLARE j <-- 0
DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

## my code

```void mergeSorting(int arr[], int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;
      mergeSorting(arr, left, middle);
      mergeSorting(arr, middle + 1, right);
      mergefunction(arr, left, middle, right);
    }
  }
  public void mergefunction(int arr[], int p, int x, int r) {

    int num1 = x - p + 1;
    int num2 = r - x;

    int leftArr[] = new int[num1];
    int rightArr[] = new int[num2];

    for (int i = 0; i < num1; i++) {
      leftArr[i] = arr[p + i];
    }
    for (int j = 0; j < num2; j++) {
      rightArr[j] = arr[x + 1 + j];
    }
    int i=0, j=0, k=p;
    while(i < num1 && j < num2) {
      if (leftArr[i] <= rightArr[j]) {
        arr[k] = leftArr[i];
        i++;
      } else {
        arr[k] = rightArr[j];
        j++;
      }
      k++;
    }
    while (i < num1) {
      arr[k] = leftArr[i];
      i++;
      k++;
    }

    while (j < num2) {
      arr[k] = rightArr[j];
      j++;
      k++;
    }
 }


```

# pass1:
Create duplicate copies of sub-arrays to be sorted

```int p = firstIndexForFirstSubArr;
    int x = finalkIndexForTheSameSubArr;
    int num1 = x - p + 1;
    int num2 = sizeOfArr - x;

    int leftArr[] = new int[num1];
    int rightArr[] = new int[num2];

    for (int i = 0; i < num1; i++) {
      leftArr[i] = arr[p + i];
    }
    for (int j = 0; j < num2; j++) {
      rightArr[j] = arr[x + 1 + j];
    }


````
for example:
 int arr[] = { 8,4,23,42,16,15};
p= 0
x= 4
sizeOfArr=6
num1=  x - p + 1 =3-0+1 =4
num2= 6-4 =2

leftArr[4] = [8,4,23,42]
rightArr[2] = [16,15]

# pass 2: Maintain current index of sub-arrays and main array

# pass 3: Step 3: Until we reach the end of either LeftArr or rightArr, we will choose the bigger between them and put them in the correct position at A[p..sizeOfArr]

# pass 4: When we run out of elements in either LeftArr or rightArr, choosing remaining elements and put in A[p..sizeOfArr]

![pass2,pass3](mergeSort/pass2,3.jpeg)
![pass4](mergeSort/pass4.jpeg)



