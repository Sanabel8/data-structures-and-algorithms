## Insertion Sort

arrang the array sort int from the lowest value to the bigger value using java code

## Pseudocode

InsertionSort(int[] arr)

```FOR i = 1 to arr.length

    int j <-- i - 1
    int temp <-- arr[i]

    WHILE j >= 0 AND temp < arr[j]
      arr[j + 1] <-- arr[j]
      j <-- j - 1

    arr[j + 1] <-- temp
```
## Trace
### Sample Arrays

input: [8,4,23,42,16,15]
output:[4,8,15,16,23,42]

## pass 1:
![pass1](insertSort/pass1.jpg)
## Pass 2:
![pass1](insertSort/pass2.jpg)
## Pass 3:
![pass1](insertSort/pass3.jpg)
## Pass 4:
![pass1](insertSort/pass4.jpg)
## Pass 5:
![pass1](insertSort/pass5.jpg)

#### working code

```public void sortArray(int arr[]) {
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
```

## Efficency
Gig o/complexity
space: o(n)
time :  o(n)

