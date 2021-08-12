package stack.queue;

public class AnimalShelter {
  public Queue<Cat> catQueue;
  public Queue<Dog> dogQueue;

  public AnimalShelter(){
    this.catQueue= new Queue<>();
    this.dogQueue= new Queue<>();
      }
  public void enqueue(Animal animal){
    if (animal instanceof Cat) {
      catQueue.enqueue((Cat) animal);
    }else if (animal instanceof Dog){
      dogQueue.enqueue((Dog) animal);
    }else {
      System.out.println("only for dogs and cats");
    }
  }
  public Animal dequeue(String pref){
    if(pref.equals("cat") && !catQueue.isEmpty()){
      return catQueue.dequeue();
    }else if(pref.equals("dog") && !dogQueue.isEmpty()){
      return dogQueue.dequeue();
    }else {
      return null;
    }
  }

  @Override
  public String toString() {
    return "AnimalShelter{" +
      "catQueue=" + catQueue +
      ", dogQueue=" + dogQueue +
      '}';
  }
}
