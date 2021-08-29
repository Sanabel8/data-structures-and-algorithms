public class InsertSort {

  public void sortArray(int arr[]) {
    int sizeOfArray = arr.length;
    for (int i = 1; i < sizeOfArray; ++i) {
        int indexkey = arr[i];
      int x = i - 1;
      while (x >-1 && arr[x] > indexkey) {
        arr[x + 1] = arr[x];
        --x;
      }
      arr[x + 1] = indexkey;
    }
  }
}
