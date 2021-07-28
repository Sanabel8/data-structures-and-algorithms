package challenge2;

public class App{
  public static void main(String[] args) {

      int[] a = { 1, 2, 3, 4, 5 };

      System.out.println(Arrays.toString(insertShiftArray(a,9)));

  }

  public static int[] insertShiftArray(int[] firstArr,int addedNum){
   int mid ;
   int newArr[] = new int[firstArr.length+1];
   mid =firstArr % 2 ==0 ?firstArr.length /2 : firstArr.length /2 + 1;
    for (int i = 0; i < newArr.length; i++) {
      if( i < mid ){
        newArr[i] = firstArr[i];
      }else if( i == mid ){
        newArr[i] =addedNum;
      }else {
        newArr[i] = firstArr[i-1];
      }
    }
    return newArr;
  }
}
