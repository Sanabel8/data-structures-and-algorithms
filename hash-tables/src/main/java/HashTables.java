import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Objects;

public class HashTables<K ,V> {

  //1. make arrayList to stor as bucket
  private ArrayList<HashTableNode<K,V>> storeArray;
  private int numberOfStores;
  private int size;

  //3. make methode to calculate index for storeArray by inter the key and return index
  public int calculateStoreArrayIndex(K key) {

   int zipHashingCode = zipHashingCode(key);
   int index = zipHashingCode % numberOfStores;
   index = index < 0 ? index * -1 : index;
   return index;
  }

//4. generate this method to solve error
  private int zipHashingCode(K key) {
    return Objects.hashCode(key);
  }
//2.
  public void add(K key, V value) {
    //declare for storeArray Index
    int storeArrayIndex = calculateStoreArrayIndex(key);
    int zipHashingCode = zipHashingCode(key);

    //get index for head in arraylinkedlist
    HashTableNode<K, V> head = storeArray.get(storeArrayIndex);

    //check the head not = null
    while (head != null) {
      if (head.key.equals(key) && head.zipHashingCode == zipHashingCode) {
        head.value = value;
        return;
      }
      head = head.next;
    }

    size++;
    head = storeArray.get(storeArrayIndex);
    // create new node
    HashTableNode<K, V> newNode = new HashTableNode<>(key, value, zipHashingCode);
    newNode.next = head;
    storeArray.set(storeArrayIndex, newNode);

    if ((1.0 * size) / numberOfStores >= 0.7) {
      ArrayList<HashTableNode<K, V>> current = storeArray;
      storeArray = new ArrayList<>();
      numberOfStores = 2 * numberOfStores;
      size = 0;

      for (int index = 0; index < numberOfStores; index++) {
        storeArray.add(null);
      }

      for (HashTableNode<K, V> headNode : current) {
        while (headNode != null) {
          add(headNode.key, headNode.value);
          headNode = headNode.next;
        }
      }
    }
  }
  public V get (K key) {
    int storeArrayIndex = calculateStoreArrayIndex(key);
    int zipHashingCode = zipHashingCode(key);

    Node<K, V> head = storeArray.get(storeArrayIndex);

    while (head != null) {
      if (head.key.equals(key) && head.hash == zipHashingCode) {
        return head.value;
      }

      head = head.next;
    }

    return null;
  }

  public  boolean contains (K key) {
    if (key == null){
      throw new IllegalArgumentException("Cannot find a null key.");
    }
    return get(key) != null;
  }


  public  void hash (String key) {


  }
}
