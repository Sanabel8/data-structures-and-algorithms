public class MergeSort {
  void mergeSorting(int arr[], int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;
      mergeSorting(arr, left, middle);
      mergeSorting(arr, middle + 1, right);
      mergefunction(arr, left, middle, right);
    }
  }
  public void mergefunction(int arr[], int firstIndexForFirstSubArr , int finalkIndexForTheSameSubArr, int sizeOfArr) {
    int p = firstIndexForFirstSubArr;
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


  }

