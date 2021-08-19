package trees;

public class TreeFizzBuzz {

  public int fizzBuzzTree(int k){
    for (int i = 1; i < k; i++) {
      if(i%15 ==0){
        System.out.println("FizzBuzz"+" ");
      }else if(i%5 ==0){
        System.out.println("Buzz"+" ");
      }else if (i%3 == 0){
        System.out.println("Fizz"+" ");
      }else{
        System.out.println(i+" ");
      }
    }
    return k;
  }
}
